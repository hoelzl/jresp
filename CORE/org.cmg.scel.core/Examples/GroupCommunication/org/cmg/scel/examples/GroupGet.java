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

import org.cmg.scel.behaviour.Agent;
import org.cmg.scel.knowledge.FormalTemplateField;
import org.cmg.scel.knowledge.SCELValue;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.knowledge.SCELValue.SCELType;
import org.cmg.scel.knowledge.ts.TupleSpace;
import org.cmg.scel.topology.Group;
import org.cmg.scel.topology.GroupPredicate;
import org.cmg.scel.topology.Node;
import org.cmg.scel.topology.Self;
import org.cmg.scel.topology.VirtualPort;

/**
 * @author Michele Loreti
 *
 */
public class GroupGet {

	public static VirtualPort vp = new VirtualPort(10);

	public static GroupPredicate any = new GroupPredicate() {		
		@Override
		public boolean evaluate(Object[] data) {
			return true;
		}
	};
	
	
	public static class GGetAgent extends Agent {

		public GGetAgent() {
			super("GGetAgent");
		}

		@Override
		protected void doRun() {
			try {
				while (true) {
					Template tmp = new Template( new FormalTemplateField(SCELType.STRING) );
					Group g = new Group(any);
					Tuple t = get( tmp , g );
					System.out.println("RECEIVED: "+t.toString());
				}
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
		TupleSpace ts2 =new TupleSpace();
		ts2.put(new Tuple(SCELValue.getString("TEST_1") ) );
		Node<TupleSpace> node2 = new Node<TupleSpace>("node2", ts2 );
		TupleSpace ts3 =new TupleSpace();
		ts3.put(new Tuple(SCELValue.getString("TEST_2") ) );
		Node<TupleSpace> node3 = new Node<TupleSpace>("node3", ts3);
		node1.addPort(vp);
		node1.setGroupActionWaitingTime(100);
		node2.addPort(vp);
		node2.setGroupActionWaitingTime(100);
		node3.addPort(vp);
		node3.setGroupActionWaitingTime(100);
		Agent agent1 = new GGetAgent();
		node1.addAgent(agent1);
		agent1.start();
		node3.start();
		node2.start();
		node1.start();
		
	}
	
}
