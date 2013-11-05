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
package org.cmg.resp.examples.disaster;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.Observable;
import java.util.Random;

import org.cmg.resp.comp.NodeConnection;
import org.cmg.resp.knowledge.AbstractActuator;
import org.cmg.resp.knowledge.AbstractSensor;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;


/**
 * @author loreti
 *
 */
public class Scenario extends Observable {
	
	
	public static final int LANDMARK = 0;
	public static final int WORKER = 1;
	protected static final double COMMUNICATION_RANGE = 100.0;

	private Random r = new Random();

	/**
	 * Array of robots: 
	 * - from 0 to numberOfExplorers-1 are explorers
	 * - from numberOfExplorers to numberOfExplorers+numberOfRescuers-1 are rescuers;
	 */
	private Robot[] robots;

	/**
	 * Arena width
	 */
	private double width;
	
	/**
	 * Arena height
	 */
	private double height;
	
	private Point2D.Double[] victims;
	
	private Point2D.Double nestLocation;

	private int numberOfLandmarks;

	private int numberOfWorkers;

	private int numberOfVictims;

	public Scenario( int numberOfSeekers , int numberOfRescuers , int numberOfVictims , double height , double width ) {
		this.numberOfLandmarks = numberOfSeekers;
		this.numberOfWorkers = numberOfRescuers;
		this.numberOfVictims = numberOfVictims;
		this.height = height;
		this.width = width;
	}

	public void init() {
		nestLocation = new Point2D.Double( width/2 , height-50 );
		this.victims = new Point2D.Double[numberOfVictims];
		for( int i=0 ; i<numberOfVictims ; i++ ) {
			this.victims[i] = new Point2D.Double( this.r.nextDouble()*width , r.nextDouble()*(height/4) );
		}
		robots = new Robot[numberOfLandmarks+numberOfWorkers];
		for( int i=0 ; i<numberOfLandmarks ; i++ ) {
			robots[i] = new Robot(i, 0.5);
			robots[i].setPosition( width/4+(this.r.nextDouble()*width/4)  , height-(this.r.nextDouble()*100)  );
		}
		for( int i=+numberOfLandmarks  ; i<numberOfLandmarks+numberOfWorkers ; i++ ) {
			robots[i] = new Robot(i, 0.5);
			robots[i].setPosition( width/4+(this.r.nextDouble()*width/4)  , height-(this.r.nextDouble()*100)  );
		}
		
	}
	
	/**
	 * Returns the speed of the robot with index i
	 * 
	 * @param i robot index
	 * @return the speed of the robot with index i
	 */
	public double getSpeed(int i) {
		return robots[i].getSpeed();
	}

	/**
	 * Set the speed of the robot with index i
	 * 
	 * @param i robot index
	 * @param s robot speed
	 */
	public void setSpeed(int i,double s) {
		robots[i].setSpeed(s);
	}

	/**
	 * Returns current direction of robot with index i
	 * 
	 * @param i robot index
	 * @return direction of robot with index i
	 */
	public double getDirection(int i) {
		return robots[i].getDirection();
	}

	/**
	 * Set direction of robot with index i
	 * 
	 * @param i robot index
	 * @param d robot direction
	 */
	public void setDirection(int i,double d) {
		robots[i].setDirection(d);
	}
	
	/**
	 * Returns the position of robot  with index i
	 * 
	 * @param i robot index
	 * @return robot position
	 */
	public Point2D.Double getPosition( int i ) {
		return robots[i].getPosition();
	}
	
	/**
	 * Performs a simulation step. 
	 * 
	 * @param dt a simulation step in milliseconds.
	 */
	public void step( double dt ) {
		_updatePosition(dt);
		setChanged();
		notifyObservers();
	}

