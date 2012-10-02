package org.cmg.resp.examples.traffic.data;

/**
 * Variable that describes the state of the car
 * RUN: running
 * STOP: end travel
 * PAUSE: travel paused, out of street
 * JAM: car in traffic jam zone
 * 
 * @author Tommaso Zoppi
 *
 */

public enum CarState {
	RUN, 
	STOP, 
	PAUSE, 
	JAM, 
	LIGHT_JAM
}
