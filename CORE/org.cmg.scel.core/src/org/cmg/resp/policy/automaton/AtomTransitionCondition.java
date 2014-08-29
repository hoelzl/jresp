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
package org.cmg.resp.policy.automaton;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.StructName;
import org.cmg.resp.policy.facpl.IComparisonFunction;

/**
 * @author Andrea Margheri
 * 
 */
public class AtomTransitionCondition {

	private Class<? extends IComparisonFunction> evaluationFunction;

	private Object literal;

	private StructName attribute_name;

	private boolean isNegated;

	public AtomTransitionCondition(
			Class<? extends IComparisonFunction> function, Object literal,
			StructName attribute_name) {
		this.evaluationFunction = function;
		this.literal = literal;
		this.attribute_name = attribute_name;
	}

	public StructName getAttribute_name() {
		return attribute_name;
	}

	public Object getLiteral() {
		return literal;
	}

	public Class<? extends IComparisonFunction> getEvaluationFunction() {
		return evaluationFunction;
	}

	public void setAttribute_name(StructName attribute_name) {
		this.attribute_name = attribute_name;
	}

	public boolean isNegated() {
		return isNegated;
	}

	public void setNegated(boolean isNegated) {
		this.isNegated = isNegated;
	}

	public boolean evaluate(AuthorizationRequest req) {
		try {
			Class<?> params[] = new Class[1];
			params[0] = List.class;

			Method eval;
			eval = evaluationFunction.getDeclaredMethod("evaluateFunction",	params);

			Object alg = evaluationFunction.newInstance();

			// create list of parameters
			List<Object> args = new LinkedList<Object>();
			args.add(literal);
			args.add(req.getAttributeValue(attribute_name));

			Boolean res = (Boolean) eval.invoke(alg, args);

			if (isNegated)
				return !res;
			else 
				return res;
			
		} catch (Exception e) {
			
			System.err.println(e.getMessage());
			return false;
		}
	}

}
