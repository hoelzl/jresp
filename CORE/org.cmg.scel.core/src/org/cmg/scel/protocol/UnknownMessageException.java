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
package org.cmg.scel.protocol;

/**
 * @author Michele Loreti
 *
 */
public class UnknownMessageException extends Exception {

	private Object o;

	public UnknownMessageException(Object o) {
		this.o = o;
	}
	
	public Object getReceivedObject() {
		return this.o;
	}

}
