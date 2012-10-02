package org.cmg.resp.examples.traffic.data;

import org.cmg.resp.topology.PointToPoint;

public class Track {
	
	public static String FINAL_TRACK_NAME = "Final Track";
	
	public static int FINAL_TRACK_ID = -1;

	public static Track FINAL_TRACK = new Track(FINAL_TRACK_NAME, null, FINAL_TRACK_ID, 0, 0);
	
	/**
	 * Track name
	 */
	String name;

	private double maxSpeed;
	

	/**
	 * A reference to the node handling the track
	 */
	private PointToPoint location;

	private int capacity;

	private int trackId; 

	public Track(String name, PointToPoint location, int trackId, double maxSpeed , int capacity) {
		this.name = name;
		this.location = location;
		this.trackId = trackId;
		this.maxSpeed = maxSpeed;
		this.capacity = capacity;
	}
	
	public int getTrackId() {
		return trackId;
	}
	
	public String getName(){
		return name;
	}

	public PointToPoint getAddress() {
		return location;
	}

	public int getCapacity() {
		return capacity;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

}
