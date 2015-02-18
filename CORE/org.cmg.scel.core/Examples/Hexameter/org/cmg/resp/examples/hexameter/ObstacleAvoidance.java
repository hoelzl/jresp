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

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.adaptors.HexameterAdapter;
import org.cmg.resp.knowledge.adaptors.HexameterAdapter.HexameterTag;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.cmg.resp.topology.Self;

/**
 * @author Michele Loreti, Thomas Gabor, Matthias Hölzl
 *
 */
public class ObstacleAvoidance {
	
	public static void main(String[] argv) {
		
		Node node = new Node("obstacleavoidance", new TupleSpace(),
								new HexameterAdapter("localhost:999999"));
		Agent robots = new RobotController();
		node.addAgent(robots);		
		System.out.println("START!");
		node.start();
	}
	
	
	public static class RobotController extends Agent {

		public RobotController() {
			super("RobotController");
		}

		@Override
		protected void doRun() {
			try {
				System.out.println("STARTING ROBOT LOOP!");
				while (true) {
					put(new Tuple(HexameterTag.HEXAMETER) , Self.SELF);
					query(new Template(new ActualTemplateField( "PONG" )) , Self.SELF);
					System.out.println("QUERY PONG!");
					get(new Template(new ActualTemplateField( "PONG")) , Self.SELF);
					System.out.println("GET PONG!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
