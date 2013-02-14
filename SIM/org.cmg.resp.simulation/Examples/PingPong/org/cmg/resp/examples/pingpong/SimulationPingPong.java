package org.cmg.resp.examples.pingpong;
import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.core.simulation.ExponentialDelayFactory;
import org.cmg.resp.core.simulation.Shared;
import org.cmg.resp.core.simulation.SimNode;
import org.cmg.resp.core.simulation.SimTupleSpace;
import org.cmg.resp.core.simulation.Simulation;
import org.cmg.resp.topology.VirtualPort;

import umontreal.iro.lecuyer.simevents.Event;
import umontreal.iro.lecuyer.simprocs.ProcessSimulator;

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

/**
 * @author loreti
 *
 */
public class SimulationPingPong extends Simulation {

	private int size;
	private int teminated;
	private Shared<Boolean> flag = new Shared<Boolean>(true);
	
	public SimulationPingPong( int size ) {
		this.size = size;
	}
	
	@Override
	protected boolean checkFailureCondition() {
		return false;
	}

	@Override
	protected boolean checkSuccessCondition() {
		return (teminated==2*size);
	}

	@Override
	protected void update(double dt) {
	}

	@Override
	protected void init(ProcessSimulator sim) {
		flag.set(true);
		VirtualPort vp = new VirtualPort(10);
		SimNode pingNode = new SimNode("ping", new SimTupleSpace(sim),sim,new ExponentialDelayFactory(1.0));
		SimNode pongNode = new SimNode("pong", new SimTupleSpace(sim),sim,new ExponentialDelayFactory(1.0));
		pingNode.addPort(vp);
		pongNode.addPort(vp);
//		Agent ping = new PingAgent(flag);
//		Agent pong = new PongAgent(flag);
//		pingNode.addAgent(ping);		
//		pongNode.addAgent(pong);
		System.out.println("START!");
		pingNode.start();
		pongNode.start();
	}

	public static void main(String[] argv) {
		SimulationPingPong spp = new SimulationPingPong(10);
		double prob = spp.estimateProbability(100000, 100, 0.1);
		System.out.println("Prob: "+prob);
	}

	@Override
	protected void schedultEvents(ProcessSimulator sim) {
//		new Event( sim ) {
//
//			@Override
//			public void actions() {
//				System.out.println("Time: "+sim.time());
//				schedule(0.5);
//			}
//			
//		}.schedule(0.0);
	}

	@Override
	protected void dispose() {
		flag.set(false);
	}
}
