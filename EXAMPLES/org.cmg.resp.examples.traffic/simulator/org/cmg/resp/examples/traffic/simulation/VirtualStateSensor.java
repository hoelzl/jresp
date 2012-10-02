package org.cmg.resp.examples.traffic.simulation;

import org.cmg.resp.comp.NodeSensor;
import org.cmg.resp.examples.traffic.resp.TrafficConstants;
import org.cmg.resp.knowledge.Tuple;

/**
 * @author Michele Loreti
 *
 */
public class VirtualStateSensor extends NodeSensor {

	public static String SENSOR_NAME = TrafficConstants.STATE_TAG;
	private Traffic traffic;
	private int id;
	
	public VirtualStateSensor( Traffic traffic , int id ) {
		super(SENSOR_NAME);
		this.traffic = traffic;
		this.id = id;
	}

	@Override
	public Tuple getValue() {
		return new Tuple( SENSOR_NAME , traffic.getState(id));
	}

}