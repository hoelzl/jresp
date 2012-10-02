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

import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;

import org.cmg.resp.examples.traffic.data.CarState;
import org.cmg.resp.examples.traffic.data.Position;
import org.cmg.resp.examples.traffic.data.Track;
import org.cmg.resp.examples.traffic.data.Trip;
import org.cmg.resp.examples.traffic.resp.TrafficConstants;


/**
 * @author Michele Loreti
 *
 */
@SuppressWarnings("serial")
public class Traffic extends AbstractTableModel {

	public static final long REFRESH_TIME = 1000;

	private TrackSimulation[] road;
	
	private LinkedList<CarSimulation> agents;
	
	private double time;

	public Traffic( double length , TrackSimulation ... road  ) {
		this.road = road;
		this.agents = new LinkedList<CarSimulation>();
	}
	
	public void setAgents(LinkedList<CarSimulation> cars) {
		this.agents = cars;
		enterCars();
	}
	
	private void enterCars() {
		for(int i=0;i<agents.size();i++){
			agents.get(i).enterDefault();
		}
	}

	public double getSpeed( int id ) {
		if(agents == null ||agents.size() <= id)
			return 0;
		else return agents.get(id).getSpeed();
	}
	
	public Position getPosition( int id ) {
		return agents.get(id).getPosition();
	}
	
	public CarState getState( int id ){
		return agents.get(id).getState();
	}
	
	public void startSimulation() {
		Thread t;
		t = new Thread(new Simulator());
		t.start();
	}
	
	public class Simulator implements Runnable {

		@Override
		public void run() {
			double current, speed;
			time = System.currentTimeMillis();
			boolean finish = true;
			try {			
				while (true) {
					double dt = System.currentTimeMillis() - time;
					for (CarSimulation c : agents) {
						if(c.isRunning()) {
							finish = false;	
							current = c.getCurrentPosition();
							speed = c.getSpeed();
							current += speed*dt / 1000;
							if(current > TrafficConstants.TRACK_LENGTH){
								if (c.canChangeTrack()) {
									c.changeTrack(current, speed);
								} else if (c.isOnFinalTrack()){
									c.endTravel();
								} else {
									c.waitForChange();
								}
							} else {
								c.update(current);
							}
						}
					}
					time += dt;
					fireTableDataChanged();
					if(finish)
						break;
					finish = true;
					Thread.sleep(REFRESH_TIME);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public Trip getTrip(int id) {
		return agents.get(id).getTrip();
	}

	public Track getTrackNode(int id) {
		int track = agents.get(id).getTrack();
		if(track == Track.FINAL_TRACK_ID)
			return Track.FINAL_TRACK;
		return road[track].getTrack();
	}

	@Override
	public int getColumnCount() {
		return 6;
	}

	@Override
	public int getRowCount() {
		return agents.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		CarSimulation car = agents.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return "Car "+ rowIndex;
		case 1:
			if(car.getTrack() == Track.FINAL_TRACK_ID)
				return "End Travel";
			return "Track "+ car.getTrack();
		case 2:
			return car.getStandardSpeed();
		case 3:
			if(!car.getTrip().isEmpty())
				return car.getSpeed();
			else return 0;
		case 4:
			return car.getState();
		case 5: 
			return car.getCurrentPosition();
		default:
			break;
		}
		return null;
	}

	public TrackSimulation getCurrentTrack(Trip trip) {
		String trackName = trip.getCurrentTrack().getName();
		if(trackName != null)
			return searchTrack(trackName);
		else return null;
	}

	public TrackSimulation NextTrack(Trip trip) {
		String trackName = trip.getNextTrack().getName();
		if(trackName != null)
			return searchTrack(trackName);
		else return null;
	}
	
	private TrackSimulation searchTrack(String trackName){
		for(int i=0;i<road.length;i++){
			if(road[i].getTrack().getName() == trackName)
				return road[i];
		}
		return null;
	}
}
