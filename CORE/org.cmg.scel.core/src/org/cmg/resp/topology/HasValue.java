/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universitˆ di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp.topology;

import org.cmg.resp.knowledge.Attribute;

/**
 * @author Michele Loreti
 *
 */
public class HasValue extends GroupPredicate {
	
	private Object value;

	public HasValue( String name , Object value ) {
		super(name);
		this.value = value;
	}
	
	
	@Override
	public boolean evaluate(Attribute[] data) {
		if (value == data[0].getValue()) {
			return true;
		}
		if (value == null) {
			return false;
		}
		return value.equals(data[0].getValue());
	}

}
