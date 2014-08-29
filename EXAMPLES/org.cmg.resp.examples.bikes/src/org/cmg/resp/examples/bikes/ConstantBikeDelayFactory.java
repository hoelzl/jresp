/**
 * Copyright (c) 2014 Concurrency and Mobility Group.
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
package org.cmg.resp.examples.bikes;

import java.util.Random;

import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.simulation.IDelayFactory;
import org.cmg.resp.simulation.SimulationNode;
import org.cmg.resp.topology.GroupPredicate;

/**
 * @author loreti
 *
 */
public class ConstantBikeDelayFactory implements IDelayFactory {

	private Random random;

	public ConstantBikeDelayFactory( Random random ) {
		this.random = random;
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.simulation.IDelayFactory#getRetryTime(org.cmg.resp.simulation.SimulationNode)
	 */
	@Override
	public double getRetryTime(SimulationNode node) {
		return sampleExponential(1.0);
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.simulation.IDelayFactory#getLocalGetTime(org.cmg.resp.simulation.SimulationNode)
	 */
	@Override
	public double getLocalGetTime(SimulationNode node, Template t) {
		return sampleExponential(1.0);
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.simulation.IDelayFactory#getRemoteGetTime(org.cmg.resp.simulation.SimulationNode, org.cmg.resp.knowledge.Template, org.cmg.resp.simulation.SimulationNode)
	 */
	@Override
	public double getRemoteGetTime(SimulationNode src, Template t,
			SimulationNode trg) {
		return sampleExponential(1.0);
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.simulation.IDelayFactory#getGroupGetTime(org.cmg.resp.simulation.SimulationNode, org.cmg.resp.knowledge.Template, org.cmg.resp.topology.GroupPredicate, org.cmg.resp.simulation.SimulationNode)
	 */
	@Override
	public double getGroupGetTime(SimulationNode src, Template t,
			GroupPredicate target, SimulationNode trg) {
		return sampleExponential(10.0);	
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.simulation.IDelayFactory#getLocalPutTime(org.cmg.resp.simulation.SimulationNode)
	 */
	@Override
	public double getLocalPutTime(SimulationNode node, Tuple t) {
		if (Scenario.WALK_TEMPLATE.match(t)) {
			return sampleExponential(0.25);
		}
		if (Scenario.RIDE_TEMPLATE.match(t)) {
			return sampleExponential(0.5);
		}
		return sampleExponential(1.0);
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.simulation.IDelayFactory#getRemotePutTime(org.cmg.resp.simulation.SimulationNode, org.cmg.resp.knowledge.Tuple, org.cmg.resp.simulation.SimulationNode)
	 */
	@Override
	public double getRemotePutTime(SimulationNode src, Tuple t,
			SimulationNode trg) {
		return sampleExponential(1.0);
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.simulation.IDelayFactory#getGroupPutTime(org.cmg.resp.simulation.SimulationNode, org.cmg.resp.knowledge.Tuple, org.cmg.resp.topology.GroupPredicate)
	 */
	@Override
	public double getGroupPutTime(SimulationNode src, Tuple t,
			GroupPredicate target) {
		return sampleExponential(1.0);
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.simulation.IDelayFactory#getLocalQueryTime(org.cmg.resp.simulation.SimulationNode)
	 */
	@Override
	public double getLocalQueryTime(SimulationNode node, Template t) {
		return sampleExponential(1.0);
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.simulation.IDelayFactory#getRemoteQueryTime(org.cmg.resp.simulation.SimulationNode, org.cmg.resp.knowledge.Template, org.cmg.resp.simulation.SimulationNode)
	 */
	@Override
	public double getRemoteQueryTime(SimulationNode src, Template t,
			SimulationNode trg) {
		return sampleExponential(1.0);
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.simulation.IDelayFactory#getGroupQueryTime(org.cmg.resp.simulation.SimulationNode, org.cmg.resp.knowledge.Template, org.cmg.resp.topology.GroupPredicate, org.cmg.resp.simulation.SimulationNode)
	 */
	@Override
	public double getGroupQueryTime(SimulationNode src, Template t,
			GroupPredicate target, SimulationNode trg) {
		return sampleExponential(1.0);
	}

	private double sampleExponential( double rate ) {
		return 1/rate*-Math.log(random.nextDouble());
	}
}
