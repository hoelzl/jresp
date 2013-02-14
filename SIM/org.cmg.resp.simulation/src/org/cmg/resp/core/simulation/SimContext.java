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
package org.cmg.resp.core.simulation;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.behaviour.AgentContext;
import org.cmg.resp.comp.INode;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Target;

import umontreal.iro.lecuyer.simprocs.ProcessSimulator;
import umontreal.iro.lecuyer.simprocs.SimProcess;

/**
 * @author loreti
 *
 */
public class SimContext extends SimProcess implements AgentContext {

	private INode<?> node;
	private IDelayFactory df;
	private Agent a;
	
	public SimContext( INode<?> node , IDelayFactory df , ProcessSimulator sim, Agent a ) {
		super(sim);
		this.node = node;
		this.df = df;
		this.a = a;
	}
	
	@Override
	public boolean put(Agent a, Tuple t, Target l) throws InterruptedException,
			IOException {
		delay(df.getPutDelay(node,a,t,l));
		return node.put(t, l);
	}

	@Override
	public Tuple get(Agent a, Template t, Target l)
			throws InterruptedException, IOException {
		delay(df.getGetDelay(node,a,t,l));
		return node.get(t, l);
	}

	@Override
	public Tuple query(Agent a, Template t, Target l)
			throws InterruptedException, IOException {
		delay(df.getQueryDelay(node,a,t,l));
		return node.query(t, l);
	}

	@Override
	public void exec(Agent a, Agent b) throws InterruptedException {
		delay(df.getExecDelay(node,a,b));
	}

	@Override
	public String fresh() {
		return node.fresh();
	}

	@Override
	public void done(Agent agent) {
	}

	@Override
	public void actions() {
		a.run();
	}

	@Override
	public void suspend(long t) throws InterruptedException {
		delay(t);
	}
}
