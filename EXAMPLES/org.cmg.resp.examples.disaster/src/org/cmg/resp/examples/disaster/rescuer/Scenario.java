/**
 * Copyright (c) 2014 Concurrency and Mobility Group.
 * Universit? di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 *      Andrea Margheri
 */
package org.cmg.resp.examples.disaster.rescuer;

import java.awt.Color;
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

public class Scenario extends Observable {

	public static final String EXPLORER = "explorer";
	public static final String RESCUER = "rescuer";
	public static final String HELP_RES = "help_rescuer";
	public static final String LOW_BATT = "low_battery";

	// public static final int WORKER = 1;
	
	protected static final double COMMUNICATION_RANGE = 100.0;

	private Random r = new Random();

	/**
	 * Array of robots: - the number of total robot, according to the state
	 * changes the role in the scenario
	 */
	private Robot[] robots;

	private int numberOfRobots;
	
	/**
	 * Number of Rescuer needed for rescuing a victim 
	 */
	private int numberOfRescuersSwarm;

	/**
	 * Arena width
	 */
	private double width;

	/**
	 * Arena height
	 */
	private double height;

	/**
	 * Victims: number, array of victim positions, if each of them has been rescued
	 */
	private int numberOfVictims;
	
	private Point2D.Double[] victims;
	
	/*
	 * Rescuers: 
	 * -> 0 not discovered
	 * -> 1 discovered by rescuer(s) - waiting for other rescuers (i.e. helpRescuer can perceive the victim)
	 * -> till #numberOfRescuersSwarm (when equal the victim is rescued
	 */
	private int[] rescuers;
	
	// private Point2D.Double nestLocation;

	public Scenario(int numberOfRobots, int numberOfRescuersSwarm,
			int numberOfVictims, double height, double width) {
		this.numberOfRobots = numberOfRobots;
		this.numberOfRescuersSwarm = numberOfRescuersSwarm;
		this.numberOfVictims = numberOfVictims;
		this.height = height;
		this.width = width;
	}

	public void init() {
		//nestLocation = new Point2D.Double(width / 2, height - 50);
		this.rescuers = new int[numberOfVictims];
		
		this.victims = new Point2D.Double[numberOfVictims];
		for (int i = 0; i < numberOfVictims; i++) {
			double x = 0.0;
			double y = 0.0;
			do {
				x = this.r.nextDouble() * width;
				y = r.nextDouble() * (height / 4);
			} while (!isAValidVictimPosition(i, x, y));
			this.victims[i] = new Point2D.Double(x,y);
			//starting with all victims to be rescued (i.e. 0 rescuers)
			this.rescuers[i] = 0;
		}
		robots = new Robot[numberOfRobots];
		for (int i = 0; i < numberOfRobots; i++) {
			robots[i] = new Robot(i, 0.5);
			robots[i].setPosition(
					width / 4 + (this.r.nextDouble() * width / 4), height
							- (this.r.nextDouble() * 100));
		}
	}

