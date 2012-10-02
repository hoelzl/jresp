package org.cmg.resp.examples.traffic.data;

import org.cmg.resp.examples.traffic.resp.TrafficConstants;

/**
 * Position of a car. Specifies direction and current Km.
 * 
 * @author Tommaso Zoppi
 *
 */

public class Position {
	
	private double current, absolute;
	private Direction direction;

	/**
	 * Default constructor.
	 */
	public Position(double current, double absolute, Direction direction) {
		this.current = current;
		this.absolute = absolute;
		this.direction = direction;
	}
	
	/**
	 * Returns the current Km.
	 */
	public double getCurrent() {
		return current;
	}
	
	public void setCurrent(double newPosition){
		current = newPosition % TrafficConstants.TRACK_LENGTH;
	}

	/**
	 * Returns the current direction.
	 */
	public Direction getDirection() {
		return direction;
	}
	
	public static Position getDefaultPosition(Direction direction){
		return new Position(0, 0, direction);
	}
	
	@Override
	public String toString() {
		return "Position [current=" + current + ", direction=" + direction
				+ "]";
	}

	public double getAbsolutePosition() {
		return absolute;
	}

	public void setAbsolute(double position) {
		absolute = absolute + position - current;
		
	}

}
