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
import org.cmg.resp.topology.SocketPort;
import org.cmg.resp.topology.SocketPortAddress;

/**
 * @author Michele Loreti
 *
 */
public class RemotePingPong2 {

	public static void main(String[] argv) throws IOException {
		SocketPort pingPort = new SocketPort(9999);
		SocketPort pongPort = new SocketPort(9998);
		Node pingNode = new Node("ping", new TupleSpace());
		pingNode.addPort(pingPort);
		Agent ping = new PingAgent();
		Agent pong = new PongAgent();
		pingNode.addAgent(ping);
		Node pongNode = new Node("pong", new TupleSpace());
		pongNode.addPort(pongPort);
		pongNode.addAgent(pong);
		pongNode.start();
		pingNode.start();
	}
	
	
	public static class PingAgent extends Agent {

		PointToPoint other = new PointToPoint("pong", new SocketPortAddress(9998));
		
		public PingAgent() {
			super("PING");
		}

		@Override
		protected void doRun() {
			try {
				while (true) {
					System.out.println("PING!");
					get( new Template(new ActualTemplateField( "PING" ) ), other);
					System.out.println("PING DONE!");
					put( new Tuple( "PONG" ) , Self.SELF);
					System.out.println("GET PONG!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}


	public static class PongAgent extends Agent {
	
		PointToPoint other = new PointToPoint("ping", new SocketPortAddress(9999));

		public PongAgent() {
			super("PONG");
		}
	
		@Override
		protected void doRun() {
			try {
				while (true) {
					put(new Tuple( "PING" ), Self.SELF);
					System.out.println("PONG!");
					get(new Template(new ActualTemplateField( "PONG" ) ) , other);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
