/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universitą di Firenze
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

import java.awt.geom.Point2D;
import java.util.Observable;
import java.util.Random;

import org.cmg.resp.comp.NodeActuator;
import org.cmg.resp.comp.NodeSensor;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;


/**
 * @author loreti
 *
 */
public class Scenario extends Observable {
	
	public enum RobotState {
		WALKING , 
		INFORMED , 
		SOS , 
		REACHED
	}
	
	public Point2D.Double[] target;
	
	private RobotState[] states;
	
	private Random r = new Random();
	
	/**
	 * Number of robots in the considered scenario
	 */
	private int size;

	/**
	 * Array of robots speeds in meters over seconds
	 */
	private double[] speed;
	
	/**
	 * Array of robots positions
	 */
	private Point2D.Double[] positions;

	private Point2D.Double[] informedTarget;

	/**
	 * Array of robots directions
	 */
	private double[] direction;
	
	/**
	 * Array of robot batteries levels
	 */
	private double[] battery;
	
	/**
	 * Arena width
	 */
	private double width;
	
	/**
	 * Arena height
	 */
	private double height;
	
	/**
	 * Number of robots that have reached the target zone.
	 */
	private double onTarget;

	private BatteryConsumptionFunction batteryDischargingFunction;

	public Scenario( int size , double height , double width , BatteryConsumptionFunction batteryDischargingFunction ) {
		this.size = size;
		this.height = height;
		this.width = width;
		this.batteryDischargingFunction = batteryDischargingFunction;
		init();
	}

	public void init() {
		target = new Point2D.Double[2];
		target[0] = new Point2D.Double( 20+r.nextDouble()*(width-40) , 20+r.nextDouble()*(height-40) );
		target[1] = new Point2D.Double( 20+r.nextDouble()*(width-40) , 20+r.nextDouble()*(height-40) );
		speed = new double[size];
		positions = new Point2D.Double[size];
		direction = new double[size];
		battery = new double[size];
		states = new RobotState[size];
		informedTarget = new Point2D.Double[size];
		for( int i=0 ; i<size ; i++ ) {
			battery[i] = 1.0;//r.nextDouble();
			positions[i] = new Point2D.Double(r.nextDouble()*width, r.nextDouble()*height);
			speed[i] = 0.2;
			direction[i] = r.nextDouble()*2*Math.PI;
			states[i] = RobotState.WALKING;
		}
		
	}
	
	/**
	 * Returns the speed of the robot with index i
	 * 
	 * @param i robot index
	 * @return the speed of the robot with index i
	 */
	public double getSpeed(int i) {
		return speed[i];
	}

	/**
	 * Set the speed of the robot with index i
	 * 
	 * @param i robot index
	 * @param s robot speed
	 */
	public void setSpeed(int i,double s) {
		speed[i]=s;
	}

	/**
	 * Returns current direction of robot with index i
	 * 
	 * @param i robot index
	 * @return direction of robot with index i
	 */
	public double getDirection(int i) {
		return direction[i];
	}

	/**
	 * Set direction of robot with index i
	 * 
	 * @param i robot index
	 * @param d robot direction
	 */
	public void setDirection(int i,double d) {
		direction[i]=d;
	}

	/**
	 * Returns the level of battery of robot with index i
	 * 
	 * @param i robot index
	 * @return robot position
	 */
	public double getBatteryLevel( int i ) {
		return battery[i];
	}
	
	/**
	 * Returns the position of robot  with index i
	 * 
	 * @param i robot index
	 * @return robot position
	 */
	public Point2D.Double getPosition( int i ) {
		return positions[i];
	}
	
	/**
	 * Performs a simulation step. 
	 * 
	 * @param dt a simulation step in milliseconds.
	 */
	public void step( double dt ) {
		_updatePosition(dt);
		_updateBattery(dt);
		setChanged();
		notifyObservers();
	}

	/**
	 * Methods used to update levels of robots' batteries.
	 *
	 * @param dt
	 */
	private void _updateBattery( double dt ) {
		for( int i=0 ; i<size ; i++ ) {
			battery[i] = batteryDischargingFunction.nextBatteryLevel(dt, battery[i], speed[i]);
		}
	}

