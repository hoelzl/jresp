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

import org.cmg.resp.RESPFactory;
import org.cmg.resp.protocol.UnicastMessage;
import org.cmg.resp.protocol.jRESPMessage;

import rice.environment.Environment;
import rice.p2p.commonapi.Application;
import rice.p2p.commonapi.Endpoint;
import rice.p2p.commonapi.Id;
import rice.p2p.commonapi.RouteMessage;
import rice.p2p.scribe.ScribeImpl;
import rice.p2p.scribe.Topic;
import rice.pastry.NodeIdFactory;
import rice.pastry.PastryNode;
import rice.pastry.PastryNodeFactory;
import rice.pastry.commonapi.PastryIdFactory;
import rice.pastry.socket.SocketPastryNodeFactory;
import rice.pastry.standard.RandomNodeIdFactory;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * @author Michele Loreti
 *
 */
public class ScribePort extends AbstractPort {
	
	private PastryNode pastryNode;
	private ScribePortApplication application;
	private Gson gson;

	public ScribePort( PastryNode pastryNode ) {
		this.pastryNode = pastryNode;
		this.gson = RESPFactory.getGSon();
		this.application = new ScribePortApplication();		
	}
	
	public class ScribePortApplication implements Application {
		
		private Endpoint endpoint;

		public ScribePortApplication() {
			this.endpoint = ScribePort.this.pastryNode.buildEndpoint(this,"jRESPPastry");
			this.endpoint.register();
		}

		@Override
		public boolean forward(RouteMessage message) {
//			System.out.println("FORWARDING: "+message);
//			System.out.println("My ID: "+pastryNode.getId().toStringFull());
//			System.out.println("Target ID: "+message.getDestinationId().toStringFull());
			return true;
		}

		@Override
		public void deliver(Id id, rice.p2p.commonapi.Message message) {
			if (message instanceof jRESPScribeMessage) {
				jRESPScribeMessage m = (jRESPScribeMessage) message;
				try {
					receiveMessage(m.getMessage());
				} catch (JsonSyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				//FIXME: Signal an error!
			}
		}

		@Override
		public void update(rice.p2p.commonapi.NodeHandle handle, boolean joined) {			
//			System.out.println("NEW NODE ID: "+handle.getId().toStringFull()+" ("+joined+")");
		}
		
		public void sendMessage( Id target , jRESPMessage message ) {
//			System.out.println("TARGET: "+target.toStringFull());
//			System.out.println("NEIGHBOURS: "+endpoint.neighborSet(100).size());
			rice.p2p.commonapi.NodeHandle nh = endpoint.neighborSet(100).getHandle(target);
			if (nh == null) {
				this.endpoint.route(target, new jRESPScribeMessage(ScribePort.this.pastryNode.getId(), target, message), null);
			} else {
				this.endpoint.route(null, new jRESPScribeMessage(ScribePort.this.pastryNode.getId(), target, message), nh);
			}
		}
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see org.cmg.resp.topology.AbstractPort#canSendTo(org.cmg.resp.topology.Target)
	 */
	@Override
	public boolean canSendTo(Target l) {
		return (l instanceof Group)||((l instanceof PointToPoint)&&(((PointToPoint) l).address instanceof PastryPortAddress));
	}

	/*
	 * (non-Javadoc)
	 * @see org.cmg.resp.topology.AbstractPort#send(org.cmg.resp.topology.Address, org.cmg.resp.protocol.UnicastMessage)
	 */
	@Override
	protected void send(Address address, UnicastMessage message)
			throws IOException, InterruptedException {
		Id target = ((PastryPortAddress) address).getId();
		application.sendMessage(target, message);		
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
		return new PastryPortAddress(this.pastryNode.getId());
	}
	
	public static ScribePort createScribePort( 
			InetAddress bindAddress, int bindport , 
			InetSocketAddress bootstrapNode , 
			Environment environment
		) throws IOException, InterruptedException {
		NodeIdFactory nidFactory = new RandomNodeIdFactory(environment);
		PastryNodeFactory factory = new SocketPastryNodeFactory(nidFactory, bindAddress , bindport, environment);	
//	    NodeHandle bootHandle = ((SocketPastryNodeFactory)factory).getNodeHandle(bootstrapNode);
		
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
		return new ScribePort(node);	
	}

	public PastryNode getNode() {
		return pastryNode;
	}

}
