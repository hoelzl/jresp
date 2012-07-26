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
package org.cmg.scel.connections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;

import org.cmg.scel.protocol.Message;
import org.cmg.scel.protocol.UnicastMessage;
import org.cmg.scel.topology.PointToPoint;
import org.cmg.scel.topology.SCELFactory;
import org.cmg.scel.topology.Target;

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
	private ServerSocket ssocket;
	private MulticastSocket msocket;
	private InetAddress group;
	private String multicastGroup;
	private Gson gson;

	
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
		this.gson = SCELFactory.getGSon();
		this.udpPort = udpPort;
		this.group =  InetAddress.getByName(multicastGroup);
		this.msocket = new MulticastSocket(udpPort);
		this.msocket.joinGroup(this.group);
		Thread t = new Thread( new PortHandler() ); 
		t.setDaemon(true);
		t.start();
		Thread t2 = new Thread( new GroupHandler() );
		t2.setDaemon(true);
		t2.start();
	}


	@Override
	public boolean canDeliver(Target l) {		
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
	protected void send( Message m ) {
		
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
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public class GroupHandler implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					DatagramPacket p = new DatagramPacket(new byte[5000], 5000);
					msocket.receive(p);
					String str = new String(p.getData(),p.getOffset(),p.getLength());
					Message msg = gson.fromJson(str, Message.class);
					handleMessage(msg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
