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
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import org.cmg.resp.RESPFactory;
import org.cmg.resp.exceptions.DuplicateNameException;
import org.cmg.resp.protocol.Ack;
import org.cmg.resp.protocol.AttributeReply;
import org.cmg.resp.protocol.AttributeRequest;
import org.cmg.resp.protocol.Fail;
import org.cmg.resp.protocol.GetRequest;
import org.cmg.resp.protocol.GroupGetReply;
import org.cmg.resp.protocol.GroupGetRequest;
import org.cmg.resp.protocol.GroupPutReply;
import org.cmg.resp.protocol.GroupPutRequest;
import org.cmg.resp.protocol.GroupQueryReply;
import org.cmg.resp.protocol.GroupQueryRequest;
import org.cmg.resp.protocol.Message;
import org.cmg.resp.protocol.MessageHandler;
import org.cmg.resp.protocol.PutRequest;
import org.cmg.resp.protocol.QueryRequest;
import org.cmg.resp.protocol.TupleReply;

import com.google.gson.Gson;

/**
 * @author Michele Loreti
 *
 */
public class ServerPort extends MessageHandler {

	private static final int DEFAULT_SUBSCRIBE_PORT = 9999;
	private static final int DEFAULT_PROTOCOL_PORT = 9998;
	
	private Gson gson;
	protected HashMap<String, InetSocketAddress> clients;

	private ServerSocket subribe_socket;
	private ServerSocket protocol_socket;
	
	public ServerPort() throws IOException {
		this(DEFAULT_SUBSCRIBE_PORT,DEFAULT_PROTOCOL_PORT);
	}

	public ServerPort(int subscribe_port, int protocol_port ) throws IOException {
		this(subscribe_port,protocol_port,new HashMap<String, InetSocketAddress>());
	}

	public ServerPort(int subscribe_port, int protocol_port, HashMap<String, InetSocketAddress> clients) throws IOException {
		this.clients = clients;
		this.gson = RESPFactory.getGSon();
		this.subribe_socket = new ServerSocket(subscribe_port);
		this.protocol_socket = new ServerSocket(protocol_port);
	}
	
	public void register( String clientName , InetSocketAddress clientAddress ) {
		if (clients.containsKey(clientName)) {
			throw new DuplicateNameException(clientName);
		}
		clients.put(clientName, clientAddress);
	}
	
	public void unregister( String clientName ) {
		clients.remove(clientName);
	}

	private void dispatch( String clientName , Message message ) throws IOException {
		InetSocketAddress clientAddress = clients.get(clientName);
		Socket socket = new Socket(clientAddress.getAddress(), clientAddress.getPort());
		PrintWriter writer = new PrintWriter(socket.getOutputStream());
		writer.println(gson.toJson(message));
		writer.close();
		socket.close();
	}
	
	private synchronized void broadcast( Message message ) {
		for (String clientName : clients.keySet()) {
			try {
				dispatch( clientName , message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void handle(AttributeRequest msg) throws IOException,
			InterruptedException {
		dispatch( msg.getTarget() , msg );
	}

	@Override
	public void handle(AttributeReply msg) throws IOException,
			InterruptedException {
		dispatch( msg.getTarget() , msg );
	}

	@Override
	public void handle(PutRequest msg) throws IOException, InterruptedException {
		dispatch( msg.getTarget() , msg );
	}

	@Override
	public void handle(GetRequest msg) throws IOException, InterruptedException {
		dispatch( msg.getTarget() , msg );
	}

	@Override
	public void handle(QueryRequest msg) throws IOException,
			InterruptedException {
		dispatch( msg.getTarget() , msg );
	}

	@Override
	public void handle(TupleReply msg) throws IOException, InterruptedException {
		dispatch( msg.getTarget() , msg );
	}

	@Override
	public void handle(Ack msg) throws IOException {
		dispatch( msg.getTarget() , msg );
	}

	@Override
	public void handle(GroupGetRequest msg) throws IOException,
			InterruptedException {
		broadcast(msg);
	}

	@Override
	public void handle(GroupQueryRequest msg) throws IOException,
			InterruptedException {
		broadcast(msg);
	}

	@Override
	public void handle(GroupPutRequest msg) throws IOException,
			InterruptedException {
		broadcast(msg);
	}

	@Override
	public void handle(GroupGetReply msg) throws IOException,
			InterruptedException {
		dispatch(msg.getTarget(), msg);
	}

	@Override
	public void handle(GroupQueryReply msg) throws IOException,
			InterruptedException {
		dispatch(msg.getTarget(), msg);
	}

	@Override
	public void handle(GroupPutReply msg) throws IOException,
			InterruptedException {
		dispatch(msg.getTarget(), msg);
	}

	@Override
	public void handle(Fail msg) throws IOException {
		dispatch(msg.getTarget(), msg);
	}
	
}
