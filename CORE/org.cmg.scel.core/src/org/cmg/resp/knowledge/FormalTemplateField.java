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
package org.cmg.resp.knowledge;




/**
 * Identifies a formal template field. 
 * 
 * @author Michele Loreti
 *
 */
public class FormalTemplateField implements TemplateField {

	/**
	 * Type of mathcing value.
	 */
	private Class<?> type;
	
	/**
	 * Creates a matching template field matching any value of type <code>type</code>.
	 * @param type
	 */
	public FormalTemplateField(Class<?> type) {
		this.type = type;
	}
	
	
	/***
	 * A SCELValue o matches this formal field if and only if o has type <code>this.type</code>.
	 * 
	 * @see org.cmg.resp.knowledge.TemplateField#match(java.lang.Object)
	 */
	@Override
	public boolean match(Object o) {
		return type.isInstance(o);
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FormalTemplateField) {
			return type.equals( ((FormalTemplateField) obj).type );
		}
		return false;
	}


	@Override
	public int hashCode() {
		return type.hashCode();
	}


	@Override
	public String toString() {
		return "{"+type.getName()+"}";
	}


	public Class<?> getFormalFieldType() {
		return type;
	}

}
