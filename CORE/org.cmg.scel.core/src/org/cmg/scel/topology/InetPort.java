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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

import org.cmg.scel.exceptions.DuplicateNameException;
import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.protocol.Ack;
import org.cmg.scel.protocol.AttributeReply;
import org.cmg.scel.protocol.Fail;
import org.cmg.scel.protocol.GetRequest;
import org.cmg.scel.protocol.Message;
import org.cmg.scel.protocol.PutRequest;
import org.cmg.scel.protocol.QueryRequest;
import org.cmg.scel.protocol.TupleReply;

import com.google.gson.Gson;

/**
 * @author Michele Loreti
 *
 */
public class InetPort implements Port {

	
	Hashtable<String, Node<?>> nodes;
	private int port;
	private ServerSocket ssocket;
	private Gson gson;

	public InetPort(int port) throws IOException {
		this.port = port;
		this.ssocket = new ServerSocket(port);
		this.gson = SCELFactory.getGSon();
		this.nodes = new Hashtable<String, Node<?>>();
		Thread t = new Thread( new PortHandler() ); 
		t.setDaemon(true);
		t.start();
	}


	@Override
	public boolean canDeliver(Target l) {		
		return (l instanceof Locality);
	}

	@Override
	public void sendTuple(Target to, String name, int session, Tuple tuple) throws IOException {
		if (!(to instanceof Locality)) {
			throw new IllegalArgumentException();
		}
		Locality target = (Locality) to;
		Locality source = new Locality(name, getAddress());
		send(target.getAddress(),new TupleReply(source, session, target.getName(), tuple));
	}

	private void send(InetSocketAddress address, Message message) throws IOException {
		Socket socket = new Socket(address.getAddress(), address.getPort());
		PrintWriter writer = new PrintWriter(socket.getOutputStream());
		writer.println(gson.toJson(message));
		writer.close();
		socket.close();
	}


	public InetSocketAddress getAddress() {
		return new InetSocketAddress(ssocket.getInetAddress(),port);
	}


	@Override
	public void sendAck(Target to, String name, int session) throws IOException {
		if (!(to instanceof Locality)) {
			throw new IllegalArgumentException();
		}
		Locality target = (Locality) to;
		Locality source = new Locality(name, getAddress());
		send(target.getAddress(),new Ack(source, session, target.getName()));
	}

	@Override
	public void sendFail(Target to, String name, int session) throws IOException {
		if (!(to instanceof Locality)) {
			throw new IllegalArgumentException();
		}
		Locality target = (Locality) to;
		Locality source = new Locality(name, getAddress());
		send(target.getAddress(),new Fail(source, session, target.getName()));
	}

	@Override
	public void sendAttributes(Target to, String name, int session,
			Attribute[] attributes) throws IOException {
		if (!(to instanceof Locality)) {
			throw new IllegalArgumentException();
		}
		Locality target = (Locality) to;
		Locality source = new Locality(name, getAddress());
		send(target.getAddress(),new AttributeReply(source, session, target.getName(),attributes));
	}

	@Override
	public void sendPutRequest(Target to, String name, int session, Tuple t) throws IOException {
		if (!(to instanceof Locality)) {
			throw new IllegalArgumentException();
		}
		Locality target = (Locality) to;
		Locality source = new Locality(name, getAddress());
		send(target.getAddress(),new PutRequest(source, session, target.getName(),t));
	}

	@Override
	public void sendGetRequest(Target to, String name, int session, Template t) throws IOException {
		if (!(to instanceof Locality)) {
			throw new IllegalArgumentException();
		}
		Locality target = (Locality) to;
		Locality source = new Locality(name, getAddress());
		send(target.getAddress(),new GetRequest(source, session, target.getName(),t));
	}

	@Override
	public void sendQueryRequest(Target to, String name, int session, Template t) throws IOException {
		if (!(to instanceof Locality)) {
			throw new IllegalArgumentException();
		}
		Locality target = (Locality) to;
		Locality source = new Locality(name, getAddress());
		send(target.getAddress(),new QueryRequest(source, session, target.getName(),t));
	}


	@Override
	public synchronized void register(Node<?> n) {
		if (nodes.contains(n.getName())) {
			throw new DuplicateNameException();
		}
		nodes.put(n.name, n);
	}

	protected synchronized void handleMessage( Message m ) {
		String target = m.getTarget();
		Node<?> targetNode = nodes.get(target);
		if (targetNode == null) {
			try {
				sendFail(m.getSource(), null, m.getSession());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ;
		} 
		targetNode.addMessage(m);
	}
	
	public class PortHandler implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					System.out.println("Waiting for connections at"+getAddress());
					Socket s = ssocket.accept();
					BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
					Message msg = gson.fromJson(reader, Message.class);
					handleMessage(msg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
