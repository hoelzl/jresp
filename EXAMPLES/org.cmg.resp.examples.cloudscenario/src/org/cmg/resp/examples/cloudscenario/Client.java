/**
 * Copyright (c) 2014 Concurrency and Mobility Group.
 * Università di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp.examples.cloudscenario;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Self;

/**
 * @author loreti
 *
 */
public class Client extends Agent {

	public Client(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.behaviour.Agent#doRun()
	 */
	@Override
	protected void doRun() throws Exception {
		while (true) {
			put( new Tuple( "TASK" , 1 ) , Self.SELF );
//			System.out.println("TASK DEPLOYED!");
		}
	}

}
