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
package org.cmg.resp.topology;

import java.io.IOException;

import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.protocol.Message;

/**
 * @author Michele Loreti
 *
 */
public interface IPort {

	boolean canDeliver(Target l);

	void register( MessageDispatcher n );
	
	void sendTuple(PointToPoint to, String name, int session, Tuple tuple)  throws IOException, InterruptedException;

	void sendAck(PointToPoint to, String name, int session)  throws IOException, InterruptedException;

	void sendFail(PointToPoint to, String name, int session, String message)  throws IOException, InterruptedException;

	void sendAttributes(PointToPoint to, String name, int session,
			Attribute[] attributes)  throws IOException, InterruptedException;

	void sendPutRequest(PointToPoint l, String name, int session, Tuple t)  throws IOException, InterruptedException;

	void sendGetRequest(PointToPoint l, String name, int session, Template t)  throws IOException, InterruptedException;

	void sendQueryRequest(PointToPoint l, String name, int session, Template t)  throws IOException, InterruptedException;

	void sendGroupPutRequest(String name, int session, String[] attributes, Tuple t)  throws IOException, InterruptedException;

	void sendGroupGetRequest(String name, int session, String[] attributes , Template t)  throws IOException, InterruptedException;

	void sendGroupQueryRequest(String name, int session, String[] attributes , Template t)  throws IOException, InterruptedException;

	void sendGroupPutReply(PointToPoint l, String name, int session, int tupleSession,
			Attribute[] attributes)  throws IOException, InterruptedException;

	void sendGroupGetReply(PointToPoint l, String name, int session, int tupleSession, Attribute[] attributes, Tuple t)  throws IOException, InterruptedException;

	void sendGroupQueryReply(PointToPoint l, String name, int session, Attribute[] attributes, Tuple t)  throws IOException, InterruptedException;

	void deliver(Message msg) throws IOException, InterruptedException;

}
