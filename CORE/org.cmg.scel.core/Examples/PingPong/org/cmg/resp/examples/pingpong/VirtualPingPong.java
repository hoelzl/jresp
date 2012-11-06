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

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Self;
import org.cmg.resp.topology.VirtualPort;
import org.cmg.resp.topology.VirtualPortAddress;

/**
 * @author Michele Loreti
 *
 */
public class VirtualPingPong {

	public static void main(String[] argv) throws IOException {
		VirtualPort vp = new VirtualPort(10);
		Node<TupleSpace> pingNode = new Node<TupleSpace>("ping", new TupleSpace());
		pingNode.addPort(vp);
		Agent ping = new PingAgent();
		Agent pong = new PongAgent();
		pingNode.addAgent(ping);
		Node<TupleSpace> pongNode = new Node<TupleSpace>("pong", new TupleSpace());
		pongNode.addPort(vp);
		pongNode.addAgent(pong);
		pongNode.start();
		pingNode.start();
	}
	
	
	public static class PingAgent extends Agent {

		PointToPoint other = new PointToPoint("pong", new VirtualPortAddress(10));
		
		public PingAgent() {
			super("PING");
		}

		@Override
		protected void doRun() {
			try {
				while (true) {
					System.out.println("PING!");
					put(new Tuple( "PING" ) , other);
					System.out.println("PING DONE!");
					get(new Template(new ActualTemplateField( "PONG" )) , Self.SELF);
					System.out.println("GET PONG!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}


	public static class PongAgent extends Agent {
	
		PointToPoint other = new PointToPoint("ping", new VirtualPortAddress(10));

		public PongAgent() {
			super("PONG");
		}
	
		@Override
		protected void doRun() {
			try {
				while (true) {
					get(new Template(new ActualTemplateField( "PING" )) , Self.SELF);
					System.out.println("GET PING!");
					System.out.println("PONG!");
					put(new Tuple( "PONG" ) , other);
					System.out.println("PONG DONE!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
