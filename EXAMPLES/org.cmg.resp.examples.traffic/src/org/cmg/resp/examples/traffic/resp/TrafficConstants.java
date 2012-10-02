package org.cmg.resp.examples.traffic.resp;

import org.cmg.resp.examples.traffic.data.CarState;
import org.cmg.resp.examples.traffic.data.Direction;
import org.cmg.resp.examples.traffic.data.Track;
import org.cmg.resp.examples.traffic.data.Trip;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;

/**
 * Specifies all templates used in this application.
 * 
 * @author Tommaso Zoppi
 *
 */

public class TrafficConstants {
	
	/**
	 * Tag for the state template.
	 */
	public static final String STATE_TAG = "STATE";
	
	/**
	 * Tag for the speed template.
	 */
	public static final String SPEED_TAG = "SPEED";
	
	/**
	 * Tag for the speed template.
	 */
	public static final String AVG_SPEED_TAG = "AVERAGE_SPEED";

	
	/**
	 * Tag for the speed accumulator template.
	 */
	public static final String AVG_SPEED_AC_TAG = "AVERAGE_AC_SPEED";

	
	/**
	 * Tag for the speed template.
	 */
	public static final String TRIP_TAG = "TRIP";
	
	/**
	 * Tag for the end template.
	 */
	public static final String END_TAG = "END_TRAVEL";
	
	/**
	 * Identifies a tuple that specifies the state of the car
	 */
	public static final Template STATE_TEMPLATE = new Template(
			new ActualTemplateField((STATE_TAG)),
			new FormalTemplateField(CarState.class));
	
	/**
	 * Identifies a tuple that specifies the current CarPosition
	 */
	public static final Template SPEED_TEMPLATE = new Template(
			new ActualTemplateField((SPEED_TAG)),
			new FormalTemplateField(Double.class));

	/**
	 * Identifies a tuple that specifies the current CarPosition
	 */
	public static final Template AVERAGE_SPEED_AC_TEMPLATE = new Template(
			new ActualTemplateField((AVG_SPEED_AC_TAG)),
			new FormalTemplateField(Double.class),
			new FormalTemplateField(Integer.class)
			);

	
	
	/**
	 * Identifies a tuple that specifies the current CarPosition
	 */
	public static final Template AVG_SPEED_TEMPLATE = new Template(
			new ActualTemplateField((AVG_SPEED_TAG)),
			new FormalTemplateField(Double.class));
	
	/**
	 * Identifies a tuple that specifies the trip of the car
	 */
	public static final Template TRIP_TEMPLATE = new Template(
			new ActualTemplateField((TRIP_TAG)),
			new FormalTemplateField(Trip.class));
	
	/**
	 * Identifies a tuple that signals the end of the travel.
	 */
	public static final Template END_TEMPLATE = new Template(
			new ActualTemplateField((END_TAG)));

	public static final double TRACK_LENGTH = 1000;

	public static String TRACK_TAG = "TRACK";

	public static final Template TRACK_TEMPLATE = new Template(
			new ActualTemplateField((TRACK_TAG )),
			new FormalTemplateField(Track.class));
	
	public static String POSITION_TAG = "POSITION";

	public static final Template POSITION_TEMPLATE = new Template(
			new ActualTemplateField((POSITION_TAG )),
			new FormalTemplateField(Double.class), 
			new FormalTemplateField(Direction.class));

}
