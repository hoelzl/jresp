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

import java.io.IOException;

import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;

/**
 * @author Michele Loreti
 *
 */
public interface Port {

	boolean canDeliver(Target l);

	void register( Node<?> n );
	
	void sendTuple(Target to, String name, int session, Tuple tuple) throws IOException;

	void sendAck(Target to, String name, int session) throws IOException;;

	void sendFail(Target to, String name, int session) throws IOException;;

	void sendAttributes(Target to, String name, int session,
			Attribute[] attributes) throws IOException;;

	void sendPutRequest(Target l, String name, int session, Tuple t) throws IOException;;

	void sendGetRequest(Target l, String name, int session, Template t) throws IOException;;

	void sendQueryRequest(Target l, String name, int session, Template t) throws IOException;;

}
