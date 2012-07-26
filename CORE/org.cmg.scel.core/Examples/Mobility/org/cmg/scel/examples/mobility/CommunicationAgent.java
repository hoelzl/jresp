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
package org.cmg.scel.examples.mobility;

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

	public static GroupPredicate any = new GroupPredicate() {		
		@Override
		public boolean evaluate(Attribute[] data) {
			return true;
		}
	};

	private Template informedTemplate = new Template( 
			new ActualTemplateField( "INFORMED" ),
			new FormalTemplateField( Boolean.class )
		);

	private Template directionTemplate = new Template(
			new ActualTemplateField( "DIRECTION" ),
			new FormalTemplateField( Double.class ),
			new FormalTemplateField( Double.class )				
		);

	
	public CommunicationAgent(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.behaviour.Agent#doRun()
	 */
	@Override
	protected void doRun() {
		try {
			Tuple t = query(directionTemplate, new Group(any));
			put( t , Self.SELF );
			get( informedTemplate , Self.SELF );
			put( new Tuple( "INFORMED" , true ) , Self.SELF );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
