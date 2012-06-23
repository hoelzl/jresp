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

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.DatagramChannel;
import java.util.HashMap;

/**
 * @author loreti
 *
 */
public class AbstractProtocol {
	
	DatagramChannel c;
	
	public AbstractProtocol( ) throws IOException {
		c = DatagramChannel.open();
	}
	
	public void connect( SocketAddress address ) throws IOException {
		c.connect(address);
	}
	
	public void connect( ) {

	}
	

}
