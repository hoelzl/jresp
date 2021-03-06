/**
 * Copyright (c) 2013 Concurrency and Mobility Group.
 * Universit� di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp.simulation;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.behaviour.AgentContext;
import org.cmg.resp.comp.NodeConnection;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Group;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Target;

/**
 * @author loreti
 *
 */
public class SimulationEnvironment {
	
	protected SimulationScheduler scheduler;
	
	protected HashMap<String, SimulationNode> nodes;
	
	protected int agentCounter = 0;
	
	protected int nonceCounter = 0;
	
	private ElementSelector selector;
	
	protected IDelayFactory delayFactory;
	
	protected NodeConnection connection;

	
	public SimulationEnvironment( SimulationScheduler scheduler , ElementSelector selector , IDelayFactory delayFactory ) {
		this(scheduler,selector,delayFactory,null);
	}
		
	public SimulationEnvironment( SimulationScheduler scheduler , ElementSelector selector , IDelayFactory delayFactory , NodeConnection connection ) {
		this.scheduler = scheduler;
		this.nodes = new HashMap<String, SimulationNode>();
		this.selector = selector;
		this.delayFactory = delayFactory;
		this.connection = connection;
	}

	public void register(SimulationNode simulationNode) {
		String nodeName = simulationNode.getName();
		nodes.put(nodeName, simulationNode);
	}

	public void execute(final SimulationNode simulationNode, Agent a) {
		AgentContext context = new AgentContext() {
			
			@Override
			public void suspend(long t) throws InterruptedException {
				scheduler.schedule(t);
			}
			
			@Override
			public Tuple query(Agent a, Template t, Target l)
					throws InterruptedException, IOException {
				return simulationNode.query(t, l);
			}
			
			@Override
			public boolean put(Agent a, Tuple t, Target l) throws InterruptedException,
					IOException {
				return simulationNode.put(t, l);
			}
			
			@Override
			public LinkedList<PointToPoint> getLocalAddresses() {
				return simulationNode.getLocalAddresses();
			}
			
			@Override
			public Tuple get(Agent a, Template t, Target l)
					throws InterruptedException, IOException {
				return simulationNode.get(t,l);
			}
			
			@Override
			public String fresh( Agent a ) {
				return simulationNode.fresh();
			}
			
			@Override
			public void exec(Agent a, Agent b) throws InterruptedException {
				simulationNode.addAgent(b);
			}
			
			@Override
			public void done(Agent agent) {
			}
		};
		a.setContext(agentCounter++, context);
		scheduler.execute(a);
	}

	public ElementSelector getElementSelector() {
		return selector;
	}

	public Tuple get(SimulationNode simulationNode, Template t, Target l) throws InterruptedException {
		if (l.isSelf()) {
			return _getAtSelf( simulationNode , t );
		}
		if (l.isAGroup()) {
			return _getAtGroup( simulationNode , t , (Group) l );
		}
		return _get( simulationNode , t , (PointToPoint) l );
	}

	private Tuple _get(SimulationNode simulationNode, Template t, PointToPoint l) throws InterruptedException {
		Tuple toReturn = null;		
		SimulationNode target =  nodes.get(l.getName());;
		if (target == null) {
			throw new IllegalArgumentException("Node "+l.getName()+" is unknown!");
		}
		while (true) {
			if (areInTouch(simulationNode , target )) {
				scheduler.schedule( delayFactory.getRemoteGetTime( simulationNode , t , target ) );			
				toReturn = target.get(t);
			}
			if (toReturn == null) {
				scheduler.schedule( delayFactory.getRetryTime( simulationNode ) ); 
			} else {
				return toReturn;
			}
		}
	}

	private boolean areInTouch(SimulationNode source, SimulationNode target) {
		if (connection == null) {
			return true;
		}
		return connection.areInTouch(source.getName(), target.getName());
	}

	private Tuple _getAtGroup(SimulationNode simulationNode, Template t, Group l) throws InterruptedException {
		GroupPredicate target =  l.getPredicate();		
		while (true) {
			PriorityQueue<TimedElement> queue = new PriorityQueue<SimulationEnvironment.TimedElement>();
			Tuple toReturn = null;
			for (SimulationNode n : nodes.values()) {
				double foo = delayFactory.getGroupGetTime( simulationNode , t , target , n );
				if (foo >= 0) {
					queue.add(new TimedElement(n,foo));
				}
			}
			double time = 0.0;
			for (TimedElement te : queue) {
				scheduler.schedule(te.time-time);
				if ((te.node!=simulationNode)&&(areInTouch(simulationNode , te.node ))&&(target.evaluate(te.node.getInterface()))) {
					toReturn = te.node.get(t);					
				}
				if (toReturn != null) {
					return toReturn;
				}
				time = te.time;
			}
//			scheduler.schedule( delayFactory.getRetryTime( simulationNode.getName() ) ); 
//			System.out.println("Retry...");
		}
	}

	private Tuple _getAtSelf(SimulationNode simulationNode, Template t) throws InterruptedException {
		Tuple toReturn = null;
		while (toReturn == null) {
			scheduler.schedule( delayFactory.getLocalGetTime( simulationNode , t ) );
			toReturn = simulationNode.get(t);
			if (toReturn == null) {
				scheduler.schedule( delayFactory.getRetryTime( simulationNode ) ); 
			}
		}
		return toReturn;
	}

