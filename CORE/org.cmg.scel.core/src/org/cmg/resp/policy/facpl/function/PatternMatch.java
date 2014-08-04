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
package org.cmg.resp.policy.facpl.function;

import java.util.List;

import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.policy.facpl.IComparisonFunction;

/**
 * @author Andrea Margheri
 * 
 */
public class PatternMatch implements IComparisonFunction {

	@Override
	public Boolean evaluateFunction(List<Object> args) throws Throwable {

		try {
			Template template = (Template) args.get(0);
			Tuple item = (Tuple) args.get(1);

			return template.match(item);
		} catch (Exception e) {
			throw new Exception("Unexpected type of arguments");
		}
	}

}
