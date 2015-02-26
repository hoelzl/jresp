/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universit� di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp.examples.hexameter;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.adaptors.HadesAdapter;
import org.cmg.resp.knowledge.adaptors.HexameterAdapter;
import org.cmg.resp.knowledge.adaptors.HexameterAdapter.HexameterTag;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.cmg.resp.topology.Self;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @author Michele Loreti, Thomas Gabor, Matthias Hölzl
 *
 */
public class ObstacleAvoidance {
	

	public static void main(String[] argv) {
		String me = "localhost:99999";
		String hades = "localhost:55555";
		String[] bodies = {"math1","math2","math2","math3","math4","math5","math6","math7","math8","math9","math10","math11","math12"};

		Node node = new Node("obstacleavoidance",
				new TupleSpace(),
				new HadesAdapter(me, hades));
		Agent robots = new RobotController(me, hades, bodies);
		node.addAgent(robots);		
		System.out.println("START!");
		node.start();
	}
	
	
	public static class RobotController extends Agent {

		protected String me;
		protected String hades;
		protected String[] bodies = {};
		
		public RobotController(String myAddress, String hadesAddress, String[] managedBodies) {
			super("RobotController");
			me = myAddress;
			hades = hadesAddress;
			bodies = managedBodies;
		}

		@SuppressWarnings("unchecked")
		@Override
		protected void doRun() {
			try {
				System.out.println("STARTING ROBOT LOOP!");
				// register this controller with HADES for managing all our robots
				for ( String body : bodies ) {
					JSONArray tickParameter = new JSONArray();
					JSONObject tickItem = new JSONObject();
					tickItem.put("body", body);
					tickItem.put("soul", me);
					tickParameter.add(tickItem);
					System.out.println("put");
					put(new Tuple(HexameterTag.HEXAMETER, hades, "ticks", tickParameter), Self.SELF);
					put(new Tuple(HexameterTag.HEXAMETER, hades, "tocks", tickParameter), Self.SELF); //can really use the same parameter here
				}
				// reaction loop
				while ( true ) {
					// wait for new tick from HADES
					Tuple tickTuple = get(new Template(new ActualTemplateField(HexameterTag.HADES), new ActualTemplateField("tick")) , Self.SELF);
					JSONArray tickParameter = (JSONArray) tickTuple.getElementAt(2);
					// one Hexameter message could contain multiple ticks, but usually doesn't
					for ( Object rawTickItem : tickParameter ) {
						JSONObject tickItem = (JSONObject) rawTickItem;
						if ( tickItem.get("body") != null ) {
							// process reaction and send tock
							String body = (String) tickItem.get("body");
							Long period = (Long) tickItem.get("period");
							System.out.println("received tick for "+body+" in period "+period.toString());
							react(body, period);
							JSONArray tockParameter = new JSONArray();
							JSONObject tockItem = new JSONObject();
							tockItem.put("body", body);
							tockParameter.add(tockItem);
							put(new Tuple(HexameterTag.HEXAMETER, hades, "tocks", tockParameter), Self.SELF);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// except for this method, everything else is actually general enough to be reused in other agents, so just
		// inherit this class and override this method to implement robots with different behavior
		@SuppressWarnings("unchecked")
		protected void react(String body, Long period) {
			//the algorithm for obstacle avoidance is copied from an example file for ARGoS (see iridia.ulb.ac.be/argos )
			double speed = 5;
			double value = -1; // highest value found so far
			int idx = -1; // index of the highest value
			
			JSONArray proximityMeasurement = (JSONArray) sensor(body, "proximity", null);
			for ( int i = 1; i <= 24; i++ ) {
				double proxValue = ((Number) ((JSONObject)proximityMeasurement.get(i-1)).get("value")).doubleValue();
				if ( value < proxValue ) {
					idx = i;
					value = proxValue;
				}
			}
			
			JSONObject motorControl = new JSONObject();
			if ( value == 0 ) {
				motorControl.put("left", speed);
				motorControl.put("right", speed);
			} else {
				if ( idx <= 12 ) {
					motorControl.put("left", speed);
					motorControl.put("right", Math.ceil((double) (idx-1) * speed / 11.0));
				} else {
					motorControl.put("left", Math.ceil((double) (24-idx) * speed / 11.0));
					motorControl.put("right", speed);
				}
			}
			motor(body, "setvelocity", motorControl);
		}
		
		@SuppressWarnings("unchecked")
		protected Object sensor(String body, String type, JSONObject sensorControl) {
			JSONArray sensorParameter = new JSONArray();
			JSONObject sensorItem = new JSONObject();
			sensorItem.put("body", body);
			sensorItem.put("type", type);
			if ( sensorControl != null ) {
				sensorItem.put("control", sensorControl);
			}
			sensorParameter.add(sensorItem);
			Tuple sensorResponseTuple;
			JSONArray sensorResponse = new JSONArray();
			try {
				sensorResponseTuple = get(
						new Template(
								new ActualTemplateField(HexameterTag.HEXAMETER), 
								new ActualTemplateField(hades),
								new ActualTemplateField("sensors"),
								new ActualTemplateField(sensorParameter)),
						Self.SELF);
				sensorResponse = (JSONArray) sensorResponseTuple.getElementAt(4);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return ((JSONObject)sensorResponse.get(0)).get("value");
		}
		
		
		@SuppressWarnings("unchecked")
		protected void motor(String body, String type, JSONObject motorControl) {
			JSONArray motorParameter = new JSONArray();
			JSONObject motorItem = new JSONObject();
			motorItem.put("body", body);
			motorItem.put("type", type);
			if ( motorControl != null ) {
				motorItem.put("control", motorControl);
			}
			motorParameter.add(motorItem);
			try {
				put(new Tuple(HexameterTag.HEXAMETER, hades, "motors", motorParameter), Self.SELF);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}



}
