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
package org.cmg.resp.comp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import org.cmg.resp.RESPFactory;
import org.cmg.resp.knowledge.AbstractSensor;
import org.cmg.resp.knowledge.Tuple;

import com.google.gson.Gson;

/**
 * @author Michele Loreti
 *
 */
public class NodeSensorClient extends AbstractSensor {

	private String serverAddress;
	private int serverPort;
	private Gson gson = RESPFactory.getGSon();
	private long refreshTime;
	
	public NodeSensorClient(String name , String serverAddress , int serverPort , long refreshTime ) throws IOException {
		super( name );
		this.serverAddress = serverAddress;
		this.serverPort = serverPort;
		this.refreshTime = refreshTime;
		new Thread( new SensorThread() ).start();
	}
	
	public class SensorThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				Socket s;
				try {
					System.out.println(getName()+" requests a value...");
					s = new Socket(serverAddress,serverPort);
					BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
					Tuple t = gson.fromJson(reader, Tuple.class);
					reader.close();
					s.close();
					System.out.println(getName()+" delivers a value...");
					setValue(t);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				setValue(null);
				try {
					Thread.sleep(refreshTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
					return ;
				}
			}
		}
		
	}
			
}
