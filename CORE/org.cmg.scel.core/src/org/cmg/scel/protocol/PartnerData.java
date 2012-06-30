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

import java.io.Serializable;

/**
 * @author Michele Loreti
 *
 */
public class PartnerData implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String name;
	protected int port;
	protected String host;
	protected int session;
	
	
	public PartnerData(String name, int port, String host) {
		this(name,port,host,-1);
	}
	
	public PartnerData(String name, int port, String host, int session) {
		super();
		this.name = name;
		this.port = port;
		this.host = host;
		this.session = session;
	}
	public String getName() {
		return name;
	}
	public int getPort() {
		return port;
	}
	public String getHost() {
		return host;
	}
	public int getSession() {
		return session;
	}

}
