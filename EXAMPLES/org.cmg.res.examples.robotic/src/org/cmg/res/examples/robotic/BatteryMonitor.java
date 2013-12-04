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
public class BatteryMonitor extends Agent {

	public BatteryMonitor() {
		super("BatteryMonitor");
	}

	@Override
	protected void doRun() throws IOException, InterruptedException{
	    while (true) {
//	    	Thread.sleep(10);
	        Tuple t = query( new Template( 
	 	         new ActualTemplateField("batteryLevel") , 
	 	         new FormalTemplateField(Integer.class)) , 
	             Self.SELF );
	        int level = t.getElementAt(Integer.class, 1); 
	        get( new Template( 
	                   new ActualTemplateField("lowBattery") , 
	                   new FormalTemplateField(Boolean.class)) , 
	             Self.SELF );
	        put( new Tuple( "lowBattery" , (level<10) ) , Self.SELF );
	     }
	}

}
