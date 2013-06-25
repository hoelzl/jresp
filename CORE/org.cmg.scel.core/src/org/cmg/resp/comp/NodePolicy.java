/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universitˆ di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp.comp;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.policy.IPolicy;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Target;

/**
 * @author Michele Loreti
 *
 */
public class NodePolicy implements IPolicy {

	private INode node;

	public NodePolicy(INode node) {
		this.node = node;
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.topology.AgentContext#put(org.cmg.scel.topology.Agent, org.cmg.scel.knowledge.Tuple, org.cmg.scel.topology.Target)
	 */
	@Override
	public boolean put(Agent a, Tuple t, Target l) throws InterruptedException, IOException {
		return node.put(t, l);
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.topology.AgentContext#get(org.cmg.scel.topology.Agent, org.cmg.scel.knowledge.Template, org.cmg.scel.topology.Target)
	 */
	@Override
	public Tuple get(Agent a, Template t, Target l) throws InterruptedException, IOException {
		return node.get(t, l);
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.topology.AgentContext#query(org.cmg.scel.topology.Agent, org.cmg.scel.knowledge.Template, org.cmg.scel.topology.Target)
	 */
	@Override
	public Tuple query(Agent a, Template t, Target l)
			throws InterruptedException, IOException {
		return node.query(t, l);
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.topology.AgentContext#exec(org.cmg.scel.topology.Agent, org.cmg.scel.topology.Agent)
	 */
	@Override
	public void exec(Agent a, Agent b) throws InterruptedException {
		node.addAgent(b);
	}

	@Override
	public void acceptPut(PointToPoint from, int session, Tuple tuple) throws IOException, InterruptedException {
		node.put(from, session, tuple);
	}

	@Override
	public void acceptGet(PointToPoint source, int session , Template template) throws InterruptedException, IOException {
		Tuple t = node.get(template);
		if (t != null) {
			node.sendTuple( source , session , t );
		} else {
			node.sendFail( source , session , "Tuple not found!");				
		}
	}

	@Override
	public void acceptQuery(PointToPoint source, int session , Template template) throws InterruptedException, IOException {
		Tuple t = node.query(template);
		if (t != null) {
			node.sendTuple( source , session , t );
		} else {
			node.sendFail( source , session , "Tuple not found!");				
		}
	}

	@Override
	public void acceptGroupPut(PointToPoint from, int session,
			GroupPredicate groupPredicate, Tuple tuple) throws IOException, InterruptedException {
		node.gPut( from , session , groupPredicate , tuple );
	}

	@Override
	public void acceptGroupGet(PointToPoint from, int session,
			GroupPredicate groupPredicate, Template template) throws IOException,
			InterruptedException {
		node.gGet( from , session , groupPredicate , template );
	}

	@Override
	public void acceptGroupQuery(PointToPoint from, int session,
			GroupPredicate groupPredicate, Template template) throws IOException,
			InterruptedException {
		node.gQuery( from , session , groupPredicate , template );
	}

	@Override
	public String fresh() {
		return node.fresh();
	}

}
