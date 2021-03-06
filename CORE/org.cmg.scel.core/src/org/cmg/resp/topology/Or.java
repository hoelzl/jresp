/**
 * Copyright (c) 2013 Concurrency and Mobility Group.
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
package org.cmg.resp.topology;

import java.util.HashMap;

import org.cmg.resp.knowledge.Attribute;

/**
 * @author Michele Loreti
 *
 */
public class Or extends GroupPredicate {

	private GroupPredicate left;
	private GroupPredicate right;

	public Or( GroupPredicate left , GroupPredicate right ) {
		super( GroupPredicate.PredicateType.OR );
		if ((left == null)||(right==null)) {
			throw new NullPointerException();
		}
		this.left = left;
		this.right = right;
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.topology.GroupPredicate#evaluate(java.util.HashMap)
	 */
	@Override
	public boolean evaluate(HashMap<String, Attribute> data) {
		return left.evaluate(data)||right.evaluate(data);
	}

	/* (non-Javadoc)
	 * @see org.cmg.resp.topology.GroupPredicate#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (super.equals(obj)) {
			Or p = (Or) obj;
			return left.equals(p.left)&&right.equals(p.right);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.left.hashCode()^this.right.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "("+left.toString()+") || ("+right.toString()+")";
	}

	public GroupPredicate getLeft() {
		return left;
	}

	public GroupPredicate getRight() {
		return right;
	}
}
