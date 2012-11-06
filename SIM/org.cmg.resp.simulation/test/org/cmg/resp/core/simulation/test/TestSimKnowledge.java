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
package org.cmg.resp.core.simulation.test;

import org.cmg.resp.core.simulation.SimTupleSpace;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;

import umontreal.iro.lecuyer.simevents.Event;
import umontreal.iro.lecuyer.simprocs.SimProcess;
import umontreal.iro.lecuyer.simprocs.ThreadProcessSimulator;

/**
 * @author loreti
 *
 */
public class TestSimKnowledge {


	public TestSimKnowledge() {
	}
	
	public void simulate(double limit) {
		ThreadProcessSimulator sim = new ThreadProcessSimulator();		
		sim.init();
		final SimTupleSpace sts = new SimTupleSpace(sim);
		new SimProcess(sim) {
			
			@Override
			public void actions() {
				try {
					sts.query(new Template( new ActualTemplateField("test") ) );
					System.out.println("QUERY AT: "+sim.time());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
						
		}.schedule(6.0);
		new SimProcess(sim) {
			
			@Override
			public void actions() {
				try {
					sts.get(new Template( new ActualTemplateField("test") ) );
					System.out.println("GET AT: "+sim.time());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
						
		}.schedule(4.0);
		new SimProcess(sim) {
			
			@Override
			public void actions() {
				sts.put(new Tuple( "test" ) );
				System.out.println("PUT AT: "+sim.time());
			}
						
		}.schedule(10.0);
		new Event(sim) {
			
			@Override
			public void actions() {
				System.out.println("END AT: "+sim.time());
				sim.stop();
			}
		}.schedule(limit);
		sim.start();
	}

	public static void main(String[] argv) {
		TestSimKnowledge test = new TestSimKnowledge();
		test.simulate(4.0);
	}
}
