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
public class PoemFloat implements PoemValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private float value;

	public PoemFloat(float value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.knowledge.adaptors.PoemValue#getString()
	 */
	@Override
	public String getString() {
		return toString();
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.knowledge.adaptors.PoemValue#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
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
		if (arg0 instanceof PoemFloat) {
			return value == ((PoemFloat) arg0).value;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (int) value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return value+"";
	}

}
