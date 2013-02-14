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

import java.awt.geom.Point2D;
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
public class Informed extends Agent {

	public Informed() {
		super("Informed");
	}

	@Override
	protected void doRun() throws IOException, InterruptedException{
		Tuple t = query(new Template( 
								new ActualTemplateField("targetLocation") , 
								new FormalTemplateField(Double.class) , 
								new FormalTemplateField(Double.class)) , 
						Self.SELF );
		double x = t.getElementAt(Double.class, 1);
		double y = t.getElementAt(Double.class, 2);
		double angle = towards( x , y );
		if (angle != -10) {
			put( new Tuple( "direction" , towards(x , y ) ) , Self.SELF );
		}
	}

	private double towards(double x, double y) throws InterruptedException, IOException {
		Tuple t = query(new Template( 
				new ActualTemplateField("gps") , 
				new FormalTemplateField(Double.class) , 
				new FormalTemplateField(Double.class)) , 
			Self.SELF );
		double xl = t.getElementAt(Double.class, 1);
		double yl = t.getElementAt(Double.class, 2);
		double angle = getAngle(xl,yl,x,y);
		return angle;
	}

	public static double getAngle(double x, double y, double xTarget, double yTarget) {
		double dX = Math.abs(xTarget - x);
		double dY = Math.abs(yTarget - y);
		if ((dX==0)&&(dY==0)) {
			return -10;
		}
		if (dX == 0) {
			return (yTarget>y?Math.PI/2:-Math.PI/2);
		}
		if (dY == 0) {
			return (xTarget>x?0:Math.PI);			
		}
		double angle = Math.atan(dY/dX);
		if ((xTarget>x)&&(yTarget>y)) {
			return angle;
		}
		if ((xTarget<x)&&(yTarget>y)) {
			return Math.PI-angle;
		}
		if ((xTarget<x)&&(yTarget<y)) {
			return angle+Math.PI;
		}
		return (2*Math.PI)-angle;
	}


}
