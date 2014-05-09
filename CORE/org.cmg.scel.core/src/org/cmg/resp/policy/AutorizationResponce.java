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
package org.cmg.resp.policy;

import java.util.LinkedList;

import org.cmg.resp.behaviour.Agent;

/**
 * @author Michele Loreti
 *
 */
public class AutorizationResponce {
	
	private Decision decision;
	
	private Agent obligations;
	
	public AutorizationResponce( Decision decision , Agent agent ) {
		this.decision = decision;
		this.obligations = agent;
	}
	
	public Decision getDecision() {
		return decision;
	}
	
	public Agent getObligations() {
		return obligations;
	}

}
