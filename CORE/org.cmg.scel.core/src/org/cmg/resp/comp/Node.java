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

import java.io.IOException;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.behaviour.AgentContext;
import org.cmg.resp.behaviour.ContextState;
import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.Knowledge;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.policy.IPolicy;
import org.cmg.resp.protocol.Ack;
import org.cmg.resp.protocol.AttributeReply;
import org.cmg.resp.protocol.AttributeRequest;
import org.cmg.resp.protocol.Fail;
import org.cmg.resp.protocol.GetRequest;
import org.cmg.resp.protocol.GroupGetReply;
import org.cmg.resp.protocol.GroupGetRequest;
import org.cmg.resp.protocol.GroupPutReply;
import org.cmg.resp.protocol.GroupPutRequest;
import org.cmg.resp.protocol.GroupQueryReply;
import org.cmg.resp.protocol.GroupQueryRequest;
import org.cmg.resp.protocol.Message;
import org.cmg.resp.protocol.MessageHandler;
import org.cmg.resp.protocol.PutRequest;
import org.cmg.resp.protocol.QueryRequest;
import org.cmg.resp.protocol.TupleReply;
import org.cmg.resp.topology.Group;
import org.cmg.resp.topology.IPort;
import org.cmg.resp.topology.MessageDispatcher;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Target;

/**
 * 
 * This class implements a generic SCEL components. 
 * 
 * @author Michele Loreti
 * 
 *
 */
public class Node<T extends Knowledge> extends Observable implements MessageDispatcher {

	/**
	 * A parameter identifying the time-out for group oriente actions.
	 */
	protected int groupActionWaitingTime = 10000;
	
	/**
	 * This is the thread that is instantiated when a node receives a new message.
	 * 
	 * @author Michele Loreti
	 *
	 */
	public class NodeMessageHandler extends MessageHandler implements Runnable {
		
		/**
		 * The received message.
		 */
		private Message m;
		
