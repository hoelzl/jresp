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

import java.io.IOException;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.cmg.scel.behaviour.Agent;
import org.cmg.scel.behaviour.AgentContext;
import org.cmg.scel.behaviour.ContextState;
import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.Knowledge;
import org.cmg.scel.knowledge.SCELValue;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.policy.IPolicy;
import org.cmg.scel.protocol.Ack;
import org.cmg.scel.protocol.AttributeReply;
import org.cmg.scel.protocol.AttributeRequest;
import org.cmg.scel.protocol.Fail;
import org.cmg.scel.protocol.GetRequest;
import org.cmg.scel.protocol.GroupGetReply;
import org.cmg.scel.protocol.GroupGetRequest;
import org.cmg.scel.protocol.GroupPutReply;
import org.cmg.scel.protocol.GroupPutRequest;
import org.cmg.scel.protocol.GroupQueryReply;
import org.cmg.scel.protocol.GroupQueryRequest;
import org.cmg.scel.protocol.Message;
import org.cmg.scel.protocol.MessageHandler;
import org.cmg.scel.protocol.PutRequest;
import org.cmg.scel.protocol.QueryRequest;
import org.cmg.scel.protocol.TupleReply;

/**
 * 
 * 
 * 
 * @author Michele Loreti
 * 
 *
 */
public class Node<T extends Knowledge> extends Observable {

	private static final String ID_ATTRIBUTE_NAME = "ID";

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

	protected Queue<Message> pendingMessages = new LinkedList<Message>();
	
	/**
	 * 
	 */
	protected int agentCounter = 0;

	protected int sessionCounter = 0;
	
	protected String name;

	
	protected Hashtable<Integer, Pending<Attribute[]>> pendingAttributeRequests = new Hashtable<Integer, Pending<Attribute[]>>();
	
	protected Hashtable<Integer, Pending<Tuple>> tuplePending = new Hashtable<Integer, Pending<Tuple>>();
	
	protected Hashtable<Integer, Pending<Boolean>> putPending = new Hashtable<Integer, Pending<Boolean>>();

	protected LinkedList<Sensor> sensors = new LinkedList<Sensor>();
	
	protected LinkedList<Actuator> actuators = new LinkedList<Actuator>();
	
	protected Hashtable<String,AttributeCollector> attributes = new Hashtable<String, AttributeCollector>();
	
	protected LinkedList<Agent> agents;
	
	private ContextState state;
	
	protected Executor executor = Executors.newCachedThreadPool();
	
	public Node( String name , T knowledge ) {
		this.name = name;
		this.knowledge = knowledge;
		this.agents = new LinkedList<Agent>();
		this.policy = new NodePolicy(this);
		this.state = ContextState.READY;
		this.ports = new LinkedList<Port>();
	}
	
	public void addAgent(Agent a) {
		a.setContext( 
			getAgentId() , 
			new AgentContext() {
				
				@Override
				public void put(Agent a, Tuple t, Target l) throws InterruptedException, IOException {
					policy.put(a, t, l);
				}

				@Override
				public Tuple get(Agent a, Template t, Target l) throws InterruptedException, IOException {
					return policy.get(a, t, l);
				}

				@Override
				public Tuple query(Agent a, Template t, Target l) throws InterruptedException, IOException {
					return policy.query(a, t, l);
				}

				@Override
				public void exec(Agent a, Agent b) throws InterruptedException {
					policy.exec(a, b);
				}

				@Override
				public ContextState getState() {
					return Node.this.getState();
				}

				@Override
				public void waitState(ContextState state)
						throws InterruptedException {
					Node.this.waitState(state);
				}

			}
		);
		agents.add(a);
		executor.execute(a);
	}

	protected synchronized void waitState(ContextState state) throws InterruptedException {
		while (getState() != state) {
			wait();
		}
	}

	public synchronized ContextState getState() {
		return state;
	}

	public synchronized void start() {
		if (state != ContextState.READY) {
			throw new IllegalStateException();
		}
		executor.execute(new NodeThread());
		state = ContextState.RUNNING;
		notifyAll();
	}
	
	public synchronized void stop() {
		if (state != ContextState.RUNNING) {
			throw new IllegalStateException();
		}
		state = ContextState.HALT;
		notifyAll();
		doStop();
	}

	private void doStop() {
		// TODO Auto-generated method stub
		
	}

	protected synchronized int getAgentId() {
		return agentCounter++;
	}
	
	public class NodeThread implements Runnable {

