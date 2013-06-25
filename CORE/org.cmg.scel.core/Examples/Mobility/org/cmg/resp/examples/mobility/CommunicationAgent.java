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
package org.cmg.resp.examples.mobility;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.AnyComponent;
import org.cmg.resp.topology.Group;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.Self;

/**
 * @author Michele Loreti
 *
 */
public class CommunicationAgent extends Agent {

	public static GroupPredicate any = new AnyComponent();

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
