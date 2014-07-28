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
 *      Andrea Margheri
 */
package org.cmg.resp.policy.automaton;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;



//import org.cmg.resp.behaviour.Action;
import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.policy.ActionID;
import org.cmg.resp.policy.AuthorizationDecision;
import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.AuthorizationResponse;
import org.cmg.resp.policy.IPolicy;
import org.cmg.resp.policy.facpl.FulfilledObligation;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Target;

/**
 * @author Michele Loreti
 * @author Andrea Margheri
 *
 */
public class PolicyAutomaton implements IPolicy {

	private IPolicyAutomatonState[] policyStates;
	
	private ArrayList<LinkedList<PATransition>> rules;

	private int currentState;

	private Node node;
	
	private Lock lock;
	
	
	public PolicyAutomaton( IPolicyAutomatonState ... states ) {
		this.policyStates = states;
		this.rules = new ArrayList<LinkedList<PATransition>>(states.length);
		this.currentState = 0;
	}
	
	public void setCurrentState( int idx ) {
		this.currentState = idx;
	}
	
	/**
	 * Return the number of automaton's state
	 * @return
	 */	
	public int size() {
		return policyStates.length;
	}
	
	/**
	 * Add a transition in the automaton transition function
	 * @param src
	 * @param filter
	 * @param trg
	 */
	public void addTransitionRule( int src , TransitionCondition condition , int trg ) {
		_addTransitionRule( src , new PATransition( condition , trg ));
	}
	
	/**
	 * Add Transition to the Automaton
	 * @param src
	 * @param paTransition
	 */
	private void _addTransitionRule(int src, PATransition paTransition) {
		LinkedList<PATransition> stateRules = rules.get(src);
		if (stateRules == null) {
			stateRules = new LinkedList<PATransition>();
			rules.set(src, stateRules);
		}
		stateRules.add(paTransition);
	}

	/**
	 * 
	 * @param req AuthorizationRequest
	 * @return AuthorizationDecion and possibly a sequence of actions
	 */
	private AuthorizationResponse evaluateRequestOnState( AuthorizationRequest req ) {
		return policyStates[currentState].evaluate(req);		
	}
	
	/**
	 * Evaluate the transition function in order to calculate the new automaton's state 
	 * @param req
	 */
	private void updatePolicState(AuthorizationRequest req) {
		LinkedList<PATransition> stateTransitions = rules.get(currentState);
		for (PATransition paTransition : stateTransitions) {
			if (paTransition.isEnabled(req)) {
				currentState = paTransition.nextState;
				return ;
			}
		}
	}
	
	/*
	 * #############################################
	 * -> Implementation of AUTHORIZATION PREDICATEs
	 * #############################################
	 */
	
	@Override
	public void acceptPut(PointToPoint from, int session, Tuple tuple)
			throws InterruptedException, IOException {
		this.lock.lock();
		AuthorizationRequest req = new AuthorizationRequest(ActionID.ACCEPT_PUT, tuple, from, node.getInterface());
		AuthorizationResponse res = evaluateRequestOnState( req );
		if (res.getDecision() == AuthorizationDecision.PERMIT) {
			node.put(from, session, tuple);
		}
		updatePolicState(req);
		this.lock.unlock();
		if (res.getObligations().size()> 0){
			node.addAgent(getAgentFromObligations(res.getObligations()));
		}
	}

	@Override
	public void acceptGet(PointToPoint source, int session, Template template)
			throws InterruptedException, IOException {
		this.lock.lock();
		AuthorizationRequest req = new AuthorizationRequest(ActionID.ACCEPT_GET, template, source, node.getInterface());
		AuthorizationResponse res = evaluateRequestOnState( req );
		if (res.getDecision() == AuthorizationDecision.PERMIT) {
			Tuple t = node.get(template);
			if (t != null) {
				node.sendTuple( source , session , t );
			} else {
				node.sendFail( source , session , "Tuple not found!");				
			}
		}
		updatePolicState(req);
		this.lock.unlock();
		if (res.getObligations().size()> 0){
			node.addAgent(getAgentFromObligations(res.getObligations()));
		}
	}

	@Override
	public void acceptQuery(PointToPoint source, int session, Template template)
			throws InterruptedException, IOException {
		this.lock.lock();
		AuthorizationRequest req = new AuthorizationRequest(ActionID.ACCEPT_QRY, template, source, node.getInterface());
		AuthorizationResponse res = evaluateRequestOnState( req );
		if (res.getDecision() == AuthorizationDecision.PERMIT) {
			Tuple t = node.query(template);
			if (t != null) {
				node.sendTuple( source , session , t );
			} else {
				node.sendFail( source , session , "Tuple not found!");				
			}
		}
		updatePolicState(req);
		this.lock.unlock();
		if (res.getObligations().size()> 0){
			node.addAgent(getAgentFromObligations(res.getObligations()));
		}
	}

