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
package org.cmg.scel.topology;

import java.util.Observable;

import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;

/**
 * @author Michele Loreti
 *
 */
public abstract class Agent extends Observable implements Runnable {
	
	/**
	 * Identifies the context where the agent is running.
	 */
	private AgentContext container;
	
	/**
	 * Agent name
	 */
	protected String name;
	
	/**
	 * Creates a new agent with a specific name.
	 * 
	 * @param name agent name
	 */
	public Agent( String name ) {
		this.name = name;
	}
	
	/**
	 * Returns agent name.
	 * 
	 * @return agent name.
	 */
	public String getName() {
		return name;
	}

	
	
	/**
	 * Start agent execution.
	 */
	public final void run() {
		
	}
		
	

}
