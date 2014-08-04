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
package org.cmg.resp.policy.facpl;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.cmg.resp.comp.INode;
import org.cmg.resp.comp.Node;
import org.cmg.resp.policy.AuthorizationDecision;
import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.AuthorizationResponse;
import org.cmg.resp.policy.automaton.IPolicyAutomatonState;
import org.cmg.resp.policy.automaton.PolicyAutomaton;

/**
 * @author Andrea Margheri
 * 
 */
public class FacplPolicyState implements IPolicyAutomatonState {

	// private PolicyAutomaton automata;

	private INode node;

	private Class<? extends ICombiningAlgorithm> algorithm;
	private List<IFacplElement> policies;

	public FacplPolicyState(Node n,
			Class<? extends ICombiningAlgorithm> algorithm,
			IFacplElement... policy) {

		this.node = n;
		this.algorithm = algorithm;
		this.policies = new LinkedList<IFacplElement>();
		for (IFacplElement p : policy) {
			this.policies.add(p);
		}

	}
	
	/**
	 * Invoke the authorization of the request on the policy of the current PolicyAutomaton state
	 */
	@Override
	public AuthorizationResponse evaluate(AuthorizationRequest r) {

		Class<?> params[] = new Class[2];
		params[0] = List.class;
		params[1] = AuthorizationRequest.class;

		try {
			Method eval = algorithm.getDeclaredMethod("evaluate", params);
			Object alg = algorithm.newInstance();
			return (AuthorizationResponse) eval.invoke(alg, policies, r);
		} catch (Exception e) {
			e.printStackTrace();
			//returns error
			return new AuthorizationResponse(AuthorizationDecision.INDETERMINATE);
		} 
	}

}
