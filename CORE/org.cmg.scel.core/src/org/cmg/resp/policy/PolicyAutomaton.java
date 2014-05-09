/**
 * Copyright (c) 2014 Concurrency and Mobility Group.
 * Università di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp.policy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;

import org.cmg.resp.behaviour.Action;
import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Target;

/**
 * @author Michele Loreti
 *
 */
public class PolicyAutomaton implements IPolicy {

	private PolicyState[] policyStates;
	
	private ArrayList<LinkedList<PATransition>> rules;

	private int currentState;

	private Node node;
	
	private Lock lock;
	
	
	public PolicyAutomaton( PolicyState ... states ) {
		this.policyStates = states;
		this.rules = new ArrayList<LinkedList<PATransition>>(states.length);
		this.currentState = 0;
	}
	
	public void setState( int idx ) {
		this.currentState = idx;
	}
	
	public int size() {
		return policyStates.length;
	}
	
	public void addRule( int src , Filter filter , int trg ) {
		_addRule( src , new PATransition( filter , trg ));
	}
	
	
	private void _addRule(int src, PATransition paTransition) {
		LinkedList<PATransition> stateRules = rules.get(src);
		if (stateRules == null) {
			stateRules = new LinkedList<PATransition>();
			rules.set(src, stateRules);
		}
		stateRules.add(paTransition);
	}

	private AutorizationResponce eval( AutorizationRequest req ) {
		return policyStates[currentState].evaluate(req);		
	}
	
	private void updatePolicState(AutorizationRequest req) {
		LinkedList<PATransition> stateTransitions = rules.get(currentState);
		for (PATransition paTransition : stateTransitions) {
			if (paTransition.isEnabled(req)) {
				currentState = paTransition.nextState;
				return ;
			}
		}
	}

	private class PATransition {
		
		protected Filter filter;
		
		protected int nextState;

		public PATransition(Filter filter , int nextState ) {
			this.filter = filter;
			this.nextState = nextState;
		}
		
		public boolean isEnabled( AutorizationRequest req ) {
			return filter.equals(req);
		}

		public int nextState() {
			return nextState;
		}

	}
	
	public static interface Filter {
		
		public boolean eval( AutorizationRequest act );
		
	}

	@Override
	public void acceptPut(PointToPoint from, int session, Tuple tuple)
			throws InterruptedException, IOException {
		this.lock.lock();
		AutorizationRequest req = new AutorizationRequest(ActionID.ACCEPT_PUT, tuple, from, node.getInterface());
		AutorizationResponce res = eval( req );
		if (res.getDecision() == Decision.PERMIT) {
			node.put(from, session, tuple);
		}
		updatePolicState(req);
		this.lock.unlock();
		node.addAgent( res.getObligations() );
	}

	@Override
	public void acceptGet(PointToPoint source, int session, Template template)
			throws InterruptedException, IOException {
		this.lock.lock();
		AutorizationRequest req = new AutorizationRequest(ActionID.ACCEPT_GET, template, source, node.getInterface());
		AutorizationResponce res = eval( req );
		if (res.getDecision() == Decision.PERMIT) {
			Tuple t = node.get(template);
			if (t != null) {
				node.sendTuple( source , session , t );
			} else {
				node.sendFail( source , session , "Tuple not found!");				
			}
		}
		updatePolicState(req);
		this.lock.unlock();
		node.addAgent( res.getObligations() );
	}

	@Override
	public void acceptQuery(PointToPoint source, int session, Template template)
			throws InterruptedException, IOException {
		this.lock.lock();
		AutorizationRequest req = new AutorizationRequest(ActionID.ACCEPT_QRY, template, source, node.getInterface());
		AutorizationResponce res = eval( req );
		if (res.getDecision() == Decision.PERMIT) {
			Tuple t = node.query(template);
			if (t != null) {
				node.sendTuple( source , session , t );
			} else {
				node.sendFail( source , session , "Tuple not found!");				
			}
		}
		updatePolicState(req);
		this.lock.unlock();
		node.addAgent( res.getObligations() );		
	}

