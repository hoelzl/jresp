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

import org.cmg.resp.examples.traffic.data.Track;


/**
 * @author Michele Loreti
 *
 */
public class TrackSimulation {
	
	private double[][] carsSpeed;
	
	private int occupancy;
	
	private Track track;
		
	public static double JAM_SPEED = 5.0;
	
	public static TrackSimulation FINAL_TRACK = new TrackSimulation(Track.FINAL_TRACK);

	public TrackSimulation( Track track ) {
		super();
		this.track = track;
		this.occupancy = 0;
		this.carsSpeed = new double[track.getCapacity()][2];
	}

	public double getMaxSpeed() {
		return track.getMaxSpeed();
	}
	
	public double getSpeed() {
		if (track.getCapacity() == occupancy)
			return JAM_SPEED;
		return (getTotalSpeed() + (track.getMaxSpeed()*(track.getCapacity()-occupancy)))/track.getCapacity();
	}

	public int getCapacity() {
		return track.getCapacity();
	}
	
	public int getTrackId(){
		return track.getTrackId();
	}
	
	public synchronized boolean isAvailable() {
		return occupancy<track.getCapacity();
	}
	
	public synchronized void enterCar(int id, double speed) {
		if (occupancy<track.getCapacity()) {
			addCar(id, speed);
			occupancy++;
		} else {
			throw new IllegalStateException();
		}
	}
	
	public synchronized void exitCar(int id) {
		if (occupancy>0) {
			removeCar(id);
			occupancy--;
		} else {
			throw new IllegalStateException();
		}
	}

	public int getOccupancy() {
		return occupancy;
	}
	
	public Track getTrack(){
		return track;
	}
	
	private void addCar(int id, double speed){
		carsSpeed[occupancy][0] = id;
		carsSpeed[occupancy][1] = speed;
	}
	
	private void removeCar(int id){
		for(int i=0;i<occupancy;i++){
			if(carsSpeed[i][0] == id){
				for(int j=i;j<track.getCapacity()-1;j++){
					carsSpeed[j] = carsSpeed[j+1];
				}
			}
		}
	}
	
	public void updateCar(int id, double newSpeed){
		for(int i=0;i<occupancy;i++){
			if(carsSpeed[i][0] == id){
				carsSpeed[i][1] = newSpeed;
			}
		}
	}
	
	private double getTotalSpeed(){
		double sum = 0;
		for(int i=0;i<occupancy;i++){
			sum = sum + carsSpeed[i][1];
		}
		return sum;
		
	}

}
