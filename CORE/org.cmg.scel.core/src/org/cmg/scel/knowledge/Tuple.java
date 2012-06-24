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
	protected Object[] fields;
	
	
	/**
	 * Creates a new tuple.
	 * 
	 * @param fields fields of new created tuple.
	 */
	public Tuple( Object ... fields ) {
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
	public Object getElementAt( int i ) {
		return fields[i];
	}
	
	/**
	 * Checks if the element at index <code>i</code> is
	 * instance of class <code>c</code>.
	 * 
	 * @param c a class
	 * @param i index of element
	 * @return if the element at index <code>i</code> is
	 * instance of class <code>c</code>
	 */
	public <T> boolean instanceOf( Class<T> c , int i ) {
		return c.isInstance(fields[i]);
	}

	/**
	 * Returns the instance of class <code>c</code> at
	 * index <code>i</code>. An <code>IllegalTypeException</code>
	 * is raised if the element at index <code>i</code> is not
	 * an isntance of <code>c</code>.
	 * 
	 * @param c a class
	 * @param i index of element
	 * @return the instance of class <code>c</code> at
	 * index <code>i</code>
	 */
	public <T> T getElementAt( Class<T> c , int i) {
		if (c.isInstance(fields[i])) {
			return c.cast(fields[i]);
		}
		throw new IllegalTypeException(c,fields[i].getClass());
	}
	

	/**
	 * Returns the class <code>c</code> of the element with index <code>i</code>. 	
	 *  
	 * @param i element index
	 * @return the class <code>c</code> of the element with index <code>i</code>. 	
	 */
	public Class<?> getTypeAt( int i ) {
		return fields[i].getClass();
	}
}
