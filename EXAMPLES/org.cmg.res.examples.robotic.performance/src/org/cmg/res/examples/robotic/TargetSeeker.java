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
package org.cmg.res.examples.robotic;

import java.io.IOException;

import org.cmg.res.examples.robotic.Scenario.RobotState;
import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Self;

/**
 * @author loreti
 *
 */
public class TargetSeeker extends Agent {

	public TargetSeeker() {
		super("DataSeeker");
	}

	@Override
	protected void doRun() throws IOException, InterruptedException{
		boolean found = false;
		while (!found) {
	        get( new Template( 
                    new ActualTemplateField( "controlStep" ) ,
                    new FormalTemplateField( Boolean.class ) ,
                    new FormalTemplateField( Agent.class ) ) ,
                 Self.SELF );
			Tuple t = query( new Template(
					 				new ActualTemplateField("lowBattery") , 
					 				new FormalTemplateField(Boolean.class)) , 
					 		 Self.SELF );
			boolean low = t.getElementAt(Boolean.class,1);
			if (low) {
				put( new Tuple( "controlStep" , true , new LowBattery() ) , Self.SELF );
				put( new Tuple( "state" ,  RobotState.SOS ) , Self.SELF );
				query( new Template( 
					 	new ActualTemplateField("lowBattery") , 
					 	new ActualTemplateField(false)) ,
					 Self.SELF );
			} else {
				t = query( new Template(
				 		new ActualTemplateField("target") , 
				 		new FormalTemplateField(Boolean.class)) , 
				 	  Self.SELF );
				found = t.getElementAt(Boolean.class, 1);
				if (found) {
					put( new Tuple( "state" ,  RobotState.REACHED ) , Self.SELF );
					put( new Tuple( "stop" ) , Self.SELF );
					put( new Tuple( "controlStep" , false , new Found() ) , Self.SELF );
                    doTask();
				} else {
					t = query( new Template(
					 		new ActualTemplateField("informed") , 
					 		new FormalTemplateField(Boolean.class)) , 
					 	  Self.SELF );
					boolean informed = t.getElementAt(Boolean.class, 1);
					if (informed) {
						put( new Tuple( "state" ,  RobotState.INFORMED ) , Self.SELF );
						put( new Tuple( "controlStep" , true , new Informed() ) , Self.SELF );
					} else {
						put( new Tuple( "state" ,  RobotState.WALKING ) , Self.SELF );
						put( new Tuple( "controlStep" , true , new RandomWalk() ) , Self.SELF );
					}
				}				
			}
		}
	}	
	private void doTask() {
		//This method execute task i...
	}
}
