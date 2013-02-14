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
package org.cmg.resp.core.simulation;

import umontreal.iro.lecuyer.simevents.Event;
import umontreal.iro.lecuyer.simprocs.ProcessSimulator;
import umontreal.iro.lecuyer.simprocs.ThreadProcessSimulator;

/**
 * @author loreti
 *
 */
public abstract class Simulation {	

	public boolean run(double deadline , final double dt ) {
		ProcessSimulator sim = new ThreadProcessSimulator();
		final Result result = new Result();
		sim.init();
		init(sim);
		schedultEvents(sim);
		new Event(sim) {
			
			@Override
			public void actions() {
				sim.stop();
			}
		}.schedule(deadline+dt);
		new Event(sim) {
			
			@Override
			public void actions() {
//				System.out.println("Time "+sim.time());
				update(dt);
				if (checkSuccessCondition()) {
					result.setResult(true);
					System.out.println("Success! Time: "+sim.time());
					sim.stop();
				}
				if (checkFailureCondition()) {
					result.setResult(false);
					System.out.println("Failure! Time: "+sim.time());
					sim.stop();
				}
				schedule(dt);
			}
			
		}.schedule(0.0);
		sim.start();
		dispose();
		return result.getResult();
	}

	protected abstract void dispose();

	protected abstract boolean checkFailureCondition();

	protected abstract boolean checkSuccessCondition();

	protected abstract void update(double dt);

	protected abstract void init(ProcessSimulator sim);
	
	protected abstract void schedultEvents(ProcessSimulator sim);
	
	public static class Result {
		
		private boolean result = false;
		
		public boolean getResult() {
			return result;
		}
		
		public void setResult( boolean result ) {
			this.result = result;
		}
	}
	
	public double estimateProbability( double eps , double delta , double deadline , double dt ) {
		double iterations = Math.floor(4*Math.log(2/delta)/Math.pow(eps, 2.0));
		return estimateProbability( iterations , deadline , dt );		
	}
	
	public double estimateProbability( double iterations , double deadline , double dt ) {
		double success = 0.0;
		for( int i=0 ; i<iterations ; i++ ) {
//			System.out.print("Iteration "+i);
			System.out.flush();
			if (run(deadline,dt)) {
				success = success + 1.0;
			} 
//			System.out.println(" DONE!");
		}
		return success/iterations;		
	}

}
