/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universitą di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.scel.exceptions;

/**
 * @author loreti
 * 
 *
 */
public class IllegalTypeException extends RuntimeException {

	//FIXME: Complete class!
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param c
	 * @param class1
	 */
	public IllegalTypeException(Class<?> expected, Class<?> was) {
		super("Illegal type exception: expected "+expected.getName()+" was "+was.getName());
	}

}
