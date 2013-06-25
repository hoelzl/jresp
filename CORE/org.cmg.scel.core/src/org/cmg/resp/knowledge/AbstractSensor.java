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

import java.util.Observable;



/**
 * @author Michele Loreti
 *
 */
public abstract class AbstractSensor extends Observable {
	
	protected String name;
	
	protected Tuple value;
	
	public AbstractSensor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public final Tuple getValue() {
		return value;
	}
	
	public final void setValue( Tuple t ) {
		this.value = t;
		this.setChanged();
		this.notifyObservers(t);
	}
	
}