	@Override
	public boolean put(Agent a, Tuple t, Target l) throws InterruptedException,
			IOException {
		this.lock.lock();
		AutorizationRequest req = new AutorizationRequest(ActionID.PUT, t, l, node.getInterface());
		AutorizationResponce res = eval( req );
		if (res.getDecision() == Decision.PERMIT) {
			node.put(t, l);
		}
		updatePolicState(req);
		this.lock.unlock();
		a.exec( res.getObligations() );		
		return true;
	}

	@Override
	public Tuple get(Agent a, Template t, Target l)
			throws InterruptedException, IOException {
		this.lock.lock();
		AutorizationRequest req = new AutorizationRequest(ActionID.GET, t, l, node.getInterface());
		AutorizationResponce res = eval( req );
		updatePolicState(req);
		this.lock.unlock();
		Tuple result = null;
		if (res.getDecision() == Decision.PERMIT) {
			result = node.get(t, l);
		}
		a.exec( res.getObligations() );		
		return result;
	}

	@Override
	public Tuple query(Agent a, Template t, Target l)
			throws InterruptedException, IOException {
		this.lock.lock();
		AutorizationRequest req = new AutorizationRequest(ActionID.QRY, t, l, node.getInterface());
		AutorizationResponce res = eval( req );
		updatePolicState(req);
		this.lock.unlock();
		Tuple result = null;
		if (res.getDecision() == Decision.PERMIT) {
			result = node.get(t, l);
		}
		a.exec( res.getObligations() );		
		return result;
	}

	@Override
	public void exec(Agent a, Agent b) throws InterruptedException {
		this.lock.lock();
		AutorizationRequest req = new AutorizationRequest(ActionID.EXEC, b , null , node.getInterface());
		AutorizationResponce res = eval( req );
		updatePolicState(req);
		this.lock.unlock();
		if (res.getDecision() == Decision.PERMIT) {
			a.exec(b);
		}
		a.exec( res.getObligations() );		
	}

	@Override
	public void acceptGroupPut(PointToPoint from, int session,
			GroupPredicate groupPredicate, Tuple tuple) throws IOException,
			InterruptedException {
		this.lock.lock();
		AutorizationRequest req = new AutorizationRequest(ActionID.ACCEPT_PUT, tuple, from, node.getInterface());
		AutorizationResponce res = eval( req );
		node.gPut( from , session , groupPredicate , tuple );
		updatePolicState(req);
		this.lock.unlock();
		node.addAgent( res.getObligations() );
	}

	@Override
	public void acceptGroupGet(PointToPoint from, int session,
			GroupPredicate groupPredicate, Template template)
			throws IOException, InterruptedException {
		this.lock.lock();
		AutorizationRequest req = new AutorizationRequest(ActionID.ACCEPT_GET, template, from, node.getInterface());
		AutorizationResponce res = eval( req );
		node.gGet( from , session , groupPredicate , template );
		updatePolicState(req);
		this.lock.unlock();
		node.addAgent( res.getObligations() );
	}

	@Override
	public void acceptGroupQuery(PointToPoint from, int session,
			GroupPredicate groupPredicate, Template template)
			throws IOException, InterruptedException {
		this.lock.lock();
		AutorizationRequest req = new AutorizationRequest(ActionID.ACCEPT_QRY, template, from, node.getInterface());
		AutorizationResponce res = eval( req );
		node.gQuery(from , session , groupPredicate , template );
		updatePolicState(req);
		this.lock.unlock();
		node.addAgent( res.getObligations() );
	}

	@Override
	public String fresh(Agent a) throws InterruptedException {
		this.lock.lock();
		AutorizationRequest req = new AutorizationRequest(ActionID.FRESH, null, null, node.getInterface());
		AutorizationResponce res = eval( req );
		String result = node.fresh();
		updatePolicState(req);
		this.lock.unlock();
		a.exec( res.getObligations() );		
		return result;
	}

	@Override
	public void setNode(Node node) {
		this.node = node;
	}
	
}
