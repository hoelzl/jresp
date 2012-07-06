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
import java.util.Random;

import org.cmg.scel.behaviour.Agent;
import org.cmg.scel.knowledge.ActualTemplateField;
import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.FormalTemplateField;
import org.cmg.scel.knowledge.SCELValue;
import org.cmg.scel.knowledge.SCELValue.SCELBoolean;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.SCELValue.SCELDouble;
import org.cmg.scel.knowledge.SCELValue.SCELType;
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
			return ((SCELBoolean) data[0].getValue()).getValue()==CommunicationAgent.this.isGreen;
		}
	};
	
	
	private Template gpsTemplate = new Template(
				new ActualTemplateField(SCELValue.getString("GPS")),
				new FormalTemplateField(SCELType.DOUBLE),
				new FormalTemplateField(SCELType.DOUBLE)				
			);
	
	private Template targetTemplate = new Template( 
				new ActualTemplateField(SCELValue.getString("TARGET")),
				new FormalTemplateField(SCELType.BOOLEAN)
			);

	private Template foundTemplate = new Template( 
			new ActualTemplateField(SCELValue.getString("FOUND")),
			new FormalTemplateField(SCELType.BOOLEAN)
		);

	private Template informedTemplate = new Template( 
			new ActualTemplateField(SCELValue.getString("INFORMED")),
			new FormalTemplateField(SCELType.BOOLEAN)
		);

	private Template directionTemplate = new Template(
			new ActualTemplateField(SCELValue.getString("DIRECTION")),
			new FormalTemplateField(SCELType.DOUBLE),
			new FormalTemplateField(SCELType.DOUBLE)				
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
			put( new Tuple( SCELValue.getString("INFORMED") , SCELValue.getBoolean(true)) , Self.SELF );
			put( t , Self.SELF );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
