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

import java.net.InetSocketAddress;

/**
 * @author Michele Loreti
 *
 */
public class Locality implements Target {

	protected String name;
	protected InetSocketAddress address;
	
	public Locality( String name , InetSocketAddress address ) {
		this.name = name;
		this.address = address;
	}
	
	public Locality( String name , int port ) {
		this( name , new InetSocketAddress(port) );
	}
	
	public Locality( String name , String host , int port ) {
		this( name , new InetSocketAddress(host, port) );
	}
	
	@Override
	public boolean isSelf() {
		return false;
	}

	public InetSocketAddress getAddress() {
		return address;
	}

	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof Locality) {
			Locality t = (Locality) arg0;
			return name.equals(t.name)&&
					address.getHostName().equals(t.address.getHostName())
					&&(address.getPort()==t.address.getPort());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode()^address.hashCode();
	}

	@Override
	public String toString() {
		return name+"@"+address;
	}
	
	
}
