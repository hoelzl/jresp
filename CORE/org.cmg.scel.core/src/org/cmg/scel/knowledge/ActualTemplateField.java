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



/**
 * @author loreti
 * 
 *
 */
public class ActualTemplateField implements TemplateField {
	
	private SCELValue value;
	
	public ActualTemplateField( SCELValue formal ) {
		this.value = formal;
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.knowledge.TemplateField#match(java.lang.Object)
	 */
	@Override
	public boolean match(SCELValue o) {
		return (value == o)||((value != null)&&value.equals(o));
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ActualTemplateField) {
			return value.equals(((ActualTemplateField) obj).value);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		return value.toString();
	}

}
