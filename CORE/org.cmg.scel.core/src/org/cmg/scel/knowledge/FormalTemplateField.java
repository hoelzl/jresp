/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
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
package org.cmg.scel.knowledge;

/**
 * @author loreti
 * 
 *
 */
public class FormalTemplateField implements TemplateField {
	
	private Object formal;
	
	public FormalTemplateField( Object formal ) {
		this.formal = formal;
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.knowledge.TemplateField#match(java.lang.Object)
	 */
	@Override
	public boolean match(Object o) {
		return formal.equals(formal);
	}

}
