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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


/**
 * @author Michele Loreti
 *
 */
public class ConnectionHandler {

	private ObjectInputStream input;
	private ObjectOutputStream output;
	public boolean isOpen;
	public PartnerData remote;
	
	public ConnectionHandler(Socket socket) throws IOException {
		this.input = new ObjectInputStream( socket.getInputStream() );
		this.output = new ObjectOutputStream( socket.getOutputStream() );
	}
	
	
	public void sendPartnerData( PartnerData data ) throws IOException {
		output.writeObject(data);
		output.flush();
	}

	public synchronized PartnerData getRemotePartnerData() throws InterruptedException  {
		while ( remote == null ) {
			wait();
		}
		return remote;
	}
	
	public class ConnectionThread implements Runnable {

		@Override
		public void run() {
			while (isOpen) {
				try {
					Object o = input.readObject();
					handle(o);					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnknownMessageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	public synchronized void handle(Object o) throws UnknownMessageException {
		if (o instanceof PartnerData) {
			remote = (PartnerData) o;
			notifyAll();
			return ;
		} 
		throw new UnknownMessageException(o);
	}
	
	

}
