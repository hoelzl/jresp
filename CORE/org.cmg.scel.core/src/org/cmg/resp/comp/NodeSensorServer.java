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
package org.cmg.resp.comp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.cmg.resp.RESPFactory;
import org.cmg.resp.knowledge.Tuple;

import com.google.gson.Gson;

/**
 * This class allows remote components to access to a sensor via a network connection.
 * 
 * @author Michele Loreti
 *
 */
public class NodeSensorServer extends NodeSensor {

	/**
	 * The sensor collecting data.
	 */
	private NodeSensor sensor;
	
	/**
	 * Server socket used to accept remote connections.
	 */
	private ServerSocket ssocket;
	
	/**
	 * Gson object used to serialize/deserialize messages.
	 */
	private Gson gson = RESPFactory.getGSon();

	public NodeSensorServer(NodeSensor sensor , int port ) throws IOException {
		super( sensor.name );
		this.sensor = sensor;
		this.ssocket = new ServerSocket(port);
		new Thread(new SensorThread()).start();
	}

	@Override
	public Tuple getValue() {
		return sensor.getValue();
	}
	
	public class SensorThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					Socket s = ssocket.accept();
					PrintWriter writer = new PrintWriter(s.getOutputStream());
					writer.println( gson.toJson(getValue()) ); 
					writer.close();
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}

	}
	
}
