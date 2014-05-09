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
package org.cmg.resp.policy.facpl;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.policy.IPolicy;
import org.cmg.resp.policy.PolicyAutomaton;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Target;

/**
 * @author Michele Loreti
 *
 */
public class FacplPolicy implements IPolicy {
	
	private PolicyAutomaton automata;
	
	public FacplPolicy( Node n /*, Policy facplPolicy */ ) {

	}

	@Override
	public void acceptPut(PointToPoint from, int session, Tuple tuple)
			throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptGet(PointToPoint source, int session, Template template)
			throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptQuery(PointToPoint source, int session, Template template)
			throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean put(Agent a, Tuple t, Target l) throws InterruptedException,
			IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Tuple get(Agent a, Template t, Target l)
			throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple query(Agent a, Template t, Target l)
			throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void exec(Agent a, Agent b) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptGroupPut(PointToPoint from, int session,
			GroupPredicate groupPredicate, Tuple tuple) throws IOException,
			InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptGroupGet(PointToPoint from, int session,
			GroupPredicate groupPredicate, Template template)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptGroupQuery(PointToPoint from, int session,
			GroupPredicate groupPredicate, Template template)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String fresh( Agent a ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNode(Node node) {
		// TODO Auto-generated method stub
		
	}
	
	

}