		@Override
		public void run() {
			try {
			while (isRunning()) {				
				executor.execute( new NodeMessageHandler(getNextMessage()) );			
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	public class NodeMessageHandler extends MessageHandler implements Runnable {
		
		private Message m;
		
		public NodeMessageHandler( Message m ) {
			this.m = m;
		}

		@Override
		public void handle(AttributeRequest msg) throws IOException {
			sendAttibutes(msg.getSource(),msg.getSession(),msg.getAttributes());
		}

		@Override
		public void handle(AttributeReply msg) throws IOException {
			synchronized (pendingAttributeRequests) {
				Pending<Attribute[]> pending = pendingAttributeRequests.get(msg.getSession());
				if (pending == null) {
					sendFail(msg.getSource(),msg.getSession());
				} else {
					pending.set(msg.getValues());
				}
			}
		}

		@Override
		public void handle(PutRequest msg) throws IOException {
			try {
				policy.put( msg.getSource() , msg.getTuple() );
				sendAck( msg.getSource() , msg.getSession() );
			} catch (Exception e) {
				sendFail(msg.getSource(),msg.getSession());
			}
		}

		@Override
		public void handle(GetRequest msg) throws IOException {
			try {
				sendTuple( msg.getSource() , msg.getSession() , policy.get(msg.getSource() , msg.getTemplate() ));
			} catch (Exception e) {
				sendFail(msg.getSource(),msg.getSession());				
			}
		}

		@Override
		public void handle(QueryRequest msg) throws IOException {
			try {
				sendTuple( msg.getSource() , msg.getSession() , policy.query(msg.getSource() , msg.getTemplate() ));
			} catch (Exception e) {
				sendFail(msg.getSource(),msg.getSession());				
			}
		}

		@Override
		public void handle(TupleReply msg) throws IOException {
			synchronized (tuplePending) {
				Pending<Tuple> pending = tuplePending.get(msg.getSession());
				if (pending == null) {
					sendFail(msg.getSource(),msg.getSession());
				} else {
					pending.set(msg.getTuple());
					sendAck(msg.getSource(), msg.getSession());
				}
			}
		}

		@Override
		public void handle(Ack msg) {
			synchronized (putPending) {
				Pending<Boolean> pending = putPending.get(msg.getSession());
				if (pending != null) {
					pending.set(true);
				}
			}
		}

		@Override
		public void handle(Fail msg) {
			synchronized (putPending) {
				Pending<Boolean> pending = putPending.get(msg.getSession());
				if (pending != null) {
					pending.fail();
					return ;
				}
			}
			synchronized (tuplePending) {
				Pending<Tuple> pending = tuplePending.get(msg.getSession());
				if (pending != null) {
					pending.fail();
					return ;
				}
			}
			synchronized (pendingAttributeRequests) {
				Pending<Attribute[]> pending = pendingAttributeRequests.get(msg.getSession());
				if (pending != null) {
					pending.fail();
					return ;
				}
			}
			//TODO: Add error handling or logging!
		}

		@Override
		public void run() {
			try {
				m.accept(this);
			} catch (IOException e) {
				// TODO Manage error handling!
				e.printStackTrace();
			}
		}

		@Override
		public void handle(GroupGetRequest msg) throws IOException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void handle(GroupQueryRequest msg) throws IOException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void handle(GroupPutRequest msg) throws IOException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void handle(GroupGetReply msg) throws IOException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void handle(GroupQueryReply msg) throws IOException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void handle(GroupPutReply msg) throws IOException {
			// TODO Auto-generated method stub
			
		}
		
	}

	public synchronized boolean isRunning() {
		return state==ContextState.RUNNING;
	}

	public void sendTuple(PointToPoint to, int session, Tuple tuple) throws IOException {
		for (Port p : ports) {
			if (p.canDeliver(to)) {
				p.sendTuple( to , getName() , session , tuple );
				return ;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void sendAck(PointToPoint to, int session) throws IOException {
		for (Port p : ports) {
			if (p.canDeliver(to)) {
				p.sendAck( to, getName() , session );
				return ;
			}
		}
	}

	public void sendFail(PointToPoint to, int session) throws IOException {
		for (Port p : ports) {
			if (p.canDeliver(to)) {
				p.sendFail( to, getName() , session );
				return ;
			}
		}
	}

	public void sendAttibutes(PointToPoint to, int session, String[] attributes) throws IOException {
		for (Port p : ports) {
			if (p.canDeliver(to)) {
				p.sendAttributes( to, getName() , session ,getAttributes(attributes));
				return ;
			}
		}
	}

	public synchronized Message getNextMessage() throws InterruptedException {
		while (pendingMessages.isEmpty()) {
			wait();
		}
		return pendingMessages.poll();
	}
	
	public synchronized void addMessage( Message msg ) {
		pendingMessages.add(msg);
		notifyAll();
	}

	public void put(Tuple tuple) {
		if (putToActuators(tuple)) {
			return ;
		}
		knowledge.put(tuple);
	}

	private boolean putToActuators(Tuple tuple) {
		for (Actuator a : actuators) {
			if (a.getTemplate().match(tuple)) {
				a.send(tuple);
				return true;
			}
		}
		return false;
	}

	public Tuple get(Template template) throws InterruptedException {
		return knowledge.get(template);
	}

	public Tuple query(Template template) throws InterruptedException {
		Tuple t = queryFromSensors(template);
		if (t!=null) {
			return t;
		}
		return knowledge.query(template);
	}

	private synchronized Tuple queryFromSensors(Template template) {
		for (Sensor s : sensors) {
			Tuple t = s.getValue();
			if (template.match(t)) {
				return t;
			}
		}
		return null;
	}

	public void put(Tuple t, Target l) throws InterruptedException, IOException {
		if (l.isSelf()) {
			put(t);
		} else {
			sendPutRequest( l , t );
		}
	}

	private void sendPutRequest(Target l, Tuple t) throws InterruptedException, IOException {
		for (Port p : ports) {
			if (p.canDeliver(l)) {
				int session = getSession();
				Pending<Boolean> pending = new Pending<Boolean>();
				putPending.put(session, pending);
				p.sendPutRequest( l , getName() , session , t );
				pending.get(); //TODO: Handle return value!
			}
		}
		//TODO: Handle the case when no port is able to deliver message at l!
	}

	private synchronized int getSession() {
		return sessionCounter++;
	}

	public Tuple get(Template t, Target l) throws InterruptedException, IOException {
		if (l.isSelf()) {
			return get(t);
		} else {
			return sendGetRequest( l , t);
		}
	}

	private Tuple sendGetRequest(Target l, Template t) throws InterruptedException, IOException {
		for (Port p : ports) {
			if (p.canDeliver(l)) {
				int session = getSession();
				Pending<Tuple> pending = new Pending<Tuple>();
				synchronized (tuplePending) {
					tuplePending.put(session, pending);
				}
				p.sendGetRequest( l , getName() , session , t );
				return pending.get();
			}
		}
		//TODO: Handle the case when no port is able to deliver message at l!		
		return null;
	}

	public Tuple query(Template t, Target l) throws InterruptedException, IOException {
		if (l.isSelf()) {
			return query(t);
		} else {
			return sendQueryRequest( l , t);
		}
	}
	
	private Tuple sendQueryRequest(Target l, Template t) throws InterruptedException, IOException {
		for (Port p : ports) {
			if (p.canDeliver(l)) {
				int session = getSession();
				Pending<Tuple> pending = new Pending<Tuple>();
				synchronized (tuplePending) {
					tuplePending.put(session, pending);
				}
				p.sendQueryRequest( l , getName() , session , t );
				return pending.get();
			}
		}
		//TODO: Handle the case when no port is able to deliver message at l!		
		return null;
	}
	
	public synchronized void addPort( Port p ) {
		p.register(this);
		ports.add(p);
	}
	
	public Sensor[] getSensors() {
		return sensors.toArray(new Sensor[sensors.size()]);
	}

	public Actuator[] getActuators() {
		return actuators.toArray(new Actuator[sensors.size()]);
	}
	
	public synchronized void addSensor(Sensor sensor) {
		sensors.add(sensor);
	}
	
	public synchronized void addActuator( Actuator actuator ) {
		actuators.add(actuator);
	}
	
	public synchronized Attribute getAttribute( String name ) {
		AttributeCollector ac = attributes.get(name);
		if (ac == null) {
			return new Attribute(name, null);
		}
		if (ID_ATTRIBUTE_NAME.equals(name)) {
			return new Attribute(name, SCELValue.getString(getName()));
		}
		return ac.eval();
	}

	public Tuple queryp(Template template) {
		return knowledge.queryp(template);
	}

	public synchronized void addAttributeCollector( AttributeCollector ac ) {
		attributes.put(ac.getName(), ac);
	}
	
	public synchronized Hashtable<String, Attribute> getNodeInterface() {
		Hashtable<String, Attribute> toReturn = new Hashtable<String, Attribute>();
		for (String a : attributes.keySet()) {
			toReturn.put(a, attributes.get(a).eval());
		}
		toReturn.put(ID_ATTRIBUTE_NAME,new Attribute(ID_ATTRIBUTE_NAME, SCELValue.getString(getName())));
		return toReturn;
	}
	
	public synchronized Attribute[] getAttributes(String[] attributes) {
		Attribute[] toReturn = new Attribute[attributes.length];
		for( int i=0 ; i<attributes.length ; i++ ) {
			toReturn[i] = getAttribute(attributes[i]);
		}
		return toReturn;
	}
	
}