	/**
	 * Methods used to update position of robots.
	 *
	 * @param dt
	 */
	private void _updatePosition(double dt) {
		for( int i=0 ; i<size ; i++ ) {
			if (battery[i]>0.0) {
				double dx = ((speed[i]*dt)*Math.cos(direction[i]));
				double dy = ((speed[i]*dt)*Math.sin(direction[i]));
				double x = positions[i].getX()+dx;
				double y = positions[i].getY()+dy;
				if (x<0.0) {
//					x=Math.abs(x);
					x=0.0;
				}
				if (y<0.0) {
//					y=Math.abs(y);
					y=0.0;
				}
				if (x>width) {
//					x=width-(x-width);
					x=width;
				}
				if (y>height) {
//					y=height-(y-height);
					y=height;
				}
				positions[i].setLocation(x,y);
			}
		}
	}

	/**
	 * Returns the number of robots in the scenario.
	 * 
	 * @return the number of robots in the scenario.
	 */
	public int getSize() {
		return size;
	}

	public int getBarreryPercentage(int arg0) {
		return (int) (getBatteryLevel(arg0)*100);
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public NodeActuator getDirectionActuator(final int i) {
		return new NodeActuator("direction") {
			
			@Override
			public void send(Tuple t) {
				double dir = t.getElementAt(Double.class, 1);
				setDirection(i, dir);
			}
			
			@Override
			public Template getTemplate() {
				return new Template(
						new ActualTemplateField("direction") ,
						new FormalTemplateField(Double.class)
				);
			}
		};
	}

	public NodeSensor getLocationSensor(final int i) {
		return new NodeSensor("batteryLevel") {
			
			@Override
			public Tuple getValue() {
				return new Tuple( "batteryLevel" , getBarreryPercentage(i) );
			}
		};
	}

	public NodeActuator getStopActuator(final int i) {
		return new NodeActuator("stop") {
			
			@Override
			public void send(Tuple t) {
				setSpeed(i, 0.0);
			}
			
			@Override
			public Template getTemplate() {
				return new Template(
						new ActualTemplateField("stop")
				);
			}
		};
	}

	public NodeActuator getPerceivedTargetActuator(final int i) {
		return new NodeActuator("perceivedTarget") {
			
			@Override
			public void send(Tuple t) {
				setPerceivedTarget(i, t.getElementAt(Double.class, 1) , t.getElementAt(Double.class, 2));
			}
			
			@Override
			public Template getTemplate() {
				return new Template(
						new ActualTemplateField("perceivedTarget") , 
						new FormalTemplateField(Double.class) , 
						new FormalTemplateField(Double.class)
				);
			}
		};
	}

	protected void setPerceivedTarget(int i, Double x, Double y) {
		this.informedTarget[i] = new Point2D.Double(x, y);
	}

	public NodeSensor getBatterySensor(final int i) {
		return new NodeSensor("gps") {
			
			@Override
			public Tuple getValue() {
				return new Tuple( "gps" , positions[i].getX() , positions[i].getY() );
			}

		};
	}

	public NodeSensor getTargetSensor(final int i) {
		return new NodeSensor("target") {
			
			@Override
			public Tuple getValue() {
				return new Tuple( "target" , target[i%2].distance(positions[i])<20 );
			}

		};
	}

	public Point2D.Double[] getTarget() {
		return target;
	}

	public double getRobotOnTarget() {
		return onTarget/size;
	}
	
	public double getDistaneToTarget(int i) {
		return target[i%2].distance(positions[i]);
	}
	
	public NodeActuator getRobotStateActuator( final int i ) {
		return new NodeActuator("state") {
		
			@Override
			public void send(Tuple t) {
				setRobotState(i, t.getElementAt(RobotState.class, 1));
			}
			
			@Override
			public Template getTemplate() {
				return new Template(
						new ActualTemplateField("state") ,
						new FormalTemplateField(RobotState.class)
				);
			}
		
		};

	}

	protected void setRobotState(int i, RobotState s) {
		if (s==RobotState.REACHED) {
			onTarget++;
		}
		states[i] = s;
	}

	public String getState(int i) {
		return states[i].name();
	}
	
	public Point2D.Double getInformedTarget(int i) {
		return informedTarget[i];
	}
}
