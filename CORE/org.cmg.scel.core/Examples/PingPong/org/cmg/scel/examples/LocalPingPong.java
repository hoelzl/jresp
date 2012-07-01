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

import org.cmg.scel.behaviour.Agent;
import org.cmg.scel.knowledge.ActualTemplateField;
import org.cmg.scel.knowledge.SCELValue;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.knowledge.ts.TupleSpace;
import org.cmg.scel.topology.Node;
import org.cmg.scel.topology.Self;

/**
 * @author Michele Loreti
 *
 */
public class LocalPingPong {
	
	public static void main(String[] argv) {
		
		Node<TupleSpace> node = new Node<TupleSpace>("pingpong", new TupleSpace());
		Agent ping = new PingAgent();
		Agent pong = new PongAgent();
		node.addAgent(ping);		
		node.addAgent(pong);
		ping.start();
		pong.start();
		System.out.println("START!");
		node.start();
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
					put(new Tuple(SCELValue.getString("PING") ) , Self.SELF);
					query(new Template(new ActualTemplateField(SCELValue.getString("PONG"))) , Self.SELF);
					System.out.println("QUERY PONG!");
					get(new Template(new ActualTemplateField(SCELValue.getString("PONG"))) , Self.SELF);
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
					get(new Template(new ActualTemplateField(SCELValue.getString("PING"))) , Self.SELF);
					System.out.println("PONG!");
					put(new Tuple(SCELValue.getString("PONG") ) , Self.SELF);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
