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
 * 
 * 
 * @author loreti
 * 
 *
 */
public class Template {
	//FIXME: Add documentation;

	private TemplateField[] fields;

	public Template( TemplateField ... fields ) {
		this.fields = fields;
	}
	
	public boolean match( Tuple t ) {
		int size = this.length();
		if (size != t.length()) {
			return false;
		}
		for( int i=0 ; i<size ; i++ ) {
			if (!fields[i].match(t.getElementAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @return
	 */
	public int length() {
		return fields.length;
	}
	
}