	public boolean put(SimulationNode simulationNode, Tuple t, Target l) throws InterruptedException {
		if (l.isSelf()) {
			return _putAtSelf( simulationNode , t );
		}
		if (l.isAGroup()) {
			return _putAtGroup( simulationNode , t , (Group) l );
		}
		return _put( simulationNode , t , (PointToPoint) l );
	}

	private boolean _put(SimulationNode simulationNode, Tuple t, PointToPoint l) throws InterruptedException {
		SimulationNode target = nodes.get(l.getName());
		if (target == null) {
			throw new IllegalArgumentException("Node "+l.getName()+" is unknown!");
		}
		while (true) {
			if (areInTouch(simulationNode , target )) {
				scheduler.schedule( delayFactory.getRemotePutTime(simulationNode ,t,target ));
				target.put(t);
				return true;
			} else {
				delayFactory.getRetryTime( simulationNode );
			}
		}
	}

	private boolean _putAtGroup(SimulationNode simulationNode, Tuple t, Group l) throws InterruptedException {
		GroupPredicate predicate = l.getPredicate();
		scheduler.schedule( delayFactory.getGroupPutTime(simulationNode , t, predicate) );
		for (SimulationNode n : nodes.values()) {
			if ((n!=simulationNode)&&(areInTouch(simulationNode , n ))&&(predicate.evaluate(n.getInterface()))) {
				n.put(t);
			}
		}
		return true;
	}

	private boolean _putAtSelf(SimulationNode simulationNode, Tuple t) throws InterruptedException {
		scheduler.schedule( delayFactory.getLocalPutTime( simulationNode , t  ));
		simulationNode.put(t);		
		return true;
	}

	public Tuple query(SimulationNode simulationNode, Template t, Target l) throws InterruptedException {
		if (l.isSelf()) {
			return _queryAtSelf( simulationNode , t );
		}
		if (l.isAGroup()) {
			return _queryAtGroup( simulationNode , t , (Group) l );
		}
		return _query( simulationNode , t , (PointToPoint) l );
	}

	private Tuple _query(SimulationNode simulationNode, Template t,
			PointToPoint l) throws InterruptedException {
		Tuple toReturn = null;		
		SimulationNode target =  nodes.get(l.getName());;
		if (target == null) {
			throw new IllegalArgumentException("Node "+l.getName()+" is unknown!");
		}
		while (true) {
			if (areInTouch(simulationNode , target )) {
				scheduler.schedule( delayFactory.getRemoteQueryTime( simulationNode , t , target ) );			
				toReturn = target.query(t);
			}
			if (toReturn == null) {
				scheduler.schedule( delayFactory.getRetryTime( simulationNode ) ); 
			} else {
				return toReturn;
			}
		}
	}

	private Tuple _queryAtGroup(SimulationNode simulationNode, Template t,
			Group l) throws InterruptedException {
		GroupPredicate target =  l.getPredicate();		
		while (true) {
			PriorityQueue<TimedElement> queue = new PriorityQueue<SimulationEnvironment.TimedElement>();
			Tuple toReturn = null;
			for (SimulationNode n : nodes.values()) {
				double foo = delayFactory.getGroupQueryTime( simulationNode , t , target , n );
				if (foo >= 0) {
					queue.add(new TimedElement(n,foo));
				}
			}
			double time = 0.0;
			for (TimedElement te : queue) {
				scheduler.schedule(te.time-time);
				if ((te.node!=simulationNode)&&(areInTouch(simulationNode , te.node ))&&(target.evaluate(te.node.getInterface()))) {
					toReturn = te.node.query(t);					
				}
				if (toReturn != null) {
					return toReturn;
				}
				time = te.time;
			}
//			scheduler.schedule( delayFactory.getRetryTime( simulationNode.getName() ) ); 
//			System.out.println("Retry...");
		}
	}

	private Tuple _queryAtSelf(SimulationNode simulationNode, Template t) throws InterruptedException {
		Tuple toReturn = null;
		while (toReturn == null) {
			scheduler.schedule( delayFactory.getLocalQueryTime( simulationNode , t ) );
			toReturn = simulationNode.query(t);
			if (toReturn == null) {
				scheduler.schedule( delayFactory.getRetryTime( simulationNode ) ); 
			}
		}
		return toReturn;
	}

	public String fresh(SimulationNode simulationNode) {
		return "new"+(nonceCounter++);
	}

	public void simulate(double deadline) {
		scheduler.schedule( new SimulationAction() {
			
			@Override
			public void doAction( double time ) {
				System.out.println("Simulation completed at time: "+time);
				scheduler.stopSimulation();
			}
		}, deadline, 1);
		
		scheduler.start( );
	}
	
	public void schedule( SimulationAction action , double time ) {
		schedule( action , time , 0 );
	}

	public void schedule(SimulationAction action, double time, int priority) {
		scheduler.schedule(action, time, priority);
	}

	public void join() throws InterruptedException {
		scheduler.join();
	}

	public void schedulePeriodicAction(SimulationAction action, double from,
			double interval) {
		scheduler.schedulePeriodicAction(action, from, interval);
	}

	public void stopSimulation() {
		scheduler.stopSimulation();
	}
	
	public class TimedElement implements Comparable<TimedElement>{
		
		double time;
		
		SimulationNode node;

		public TimedElement(SimulationNode node, double time) {
			this.node = node;
			this.time = time;
		}

		@Override
		public int compareTo(TimedElement o) {
			if (time == o.time) {
				return 0;
			}
			if (time < o.time) {
				return -1;
			}
			return 1;
		}
		
		
	}
}
