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
package org.cmg.res.examples.robotic;

import umontreal.iro.lecuyer.simevents.*;
import umontreal.iro.lecuyer.simprocs.*;
import umontreal.iro.lecuyer.rng.*;
import umontreal.iro.lecuyer.randvar.ExponentialGen;
import umontreal.iro.lecuyer.stat.Tally;
import java.io.*;
import java.util.*;

/**
 * @author loreti
 *
 */
public class Test {

	public static double LAMBDA = 1.0;
	public static double MU = 2.0;
	public static double H = 0.5;
	public static ProcessSimulator sim = new ThreadProcessSimulator();
	public static RandomStream  streamWriter = new MRG32k3a();		
	public static RandomStream  streamReader = new MRG32k3a();		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Buffer buffer = new Buffer(10);
		sim.init();
		new Printer(sim, buffer).schedule(0.0);
		startProducers(buffer,1000);
		startConsumer(buffer,1000);
		new EndOfSimulation(sim).schedule(100.1);
		sim.start();
				
	}

	private static void startProducers(Buffer buffer, int n) {
		for (int i=0 ; i<n; i++) {
			new Producer( sim , buffer).schedule(0.0);
		}

	}

	private static void startConsumer(Buffer buffer, int n) {
		for (int i=0 ; i<n; i++) {
			new Consumer( sim , buffer).schedule(0.0);
		}

	}

	public static class Printer extends Event {

		private Buffer buffer;

		public Printer(ProcessSimulator sim, Buffer buffer) {
			super(sim);
			this.buffer = buffer;
		}

		@Override
		public void actions() {
			System.out.println(sim.time()+ ") "+this.buffer.elem+" of "+this.buffer.size+ " [WQ:"+this.buffer.waitingWriters.size()+", RQ:"+this.buffer.waitingReaders.size()+"]");
			schedule(H);
		}
		
		
		
	}
	
	
	public static class Buffer {
		
		LinkedList<SimProcess> waitingReaders = new LinkedList<SimProcess>();
		LinkedList<SimProcess> waitingWriters = new LinkedList<SimProcess>();
		
		private int size;
		private int elem;
		
		public Buffer(int size) {
			this.size = size;
			this.elem = 0;
		}
		
		public void read() throws InterruptedException {
			while (elem == 0) {
				SimProcess proc = sim.currentProcess();
				waitingReaders.add(proc);
				proc.suspend();
			}
			elem--;
			if (!waitingWriters.isEmpty()) {
				SimProcess proc = waitingWriters.poll();
				proc.resume();
			}
//			for (SimProcess proc : waitingWriters) {
//				proc.resume();
//			}
		}
		
		public void write() throws InterruptedException {
			while (elem == size) {
				SimProcess proc = sim.currentProcess();
				waitingWriters.add(proc);
				proc.suspend();
			}
			elem++;
			if (!waitingReaders.isEmpty()) {
				SimProcess proc = waitingReaders.poll();
				proc.resume();
			}
//			for (SimProcess proc : waitingReaders) {
//				proc.resume();
//			}
		}
		
	}
	
	public static class Producer extends SimProcess {

		private Buffer buffer;

		public Producer(ProcessSimulator sim, Buffer buffer) {
			super(sim);
			this.buffer = buffer;
		}

		@Override
		public void actions() {
			try {
				while (true) {
					buffer.write();
					delay(ExponentialGen.nextDouble (streamWriter, MU));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static class Consumer extends SimProcess {
		
		private Buffer buffer;
		
		public Consumer(ProcessSimulator sim, Buffer buffer) {
			super(sim);
			this.buffer = buffer;
		}

		@Override
		public void actions() {
			try {
				while (true) {
					buffer.read();
					delay(ExponentialGen.nextDouble (streamWriter, LAMBDA));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public static class EndOfSimulation extends Event {

		public EndOfSimulation(ProcessSimulator sim) {
			super(sim);
		}

		@Override
		public void actions() {
			sim.stop();
		}
		
	}
	
}
