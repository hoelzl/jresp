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
package org.cmg.resp.examples.group;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.cmg.resp.topology.Group;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.Self;
import org.cmg.resp.topology.VirtualPort;

/**
 * @author Michele Loreti
 *
 */
public class GroupPut {

	public static VirtualPort vp = new VirtualPort(10);

	public static GroupPredicate any = new GroupPredicate() {		
		@Override
		public boolean evaluate(Attribute[] data) {
			return true;
		}
	};
	
	
	public static class GPutAgent extends Agent {

		public GPutAgent() {
			super("GPutAgent");
		}

		@Override
		protected void doRun() {
			try {
				put(new Tuple(("TEST")), new Group(any));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static class GetAgent extends Agent {

		public GetAgent() {
			super("GetAgent");
		}

		@Override
		protected void doRun() {
			try {
				get(new Template( new FormalTemplateField(String.class) ) , Self.SELF);
				System.out.println("RECEIVED!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] argv) {
		Node<TupleSpace> node1 = new Node<TupleSpace>("node1", new TupleSpace());
		Node<TupleSpace> node2 = new Node<TupleSpace>("node2", new TupleSpace());
		Node<TupleSpace> node3 = new Node<TupleSpace>("node3", new TupleSpace());
		node1.addPort(vp);
		node1.setGroupActionWaitingTime(100);
		node2.addPort(vp);
		node2.setGroupActionWaitingTime(100);
		node3.addPort(vp);
		node3.setGroupActionWaitingTime(100);
		Agent agent1 = new GPutAgent();
		Agent agent2 = new GetAgent();
		Agent agent3 = new GetAgent();
		node1.addAgent(agent1);
		node2.addAgent(agent2);
		node3.addAgent(agent3);
		node3.start();
		node2.start();
		node1.start();
		
	}
	
}
