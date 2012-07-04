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
package org.cmg.scel.topology;


/**
 * @author Michele Loreti
 *
 */
public abstract class GroupPredicate {

	protected String[] parameters;
	
	protected GroupPredicate( String ... parameters ) {
		this.parameters = parameters;
	}

	public int size() {
		return parameters.length;
	}
	
	public String getParameterName( int i ) {
		return parameters[i];
	}
	
	public abstract boolean evaluate( Object[] data );

	public String[] getParameters() {
		return parameters;
	}
	
}
