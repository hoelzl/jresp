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

import java.util.Arrays;

import org.cmg.scel.exceptions.IllegalTypeException;

/**
 * A tuple identifies the basic information item. It consists
 * of a sequence of values that can be collected into a knowledge
 * repository.
 * 
 * @author Michele Loreti
 * 
 *
 */
public class Tuple {

	/**
	 * Tuple fields.
	 */
	protected SCELValue[] fields;
	
	
	/**
	 * Creates a new tuple.
	 * 
	 * @param fields fields of new created tuple.
	 */
	public Tuple( SCELValue ... fields ) {
		this.fields = fields;
	}
	
	/**
	 * Returns the tuple length.
	 * 
	 * @return the tuple length.
	 */
	public int length() {
		return fields.length;		
	}
	
	
	/**
	 * Returns the element at index <code>i</code>.
	 * 
	 * @param i element index.
	 * @return the element at index <code>i</code>.
	 */
	public SCELValue getElementAt( int i ) {
		return fields[i];
	}

	/**
	 * Returns the class <code>c</code> of the element with index <code>i</code>. 	
	 *  
	 * @param i element index
	 * @return the class <code>c</code> of the element with index <code>i</code>. 	
	 */
	public SCELValue.SCELType getTypeAt( int i ) {
		return fields[i].getType();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Tuple) {
			return Arrays.deepEquals(fields, ((Tuple) obj).fields );
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(fields);
	}

	@Override
	public String toString() {
		return Arrays.deepToString(fields);
	}

}
