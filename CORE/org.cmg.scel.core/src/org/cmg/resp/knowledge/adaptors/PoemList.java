/**
 * Copyright (c) 2013 Concurrency and Mobility Group.
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
package org.cmg.resp.knowledge.adaptors;

import java.util.Arrays;

/**
 * @author Michele Loreti
 *
 */
public class PoemList implements PoemValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PoemValue[] args;
	
	public PoemList( PoemValue ... args ) {
		this.args = args;
	}
	
	@Override
	public String getString() {
		String toReturn = "(";
		for (int i=0 ; i<args.length ; i++ ) {
			toReturn += args[i].getString()+(i!=args.length-1?" ":"");
		}
		toReturn += ")";
		return toReturn;
	}

	@Override
	public int size() {
		int toReturn = 0;
		for (PoemValue arg : args) {
			toReturn += arg.size();
		}
		return toReturn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null) {
			return false;
		}
		if (arg0 instanceof PoemList) {
			PoemValue[] listElements = ((PoemList) arg0).args;
			if (args.length != listElements.length) {
				return false;
			}
			return Arrays.deepEquals(args, listElements);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Arrays.hashCode(args);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Arrays.toString(args);
	}

}
