/**
 * Copyright (c) 2013 Concurrency and Mobility Group.
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
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Collections;

import org.cmg.resp.protocol.jRESPMessage;
import org.cmg.resp.protocol.UnicastMessage;

import rice.environment.Environment;
import rice.p2p.commonapi.Application;
import rice.p2p.commonapi.Id;
import rice.p2p.commonapi.RouteMessage;
import rice.pastry.NodeHandle;
import rice.pastry.NodeIdFactory;
import rice.pastry.PastryNode;
import rice.pastry.PastryNodeFactory;
import rice.pastry.socket.SocketPastryNodeFactory;
import rice.pastry.standard.RandomNodeIdFactory;

/**
 * @author Michele Loreti
 *
 */
public class ScribePort extends AbstractPort {
	
	private PastryNode pastryNode;

	public ScribePort( PastryNode pastryNode ) {
		this.pastryNode = pastryNode;
	}
	
	public class ScribePortApplication implements Application {

		@Override
		public boolean forward(RouteMessage message) {
			return true;
		}

		@Override
		public void deliver(Id id, rice.p2p.commonapi.Message message) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update(rice.p2p.commonapi.NodeHandle handle, boolean joined) {			
		}
		
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see org.cmg.resp.topology.AbstractPort#canSendTo(org.cmg.resp.topology.Target)
	 */
	@Override
	public boolean canSendTo(Target l) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.cmg.resp.topology.AbstractPort#send(org.cmg.resp.topology.Address, org.cmg.resp.protocol.UnicastMessage)
	 */
	@Override
	protected void send(Address address, UnicastMessage message)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.cmg.resp.topology.AbstractPort#send(org.cmg.resp.protocol.Message)
	 */
	@Override
	protected void send(jRESPMessage m) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Address getAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static ScribePort createScribePort( 
			InetAddress bindAddress, int bindport , 
			InetSocketAddress bootstrapNode , 
			Environment environment
		) throws IOException, InterruptedException {
		NodeIdFactory nidFactory = new RandomNodeIdFactory(environment);
		PastryNodeFactory factory = new SocketPastryNodeFactory(nidFactory, bindAddress , bindport, environment);	
	    NodeHandle bootHandle = ((SocketPastryNodeFactory)factory).getNodeHandle(bootstrapNode);
		
		// construct a node, passing the null boothandle on the first loop will 
	    // cause the node to start its own ring
	    PastryNode node = factory.newNode();
	    if (bootstrapNode == null) {
	    	node.boot(Collections.EMPTY_LIST);
	    } else {
	    	node.boot(bootstrapNode);
	    }
	    synchronized(node) {
	        while(!node.isReady() && !node.joinFailed()) {
	        	System.out.println("Trying to join the FreePastry ring. Retry in 500ms.");
	          // delay so we don't busy-wait
	          node.wait(500);
	          
	          // abort if can't join
	          if (node.joinFailed()) {
	            throw new IOException("Could not join the FreePastry ring.  Reason:"+node.joinFailedReason()); 
	          }
	        }       
	    }	
	    System.out.println("NODE STARTED: "+node.isReady());
		return null;	
	}

}
