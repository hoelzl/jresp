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

import java.util.List;

import org.cmg.resp.policy.AuthorizationRequest;

/**
 * 
 * @author Andrea Margheri
 *
 */
public class TransitionCondition {
	
	private List<AtomTransitionCondition> condition_items;
	
	/*
	 * the connector 1 is the connector between the item 1 and 2
	 */
	private ConditionConnector[] connector;

	
	
	public boolean checkCondition(AuthorizationRequest req) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}



