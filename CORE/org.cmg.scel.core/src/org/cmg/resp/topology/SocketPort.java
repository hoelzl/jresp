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
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;

import org.cmg.resp.RESPFactory;
import org.cmg.resp.protocol.jRESPMessage;
import org.cmg.resp.protocol.UnicastMessage;

import com.google.gson.Gson;

/**
 * @author Michele Loreti
 *
 */
public class SocketPort extends AbstractPort {
	
	
	public static int DEFAULT_TCP_PORT = 9999;
	public static int DEFAULT_UDP_PORT = 9999;
	public static String DEFAUL_MULTICAST_GROUP = "233.252.252.252";

	
	private int tcpPort;
	private int udpPort;
	ServerSocket ssocket;
	MulticastSocket msocket;
	private InetAddress group;
	private String multicastGroup;
	Gson gson;

	
	public SocketPort( ) throws IOException {
		this(DEFAULT_TCP_PORT,DEFAULT_UDP_PORT,DEFAUL_MULTICAST_GROUP);
	}
	
	public SocketPort( int tcpPort ) throws IOException {
		this(tcpPort,DEFAULT_UDP_PORT,DEFAUL_MULTICAST_GROUP);
	}
	
	public SocketPort( int tcpPort , int udpPort ) throws IOException {
		this(tcpPort,udpPort,DEFAUL_MULTICAST_GROUP);
	}
	
	public SocketPort(int tcpPort , int udpPort , String multicastGroup ) throws IOException {
		super();
		this.tcpPort = tcpPort;
		this.ssocket = new ServerSocket(tcpPort);
		this.gson = RESPFactory.getGSon();
		this.udpPort = udpPort;
		this.group =  InetAddress.getByName(multicastGroup);
		this.msocket = new MulticastSocket(udpPort);
		this.msocket.joinGroup(this.group);
		Thread t = new Thread( new SocketReceiver(this.ssocket,this) ); 
		t.setDaemon(true);
		t.start();
		Thread t2 = new Thread( new DatagramReceiver(msocket,this) );
		t2.setDaemon(true);
		t2.start();
	}


	@Override
	public boolean canSendTo(Target l) {		
		return (l instanceof PointToPoint)&&(((PointToPoint) l).getAddress() instanceof SocketPortAddress);
	}

	@Override
	protected void send(Address address, UnicastMessage message) throws IOException {
		InetSocketAddress isc = ((SocketPortAddress) address).getAddress();
		Socket socket = new Socket(isc.getAddress(), isc.getPort());
		PrintWriter writer = new PrintWriter(socket.getOutputStream());
		writer.println(gson.toJson(message));
		writer.close();
		socket.close();
	}
	
	@Override
	protected void send( jRESPMessage message ) throws IOException {
		//FIXME: Check if parameters are correctly passed!
		msocket.send(new DatagramPacket(gson.toJson(message).getBytes() , 0 ));
	}


	public SocketPortAddress getAddress() {
		return new SocketPortAddress(ssocket.getInetAddress(),tcpPort);
	}

	public int getUdpPort() {
		return udpPort;
	}
	
	public String getMulticastGroup() {
		return multicastGroup;
	}

}
