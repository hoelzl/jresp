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
package org.cmg.resp.topology;

import java.io.IOException;

import org.cmg.resp.protocol.jRESPMessage;
import org.cmg.resp.protocol.UnicastMessage;

/**
 * @author Michele Loreti
 *
 */
public interface MessageReceiver {

	public void receiveMessage( jRESPMessage m ) throws InterruptedException, IOException;

	public void receiveUnicastMessage( UnicastMessage m ) throws InterruptedException, IOException;
	
}
