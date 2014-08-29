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

import java.util.LinkedList;

import org.cmg.resp.policy.AuthorizationRequest;

/**
 * 
 * @author Andrea Margheri
 *
 */
public class TransitionCondition {
	
	private LinkedList<AtomTransitionCondition> condition_items;
	
	/*
	 * the connector 1 is the connector between the item 1 and 2 
	 */
	private LinkedList<ConditionConnector> connector;

	
	public TransitionCondition(){
		this.condition_items = new LinkedList<AtomTransitionCondition>();
		this.connector = new LinkedList<ConditionConnector>();
	}
	
	
	/**
	 * Add Atom Comparison condition for the transition, followed by a connector
	 * @param condition
	 * @param conn
	 */
	public void addCondition(AtomTransitionCondition condition, ConditionConnector conn){
		this.condition_items.add(condition);
		this.connector.add(conn);
	}
	
	/**
	 * Add Atom Comparison condition for the transition
	 * @param condition
	 */
	public void addCondition(AtomTransitionCondition condition){
		this.condition_items.add(condition);
	}
	
	/**
	 * Check if the transition is enabled and must be performed by the Automaton
	 * @param req AuthorisationRequest to authorised
	 * @return whether the transtion is enabled or not
	 */
	public boolean checkTransitionCondition(AuthorizationRequest req) {
		if (!condition_items.isEmpty()){
			Boolean res = condition_items.get(0).evaluate(req); 
			for (int i = 1; i < condition_items.size(); i ++){
				Boolean f = condition_items.get(i).evaluate(req);
				if (connector.get(i).equals(ConditionConnector.AND))
					res &= f;
				else
					res |= f;
			}
			return res;
		}else {
			return false;
		}
	}

}



