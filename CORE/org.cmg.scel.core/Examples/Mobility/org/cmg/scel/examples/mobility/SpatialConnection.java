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
package org.cmg.scel.examples.mobility;

import java.awt.geom.Point2D;
import java.util.Hashtable;
import java.util.Observable;
import java.util.Random;
import java.util.Set;

import org.cmg.scel.knowledge.ActualTemplateField;
import org.cmg.scel.knowledge.FormalTemplateField;
import org.cmg.scel.knowledge.SCELValue;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.knowledge.SCELValue.SCELDouble;
import org.cmg.scel.knowledge.SCELValue.SCELType;
import org.cmg.scel.topology.Actuator;
import org.cmg.scel.topology.NodeConnection;
import org.cmg.scel.topology.Sensor;

/**
 * @author Michele Loreti
 *
 */
public class SpatialConnection extends Observable implements NodeConnection {

	protected Random r = new Random();
	protected Hashtable<String, Point2D.Double> locations;	
	
	protected Hashtable<String, Boolean> moving;
	protected Hashtable<String, Double> directions;
	protected double maxX = 600;
	protected double maxY = 480;
	
	
	public static String NODE_PREFIX = "n";
	
	protected double speed = 10;
	protected double range = 100;
	protected double targetX;
	protected double targetY;
	protected double targetSize = 100;
	
	public SpatialConnection( int size , double range ) {
		this.range = range;
		this.locations = new Hashtable<String, Point2D.Double>();
		this.directions = new Hashtable<String, Double>();
		this.moving = new Hashtable<String, Boolean>();
		this.targetX = 75+(maxX-150)*r.nextDouble();
		this.targetY = 75+(maxY-150)*r.nextDouble();
		this.init(size);
	}
	
	private void init(int size) {
		for( int i=0 ; i<size ; i++ ) {
			String node = NODE_PREFIX+i;
			this.locations.put(node, new Point2D.Double(maxX*r.nextDouble(),maxY*r.nextDouble()));	
			this.directions.put(node, r.nextDouble()*Math.PI*2);
			this.moving.put(node, true);
		}
	}
	
	@Override
	public synchronized void waitInTouch(String src, String target)
			throws InterruptedException {
		while (!areInTouch(src, target)) {
			wait();
		}
	}

	@Override
	public synchronized boolean areInTouch(String src, String target) {
		Point2D.Double pSrc = locations.get(src);
		if (pSrc == null) {
			return false;
		}
		Point2D.Double pTrg = locations.get(target);
		if (pTrg == null) {
			return false;
		}
		boolean result = pSrc.distance(pTrg)<=range;
		return result;
	}

	public synchronized void move( ) {
		for (String n : locations.keySet()) {
			if (moving.get(n)) {
				Point2D.Double p = locations.get(n);
				Double d = directions.get(n);
				double newX = p.x+speed*Math.cos(d);
				double newY = p.y+speed*Math.sin(d);
				if (newX<0) {
					newX=0;
				}
				if (newX>maxX) {
					newX = maxX;
				}
				if (newY<0) {
					newY=0;
				}
				if (newY>maxY) {
					newY = maxY;
				}
				Point2D.Double np = new Point2D.Double(newX,newY);
				locations.put(n, np);			
	//			if ((newX==0)||(newX==maxX)||(newY==0)||(newY==maxY)) {
	//				directions.put(n, r.nextDouble()*Math.PI*2);
	//			}
			}
		}
		setChanged();
		notifyObservers();
		notifyAll();
	}

	public double getMaxX() {
		return maxX;
	}

	public void setMaxX(double maxX) {
		this.maxX = maxX;
	}

	public double getMaxY() {
		return maxY;
	}

	public void setMaxY(double maxY) {
		this.maxY = maxY;
	}

	public Set<String> getNodes() {
		return locations.keySet();
	}

	public Point2D.Double getLocation(String node) {
		return locations.get(node);
	}
	
	public Point2D.Double getTargetLocation( ) {
		return new Point2D.Double(targetX,targetY);
	}
	
	public Sensor getLocationSensor( final String n ) {
		return new Sensor("location") {
			
			@Override
			public Tuple getValue() {
				Point2D.Double p = locations.get(n);
				if (p== null) {
					return null;
				}
				return new Tuple( 
					SCELValue.getString("GPS"),
					SCELValue.getDouble(p.x),
					SCELValue.getDouble(p.y)
				);
			}
			
		};
	}
	
	public Sensor getTargetSensor( final String n ) {
		return new Sensor( "target" ) {

			@Override
			public Tuple getValue() {
				Point2D.Double p = locations.get(n);
				if (p== null) {
					return null;
				}
				return new Tuple( 
					SCELValue.getString("TARGET"),
					SCELValue.getBoolean(p.distance(targetX, targetY)<targetSize/2-5)
				);
			}
			
		};
	}

	public Actuator getDirectionActuator( final String n ) {
		return new Actuator("direction") {
			
			@Override
			public void send(Tuple t) {
				directions.put(n, ((SCELDouble) t.getElementAt(1)).getValue() );
			}
			
			@Override
			public Template getTemplate() {
				return new Template( 
					new ActualTemplateField( SCELValue.getString("DIR") ) ,
					new FormalTemplateField( SCELType.DOUBLE )
				);
			}
		};
	}
	
	public Actuator getStopActuator( final String n ) {
		return new Actuator("stop") {
			
			@Override
			public void send(Tuple t) {
				moving.put(n, false);
			}
			
			@Override
			public Template getTemplate() {
				return new Template( 
					new ActualTemplateField( SCELValue.getString("STOP") )
				);
			}
		};
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}
	
	
	
}
