package org.cmg.resp.examples.traffic.data;

import java.util.LinkedList;

public class Trip implements Cloneable {
	
	private LinkedList<Track> trackList;
	private String car;
	
	public Trip(String car, Track[] tracks){
		this.car = car;
		trackList = new LinkedList<Track>();
		for(int i=0;i<tracks.length;i++) {
			trackList.add(tracks[i]);
		}
	}
	
	public synchronized Track get(int i){
		return trackList.get(i);
	}
	
	public int size(){
		return trackList.size();
	}
		
	public synchronized Track getCurrentTrack(){
		if(size() > 0)
			return trackList.get(0);
		else return null;
	}
	
	public synchronized Track getNextTrack(){
		if(size() > 1)
			return trackList.get(1);
		else return null;
	}

	@Override
	public String toString() {
		String message = car + " trip:";
		for(int i=0;i<trackList.size();i++)
			message = message + "\n\t" + trackList.get(i).getName();
		return message;
	}

	public String getCarName() {
		return car;
	}

	public synchronized void next() {
		trackList.remove();
	}

	public synchronized boolean isEmpty() {
		return trackList.isEmpty();
	}

	public synchronized String[] getTracks() {
		String[] list = new String[trackList.size()];
		for(int i=0;i<list.length;i++)
			list[i] = trackList.get(i).getName();
		return list;
	}

	@Override
	public Trip clone() {
		return new Trip( car , trackList.toArray(new Track[trackList.size()]));
	}

	

}
