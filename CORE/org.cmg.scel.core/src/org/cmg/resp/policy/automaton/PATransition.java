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
 *      Andrea Margheri
 */
package org.cmg.resp.policy.automaton;

import org.cmg.resp.policy.AuthorizationRequest;


/**
 * @author Andrea Margheri
 *
 */
public class PATransition {
	
	protected TransitionCondition condition;
	
	protected int nextState;

	public PATransition(TransitionCondition condition , int nextState ) {
		this.condition = condition;
		this.nextState = nextState;
	}

	/**
	 * Check if the authorization request received as argument matches the current transition
	 * @return
	 */
	public boolean isEnabled( AuthorizationRequest req ) {
		return condition.checkTransitionCondition(req);
	}


	public int nextState() {
		return nextState;
	}


}