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
import org.cmg.resp.core.simulation.ExponentialDelayFactory;
import org.cmg.resp.core.simulation.SimNode;
import org.cmg.resp.core.simulation.SimTupleSpace;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Self;
import org.cmg.resp.topology.SocketPort;
import org.cmg.resp.topology.SocketPortAddress;
import org.cmg.resp.topology.VirtualPort;
import org.cmg.resp.topology.VirtualPortAddress;

import umontreal.iro.lecuyer.simevents.Event;
import umontreal.iro.lecuyer.simprocs.ProcessSimulator;
import umontreal.iro.lecuyer.simprocs.ThreadProcessSimulator;

/**
 * @author Michele Loreti
 *
 */
public class QueryCounters {

	public static void main(String[] argv) throws IOException {
		ProcessSimulator sim = new ThreadProcessSimulator();
		sim.init();
		VirtualPort vp = new VirtualPort(10);
		SimNode nodeOne = new SimNode("one", new SimTupleSpace(sim), sim , new ExponentialDelayFactory(1.0));
		nodeOne.addPort(vp);
		nodeOne.put(new Tuple( "COUNTER" , 0 ) );
		Agent one = new Counter("agentOne", new PointToPoint("two", new VirtualPortAddress(10)));
		Agent two = new Counter("agentTwo", new PointToPoint("one", new VirtualPortAddress(10)));
		nodeOne.addAgent(one);
		SimNode nodeTwo = new SimNode("two", new SimTupleSpace(sim), sim , new ExponentialDelayFactory(1.0));
		nodeTwo.addPort(vp);
		nodeTwo.put(new Tuple( "COUNTER" , 0 ) );
		nodeTwo.addAgent(two);
		nodeTwo.start();
		nodeOne.start();
		new Event(sim) {
			
			@Override
			public void actions() {
				sim.stop();
			}
		}.schedule(20.0);
		sim.start();
	}
	
	
	public static class Counter extends Agent {

		PointToPoint other;
		Template counterTemplate = new Template( new ActualTemplateField( "COUNTER" ) , new FormalTemplateField(Integer.class) );
		
		public Counter( String name , PointToPoint other ) {
			super(name);
			this.other = other;
			
		}

		@Override
		protected void doRun() {
			try {
				while (true) {
					System.out.println(getName()+": RETRIEVING COUNTER VALUE REMOTELY!");
					Tuple t = query( counterTemplate , other);
					System.out.println(getName()+": COUNTER VALUE RETRIEVED!");
					get(counterTemplate,Self.SELF);
					System.out.println(getName()+": LOCAL COUNTER REMOVED!");
					put( new Tuple( "COUNTER" , t.getElementAt(Integer.class,1)+1 ) , Self.SELF);
					System.out.println(getName()+": COUNTER UPDATED TO "+(t.getElementAt(Integer.class,1)+1)+"!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
