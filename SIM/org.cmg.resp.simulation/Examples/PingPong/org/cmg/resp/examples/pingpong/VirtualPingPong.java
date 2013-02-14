/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universitą di Firenze
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

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.core.simulation.ExponentialDelayFactory;
import org.cmg.resp.core.simulation.Shared;
import org.cmg.resp.core.simulation.SimNode;
import org.cmg.resp.core.simulation.SimTupleSpace;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Self;
import org.cmg.resp.topology.VirtualPort;
import org.cmg.resp.topology.VirtualPortAddress;

import umontreal.iro.lecuyer.simevents.Event;
import umontreal.iro.lecuyer.simprocs.ProcessSimulator;
import umontreal.iro.lecuyer.simprocs.ThreadProcessSimulator;

/**
 * @author Michele Loreti
 *
 */
public class VirtualPingPong {

	public static void main(String[] argv) throws IOException {

		
		ProcessSimulator sim = new ThreadProcessSimulator();
		sim.init();
		VirtualPort vp = new VirtualPort(10);
		SimNode pingNode = new SimNode("ping", new SimTupleSpace(sim),sim,new ExponentialDelayFactory(1.0));
		SimNode pongNode = new SimNode("pong", new SimTupleSpace(sim),sim,new ExponentialDelayFactory(1.0));
		pingNode.addPort(vp);
		pongNode.addPort(vp);
		Agent ping = new PingAgent();
		Agent pong = new PongAgent();
		pingNode.addAgent(ping);		
		pongNode.addAgent(pong);
		System.out.println("START!");
		pingNode.start();
		pongNode.start();
		new Event(sim) {
			
			@Override
			public void actions() {
				sim.stop();
			}
		}.schedule(20.0);
		sim.start();
	}
	
	
	public static class PingAgent extends Agent {

		PointToPoint other = new PointToPoint("pong", new VirtualPortAddress(10));
		private Shared<Boolean> flag;
		
		public PingAgent() {
			this(new Shared<Boolean>(true));
		}

		public PingAgent(Shared<Boolean> flag) {
			super("PING");
			this.flag = flag;
		}

		@Override
		protected void doRun() {
			try {
				while (flag.get()) {
//					System.out.println("PING!");
					put(new Tuple( "PING" ) , other);
//					System.out.println("PING DONE!");
					get(new Template(new ActualTemplateField( "PONG" )) , Self.SELF);
//					System.out.println("GET PONG!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
//			System.out.println("TERMINATED PING");
		}
		
	}


	public static class PongAgent extends Agent {
	
		PointToPoint other = new PointToPoint("ping", new VirtualPortAddress(10));
		private Shared<Boolean> flag;

		public PongAgent() {
			this(new Shared<Boolean>(true));
		}
	
		public PongAgent(Shared<Boolean> flag) {
			super("PONG");
			this.flag = flag;
		}

		@Override
		protected void doRun() {
			try {
				while (flag.get()) {
					get(new Template(new ActualTemplateField( "PING" )) , Self.SELF);
//					System.out.println("GET PING!");
//					System.out.println("PONG!");
					put(new Tuple( "PONG" ) , other);
//					System.out.println("PONG DONE!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
//			System.out.println("TERMINATED PONG");
		}
		
	}

}
