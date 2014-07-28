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
import java.util.List;

import org.cmg.resp.policy.facpl.FulfilledObligation;

/**
 * @author Michele Loreti
 * @author Andrea Margheri
 * 
 */
public class AuthorizationResponse {

	private AuthorizationDecision decision;

	/**
	 * Notably, we avoid here to use the Agent, the list of ObligationValue is
	 * used as returning value of policy evaluation
	 */
	private List<FulfilledObligation> obligations;

	public AuthorizationResponse(AuthorizationDecision decision, List<FulfilledObligation> agent) {
		this.decision = decision;
		this.obligations = agent;
	}
	
	public AuthorizationResponse(){
		this.obligations = new LinkedList<FulfilledObligation>();
	}
	
	public AuthorizationDecision getDecision() {
		return decision;
	}

	public List<FulfilledObligation> getObligations() {
		return obligations;
	}

	public void setDecision(AuthorizationDecision decision) {
		this.decision = decision;
	}

	public void addObligations(List<FulfilledObligation> obls){
		for(FulfilledObligation o : obls){
			obligations.add(o);
		}
	}
	

}
