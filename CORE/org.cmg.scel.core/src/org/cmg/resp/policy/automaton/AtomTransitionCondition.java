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

import org.cmg.resp.policy.facpl.IComparisonFunction;
import org.cmg.resp.policy.facpl.StructName;

/**
 * @author Andrea Margheri
 *
 */
public class AtomTransitionCondition {

	private Class<? extends IComparisonFunction> evaluationFunction;
	
	private Object literal; 
	
	private StructName attribute_name;
	
	
	public AtomTransitionCondition(Class<? extends IComparisonFunction> function,
			Object literal, StructName attribute_name){
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
	
	
	
}