		/**
		 * Creates an instance that is devoted to handle message <code>m</code>.
		 * 
		 * @param m message to handle.
		 */
		public NodeMessageHandler( Message m ) {
			this.m = m;
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
		public void handle(AttributeReply msg) throws IOException, InterruptedException {
			synchronized (pendingAttributeRequests) {
				Pending<Attribute[]> pending = pendingAttributeRequests.get(msg.getSession());
				if (pending == null) {
					sendFail(msg.getSource(),msg.getSession(),"Session "+msg.getSession()+" is uknown at "+getName());
				} else {
					pending.set(msg.getValues());
				}
			}
		}

		@Override
		public void handle(AttributeRequest msg) throws IOException, InterruptedException {
			sendAttibutes(msg.getSource(),msg.getSession(),msg.getAttributes());
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
		public void handle(GetRequest msg) throws IOException, InterruptedException {
			try {
				policy.acceptGet(msg.getSource() , msg.getSession() , msg.getTemplate() );
			} catch (Exception e) {
				sendFail(msg.getSource(),msg.getSession(),e.getMessage());				
			}
		}

		@Override
		public void handle(GroupGetReply msg) throws IOException, InterruptedException {
			synchronized (pendigGroupGet) {
				LinkedList<GroupGetReply> pending = pendigGroupGet.get(msg.getSession());
				if (pending == null) {
					sendFail(msg.getSource(), msg.getTupleSession(),"Session "+msg.getSession()+" is unknown at "+getName());
				} else {
					pending.add(msg);
				}
			}
		}

		@Override
		public void handle(GroupGetRequest msg) throws IOException, InterruptedException {
			policy.acceptGroupGet(msg.getSource(), msg.getSession(), msg.getAttributes(), msg.getTemplate());
		}

		@Override
		public void handle(GroupPutReply msg) throws IOException, InterruptedException {
			synchronized (outGroupPutPending) {
				LinkedList<GroupPutReply> pending = outGroupPutPending.get(msg.getSession());
				if (pending == null) {
					sendFail(msg.getSource(), msg.getTupleSession(),"Session "+msg.getSession()+" is unknown at "+getName());
				} else {
					pending.add(msg);
				}
			}
		}

		@Override
		public void handle(GroupPutRequest msg) throws IOException, InterruptedException {
			policy.acceptGroupPut( msg.getSource() , msg.getSession() , msg.getAttributes() , msg.getTuple() );
		}

		@Override
		public void handle(GroupQueryReply msg) throws IOException, InterruptedException {
			synchronized (pendigGroupQuery) {
				LinkedList<GroupQueryReply> pending = pendigGroupQuery.get(msg.getSession());
				if (pending != null) {
					pending.add(msg);
				}
			}
		}

		@Override
		public void handle(GroupQueryRequest msg) throws IOException, InterruptedException {
			policy.acceptGroupQuery(msg.getSource(), msg.getSession(), msg.getAttributes(), msg.getTemplate());
		}

		@Override
		public void handle(PutRequest msg) throws IOException, InterruptedException {
			try {
				policy.acceptPut( msg.getSource() , msg.getSession() , msg.getTuple() );
			} catch (Exception e) {
				sendFail(msg.getSource(),msg.getSession(),"Session "+msg.getSession()+" is unknown at "+getName());
			}
		}

		@Override
		public void handle(QueryRequest msg) throws IOException, InterruptedException {
			policy.acceptQuery(msg.getSource(), msg.getSession(), msg.getTemplate());
		}

		@Override
		public void handle(TupleReply msg) throws IOException, InterruptedException {
			synchronized (tuplePending) {
				Pending<Tuple> pending = tuplePending.get(msg.getSession());
				if (pending == null) {
					sendFail(msg.getSource(),msg.getSession(),"Session "+msg.getSession()+" is unknown at "+getName());
				} else {
					pending.set(msg.getTuple());
					tuplePending.remove(msg.getSession());
					sendAck(msg.getSource(), msg.getSession());
				}
			}
		}

		@Override
		public void run() {
			try {
				m.accept(this);
			} catch (IOException e) {
				// TODO Manage error handling!
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * This thread is used to remove messages from the entry queue and
	 * to activate the corresponding handler.
	 * 
	 * @author Michele Loreti
	 *
	 */
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
	protected LinkedList<IPort> ports;

	protected Queue<Message> pendingMessages = new LinkedList<Message>();
	
	/**
	 * Counter used to associate id to agents.
	 */
	protected int agentCounter = 0;

	/**
	 * Session counter
	 */
	protected int sessionCounter = 0;
	
	/**
	 * Node name
	 */
	protected String name;
	
	/**
	 * An hash-table containing the attribute requests that have been sent
	 * from this node and that have not yet received a reply.
	 */
	protected Hashtable<Integer, Pending<Attribute[]>> pendingAttributeRequests = new Hashtable<Integer, Pending<Attribute[]>>();

	/**
	 * An hash-table containing the tuple requests that have been sent
	 * from this node and that have not yet received a reply.
	 */
	protected Hashtable<Integer, Pending<Tuple>> tuplePending = new Hashtable<Integer, Pending<Tuple>>();
	
	/**
	 * An hash-table containing the put requests that have been sent
	 * from this node and that have not yet received a reply.
	 */
	protected Hashtable<Integer, Pending<Boolean>> putPending = new Hashtable<Integer, Pending<Boolean>>();

	/**
	 * An hash-table containing the group oriented put requests that have been sent
	 * from this node and that have not yet received a reply.
	 */
	protected Hashtable<Integer, Pending<Boolean>> inGroupPutPending = new Hashtable<Integer, Pending<Boolean>>();
	
	/**
	 * The list of node sensors.
	 */
	protected LinkedList<NodeSensor> sensors = new LinkedList<NodeSensor>();
	
	/**
	 * The lis of node actuators.
	 */
	protected LinkedList<NodeActuator> actuators = new LinkedList<NodeActuator>();
	
	/**
	 * The collection of attributes exposed by the node.
	 */
	protected Hashtable<String,AttributeCollector> attributes = new Hashtable<String, AttributeCollector>();
	
	/**
	 * The list of running agent.
	 */
	protected LinkedList<Agent> agents;
	
	/**
	 * The status of the node.
	 */
	private ContextState state;
	
	/**
	 * Executor used to instantiate threads.
	 */
	protected Executor executor = Executors.newCachedThreadPool();

	/**
	 * An hash-table containing the message sent to accept group oriented put requests 
	 * and that have not yet received a reply.
	 */
	private Hashtable<Integer,LinkedList<GroupPutReply>> outGroupPutPending = new Hashtable<Integer, LinkedList<GroupPutReply>>();

	/**
	 * An hash-table containing the group get requests that have been sent
	 * from this node and that have not yet received a reply.
	 */
	private Hashtable<Integer,LinkedList<GroupGetReply>> pendigGroupGet = new Hashtable<Integer, LinkedList<GroupGetReply>>();

	/**
	 * An hash-table containing the group query requests that have been sent
	 * from this node and that have not yet received a reply.
	 */
	private Hashtable<Integer,LinkedList<GroupQueryReply>> pendigGroupQuery = new Hashtable<Integer, LinkedList<GroupQueryReply>>();

	/**
	 * Creates a new instance of a nome named <code>name</code> with knowledge repository
	 * <code>knowledge</code>.
	 * 
	 * @param name node name
	 * @param knowledge knowledge repository
	 */
	public Node( String name , T knowledge ) {
		this.name = name;
		this.knowledge = knowledge;
		this.agents = new LinkedList<Agent>();
		this.policy = new NodePolicy(this);
		this.state = ContextState.READY;
		this.ports = new LinkedList<IPort>();
	}

	/**
	 * Adds an actuator to the current node.
	 * 
	 * @param actuator the actuator to add to the node.
	 */
	public synchronized void addActuator( NodeActuator actuator ) {
		actuators.add(actuator);
	}

	/**
	 * Executes agent <code>a</code>
	 * 
	 * @param a agent to execute
	 */
	public void addAgent(Agent a) {
		a.setContext( 
			getAgentId() , 
			new AgentContext() {
				
				@Override
				public void exec(Agent a, Agent b) throws InterruptedException {
					policy.exec(a, b);
				}

				@Override
				public Tuple get(Agent a, Template t, Target l) throws InterruptedException, IOException {
					return policy.get(a, t, l);
				}

				@Override
				public ContextState getState() {
					return Node.this.getState();
				}

				@Override
				public boolean put(Agent a, Tuple t, Target l) throws InterruptedException, IOException {
					return policy.put(a, t, l);
				}

				@Override
				public Tuple query(Agent a, Template t, Target l) throws InterruptedException, IOException {
					return policy.query(a, t, l);
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
	
	/**
	 * Adds an attribute collector to the node
	 *  
	 * @param ac the attribute collector to add to the node
	 */
	public synchronized void addAttributeCollector( AttributeCollector ac ) {
		ac.setNode(this);
		attributes.put(ac.getName(), ac);
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.topology.MessageDispatcher#addMessage(org.cmg.scel.protocol.Message)
	 */
	@Override
	public synchronized void addMessage( Message msg ) {
		pendingMessages.add(msg);
		notifyAll();
	}

	/**
	 * Add a port to the node.
	 * 
	 * @param p the port to add 
	 */
	public synchronized void addPort( IPort p ) {
		p.register(this);
		ports.add(p);
	}
	
	/**
	 * Adds a sensor to the current node
	 * 
	 * @param sensor the sensor to add
	 */
	public synchronized void addSensor(NodeSensor sensor) {
		sensors.add(sensor);
	}
	
	/**
	 * Terminates node
	 */
	private void doStop() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Gets a tuple matching the parameter from the local knowledge repository. This action
	 * is blocking if a matching is not found.
	 * 
	 * @param template get template
	 * @return	a tuple matching the parameter
	 * @throws InterruptedException  when another thread interrupt current thread
	 * computation while action is under execution.
	 */
	public Tuple get(Template template) throws InterruptedException {
		return knowledge.get(template);
	}

	/**
	 * Gets a tuple matching the parameter from the knowledge repository located at <code>l</code>. 
	 * This action is blocking if a matching is not found.
	 * 
	 * @param template get template
	 * @return	a tuple matching the parameter
	 * @throws InterruptedException  when another thread interrupt current thread
	 * computation while action is under execution.
	 */
	public Tuple get(Template t, Target l) throws InterruptedException, IOException {
		if (l.isSelf()) {
			return get(t);
		} 
		if (l.isAGroup()) {
			return sendGroupGetRequest( (Group) l , t );
		}
		return sendGetRequest( (PointToPoint) l , t);
	}

	/**
	 * Returns an array containing node's actuators.
	 * 
	 * @return an array containing node's actuators.
	 */
	public NodeActuator[] getActuators() {
		return actuators.toArray(new NodeActuator[sensors.size()]);
	}

	/**
	 * Computes next agent id.
	 * 
	 * @return next agent id.
	 */
	protected synchronized int getAgentId() {
		return agentCounter++;
	}

	/**
	 * Returns attribute named <code>name</code>
	 * 
	 * @param name attribute name
	 * @return attribute named <code>name</code>
	 */
	public synchronized Attribute getAttribute( String name ) {
		AttributeCollector ac = attributes.get(name);
		if (ac == null) {
			return new Attribute(name, null);
		}
		if (ID_ATTRIBUTE_NAME.equals(name)) {
			return new Attribute(name, getName());
		}
		return ac.eval();
	}

	/**
	 * Returns an array of attributes whose names are in array <code>attributes</code>
	 *
	 * @param attributes attributes' names
	 * @return an array of attributes.
	 */
	public synchronized Attribute[] getAttributes(String[] attributes) {
		Attribute[] toReturn = new Attribute[attributes.length];
		for( int i=0 ; i<attributes.length ; i++ ) {
			toReturn[i] = getAttribute(attributes[i]);
		}
		return toReturn;
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.topology.MessageDispatcher#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Retrieves next message from the message queue.
	 * 
	 * @return next message in the incoming message queue.
	 * 
	 * @throws InterruptedException  when another thread interrupts current thread
	 * computation while action is under execution.
	 */
	private synchronized Message getNextMessage() throws InterruptedException {
		while (pendingMessages.isEmpty()) {
			wait();
		}
		return pendingMessages.poll();
	}

	/**
	 * Returns the node interface. This is rendered as an hash-table associating to
	 * each name the corresponding attribute.
	 * 
	 * @return an hash-table with the node interface.
	 */
	public synchronized Hashtable<String, Attribute> getNodeInterface() {
		Hashtable<String, Attribute> toReturn = new Hashtable<String, Attribute>();
		for (String a : attributes.keySet()) {
			toReturn.put(a, attributes.get(a).eval());
		}
		toReturn.put(ID_ATTRIBUTE_NAME,new Attribute(ID_ATTRIBUTE_NAME, getName()));
		return toReturn;
	}

	/**
	 * Returns the array of sensors attached to the node.
	 * 
	 * @return the array of sensors attached to the node.
	 */
	public NodeSensor[] getSensors() {
		return sensors.toArray(new NodeSensor[sensors.size()]);
	}

	/**
	 * Creates a new session id.
	 * 
	 * @return a new session id.
	 */
	private synchronized int getSession() {
		return sessionCounter++;
	}

	/**
	 * Returns node status.
	 * 
	 * @return node status.
	 */
	public synchronized ContextState getState() {
		return state;
	}

	/**
	 * Checks if the node is running.
	 * 
	 * @return true if the node is running.
	 */
	public synchronized boolean isRunning() {
		return state==ContextState.RUNNING;
	}

	/**
	 * Adds tuple <code>tuple</code> to the local knowledge repository.
	 * 
	 * @param tuple the tuple to add
	 */
	public void put(Tuple tuple) {
		if (putToActuators(tuple)) {
			return ;
		}
		knowledge.put(tuple);
	}

	/**
	 * Adds tuple <code>tuple</code> to the knowledge repository located at
	 * <code>l</code>
	 * 
	 * @param t tuple to add
	 * @param l target locality
	 * @return true if the action has been correctrly executed.
	 * @throws InterruptedException when another thread interrupts current thread
	 * computation while action is under execution.
	 * @throws IOException when an I/O error occurs
	 */
	public boolean put(Tuple t, Target l) throws InterruptedException, IOException {
		if (l.isSelf()) {
			put(t);
			return true;
		}  
		if (l.isAGroup()) {
			return sendGroupPutRequest( (Group) l , t );
		}
		return sendPutRequest((PointToPoint) l , t );
	}

	/**
	 * Checks if tuple <code>tuple</code> can be intercepted to one of 
	 * the actuators attached to the node. In the case, the tuple is sent
	 * to the right actuator. 
	 * 
	 * @param tuple the tuple send to actuators
	 * @return if an actuator has received the tuple.
	 */
	private boolean putToActuators(Tuple tuple) {
		for (NodeActuator a : actuators) {
			if (a.getTemplate().match(tuple)) {
				a.send(tuple);
				return true;
			}
		}
		return false;
	}

	/**
	 * Queries a tuple matching template <code>template</code> from the local
	 * knowledge repository. This is a blocking: the thread invoking this method
	 * is blocked until a matching tuple is found.
	 * 
	 * @param template action template
	 * @return a matching tuple
	 * @throws InterruptedException when another thread interrupts current thread
	 * computation while action is under execution.
	 */
	public Tuple query(Template template) throws InterruptedException {
		Tuple t = queryFromSensors(template);
		if (t!=null) {
			return t;
		}
		return knowledge.query(template);
	}

	/**
	 * Queries a tuple matching template <code>template</code> from the
	 * knowledge repository located at <code>l</code>. This is a blocking: the thread 
	 * invoking this method
	 * is blocked until a matching tuple is found.
	 * 
	 * @param template action template
	 * @param l target locality
	 * @return a matching tuple
	 * @throws InterruptedException when another thread interrupts current thread
	 * computation while action is under execution.
	 */
	public Tuple query(Template t, Target l) throws InterruptedException, IOException {
		if (l.isSelf()) {
			return query(t);
		} 
		if (l.isAGroup()) {
			return sendGroupQueryRequest( (Group) l , t );
		}
		return sendQueryRequest((PointToPoint) l , t);
	}

	/**
	 * Queries a tuple matching template <code>template</code> from the
	 * knowledge repository of a node belonging to group <code>l</code>. This is a blocking: the thread 
	 * invoking this method
	 * is blocked until a matching tuple is found.
	 *
	 * @param l a group identifying the target node
	 * @param t action template
	 * @return a matching tuple
	 * @throws IOException when an I/O error occurs
	 * @throws InterruptedException when another thread interrupts current thread
	 * computation while action is under execution.
	 */
	private Tuple sendGroupQueryRequest(Group l, Template t) throws IOException, InterruptedException {
		Tuple result = null;
		while (result == null) {
			int session = getSession();
			LinkedList<GroupQueryReply> received = new LinkedList<GroupQueryReply>();
			synchronized (pendigGroupQuery) {
				pendigGroupQuery.put(session,received);				
			}
			broadCastQueryRequest(session, l.getPredicate().getParameters(), t);
			Pending<Tuple> pending = new Pending<Tuple>();
			executor.execute( new GroupQueryHandler( l , session , pending ) );		
			result = pending.get();
		}
		return result;
	}

	/**
	 * Queries a tuple matching template <code>template</code> from sensors attached
	 * to the node.
	 * 
	 * @param template action template
	 * @return a matching tuple or null if no sensors for the template is available.
	 */
	private synchronized Tuple queryFromSensors(Template template) {
		for (NodeSensor s : sensors) {
			Tuple t = s.getValue();
			if ((t!=null)&&(template.match(t))) {
				return t;
			}
		}
		return null;
	}
	
	/**
	 * This is the predicative variant of action query. Differently from action query, this is
	 * not blocking. Indeed, if no tuple matching <code>template</code> is available in the
	 * local repository, value null is returned.
	 * 
	 * @param template action template
	 * @return	a matching tuple or null.
	 */
	public Tuple queryp(Template template) {
		return knowledge.queryp(template);
	}
	
	/**
	 * Sends an acknowledgment message to <code>to</code> with id <code>session</code>.
	 * 
	 * @param to target of the acknowledgment
	 * @param session message session
	 * @throws IOException when an I/O error occurs
	 * @throws InterruptedException when another thread interrupts current thread
	 * computation while action is under execution.
	 */
	public void sendAck(PointToPoint to, int session) throws IOException, InterruptedException {
		for (IPort p : ports) {
			if (p.canDeliver(to)) {
				p.sendAck( to, getName() , session );
				return ;
			}
		}
	}
	
	/**
	 * 
	 * @param to
	 * @param session
	 * @param attributes
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void sendAttibutes(PointToPoint to, int session, String[] attributes) throws IOException, InterruptedException {
		for (IPort p : ports) {
			if (p.canDeliver(to)) {
				p.sendAttributes( to, getName() , session ,getAttributes(attributes));
				return ;
			}
		}
	}

	public void sendFail(PointToPoint to, int session, String message) throws IOException, InterruptedException {
		for (IPort p : ports) {
			if (p.canDeliver(to)) {
				p.sendFail( to, getName() , session , message);
				return ;
			}
		}
	}
	
	private Tuple sendGetRequest(PointToPoint l, Template t) throws InterruptedException, IOException {
		for (IPort p : ports) {
			if (p.canDeliver(l)) {
				int session = getSession();
				Pending<Tuple> pending = new Pending<Tuple>();
				synchronized (tuplePending) {
					tuplePending.put(session, pending);
				}
				Tuple result = null;
				while (result == null) {
					p.sendGetRequest( l , getName() , session , t );
					result = pending.get();
				}
				return result;
			}
		}
		//TODO: Handle the case when no port is able to deliver message at l!		
		return null;
	}
	
	private boolean sendGroupPutRequest(Group l, Tuple t) throws IOException, InterruptedException {
		int session = getSession();
		LinkedList<GroupPutReply> received = new LinkedList<GroupPutReply>();
		outGroupPutPending.put(session,received);
		for (IPort p : ports) {
			p.sendGroupPutRequest(getName(), session, l.getPredicate().getParameters(), t);
		}
		executor.execute( new GroupPutHandler( l , session , t ) );		
		return true;
	}

	private Tuple sendGroupGetRequest(Group l, Template t) throws IOException, InterruptedException {
		Tuple result = null;
		while (result == null) {
			int session = getSession();
			LinkedList<GroupGetReply> received = new LinkedList<GroupGetReply>();
			synchronized (pendigGroupGet) {
				pendigGroupGet.put(session,received);				
			}
			broadCastGetRequest(session, l.getPredicate().getParameters(), t);
			Pending<Tuple> pending = new Pending<Tuple>();
			executor.execute( new GroupGetHandler( l , session , pending ) );		
			result = pending.get();
		}
		return result;
	}
	
	private void broadCastGetRequest(int session, String[] parameters, Template t ) throws IOException, InterruptedException {
		for (IPort p : ports) {
			p.sendGroupGetRequest(getName(), session, parameters, t);
		}		
	}

	private void broadCastQueryRequest(int session, String[] parameters, Template t ) throws IOException, InterruptedException {
		for (IPort p : ports) {
			p.sendGroupQueryRequest(getName(), session, parameters, t);
		}		
	}

	
	public void sendGroupPutReply(PointToPoint source, int session,
			Attribute[] attributes2) {
//		IPort p = getPort( source );
	}

	private boolean sendPutRequest(PointToPoint l, Tuple t) throws InterruptedException, IOException {
		for (IPort p : ports) {
			if (p.canDeliver(l)) {
				int session = getSession();
				Pending<Boolean> pending = new Pending<Boolean>();
				putPending.put(session, pending);
				p.sendPutRequest( l , getName() , session , t );
				return pending.get(); 
			}
		}
		return false;//TODO: Probably an exception should be raised here!
	}
	
	private Tuple sendQueryRequest(PointToPoint l, Template t) throws InterruptedException, IOException {
		for (IPort p : ports) {
			if (p.canDeliver(l)) {
				int session = getSession();
				Pending<Tuple> pending = new Pending<Tuple>();
				synchronized (tuplePending) {
					tuplePending.put(session, pending);
				}
				Tuple result = null;
				while (result == null) {
					p.sendQueryRequest( l , getName() , session , t );
					result = pending.get();
				}
				return result;
			}
		}
		//TODO: Handle the case when no port is able to deliver message at l!		
		return null;
	}

	public void sendTuple(PointToPoint to, int session, Tuple tuple) throws IOException, InterruptedException {
		for (IPort p : ports) {
			if (p.canDeliver(to)) {
				p.sendTuple( to , getName() , session , tuple );
				return ;
			}
		}
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
	
	protected synchronized void waitState(ContextState state) throws InterruptedException {
		while (getState() != state) {
			wait();
		}
	}
	
	public class GroupPutHandler implements Runnable {

		private Group group;
		private int session;

		public GroupPutHandler(Group group, int session, Tuple tuple ) {
			this.group = group;
			this.session = session;
		}

		@Override
		public void run() {
			LinkedList<GroupPutReply> received = null;
			try {
				long current = System.currentTimeMillis();
				long deadline = current+groupActionWaitingTime;
				while (current<deadline) {
					Thread.sleep(deadline-current);
					current = System.currentTimeMillis();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (Node.this.outGroupPutPending) {
				received = Node.this.outGroupPutPending.get(session);
				Node.this.outGroupPutPending.remove(session);
				if (received != null) {
					try {
						doGroupPut( group , received );
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}				
		}
		
	}

	public class GroupGetHandler implements Runnable {
	
		private Group group;
		private int session;
		private Pending<Tuple> pending;
	
		public GroupGetHandler(Group group, int session, Pending<Tuple> pending ) {
			this.group = group;
			this.session = session;
			this.pending = pending;
		}
	
		@Override
		public void run() {
			LinkedList<GroupGetReply> received = null;
			try {
				long current = System.currentTimeMillis();
				long deadline = current+groupActionWaitingTime;
				while (current<deadline) {
					Thread.sleep(deadline-current);
					current = System.currentTimeMillis();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (Node.this.pendigGroupGet) {
				received = Node.this.pendigGroupGet.get(session);
				Node.this.outGroupPutPending.remove(session);
				if (received != null) {
					try {
						doGroupGet( group , received , pending );
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}				
		}
		
	}

	public class GroupQueryHandler implements Runnable {
	
		private Group group;
		private int session;
		private Pending<Tuple> pending;
	
		public GroupQueryHandler(Group group, int session, Pending<Tuple> pending ) {
			this.group = group;
			this.session = session;
			this.pending = pending;
		}
	
		@Override
		public void run() {
			LinkedList<GroupQueryReply> received = null;
			try {
				long current = System.currentTimeMillis();
				long deadline = current+groupActionWaitingTime;
				while (current<deadline) {
					Thread.sleep(deadline-current);
					current = System.currentTimeMillis();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (Node.this.pendigGroupQuery) {
				received = Node.this.pendigGroupQuery.get(session);
				Node.this.pendigGroupQuery.remove(session);
				if (received != null) {
					try {
						doGroupQuery( group , received , pending );
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}				
		}
		
	}

	public int getGroupActionWaitingTime() {
		return groupActionWaitingTime;
	}

	public void doGroupGet(Group group, LinkedList<GroupGetReply> received, Pending<Tuple> pending) throws InterruptedException {
		boolean flag = true;

		for (GroupGetReply reply : received) {
			try {
				if (flag&&group.getPredicate().evaluate(reply.getAttributes())) {
					sendAck(reply.getSource(), reply.getTupleSession());
					flag = false;
					pending.set(reply.getTuple());
				} else {
					sendFail(reply.getSource(), reply.getTupleSession(), "Attribute predicate is not satisfied!");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (flag) {
			pending.fail();
		}
		
	}

	public void doGroupQuery(Group group, LinkedList<GroupQueryReply> received, Pending<Tuple> pending) throws InterruptedException {
		boolean flag = true;

		for (GroupQueryReply reply : received) {
			if (flag&&group.getPredicate().evaluate(reply.getAttributes())) {
				flag = false;
				pending.set(reply.getTuple());
			} 
		}
		
		if (flag) {
			pending.fail();
		}
		
	}

	public void doGroupPut(Group group, LinkedList<GroupPutReply> received) throws InterruptedException {
		for (GroupPutReply reply : received) {
			try {
				if (group.getPredicate().evaluate(reply.getValues())) {
					sendAck(reply.getSource(), reply.getTupleSession());
				} else {
					sendFail(reply.getSource(), reply.getTupleSession(),"Attribute predicate is not satisfied!");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void setGroupActionWaitingTime(int groupActionWaitingTime) {
		this.groupActionWaitingTime = groupActionWaitingTime;
	}

	public void put(PointToPoint from, int session, Tuple tuple) throws IOException, InterruptedException {
		put(tuple);
		sendAck( from , session );
	}

	public void gPut(PointToPoint from, int session, String[] attributes,
			Tuple tuple) throws IOException, InterruptedException {
		IPort p = getPort(from);
		if (p != null) {
			int tupleSession = getSession();
			Pending<Boolean> pending = new Pending<Boolean>();
			putPending.put(tupleSession, pending);
			p.sendGroupPutReply(from, getName(), session,tupleSession, getAttributes(attributes));
			if (pending.get()) {
				knowledge.put(tuple);
			}
		}
	}

	private synchronized IPort getPort(Target l) {
		for (IPort p : ports) {
			if (p.canDeliver(l)) {
				return p;
			}
		}
		return null;
	}

	public void gGet(PointToPoint from, int session, String[] attributes,
			Template template) {
		IPort p = getPort(from);
		if (p != null) {
			Tuple t = knowledge.getp(template);
			if (t != null) {
				int tupleSession = getSession();
				Pending<Boolean> pending = new Pending<Boolean>();
				putPending.put(tupleSession, pending);
				try {
					p.sendGroupGetReply(from, getName(), session, tupleSession, getAttributes(attributes), t);
					if (pending.get()==null) {
						knowledge.put(t);
					}
				} catch (Exception e) {
					e.printStackTrace();
					knowledge.put(t);
				}
			}
//			p.sendGroupPutReply(from, getName(), session,tupleSession, getAttributes(attributes));
		}
	}

	public void gQuery(PointToPoint from, int session, String[] attributes,
			Template template) {
		IPort p = getPort(from);
		if (p != null) {
			Tuple t = knowledge.queryp(template);
			if (t != null) {
				try {
					p.sendGroupQueryReply(from, getName(), session, getAttributes(attributes), t);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
//			p.sendGroupPutReply(from, getName(), session,tupleSession, getAttributes(attributes));
		}
	}
	
	public Tuple[] getKnowledgeItems() {
		return knowledge.getKnowledgeItems();
	}
	
}
