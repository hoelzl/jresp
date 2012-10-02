package org.cmg.resp.topology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import org.cmg.resp.protocol.Message;

public class PortHandler implements Runnable {

	/**
	 * 
	 */
	private SocketPort handler;

	/**
	 * @param socketPort
	 */
	PortHandler(SocketPort socketPort) {
		handler = socketPort;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Waiting for connections at"+handler.getAddress());
				Socket s = handler.ssocket.accept();
				BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
				Message msg = handler.gson.fromJson(reader, Message.class);
				handler.handleMessage(msg);
				reader.close();
				s.close();
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