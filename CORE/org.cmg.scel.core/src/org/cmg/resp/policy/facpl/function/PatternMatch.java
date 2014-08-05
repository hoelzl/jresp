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
			if (args.get(0) instanceof Template && args.get(1) instanceof Tuple) {
				Template template = (Template) args.get(0);
				Tuple item = (Tuple) args.get(1);
				return template.match(item);
			}else if (args.get(0) instanceof Template && args.get(1) instanceof Template) {
				Template template = (Template) args.get(0);
				Template template2 = (Template) args.get(1);
				return template.implies(template2);
			}else if (args.get(0) instanceof Tuple && args.get(1) instanceof Template) {
				Tuple tuple = (Tuple) args.get(0);
				Template template2 = (Template) args.get(1);
				return template2.match(tuple);
			}else if (args.get(0) instanceof Tuple && args.get(1) instanceof Tuple) {
				Tuple tuple = (Tuple) args.get(0);
				Tuple tuple2 = (Tuple) args.get(1);
				return tuple.equals(tuple2);
			}else{
				throw new Exception("Unexpected type of arguments");
			}
		} catch (Exception e) {
			throw new Exception("Unexpected type of arguments");
		}
	}

}
