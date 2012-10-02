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
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.examples.traffic.data.Position;
import org.cmg.resp.examples.traffic.resp.TrafficConstants;

/**
 * @author Michele Loreti
 *
 */
public class VirtualPositionSensor extends NodeSensor {

	public static String SENSOR_NAME = TrafficConstants.POSITION_TAG;
	private Traffic traffic;
	private int id;
	
	public VirtualPositionSensor( Traffic traffic , int id ) {
		super(SENSOR_NAME);
		this.traffic = traffic;
		this.id = id;
	}

	@Override
	public Tuple getValue() {
		Position pos = traffic.getPosition(id);
		return new Tuple( SENSOR_NAME , pos.getCurrent(), pos.getDirection());
	}

}
