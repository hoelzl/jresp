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
package org.cmg.scel.protocol;

import org.cmg.scel.topology.PointToPoint;

/**
 * @author Michele Loreti
 *
 */
public abstract class UnicastMessage extends Message {

	private String target;
	
	public UnicastMessage(MessageType type, PointToPoint source, int session, String target) {
		super(type, source, session);
		this.target = target;
	}

	public String getTarget() {
		return target;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UnicastMessage) {
			return super.equals(obj)&&(target.equals(((UnicastMessage) obj).target));
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString()+" , "+target;
	}

	@Override
	public int hashCode() {
		return super.hashCode()^target.hashCode();
	}

	
	
}
