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

import org.cmg.resp.core.simulation.Simulation;

import umontreal.iro.lecuyer.randvar.ExponentialGen;
import umontreal.iro.lecuyer.rng.MRG32k3a;
import umontreal.iro.lecuyer.rng.RandomStream;
import umontreal.iro.lecuyer.simprocs.ProcessSimulator;
import umontreal.iro.lecuyer.simprocs.SimProcess;

/**
 * @author loreti
 *
 */
public class TestSimulation extends Simulation {

	private int size;
	private int limit = 100;
	private int counter = 0;
	public static RandomStream  stream = new MRG32k3a();		
	public static double LAMBDA = 1.0;
	
	public TestSimulation(int size , int limit ) {
		this.size = size;
		this.limit = limit;
	}
	
	@Override
	protected void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean checkFailureCondition() {
		return false;
	}

	@Override
	protected boolean checkSuccessCondition() {
		return (counter>=limit);
	}

	@Override
	protected void update(double dt) {
	}

	@Override
	protected void init(ProcessSimulator sim) {
		for( int i=0 ;i <size ; i++) {
			new ProcessCounter().schedule(0.0);
		}
	}

	@Override
	protected void schedultEvents(ProcessSimulator sim) {
	}

	
	public class ProcessCounter extends SimProcess {
		
//		public ProcessCounter(ProcessSimulator sim) {
//			super(sim);
//		}
		
		public void actions() {
			while (counter<limit) {
				counter++;
				delay(1.0);//ExponentialGen.nextDouble (stream, LAMBDA));				
			}
		}
		
	}
	
	public static void main(String[] argv) {
		TestSimulation ts = new TestSimulation(1, 10);
		System.out.println( "PROB: "+ts.estimateProbability(1, 100, 1.0) );
	}
}
