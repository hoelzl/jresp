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
package org.cmg.scel.topology;

import java.io.IOException;
import java.util.Hashtable;

import org.cmg.scel.exceptions.DuplicateNameException;
import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.protocol.Ack;
import org.cmg.scel.protocol.AttributeReply;
import org.cmg.scel.protocol.AttributeRequest;
import org.cmg.scel.protocol.Fail;
import org.cmg.scel.protocol.GetRequest;
import org.cmg.scel.protocol.GroupGetReply;
import org.cmg.scel.protocol.GroupGetRequest;
import org.cmg.scel.protocol.GroupPutReply;
import org.cmg.scel.protocol.GroupPutRequest;
import org.cmg.scel.protocol.GroupQueryReply;
import org.cmg.scel.protocol.GroupQueryRequest;
import org.cmg.scel.protocol.Message;
import org.cmg.scel.protocol.PutRequest;
import org.cmg.scel.protocol.QueryRequest;
import org.cmg.scel.protocol.TupleReply;
import org.cmg.scel.protocol.UnicastMessage;

/**
 * @author Michele Loreti
 *
 */
public abstract class AbstractPort implements IPort {
	
	
	Hashtable<String, MessageDispatcher> nodes;
	
	public AbstractPort( ) {
		this.nodes = new Hashtable<String, MessageDispatcher>();
	}


	public abstract boolean canDeliver(Target l);

	@Override
	public void sendTuple(PointToPoint target, String name, int session, Tuple tuple) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());		
		send(target.getAddress(),new TupleReply(source, session, target.getName(), tuple));
	}

	protected abstract void send(Address address, UnicastMessage message) throws IOException, InterruptedException;
	
	protected abstract void send( Message m ) throws IOException, InterruptedException;
	
	public abstract Address getAddress();

	@Override
	public void sendAck(PointToPoint target, String name, int session) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send(target.getAddress(),new Ack(source, session, target.getName()));
	}

	@Override
	public void sendFail(PointToPoint target, String name, int session, String message) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send(target.getAddress(),new Fail(source, session, target.getName(),message));
	}

	@Override
	public void sendAttributes(PointToPoint target, String name, int session,
			Attribute[] attributes) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send(target.getAddress(),new AttributeReply(source, session, target.getName(),attributes));
	}

	@Override
	public void sendPutRequest(PointToPoint target, String name, int session, Tuple t) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send(target.getAddress(),new PutRequest(source, session, target.getName(),t));
	}

	@Override
	public void sendGetRequest(PointToPoint target, String name, int session, Template t) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send(target.getAddress(),new GetRequest(source, session, target.getName(),t));
	}

	@Override
	public void sendQueryRequest(PointToPoint target, String name, int session, Template t) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send(target.getAddress(),new QueryRequest(source, session, target.getName(),t));
	}


	@Override
	public synchronized void register(MessageDispatcher n) {
		if (nodes.contains(n.getName())) {
			throw new DuplicateNameException();
		}
		nodes.put(n.getName(), n);
	}

	protected synchronized void handleMessage( Message m ) throws InterruptedException {
		if (m instanceof UnicastMessage) {
			handleUnicastMessage((UnicastMessage) m) ;
		} else {
			for (MessageDispatcher n : nodes.values()) {
				n.addMessage(m);
			}
		}
	}

	protected synchronized void handleUnicastMessage( UnicastMessage m ) throws InterruptedException {
		String target = m.getTarget();
		MessageDispatcher targetNode = nodes.get(target);
		if (targetNode == null) {
			try {
				sendFail(m.getSource(), null, m.getSession(),"Node "+target+" is unknown at "+getAddress());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ;
		} 
		targetNode.addMessage(m);
	}

	@Override
	public void sendGroupPutRequest(String name, int session,
			String[] attributes, Tuple t) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send(new GroupPutRequest(source, session, attributes,t));		
	}

	@Override
	public void sendGroupGetRequest(String name, int session,
			String[] attributes, Template t) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send( new GroupGetRequest(source, session, t, attributes));
	}

	@Override
	public void sendGroupQueryRequest(String name, int session,
			String[] attributes, Template t) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send( new GroupQueryRequest(source, session, t, attributes));
	}

	@Override
	public void sendGroupPutReply(PointToPoint l, String name, int session, int tupleSession,
			Attribute[] attributes) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send(l.getAddress(),new GroupPutReply(source, session, l.getName(), tupleSession, attributes));		
	}


	@Override
	public void sendGroupGetReply(PointToPoint l, String name, int session,
			int tupleSession, Attribute[] attributes, Tuple t) throws IOException,
			InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send(l.getAddress(),new GroupGetReply(source, session, l.getName(), tupleSession, attributes, t));		
	}


	@Override
	public void sendGroupQueryReply(PointToPoint l, String name, int session,
			Attribute[] attributes, Tuple t) throws IOException,
			InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send(l.getAddress(),new GroupQueryReply(source, session, l.getName(), attributes, t));		
	}

	public void sendAttributeRequest(PointToPoint l, String name,
			int session, String[] attrs) throws IOException, InterruptedException {
		PointToPoint source = new PointToPoint(name, getAddress());
		send(l.getAddress(),new AttributeRequest(source, session, l.getName(), attrs));
	}

	

}
