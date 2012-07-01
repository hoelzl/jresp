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
package org.cmg.scel.examples;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.cmg.scel.behaviour.Agent;
import org.cmg.scel.knowledge.ActualTemplateField;
import org.cmg.scel.knowledge.SCELValue;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.knowledge.ts.TupleSpace;
import org.cmg.scel.topology.InetPort;
import org.cmg.scel.topology.Locality;
import org.cmg.scel.topology.Node;
import org.cmg.scel.topology.Self;

/**
 * @author Michele Loreti
 *
 */
public class RemotePingPong {

	
	
	public static void main(String[] argv) throws IOException {
		InetPort pingPort = new InetPort(9999);
		InetPort pongPort = new InetPort(9998);
		Node<TupleSpace> pingNode = new Node<TupleSpace>("ping", new TupleSpace());
		pingNode.addPort(pingPort);
		Agent ping = new PingAgent();
		Agent pong = new PongAgent();
		pingNode.addAgent(ping);
		ping.start();
		Node<TupleSpace> pongNode = new Node<TupleSpace>("pong", new TupleSpace());
		pongNode.addPort(pongPort);
		pongNode.addAgent(pong);
		pong.start();
		pongNode.start();
		pingNode.start();
	}
	
	
	public static class PingAgent extends Agent {

		Locality other = new Locality("pong", new InetSocketAddress(9998));
		
		public PingAgent() {
			super("PING");
		}

		@Override
		protected void doRun() {
			try {
				while (true) {
					System.out.println("PING!");
					put(new Tuple(SCELValue.getString("PING") ) , other);
					System.out.println("PING DONE!");
					get(new Template(new ActualTemplateField(SCELValue.getString("PONG"))) , Self.SELF);
					System.out.println("GET PONG!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}


	public static class PongAgent extends Agent {
	
		Locality other = new Locality("ping", new InetSocketAddress(9999));

		public PongAgent() {
			super("PONG");
		}
	
		@Override
		protected void doRun() {
			try {
				while (true) {
					get(new Template(new ActualTemplateField(SCELValue.getString("PING"))) , Self.SELF);
					System.out.println("PONG!");
					put(new Tuple(SCELValue.getString("PONG") ) , other);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
