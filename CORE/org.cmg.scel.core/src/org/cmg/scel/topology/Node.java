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
import org.cmg.scel.connections.IPort;
import org.cmg.scel.connections.MessageDispatcher;
import org.cmg.scel.connections.Sensor;
import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.Knowledge;
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
public class Node<T extends Knowledge> extends Observable implements MessageDispatcher {

	protected int groupActionWaitingTime = 10000;
	
	public class NodeMessageHandler extends MessageHandler implements Runnable {
		
		private Message m;
		
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
			policy.acceptGet(msg.getSource(), msg.getSession(), msg.getTemplate());
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
	 * 
	 */
	protected int agentCounter = 0;

	
	protected int sessionCounter = 0;
	
	protected String name;
	
	protected Hashtable<Integer, Pending<Attribute[]>> pendingAttributeRequests = new Hashtable<Integer, Pending<Attribute[]>>();

	protected Hashtable<Integer, Pending<Tuple>> tuplePending = new Hashtable<Integer, Pending<Tuple>>();
	
	protected Hashtable<Integer, Pending<Boolean>> putPending = new Hashtable<Integer, Pending<Boolean>>();

	protected Hashtable<Integer, Pending<Boolean>> inGroupPutPending = new Hashtable<Integer, Pending<Boolean>>();
	
	protected LinkedList<Sensor> sensors = new LinkedList<Sensor>();
	
	protected LinkedList<Actuator> actuators = new LinkedList<Actuator>();
	
	protected Hashtable<String,AttributeCollector> attributes = new Hashtable<String, AttributeCollector>();
	
	protected LinkedList<Agent> agents;
	
	private ContextState state;
	
	protected Executor executor = Executors.newCachedThreadPool();

	private Hashtable<Integer,LinkedList<GroupPutReply>> outGroupPutPending = new Hashtable<Integer, LinkedList<GroupPutReply>>();

	private Hashtable<Integer,LinkedList<GroupGetReply>> pendigGroupGet = new Hashtable<Integer, LinkedList<GroupGetReply>>();

	private Hashtable<Integer,LinkedList<GroupQueryReply>> pendigGroupQuery = new Hashtable<Integer, LinkedList<GroupQueryReply>>();

	public Node( String name , T knowledge ) {
		this.name = name;
		this.knowledge = knowledge;
		this.agents = new LinkedList<Agent>();
		this.policy = new NodePolicy(this);
		this.state = ContextState.READY;
		this.ports = new LinkedList<IPort>();
	}

	public synchronized void addActuator( Actuator actuator ) {
		actuators.add(actuator);
	}

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

	public synchronized void addPort( IPort p ) {
		p.register(this);
		ports.add(p);
	}
	
	public synchronized void addSensor(Sensor sensor) {
		sensors.add(sensor);
	}
	
	private void doStop() {
		// TODO Auto-generated method stub
		
	}

	public Tuple get(Template template) throws InterruptedException {
		return knowledge.get(template);
	}

	public Tuple get(Template t, Target l) throws InterruptedException, IOException {
		if (l.isSelf()) {
			return get(t);
		} 
		if (l.isAGroup()) {
			return sendGroupGetRequest( (Group) l , t );
		}
		return sendGetRequest( (PointToPoint) l , t);
	}

	public Actuator[] getActuators() {
		return actuators.toArray(new Actuator[sensors.size()]);
	}

	protected synchronized int getAgentId() {
		return agentCounter++;
	}

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
	
	public synchronized Message getNextMessage() throws InterruptedException {
		while (pendingMessages.isEmpty()) {
			wait();
		}
		return pendingMessages.poll();
	}

	public synchronized Hashtable<String, Attribute> getNodeInterface() {
		Hashtable<String, Attribute> toReturn = new Hashtable<String, Attribute>();
		for (String a : attributes.keySet()) {
			toReturn.put(a, attributes.get(a).eval());
		}
		toReturn.put(ID_ATTRIBUTE_NAME,new Attribute(ID_ATTRIBUTE_NAME, getName()));
		return toReturn;
	}

	public Sensor[] getSensors() {
		return sensors.toArray(new Sensor[sensors.size()]);
	}

	private synchronized int getSession() {
		return sessionCounter++;
	}

	public synchronized ContextState getState() {
		return state;
	}

	public synchronized boolean isRunning() {
		return state==ContextState.RUNNING;
	}

	public void put(Tuple tuple) {
		if (putToActuators(tuple)) {
			return ;
		}
		knowledge.put(tuple);
	}

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

	private boolean putToActuators(Tuple tuple) {
		for (Actuator a : actuators) {
			if (a.getTemplate().match(tuple)) {
				a.send(tuple);
				return true;
			}
		}
		return false;
	}

	public Tuple query(Template template) throws InterruptedException {
		Tuple t = queryFromSensors(template);
		if (t!=null) {
			return t;
		}
		return knowledge.query(template);
	}

	public Tuple query(Template t, Target l) throws InterruptedException, IOException {
		if (l.isSelf()) {
			return query(t);
		} 
		if (l.isAGroup()) {
			return sendGroupQueryRequest( (Group) l , t );
		}
		return sendQueryRequest((PointToPoint) l , t);
	}

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

	private synchronized Tuple queryFromSensors(Template template) {
		for (Sensor s : sensors) {
			Tuple t = s.getValue();
			if (template.match(t)) {
				return t;
			}
		}
		return null;
	}
	
	public Tuple queryp(Template template) {
		return knowledge.queryp(template);
	}
	
	public void sendAck(PointToPoint to, int session) throws IOException, InterruptedException {
		for (IPort p : ports) {
			if (p.canDeliver(to)) {
				p.sendAck( to, getName() , session );
				return ;
			}
		}
	}
	
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
				while (result != null) {
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
				while (result != null) {
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
	
}
