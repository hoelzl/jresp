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

import org.cmg.scel.knowledge.SCELValue.SCELType;



/**
 * @author loreti
 * 
 *
 */
public class FormalTemplateField implements TemplateField {

	private SCELType type;
	
	public FormalTemplateField(SCELType type) {
		this.type = type;
	}
	
	
	/* (non-Javadoc)
	 * @see org.cmg.scel.knowledge.TemplateField#match(java.lang.Object)
	 */
	@Override
	public boolean match(SCELValue o) {
		return o.getType() == type;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FormalTemplateField) {
			return type == ((FormalTemplateField) obj).type;
		}
		return false;
	}


	@Override
	public int hashCode() {
		return type.hashCode();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
