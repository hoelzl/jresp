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
package org.cmg.resp.examples.traffic.simulation;

import org.cmg.resp.examples.traffic.data.CarState;
import org.cmg.resp.examples.traffic.data.Direction;
import org.cmg.resp.examples.traffic.data.Position;
import org.cmg.resp.examples.traffic.data.Track;
import org.cmg.resp.examples.traffic.data.Trip;

/**
 * @author Michele Loreti, Tommaso Zoppi
 *
 */
public class CarSimulation {
	
	private double standardSpeed;
	
	private double speed;
	
	private Position position;
	
	private boolean isRunning;
	
	private Traffic traffic;
	
	private TrackSimulation actualTrack;
	
	private int id;
	
	private Trip trip;
	
	public CarSimulation( Traffic traffic, Trip trip, int id, double standardSpeed, Direction direction) {
		this.traffic = traffic;
		this.trip = trip;
		this.standardSpeed = standardSpeed;
		this.position = Position.getDefaultPosition(direction);
		this.speed = standardSpeed;
		this.id = id;
		this.isRunning = true;
	}

	public double getStandardSpeed() {
		return standardSpeed;
	}

	public double getSpeed() {
		if(actualTrack == TrackSimulation.FINAL_TRACK)
			return 0;
		double trackSpeed = actualTrack.getSpeed();
		if(trackSpeed < standardSpeed)
			return speed = trackSpeed;
		else return speed = standardSpeed;
	}
	
	public Direction getDirection(){
		return position.getDirection();
	}
	
	public void setSpeed( double speed ) {
		this.speed = speed;
	}
	
	public Position getPosition( ) {
		return position;
	}
	
	public double getCurrentPosition( ) {
		return position.getCurrent();
	}
	
	public double getAbsolutePosition(){
		return position.getAbsolutePosition();
	}
	
	public void setPosition( Position position ) {
		this.position = position;
	}
	
	public void setPosition( double position ) {
		this.position.setAbsolute(position);
		this.position.setCurrent(position);
	}
	
	public int getTrack() {
		if(!trip.isEmpty())
			return trip.getCurrentTrack().getTrackId();
		else return Track.FINAL_TRACK_ID;
	}

	public CarState getState() {
		if(!isRunning)
			return CarState.STOP;
		if(speed < 25)
			return CarState.JAM;
		else if (speed > 50)
			return CarState.RUN;
		else return CarState.LIGHT_JAM;
	}
	
	public void endTravel() {
		actualTrack.exitCar(id);
		actualTrack = TrackSimulation.FINAL_TRACK;
		trip.next();
		isRunning = false;
	}
	
	public boolean isRunning(){
		return isRunning;
	}
	
	public void enterDefault(){
		actualTrack = traffic.getCurrentTrack(trip);
		actualTrack.enterCar(id, speed);
	}
	
	public Trip getTrip(){
		return trip;
	}

	public void changeTrack(double newPosition, double oldSpeed) {
		if(trip.size() > 0 && isRunning) {
			actualTrack.exitCar(id);
			updateTrip();
			actualTrack.enterCar(id, getSpeed());
			setPosition(newPosition);
		}
		else endTravel();
	}

	private void updateTrip() {
		trip.next();	
		actualTrack = traffic.getCurrentTrack(trip);
	}

	public boolean canChangeTrack() {
		if(trip.size() < 2)
			return false;
		return traffic.NextTrack(trip).isAvailable();
	}

	public void waitForChange() {
		actualTrack.updateCar(id, 0);
		setSpeed(0);
	}
	
	public void update(double newPosition){
		setPosition(newPosition);
	}

	public boolean isOnFinalTrack() {
		return trip.size()== 1;
	}
}
