/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universitą di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.scel.policy;

import org.cmg.scel.behaviour.AgentContext;

/**
 * @author Michele Loreti
 *
 */
public abstract class Policy implements IPolicy {

	protected AgentContext context;
	
	public Policy( AgentContext context ) {
		this.context = context;
	}

}
