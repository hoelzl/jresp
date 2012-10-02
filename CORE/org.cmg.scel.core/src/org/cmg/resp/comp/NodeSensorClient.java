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
import org.cmg.resp.knowledge.Tuple;

import com.google.gson.Gson;

/**
 * @author Michele Loreti
 *
 */
public class NodeSensorClient extends NodeSensor {

	private String serverAddress;
	private int serverPort;
	private Gson gson = RESPFactory.getGSon();
	
	public NodeSensorClient(String name , String serverAddress , int serverPort ) throws IOException {
		super( name );
		this.serverAddress = serverAddress;
		this.serverPort = serverPort;
	}

	@Override
	public Tuple getValue() {
		Socket s;
		try {
			System.out.println(getName()+" requests a value...");
			s = new Socket(serverAddress,serverPort);
			BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			Tuple t = gson.fromJson(reader, Tuple.class);
			reader.close();
			s.close();
			System.out.println(getName()+" delivers a value...");
			return t;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
		
}
