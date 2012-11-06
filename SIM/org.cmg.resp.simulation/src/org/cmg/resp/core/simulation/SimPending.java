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
package org.cmg.resp.core.simulation;

import umontreal.iro.lecuyer.simprocs.SimProcess;

/**
 * @author Michele Loreti
 *
 */
public class SimPending<T> {

	protected T value;
	protected boolean error = false;
	protected SimProcess proc;
	
	public SimPending( SimProcess proc ) {
		this.proc = proc;
	}
	
	public T get() {
		return value;
	}

	public void set( T value ) {
		this.value = value;
		proc.resume();
	}
	
	public void fail() {
		this.error = true;
		proc.resume();
	}
	
	public boolean isError() {
		return error;
	}
	
}
