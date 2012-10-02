package org.cmg.resp.test.topology;

import static org.junit.Assert.assertEquals;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.behaviour.Agent.State;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.junit.Test;
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

/**
 * @author Michele Loreti
 *
 */
public class TestAgent {

	@Test
	public void testAgent() {
		Agent a = new Agent("test") {

			@Override
			protected void doRun() {
			}
			
		};
		assertEquals(State.AWAIT,a.getState());
		Node<TupleSpace> n = new Node<TupleSpace>("test", new TupleSpace());
		n.addAgent(a);
		assertEquals(State.READY,a.getState());
	}
	
}
