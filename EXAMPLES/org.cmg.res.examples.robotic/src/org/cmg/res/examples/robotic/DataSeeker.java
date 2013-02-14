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
import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Group;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.HasValue;
import org.cmg.resp.topology.Self;

/**
 * @author loreti
 *
 */
public class DataSeeker extends Agent {
	
	private int taskId;

	public DataSeeker( int taskId ) {
		super("DataSeeker");
		this.taskId = taskId;
	}
	
	@Override
	protected void doRun() throws IOException, InterruptedException{
			Tuple t = query(new Template(
					 			new ActualTemplateField("targetLocation") , 
					 			new FormalTemplateField(Double.class), 
					 			new FormalTemplateField(Double.class)), 
					 			new Group(new HasValue( "task" , taskId ) ));
			double x = t.getElementAt(Double.class, 1);
			double y = t.getElementAt(Double.class, 2);
			put( new Tuple( "targetLocation" , x , y ) , Self.SELF );
			get( new Template( new ActualTemplateField("informed") , 
					           new ActualTemplateField(false) ) 
			     , Self.SELF );
			put( new Tuple( "informed" , true ) , Self.SELF );
	}

}
