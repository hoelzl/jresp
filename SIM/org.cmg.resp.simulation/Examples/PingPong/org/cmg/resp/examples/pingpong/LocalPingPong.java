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
package org.cmg.resp.examples.pingpong;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.core.simulation.ExponentialDelayFactory;
import org.cmg.resp.core.simulation.SimNode;
import org.cmg.resp.core.simulation.SimTupleSpace;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Self;

import umontreal.iro.lecuyer.simevents.Event;
import umontreal.iro.lecuyer.simprocs.ProcessSimulator;
import umontreal.iro.lecuyer.simprocs.ThreadProcessSimulator;

/**
 * @author Michele Loreti
 *
 */
public class LocalPingPong {
	
	public static void main(String[] argv) {
		
		ProcessSimulator sim = new ThreadProcessSimulator();
		sim.init();
		SimNode node = new SimNode("pingpong", new SimTupleSpace(sim),sim,new ExponentialDelayFactory(1.0));
		Agent ping = new PingAgent();
		Agent pong = new PongAgent();
		node.addAgent(ping);		
		node.addAgent(pong);
		System.out.println("START!");
		node.start();
		new Event(sim) {
			
			@Override
			public void actions() {
				sim.stop();
			}
		}.schedule(20.0);
		sim.start();
	}
	
	
	public static class PingAgent extends Agent {

		public PingAgent() {
			super("PING");
		}

		@Override
		protected void doRun() {
			try {
				while (true) {
					System.out.println("PING!");
					put(new Tuple( "PING" ) , Self.SELF);
					query(new Template(new ActualTemplateField( "PONG" )) , Self.SELF);
					System.out.println("QUERY PONG!");
					get(new Template(new ActualTemplateField( "PONG")) , Self.SELF);
					System.out.println("GET PONG!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}


	public static class PongAgent extends Agent {
	
		public PongAgent() {
			super("PONG");
		}
	
		@Override
		protected void doRun() {
			try {
				while (true) {
					get(new Template(new ActualTemplateField( "PING" )) , Self.SELF);
					System.out.println("PONG!");
					put(new Tuple( "PONG" ) , Self.SELF);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
