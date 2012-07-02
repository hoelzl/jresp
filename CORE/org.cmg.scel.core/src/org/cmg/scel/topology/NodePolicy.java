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
package org.cmg.scel.topology;

import java.io.IOException;

import org.cmg.scel.behaviour.Agent;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.policy.IPolicy;

/**
 * @author Michele Loreti
 *
 */
public class NodePolicy implements IPolicy {

	private Node<?> node;

	public NodePolicy(Node<?> node) {
		this.node = node;
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.topology.AgentContext#put(org.cmg.scel.topology.Agent, org.cmg.scel.knowledge.Tuple, org.cmg.scel.topology.Target)
	 */
	@Override
	public void put(Agent a, Tuple t, Target l) throws InterruptedException, IOException {
		node.put(t, l);
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
	public void put(PointToPoint source, Tuple tuple) {
		node.put( tuple );
	}

	@Override
	public Tuple get(PointToPoint source, Template template) throws InterruptedException {
		return node.get(template);
	}

	@Override
	public Tuple query(PointToPoint source, Template template) throws InterruptedException {
		return node.query(template);
	}

}
