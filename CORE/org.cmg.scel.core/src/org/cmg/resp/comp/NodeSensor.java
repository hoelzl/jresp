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
package org.cmg.resp.comp;

import java.util.Observable;

import org.cmg.resp.knowledge.Tuple;


/**
 * @author Michele Loreti
 *
 */
public abstract class NodeSensor extends Observable {
	
	protected String name;
	
	public NodeSensor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract Tuple getValue();
	
}
