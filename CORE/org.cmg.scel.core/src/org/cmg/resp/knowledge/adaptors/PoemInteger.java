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

/**
 * @author Michele Loreti
 *
 */
public class PoemInteger implements PoemValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected int value;
	
	public PoemInteger( int value ) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.cmg.resp.knowledge.adaptors.PoemValue#getString()
	 */
	@Override
	public String getString() {
		return toString();
	}

	/*
	 * (non-Javadoc)
	 * @see org.cmg.resp.knowledge.adaptors.PoemValue#size()
	 */
	@Override
	public int size() {
		return 1;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null) {
			return false;
		}
		if (arg0 instanceof PoemInteger) {
			return value == ((PoemInteger) arg0).value;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return value+"";
	}
	
	

}