	private boolean isAValidVictimPosition( int i , double x , double y ) {
		for( int j=0 ; j<i ; j++ ) {
			if (this.victims[j].distance(x, y)<2*Robot.VICTIM_SENSOR_RANGE) {
				return false;
			}
		}
		return true;
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
	public void setSpeed(int i, double s) {
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
	public void setDirection(int i, double d) {
		setDirection( i , false , d );
	}

	/**
	 * Set direction of robot with index i
	 * 
	 * @param i robot index
	 * @param d robot direction
	 */
	public void setDirection(int i, boolean fixed , double d) {
		robots[i].setDirection(d);
		robots[i].awareOfVictimPosition = fixed;
	}

	
	/**
	 * Set direction to a (x,y) point of robot i
	 * @param i robot index
	 * @param x arrival position x
	 * @param y arrival position y
	 */
	public void setDirection(int i, double x, double y) {
		Point2D.Double position = getPosition(i);
		double dx = x-position.x;
		double dy = y-position.y;
		setDirection(i, true , Math.atan2(dy, dx));
	}

	/**
	 * Set the role of robot i to s
	 * @param i robot index
	 * @param s robot role
	 */
	public void setRole(int i , String s){
		robots[i].setRole(s);
	}
	
	
	/**
	 * Return the role of robot i
	 * @param i robot index
	 */
	public String getRole(int i){
		return robots[i].getRole();
	}
	
	/**
	 * Returns the position of robot with index i
	 * 
	 * @param i robot index
	 * @return robot position
	 */
	public Point2D.Double getPosition(int i) {
		return robots[i].getPosition();
	}

	/**
	 * Performs a simulation step.
	 * 
	 * @param dt a simulation step in milliseconds.
	 */
	public void step(double dt) {
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
		// System.out.println("Update positions...");
		for (int i = 0; i < numberOfRobots; i++) {
			if (robots[i].walking) {
				Point2D.Double position = robots[i].getPosition();
				double x = position.getX()
						+ ((robots[i].getSpeed() * dt) * Math.cos(robots[i]
								.getDirection()));
				double y = position.getY()
						+ ((robots[i].getSpeed() * dt) * Math.sin(robots[i]
								.getDirection()));
				if (x < 0.0) {
					x = 0.0;
				}
				if (y < 0.0) {
					y = 0.0;
				}
				if (x > width) {
					x = width;
				}
				if (y > height) {
					y = height;
				}
				robots[i].setPosition(x, y);
			} else {
				// System.out.println("Robot "+i+" is stopped!");
			}
		}
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	//-----------------------------------------------------
	// Actuators
	//-----------------------------------------------------

	/**
	 * Set robot direction. Triggered by the tuple <"direction", dir>
	 * dir corresponds to the direction angle
	 * 
	 * @param i robot index
	 *
	 */
	public AbstractActuator getDirectionActuator(final int i) {
		return new AbstractActuator("direction") {

			@Override
			public void send(Tuple t) {
				//System.out.println("New direction received!");
				double dir = t.getElementAt(Double.class, 1);
				setDirection(i, dir);
			}

			@Override
			public Template getTemplate() {
				return new Template(new ActualTemplateField("direction"),
						new FormalTemplateField(Double.class));
			}
		};
	}


	/**
	 * Set robot direction to a (x,y) point. Triggered by the tuple <"pointDirection", x , y>
	 * x position.x of the final point
	 * y position.y of the arrival point
	 * 
	 * @param i robot index
	 *
	 */
	public AbstractActuator getPointDirectionActuator(final int i) {
		return new AbstractActuator("pointDirection") {

			@Override
			public void send(Tuple t) {
				//System.out.println("New direction received!");
				double x = t.getElementAt(Double.class, 1);
				double y = t.getElementAt(Double.class, 2);
				setDirection(i, x, y);
			}

			@Override
			public Template getTemplate() {
				System.out.println("PointDirectionTemplate");
				return new Template(new ActualTemplateField("pointDirection"),
						new FormalTemplateField(Double.class),
						new FormalTemplateField(Double.class));
			}
		};
	}

	
	/**
	 * Halt robot moving. Triggered by the tuple <"stop">
	 * @param i
	 * @return
	 */
	public AbstractActuator getStopActuator(final int i) {
		return new AbstractActuator("stop") {

			@Override
			public void send(Tuple t) {
				stop(i);
			}

			@Override
			public Template getTemplate() {
				return new Template(new ActualTemplateField("stop"));
			}
		};
	}

	/**
	 * Change role of robot. Triggered by <"role", s>
	 * s role name
	 * 
	 * @param i robot index
	 * @return
	 */
	public AbstractActuator getChangeRoleActuator(final int i) {
		return new AbstractActuator("roleChange") {

			@Override
			public void send(Tuple t) {
				String s = t.getElementAt(String.class, 1);
				if (s.equals(EXPLORER)) {
					setRole(i,EXPLORER);
				} else if (s.equals(RESCUER)) {
					setRole(i,RESCUER);
				} else if (s.equals(HELP_RES)){
					setRole(i,HELP_RES);
				} else {
					//low battery mode
					setRole(i,LOW_BATT);
				}
			}

			@Override
			public Template getTemplate() {
				return new Template(new ActualTemplateField("role"),
						new FormalTemplateField(String.class));
			}
		};
	}

	/**
	 * Update the victim status when a robot starts the rescuing process
	 * @param i the robot number
	 * @return
	 */
	public AbstractActuator getUpdateVictimStateActuator(final int i) {
		return new AbstractActuator("victimUpdate") {

			@Override
			public void send(Tuple t) {
				Double x = t.getElementAt(Double.class, 1);
				Double y = t.getElementAt(Double.class, 2);
				
				for (int i=0; i< victims.length; i++){
					if (Math.abs(x - victims[i].x) <= 40						
						&&  Math.abs(y - victims[i].y) <= 40){
						//update the rescuer number
						rescuers[i]++;
						break;
					}				
				}
				
			}

			@Override
			public Template getTemplate() {
				return new Template(new ActualTemplateField("rescue"),
						new FormalTemplateField(Double.class),
						new FormalTemplateField(Double.class));
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
	
	public AbstractSensor getDirectionSensor(final int i) {
		return robots[i].getDirectionSensor();
	}
	
	public AbstractSensor getPositionSensor(int i) {
		return robots[i].getPositionSensor();
	}

	public AbstractSensor getWalkingSensor(int i) {
		return robots[i].getWalkingSensor();
	}


	public class Robot {

		private static final double VICTIM_SENSOR_RANGE = 15;

		private int i;

		private double direction;

		private Point2D.Double position;

		private double speed;

		private boolean walking;
		
		private boolean awareOfVictimPosition;


		/**
		 * RESCUER, HELP_RESCUER, LOW_BATT, EXPLORER (use the constants in the Scenario class)
		 */
		private String role;
		
		private AbstractSensor victimSensor;
		
		private AbstractSensor collisionSensor;

		private AbstractSensor directionSensor;

		private AbstractSensor walkingSensor;
		
		private AbstractSensor positionSensor;
		
		public Robot( int i , double speed ) {
			this.i = i;
			this.position = new Point2D.Double(0,0);
			this.walking = false;
			this.speed = speed;
			this.role = EXPLORER;
			this.victimSensor = new AbstractSensor("VictimSensor-"+i ,
					new Template( new ActualTemplateField("VICTIM_PERCEIVED") , new FormalTemplateField(Boolean.class) )) {
			};
			this.collisionSensor = new AbstractSensor("CollisionSensor-"+i,
					new Template( new ActualTemplateField("COLLISION") , new FormalTemplateField(Boolean.class) )) {
			};
			this.directionSensor = new AbstractSensor("DirectionSensor-"+i,
					new Template( new ActualTemplateField("DIRECTION") , new FormalTemplateField(Double.class) )) {
			}; 
			this.walkingSensor = new AbstractSensor("WalkingSensor-"+i,
					new Template( new ActualTemplateField("WALKING") , new FormalTemplateField(Boolean.class) )) {
			}; 
			this.positionSensor =  new AbstractSensor("PositionSensor-"+i,
					new Template( new ActualTemplateField("POSITION") , new FormalTemplateField(Point2D.Double.class) )) {
			}; 
			updateCollisionSensor();
			updateVictimSensor();
			updateWalkingSensor();
			updateDirectionSensor();
			updatePositionSensor();
		}
		
		public AbstractSensor getPositionSensor() {
			return positionSensor;
		}

		private void updateWalkingSensor() {
			walkingSensor.setValue(new Tuple( "WALKING" , walking ));
		}

		private void updateDirectionSensor() {
			directionSensor.setValue(new Tuple( "DIRECTION" , direction ));
		}

		private void updatePositionSensor() {
			positionSensor.setValue(new Tuple( "POSITION" , position ));
		}

		public AbstractSensor getDirectionSensor() {
			return directionSensor;
		}
				
		public AbstractSensor getWalkingSensor() {
			return walkingSensor;
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
			// detectCollisions();
			// detectVictims();
			this.walking = true;
		}

		public int getIndex(){
			return this.i;
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

		public String getRole(){
			return role;
		}
		
		public void setRole(String s){
			this.role = s;
		}
		
		public void setPosition(double x, double y) {
			setPosition(new Point2D.Double(x, y));
		}

		public void setPosition(Point2D.Double point) {
			position = point;
			updateCollisionSensor();
			updateVictimSensor();
		}

		/**
		 * Found Victim
		 * @return
		 */
		public boolean detectVictim() {
			if (position != null) {
				int i = 0;
				//when the robot is a Rescuer or is going to the charging station the sensor is deactivated
				if (!this.role.equals(Scenario.RESCUER) && !this.role.equals(Scenario.LOW_BATT) ){
					for (Point2D.Double p : victims) {
						/*
						 * Rescuers: 
						 * -> 0 not discovered
						 * -> 1 discovered by rescuer(s) - waiting for other rescuers (i.e. helpRescuer can perceive the victim)
						 * -> till #numberOfRescuersSwarm (when equal the victim is rescued
						 */
						if (p.distance(this.position) <= VICTIM_SENSOR_RANGE && rescuers[i] < numberOfRescuersSwarm) {
							if (rescuers[i] > 0 && this.role.equals(Scenario.EXPLORER)){
								//an other rescuer has detected the victim, he is waiting for an HelpRescuer 
								//no other Explorer must become Rescuer
								return false;
							}	
							//except the previous one, in all the other case the sensor perceives the victim  
							return true;
							//the victim state (hence the rescuers number) is updated by the actuator triggered by the tuple <"rescue">
							}
						i = i + 1;
					}
				}
			}
			return false;
		}

		private void updateVictimSensor() {
			victimSensor.setValue(new Tuple("VICTIM_PERCEIVED", detectVictim()));
		}

		private void updateCollisionSensor() {
			if ((position != null)
					&& ((position.x <= 0) || (position.x >= width)
							|| (position.y <= 0) || (position.y >= height))) {
				collisionSensor.setValue(new Tuple("COLLISION", true));
				walking = false;
			} else {
				collisionSensor.setValue(new Tuple("COLLISION", false));
			}
		}

		public Point2D.Double getPosition() {
			return position;
		}

	} //End Robot Inner-Class
	

	public int getSize() {
		return numberOfRobots;
	}
 
	public Color getColor(int i) {
		switch (robots[i].getRole()) {
		case EXPLORER:
			return Color.BLUE;
		case RESCUER:
			return Color.GREEN;
		case HELP_RES:
			return Color.CYAN;
		case LOW_BATT:
			return Color.ORANGE;
		default:
			break;
		}
		//this should never happen
		return Color.BLACK;
	}

	
	public Color getColorVictim(int i) {
		if (rescuers[i] < numberOfRescuersSwarm)
			return Color.RED;
		else 
			return Color.MAGENTA;
	}

	
	public int getRobots() {
		return numberOfRobots;
	}

	public int getRescuersSwarmSize() {
		return numberOfRescuersSwarm;
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
					if ((locationSrc == null) || (locationTarget == null)) {
						return false;
					}
					return locationSrc.distance(locationTarget) < COMMUNICATION_RANGE;
				} catch (Exception e) {
					return false;
				}
			}
		};
	}

	public boolean goalReached() {

		// for ( int i=0 ; i<numberOfRobots ; i++ ) {
		// if (this.){
		// if (!robots[i].detectVictim()) {
		// return false;
		// }
		// }
		// }
		return true;
	}

}
