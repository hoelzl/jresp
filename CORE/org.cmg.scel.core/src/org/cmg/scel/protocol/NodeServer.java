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
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Michele Loreti
 *
 */
public class NodeServer {

	private InetSocketAddress address;
	private ServerSocket serverSocket;
	private Thread serverThread;

	public NodeServer(int port) {
		this(new InetSocketAddress(port));
	}

	public NodeServer(String host, int port) {
		this( new InetSocketAddress(host, port));
	}

	public NodeServer(InetSocketAddress address) {
		this.address = address;
	}
	
	public void start() throws IOException {
		serverSocket = new ServerSocket(address.getPort());
		serverSocket.bind(address);
		serverThread = new Thread( new ServerAgent() );
		serverThread.setDaemon(true);
		serverThread.start();
	}

	public class ServerAgent implements Runnable {

		@Override
		public void run() {
			while (true) {
				accept();
			}
		}
		
	}

	public void accept() {
		try {
			Socket socket = serverSocket.accept();
			ConnectionHandler handler = new ConnectionHandler(socket);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
