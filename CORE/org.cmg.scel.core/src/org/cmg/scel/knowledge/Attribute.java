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
 * @author Michele Loreti
 *
 */
public class Attribute {

	private String name;
	
	private SCELValue value;
	
	public Attribute( String name , SCELValue value ) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public SCELValue getValue() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Attribute) {
			Attribute a = (Attribute) obj;
			return name.equals(a.name)&&((value==a.value)||((value != null)&&(value.equals(a.value))));
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (value==null?name.hashCode():name.hashCode()^value.hashCode());
	}

	@Override
	public String toString() {
		return name+"="+value;
	}
	
	
	
}
