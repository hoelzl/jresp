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
package org.cmg.scel.knowledge.ts;

import org.cmg.scel.knowledge.TemplateField;


/**
 * @author loreti
 * 
 *
 */
public class ClassTemplateField implements TemplateField {

	private Class<?> c;
	
	public ClassTemplateField(Class<?> c) {
		this.c = c;
	}
	
	
	/* (non-Javadoc)
	 * @see org.cmg.scel.knowledge.TemplateField#match(java.lang.Object)
	 */
	@Override
	public boolean match(Object o) {
		return c.isInstance(o);
	}

}
