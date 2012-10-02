/* Copyright (c) 2012 Concurrency and Mobility Group.
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
package org.cmg.resp.examples.traffic.simulation;

import org.cmg.resp.comp.NodeSensor;
import org.cmg.resp.examples.traffic.resp.TrafficConstants;
import org.cmg.resp.knowledge.Tuple;

/**
 * @author Michele Loreti
 *
 */
public class VirtualTripSensor extends NodeSensor {

	public static String SENSOR_NAME = TrafficConstants.TRIP_TAG;
	private Traffic traffic;
	private int id;
	
	public VirtualTripSensor( Traffic traffic , int id ) {
		super(SENSOR_NAME);
		this.traffic = traffic;
		this.id = id;
	}

	@Override
	public Tuple getValue() {
		return new Tuple( SENSOR_NAME , traffic.getTrip(id));
	}

}
