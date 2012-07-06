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
package org.cmg.scel.example.mobility3;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
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
public class MovementAgent extends Agent {

	public GroupPredicate color = new GroupPredicate( "isgreen" ) {		
		@Override
		public boolean evaluate(Attribute[] data) {
			if (data.length<1) {
				return false;
			}
			return ((SCELBoolean) data[0].getValue()).getValue()==MovementAgent.this.isGreen;
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

	private double maxX;
	
	private double maxY;
	
	private Random r = new Random();

	private boolean isGreen;

	public MovementAgent(String name, double maxX , double maxY , boolean isGreen ) {
		super(name);
		this.maxX = maxX;
		this.maxY = maxY;
		this.isGreen = isGreen;
	}


	/* (non-Javadoc)
	 * @see org.cmg.scel.behaviour.Agent#doRun()
	 */
	@Override
	protected void doRun() {
		try {
			put( new Tuple( SCELValue.getString("INFORMED") , SCELValue.getBoolean(false)) , Self.SELF );
			if (!search()) {
				moveTo( );
			} else {
				publish();
			}
			put( new Tuple(SCELValue.getString("STOP")) , Self.SELF );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected boolean search() throws InterruptedException, IOException {
		boolean found = false;
		boolean informed = false;
		double x = 0.0;
		double y = 0.0;
		while (!found&&!informed) {
				Tuple t = query( gpsTemplate , Self.SELF );
				x = ((SCELDouble) t.getElementAt(1)).getValue();
				y = ((SCELDouble) t.getElementAt(2)).getValue();
				if ((x==0)||(y==0)||(x==maxX)||(y==maxY)) {
					put( 
						new Tuple( 
							SCELValue.getString("DIR") ,
							SCELValue.getDouble(r.nextDouble()*2*Math.PI)
						) , 
						Self.SELF );
				}
				t = query( targetTemplate , Self.SELF ); 
				found = ((SCELBoolean) t.getElementAt(1)).getValue();
				t = query( informedTemplate , Self.SELF );
				informed = ((SCELBoolean) t.getElementAt(1)).getValue();
		} 
		return found;
	}
	
	protected void publish() throws InterruptedException, IOException {
		Tuple t = query( gpsTemplate , Self.SELF );
		double x = ((SCELDouble) t.getElementAt(1)).getValue();
		double y = ((SCELDouble) t.getElementAt(2)).getValue();
		put( 
			new Tuple( 
				SCELValue.getString("DIRECTION") ,
				SCELValue.getDouble(x) ,
				SCELValue.getDouble(y)
			) ,
			new Group( 
				this.color
			)
		);
	}
	
	protected void moveTo() throws InterruptedException, IOException {
		boolean found = false;
		Tuple t = query( directionTemplate , Self.SELF );
		double xTarget = ((SCELDouble) t.getElementAt(1)).getValue();
		double yTarget = ((SCELDouble) t.getElementAt(2)).getValue();
		t = query( gpsTemplate , Self.SELF );
		double x = ((SCELDouble) t.getElementAt(1)).getValue();
		double y = ((SCELDouble) t.getElementAt(2)).getValue();
		double d = getAndle( x , y , xTarget, yTarget);
		put( 
			new Tuple( 
				SCELValue.getString("DIR") ,
				SCELValue.getDouble(d)
			) , 
			Self.SELF 
		);
		while (!found) {
			t = query( targetTemplate , Self.SELF ); 
			found = ((SCELBoolean) t.getElementAt(1)).getValue();
		}
	}

	private double getAndle(double x, double y, double xTarget, double yTarget) {
		double dX = (xTarget - x);
		double dY = (yTarget - y);
		if (dX == 0) {
			return (dY>0?Math.PI/2:-Math.PI/2);
		}
		if (dY == 0) {
			return (dX>0?0:Math.PI);			
		}
		
		return (dX<0?Math.PI:0.0)+Math.atan(dY/dX);
	}

}