	@Override
	public boolean put(Agent a, Tuple t, Target l) throws InterruptedException,
			IOException {
		this.lock.lock();
		AuthorizationRequest req = new AuthorizationRequest(ActionID.PUT, t, l, node.getInterface());
		AuthorizationResponse res = evaluateRequestOnState( req );
		if (res.getDecision() == AuthorizationDecision.PERMIT) {
			node.put(t, l);
		}
		updatePolicState(req);
		this.lock.unlock();
		if (res.getObligations().size()> 0){
			a.exec(getAgentFromObligations(res.getObligations()));
		}
		return true;
	}

	@Override
	public Tuple get(Agent a, Template t, Target l)
			throws InterruptedException, IOException {
		this.lock.lock();
		AuthorizationRequest req = new AuthorizationRequest(ActionID.GET, t, l, node.getInterface());
		AuthorizationResponse res = evaluateRequestOnState( req );
		updatePolicState(req);
		this.lock.unlock();
		Tuple result = null;
		if (res.getDecision() == AuthorizationDecision.PERMIT) {
			result = node.get(t, l);
		}
		if (res.getObligations().size()> 0){
			a.exec(getAgentFromObligations(res.getObligations()));
		}
		return result;
	}

	@Override
	public Tuple query(Agent a, Template t, Target l)
			throws InterruptedException, IOException {
		this.lock.lock();
		AuthorizationRequest req = new AuthorizationRequest(ActionID.QRY, t, l, node.getInterface());
		AuthorizationResponse res = evaluateRequestOnState( req );
		updatePolicState(req);
		this.lock.unlock();
		Tuple result = null;
		if (res.getDecision() == AuthorizationDecision.PERMIT) {
			result = node.get(t, l);
		}
		if (res.getObligations().size()> 0){
			a.exec(getAgentFromObligations(res.getObligations()));
		}
		return result;
	}

	@Override
	public void exec(Agent a, Agent b) throws InterruptedException {
		this.lock.lock();
		AuthorizationRequest req = new AuthorizationRequest(ActionID.EXEC, b , null , node.getInterface());
		AuthorizationResponse res = evaluateRequestOnState( req );
		updatePolicState(req);
		this.lock.unlock();
		if (res.getDecision() == AuthorizationDecision.PERMIT) {
			a.exec(b);
		}
		if (res.getObligations().size()> 0){
			a.exec(getAgentFromObligations(res.getObligations()));
		}
	}

	@Override
	public void acceptGroupPut(PointToPoint from, int session,
			GroupPredicate groupPredicate, Tuple tuple) throws IOException,
			InterruptedException {
		this.lock.lock();
		AuthorizationRequest req = new AuthorizationRequest(ActionID.ACCEPT_PUT, tuple, from, node.getInterface());
		AuthorizationResponse res = evaluateRequestOnState( req );
		node.gPut( from , session , groupPredicate , tuple );
		updatePolicState(req);
		this.lock.unlock();
		if (res.getObligations().size()> 0){
			node.addAgent(getAgentFromObligations(res.getObligations()));
		}
	}

	@Override
	public void acceptGroupGet(PointToPoint from, int session,
			GroupPredicate groupPredicate, Template template)
			throws IOException, InterruptedException {
		this.lock.lock();
		AuthorizationRequest req = new AuthorizationRequest(ActionID.ACCEPT_GET, template, from, node.getInterface());
		AuthorizationResponse res = evaluateRequestOnState( req );
		node.gGet( from , session , groupPredicate , template );
		updatePolicState(req);
		this.lock.unlock();
		if (res.getObligations().size()> 0){
			node.addAgent(getAgentFromObligations(res.getObligations()));
		}
	}

	@Override
	public void acceptGroupQuery(PointToPoint from, int session,
			GroupPredicate groupPredicate, Template template)
			throws IOException, InterruptedException {
		this.lock.lock();
		AuthorizationRequest req = new AuthorizationRequest(ActionID.ACCEPT_QRY, template, from, node.getInterface());
		AuthorizationResponse res = evaluateRequestOnState( req );
		node.gQuery(from , session , groupPredicate , template );
		updatePolicState(req);
		this.lock.unlock();
		if (res.getObligations().size()> 0){
			node.addAgent(getAgentFromObligations(res.getObligations()));
		}
	}

	@Override
	public String fresh(Agent a) throws InterruptedException {
		this.lock.lock();
		AuthorizationRequest req = new AuthorizationRequest(ActionID.FRESH, null, null, node.getInterface());
		AuthorizationResponse res = evaluateRequestOnState( req );
		String result = node.fresh();
		updatePolicState(req);
		this.lock.unlock();
		if (res.getObligations().size()> 0){
			a.exec( getAgentFromObligations(res.getObligations()));
		}
		return result;
	}

	@Override
	public void setNode(Node node) {
		this.node = node;
	}
	
	private Agent getAgentFromObligations(List<FulfilledObligation> obls){
		
		//TODO
		
		return null;
	}
	
}
