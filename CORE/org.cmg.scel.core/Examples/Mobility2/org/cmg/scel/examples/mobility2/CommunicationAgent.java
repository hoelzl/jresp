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
package org.cmg.scel.examples.mobility2;

import java.io.IOException;

import org.cmg.scel.behaviour.Agent;
import org.cmg.scel.knowledge.ActualTemplateField;
import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.FormalTemplateField;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.topology.Group;
import org.cmg.scel.topology.GroupPredicate;
import org.cmg.scel.topology.Self;

/**
 * @author Michele Loreti
 *
 */
public class CommunicationAgent extends Agent {

	public GroupPredicate color = new GroupPredicate( "isgreen" ) {		
		@Override
		public boolean evaluate(Attribute[] data) {
			if (data.length<1) {
				return false;
			}
			return data[0].getValue().equals(CommunicationAgent.this.isGreen);
		}
	};
	
	
	private Template gpsTemplate = new Template(
				new ActualTemplateField(("GPS")),
				new FormalTemplateField(Double.class),
				new FormalTemplateField(Double.class)				
			);
	
	private Template targetTemplate = new Template( 
				new ActualTemplateField(("TARGET")),
				new FormalTemplateField(Boolean.class)
			);

	private Template foundTemplate = new Template( 
			new ActualTemplateField(("FOUND")),
			new FormalTemplateField(Boolean.class)
		);

	private Template informedTemplate = new Template( 
			new ActualTemplateField(("INFORMED")),
			new FormalTemplateField(Boolean.class)
		);

	private Template directionTemplate = new Template(
			new ActualTemplateField(("DIRECTION")),
			new FormalTemplateField(Double.class),
			new FormalTemplateField(Double.class)				
		);


	private boolean isGreen;

	
	public CommunicationAgent(String name, boolean isGreen) {
		super(name);
		this.isGreen = isGreen;
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.behaviour.Agent#doRun()
	 */
	@Override
	protected void doRun() {
		try {
			Tuple t = query(directionTemplate, new Group(color));
			put( t , Self.SELF );
			get( informedTemplate , Self.SELF );
			put( new Tuple( ("INFORMED") , (true)) , Self.SELF );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
