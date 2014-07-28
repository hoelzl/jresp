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

import org.cmg.resp.policy.facpl.IExpressionFunction;
import org.cmg.resp.policy.facpl.StructName;

/**
 * @author Andrea Margheri
 *
 */
public class AtomTransitionCondition {

	Class<? extends IExpressionFunction> evaluationFunction;
	
	Object literal; 
	
	StructName attribute_name;
	
	
	
}
