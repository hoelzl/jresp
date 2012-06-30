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
package org.cmg.scel.topology;

import java.util.LinkedList;
import java.util.Observable;

import org.cmg.scel.behaviour.Agent;
import org.cmg.scel.behaviour.AgentContainer;
import org.cmg.scel.knowledge.Knowledge;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.policy.IPolicy;
import org.cmg.scel.protocol.NodeServer;

/**
 * 
 * 
 * 
 * @author Michele Loreti
 * 
 *
 */
public class Node<T extends Knowledge> extends Observable implements AgentContainer {

	public enum State {
		READY,
		RUNNING,
		CLOSING,
		HALT
	}
	
	/**
	 * Local knowledge
	 */
	protected T knowledge;

	/**
	 * Node policy
	 */
	protected IPolicy	policy;
	
	/**
	 * Port used to perform group-based interactions
	 */
	protected LinkedList<Port> ports;

	/**
	 * 
	 */
	protected int agentCounter = 0;
	
	protected String name;

	protected LinkedList<Agent> agents;
	
	protected NodeServer nodeServer;
	
	public Node( String name , NodeServer nodeServer , T knowledge ) {
		this.name = name;
		this.nodeServer = nodeServer;
		this.knowledge = knowledge;
		this.agents = new LinkedList<Agent>();
		this.policy = new NodePolicy(this);
	}
	
	public Node( String name , int port , T knowledge ) {
		this( name , new NodeServer(port) , knowledge );
	}

	public Node( String name , String host , int port , T knowledge ) {
		this( name , new NodeServer(host,port) , knowledge );
	}
	
	public void put(Agent a, Tuple t, Target l) throws InterruptedException {
		policy.put(a, t, l);
	}

	public Tuple get(Agent a, Template t, Target l) throws InterruptedException {
		return policy.get(a, t, l);
	}

//	public Tuple getp(Agent a, Template t, Target l) {
//		return policy.getp(a, t, l);
//	}

//	public LinkedList<Tuple> getAll(Agent a, Template t, Target l) {
//		return policy.getAll(a, t, l);
//	}

	public Tuple query(Agent a, Template t, Target l) throws InterruptedException {
		return policy.query(a, t, l);
	}

	@Override
	public void exec(Agent a, Agent b) throws InterruptedException {
		policy.exec(a, b);
	}

	@Override
	public void addAgent(Agent a) {
		a.setConteiner(this);
		agents.add(a);
	}

	@Override
	public synchronized void start() {
		
	}
	
	@Override
	public synchronized void stop() {
		
	}

	@Override
	public int getAgentId() {
		return agentCounter++;
	}
	
	

//	public Tuple queryp(Agent a, Template t, Target l) {
//		return policy.queryp(a, t, l);
//	}
//
//	public LinkedList<Tuple> queryAll(Agent a, Template t, Target l) {
//		return policy.queryAll(a, t, l);
//	}

}
