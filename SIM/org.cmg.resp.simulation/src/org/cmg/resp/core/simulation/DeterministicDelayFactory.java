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

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.INode;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Target;

import umontreal.iro.lecuyer.randvar.ExponentialGen;
import umontreal.iro.lecuyer.rng.MRG32k3a;
import umontreal.iro.lecuyer.rng.RandomStream;

/**
 * @author loreti
 *
 */
public class DeterministicDelayFactory implements IDelayFactory {

	private double delay;		

	public DeterministicDelayFactory(double delay) {
		this.delay = delay;
	}
	
//	public DeterministicDelayFactory(RandomStream stream, double lambda) {
//		this.stream = stream;
//		this.lambda = lambda;
//	}

	@Override
	public double getPutDelay(INode<?> node, Agent a, Tuple t, Target l) {
		return delay;
	}

	@Override
	public double getGetDelay(INode<?> node, Agent a, Template t, Target l) {
		return delay;
	}

	@Override
	public double getQueryDelay(INode<?> node, Agent a, Template t, Target l) {
		return delay;
	}

	@Override
	public double getExecDelay(INode<?> node, Agent a, Agent b) {
		return delay;
	}

}
