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
import org.cmg.resp.core.simulation.ConstantDelayFactory;
import org.cmg.resp.core.simulation.SimNode;
import org.cmg.resp.core.simulation.SimTupleSpace;
import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.cmg.resp.topology.Group;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.VirtualPort;

import umontreal.iro.lecuyer.simevents.Event;
import umontreal.iro.lecuyer.simprocs.ProcessSimulator;
import umontreal.iro.lecuyer.simprocs.ThreadProcessSimulator;

/**
 * @author Michele Loreti
 *
 */
public class GroupGet {

	public static VirtualPort vp = new VirtualPort(10);

	public static GroupPredicate any = new GroupPredicate() {		
		@Override
		public boolean evaluate(Attribute[] data) {
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
					Template tmp = new Template( new FormalTemplateField( String.class ) );
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
		ProcessSimulator sim = new ThreadProcessSimulator();
		sim.init();
		SimNode node1 = new SimNode("node1", new SimTupleSpace(sim),sim, new ConstantDelayFactory(1.0));
		SimTupleSpace ts2 =new SimTupleSpace(sim);
		ts2.put(new Tuple(("TEST_1") ) );
		SimNode node2 = new SimNode("node2", ts2 ,sim , new ConstantDelayFactory(1.0));
		SimTupleSpace ts3 =new SimTupleSpace(sim);
		ts3.put(new Tuple(("TEST_2") ) );
		SimNode node3 = new SimNode("node3", ts3, sim, new ConstantDelayFactory(1.0));
		node1.addPort(vp);
		node1.setGroupActionWaitingTime(10);
		node2.addPort(vp);
		node2.setGroupActionWaitingTime(10);
		node3.addPort(vp);
		node3.setGroupActionWaitingTime(10);
		Agent agent1 = new GGetAgent();
		node1.addAgent(agent1);
		node3.start();
		node2.start();
		node1.start();
		new Event(sim) {
			
			@Override
			public void actions() {
				sim.stop();
			}
		}.schedule(200.0);
		sim.start();
	}
	
}