	/**
	 * Methods used to update position of robots.
	 *
	 * @param dt
	 */
	private void _updatePosition(double dt) {
//		System.out.println("Update positions...");
		for( int i=0 ; i<numberOfLandmarks+numberOfWorkers ; i++ ) {
			if (robots[i].walking) {
				Point2D.Double position = robots[i].getPosition();
				double x = position.getX()+((robots[i].getSpeed()*dt)*Math.cos(robots[i].getDirection()));
				double y = position.getY()+((robots[i].getSpeed()*dt)*Math.sin(robots[i].getDirection()));
				if (x<0.0) {
					x=0.0;
				}
				if (y<0.0) {
					y=0.0;
				}
				if (x>width) {
					x=width;
				}
				if (y>height) {
					y=height;
				}
				robots[i].setPosition(x,y);
			} else {
//				System.out.println("Robot "+i+" is stopped!");
			}
		}
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public AbstractActuator getDirectionActuator(final int i) {
		return new AbstractActuator("direction") {
			
			@Override
			public void send(Tuple t) {
//				System.out.println("New direction received!");
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

	public AbstractActuator getStopActuator(final int i) {
		return new AbstractActuator("stop") {
			
			@Override
			public void send(Tuple t) {
				stop( i );
			}
			
			@Override
			public Template getTemplate() {
				return new Template(
						new ActualTemplateField("stop")
				);
			}
		};
	}

	protected void stop(int i) {
		robots[i].stop();
	}

	public AbstractSensor getVictimSensor(final int i) {
		return robots[i].getVictimSensor();
	}

	public AbstractSensor getCollisionSensor(final int i) {
		return robots[i].getCollisionSensor();
	}


	public class Robot {
		
		private static final double VICTIM_SENSOR_RANGE = 15;

		private int i;
		
		private double direction;
		
		private Point2D.Double position;
		
		private double speed;
		
		private boolean walking;
		
		private AbstractSensor victimSensor;
		
		private AbstractSensor collisionSensor;
		
		public Robot( int i , double speed ) {
			this.i = i;
			this.walking = false;
			this.speed = speed;
			this.victimSensor = new AbstractSensor("VictimSensor-"+i ,
					new Template( new ActualTemplateField("VICTIM_PERCEIVED") , new FormalTemplateField(Boolean.class) )) {
			};
			this.collisionSensor = new AbstractSensor("CollisionSensor-"+i,
					new Template( new ActualTemplateField("COLLISION") , new FormalTemplateField(Boolean.class) )) {
			};
			updateCollisionSensor();
			updateVictimSensor();
		}
		
		public void stop() {
			this.walking = false;
		}

		public AbstractSensor getVictimSensor() {
			return victimSensor;
		}

		public AbstractSensor getCollisionSensor() {
			return collisionSensor;
		}

		public synchronized void setDirection(double d) {
			this.direction = d;
//			detectCollisions();
//			detectVictims();
			this.walking = true;
		}

		public double getDirection() {
			return direction;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public double getSpeed() {
			return speed;
		}

		public void setPosition( double x , double y ) {
			setPosition( new Point2D.Double(x,y));
		}
		
		public void setPosition( Point2D.Double point ) {
			position = point;
			updateCollisionSensor();
			updateVictimSensor();
		}
		
		
		public boolean detectVictim() {
			if (position != null) {
				for (Point2D.Double p : victims) {
					if (p.distance(this.position) <= VICTIM_SENSOR_RANGE) {
						return true;
					}
				}
			}
			return false;
		}
		
		
		private void updateVictimSensor() {
			victimSensor.setValue( new Tuple("VICTIM_PERCEIVED" , detectVictim() ));
		}

		private void updateCollisionSensor() {
			if ((position != null)&&((position.x <= 0)||(position.x>=width)||(position.y<=0)||(position.y>=height))) {
				collisionSensor.setValue( new Tuple( "COLLISION" , true ) );
				walking = false;
			} else {
				collisionSensor.setValue( new Tuple( "COLLISION" , false ));
			}
		}

		public Point2D.Double getPosition() {
			return position;			
		}
				
	}


	public int getSize() {
		return numberOfLandmarks+numberOfWorkers;
	}

	public Color getColor(int i) {
		return Color.BLACK;
	}

	public int getLandmarks() {
		return numberOfLandmarks;
	}

	public int getWorkers() {
		return numberOfWorkers;
	}

	public int getVictims() {
		return numberOfVictims;
	}

	public Point2D.Double getVictimPosition(int i) {
		return victims[i];
	}

	public NodeConnection getNodeConnection() {
		return new NodeConnection() {
			
			@Override
			public void waitInTouch(String src, String target)
					throws InterruptedException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean areInTouch(String src, String target) {				
				try {
					int idSrc = Integer.parseInt(src);
					int idTrg = Integer.parseInt(target);
					Point2D.Double locationSrc = robots[idSrc].getPosition();
					Point2D.Double locationTarget = robots[idTrg].getPosition();
					if ((locationSrc == null)||(locationTarget==null)) {
						return false;
					}
					return locationSrc.distance(locationTarget)<COMMUNICATION_RANGE;
				} catch (Exception e) {
					return false;
				}
			}
		};
	}

	public int getNumberOfLandmarks() {
		return numberOfLandmarks;
	}

	public boolean goalReached() {
		for ( int i=numberOfLandmarks ; i<numberOfLandmarks+numberOfWorkers ; i++ ) {
			if (!robots[i].detectVictim()) {
				return false;
			}
		} 
		return true;
	}
	
}
