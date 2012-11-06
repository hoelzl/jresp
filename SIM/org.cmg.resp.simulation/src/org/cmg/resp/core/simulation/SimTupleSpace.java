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

import java.util.ArrayList;
import java.util.LinkedList;

import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.ts.TupleSpace;

import umontreal.iro.lecuyer.simprocs.ProcessSimulator;
import umontreal.iro.lecuyer.simprocs.SimProcess;

/**
 * @author loreti
 *
 */
public class SimTupleSpace extends TupleSpace {

	private ProcessSimulator sim;

	public class WaitingElement {
		public Template template;
		public SimProcess process;
		public boolean isGet;
		public Tuple t;
		public WaitingElement(Template template, SimProcess process,
				boolean isGet) {
			super();
			this.template = template;
			this.process = process;
			this.isGet = isGet;
		}
	}
	
	public LinkedList<WaitingElement> waiting = new LinkedList<WaitingElement>();
	
	public SimTupleSpace( ProcessSimulator sim ) {
		this.sim = sim;
	}
	
	@Override
	public boolean put(Tuple t) {
		if (!consumedBywaitingElements(t)) {
			return super.put(t);
		}
		return true;
	}

	private boolean consumedBywaitingElements(Tuple t) {
		LinkedList<WaitingElement> old = waiting;
		waiting = new LinkedList<WaitingElement>();
		for (WaitingElement waitingElement : old) {
			if (waitingElement.template.match(t)) {
				waitingElement.t = t;
				waitingElement.process.resume();
			}
			if (waitingElement.isGet) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Tuple get(Template template) throws InterruptedException {
		Tuple t = getp(template);
		if (t==null) {
			SimProcess process = sim.currentProcess();
			WaitingElement element = new WaitingElement(template,process,true);
			waiting.add(element);
			process.suspend();
			return element.t;
		}
		return t;
	}

	@Override
	public Tuple getp(Template template) {
		return super.getp(template);
	}

	@Override
	public Tuple query(Template template) throws InterruptedException {
		Tuple t = queryp(template);
		if (t==null) {
			SimProcess process = sim.currentProcess();
			WaitingElement element = new WaitingElement(template,process,false);
			waiting.add(element);
			process.suspend();
			return element.t;
		}
		return t;
	}

	@Override
	public Tuple queryp(Template template) {
		return super.queryp(template);
	}

}
