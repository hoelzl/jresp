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
public class ManagedElement extends Agent {

	public ManagedElement() {
		super("ManagedElement");
	}

	@Override
	protected void doRun() throws Exception {
		boolean flag = true;
		while (flag) {
			Tuple t = query(new Template( 
									new ActualTemplateField("controlStep") ,
									new FormalTemplateField(Boolean.class) ,
									new FormalTemplateField(Agent.class)) , 									
							Self.SELF );
			flag = t.getElementAt(Boolean.class, 1);
			Agent X = t.getElementAt(Agent.class, 2);
			call(X);
		}
	}
		

}
