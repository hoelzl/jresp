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
package org.cmg.scel.knowledge;

import org.cmg.scel.exceptions.IllegalTypeException;

/**
 * @author loreti
 * 
 *
 */
public class Tuple {

	protected Object[] fields;
	
	public Tuple( Object ... fields ) {
		this.fields = fields;
	}
	
	public int length() {
		return fields.length;		
	}
	
	public Object getElementAt( int i ) {
		return fields[i];
	}
	
	public <T> T getElementAt( Class<T> c , int i) {
		if (c.isInstance(fields[i])) {
			return c.cast(fields[i]);
		}
		throw new IllegalTypeException(c,fields[i].getClass());
	}
	
	
	public Class<?> getTypeAt( int i ) {
		return fields[i].getClass();
	}
}
