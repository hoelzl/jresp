/**
 * Copyright (c) 2013 Concurrency and Mobility Group.
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
package org.cmg.resp.simulation;

import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.protocol.jRESPMessage;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.PointToPoint;

/**
 * @author loreti
 *
 */
public class DeterministicDelayFactory implements IDelayFactory {

	private double delay;

	public DeterministicDelayFactory(double delay) {
		this.delay = delay;
	}

	@Override
	public double getRetryTime(String string) {
		return delay;
	}

	@Override
	public double getLocalGetTime(String name) {
		return delay;
	}

	@Override
	public double getRemoteGetTime(String name, Template t, String name2) {
		return delay;
	}

	@Override
	public double getGroupGetTime(String name, Template t, GroupPredicate target) {
		return delay;
	}

	@Override
	public double getLocalPutTime(String name) {
		return delay;
	}

	@Override
	public double getRemotePutTime(String name, Tuple t, String name2) {
		return delay;
	}

	@Override
	public double getGroupPutTime(String name, Tuple t, GroupPredicate target) {
		return delay;
	}

	@Override
	public double getLocalQueryTime(String name) {
		return delay;
	}

	@Override
	public double getRemoteQueryTime(String name, Template t, String name2) {
		return delay;
	}

	@Override
	public double getGroupQueryTime(String name, Template t,
			GroupPredicate target) {
		return delay;
	}
	
}
