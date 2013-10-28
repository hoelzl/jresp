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

import java.awt.Event;
import java.io.IOException;
import java.util.Random;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.simulation.DeterministicDelayFactory;
import org.cmg.resp.simulation.RandomSelector;
import org.cmg.resp.simulation.SimulationEnvironment;
import org.cmg.resp.simulation.SimulationNode;
import org.cmg.resp.simulation.SimulationScheduler;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Self;
import org.cmg.resp.topology.VirtualPort;
import org.cmg.resp.topology.VirtualPortAddress;

/**
 * @author Michele Loreti
 *
 */
public class QueryCounters {

	public static void main(String[] argv) throws IOException {
		Random r = new Random();
		SimulationScheduler scheduler = new SimulationScheduler();
		SimulationEnvironment environment = new SimulationEnvironment(scheduler, new RandomSelector(r), new DeterministicDelayFactory(1.0));

		SimulationNode nodeOne = new SimulationNode("one", environment);

		nodeOne.put(new Tuple( "COUNTER" , 0 ) );
		Agent one = new Counter("agentOne", new PointToPoint("two", new VirtualPortAddress(10)));
		Agent two = new Counter("agentTwo", new PointToPoint("one", new VirtualPortAddress(10)));
		nodeOne.addAgent(one);
		SimulationNode nodeTwo = new SimulationNode("two", environment);

		nodeTwo.put(new Tuple( "COUNTER" , 0 ) );
		nodeTwo.addAgent(two);

		scheduler.start();
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
