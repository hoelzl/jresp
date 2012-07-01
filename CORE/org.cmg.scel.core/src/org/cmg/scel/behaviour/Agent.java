/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universitą di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.scel.behaviour;

import java.io.IOException;
import java.util.Observable;

import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.topology.Target;

/**
 * This class identifies a SCEL agent. 
 * 
 * 
 * @author Michele Loreti
 *
 */
public abstract class Agent extends Observable implements Runnable {
	
	/**
	 * An enumeration identifying possible agent states
	 * 
	 * @author Michele Loreti
	 *
	 */
	public enum State {
		/**
		 * Agent waiting for an operating context.
		 */
		AWAIT,
		
		/**
		 * Agent ready to start the computation.
		 */
		READY,
		
		/**
		 * Agent computation is suspended
		 */
		SLEEP,
		
		/**
		 * Agent computation is forced to terminate
		 */
		HALT,
		
		/**
		 * Agent computation is terminated in an error state
		 */
		ERROR,
		
		/**
		 * Agent is running
		 */
		RUNNING,
		
		/**
		 * Agent computation is successfully terminated
		 */
		DONE
	}
	
	/**
	 * Agent state
	 */
	private State state;
	
	/**
	 * Identifies the context where the agent is running.
	 */
	private AgentContext context;
	
	/**
	 * Agent name
	 */
	protected String name;
	
	/**
	 * Agent id
	 */
	protected int id;
	
	/**
	 * Creates a new agent with a specific name.
	 * 
	 * @param name agent name
	 */
	public Agent( String name ) {
		this.name = name;
		this.state = State.AWAIT;
	}
	
	/**
	 * Returns agent name.
	 * 
	 * @return agent name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Start agent execution.
	 */
	public final void run() {
		try {
			context.waitState(ContextState.RUNNING);
			doStart();
			doRun();
			doClose();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * A subclass of <code>Agent</code> has to provide an implementation 
	 * of this method that identifies agent behaviour.
	 */
	protected abstract void doRun();
	
	protected void doClose() {
		
	}

	/**
	 * A subclass of <code>Agent</code> has to provide an implementation 
	 * of this method that identifies agent behaviour.
	 */
	private synchronized void doStart() throws InterruptedException {
		while ((state != State.RUNNING)) {
			wait();
		}
	}

	/**
	 * Adds tupe <code>t</code> to knowledge repository located
	 * at <code>l</code>
	 * 
	 * @param t knowledge element
	 * @param l	target locality
	 * @throws InterruptedException - when another thread interrupt agent
	 * computation while action is under execution.
	 * @throws IOException 
	 */
	protected void put(Tuple t, Target l) throws InterruptedException, IOException {
		doStep();
		context.put(this, t, l);
	}

	/**
	 * Gets a tuple matching template <code>t</code> from the knoledge
	 * repository located at <code>l</code>.
	 * 
	 * @param t knowledge template
	 * @param l	target locality
	 * @return	a tuple matching template <code>t</code>
	 * @throws InterruptedException - when another thread interrupt agent
	 * computation while action is under execution.
	 * @throws IOException 
	 */
	protected Tuple get(Template t, Target l)  throws InterruptedException, IOException {
		return context.get(this, t, l);
	}

	/**
	 * Queries a tuple matching template <code>t</code> from the knoledge
	 * repository located at <code>l</code>.
	 * 
	 * @param t knowledge template
	 * @param l	target locality
	 * @return	a tuple matching template <code>t</code>
	 * @throws InterruptedException - when another thread interrupt agent
	 * computation while action is under execution.
	 * @throws IOException 
	 */
	protected Tuple query(Template t, Target l)  throws InterruptedException, IOException {
		return context.query(this, t, l);
	}

	/**
	 * Suspends agent computation.
	 */
	public void sleep( ) {
		setState( State.SLEEP );
	}
	
	/**
	 * Stops agent computation.
	 */
	public void stop() {
		setState( State.HALT );
	}

	/**
	 * Set agent state to <code>state</code>
	 * 
	 * @param state new agent state
	 */
	private synchronized void setState(State state) {
		this.state = state;
		notifyObservers();
		notifyAll();
	}
	
	/**
	 * Checks if an action can be executed or, according to
	 * current state, agent computation is suspended or terminated.
	 * 
	 * @throws InterruptedException
	 */
	protected synchronized void doStep() throws InterruptedException {
		while (this.state==State.SLEEP) {
			wait();
		}
		switch (state) {
		case HALT:
		case DONE:
		case AWAIT:
		case ERROR:
			throw new IllegalStateException();
		default:
			//Agent can perform requested action!
		}
	}
	
	/**
	 * Returns <code>true</code> if the agent is in
	 * sleep state.
	 * 
	 * @return <code>true</code> if the agent is in sleep state.
	 */
	public boolean isSleeping() {
		return this.state==State.SLEEP;
	}

	/**
	 * Returns <code>true</code> if the agent computation has been terminated.
	 * 
	 * @return <code>true</code> if the agent computation has been terminated.
	 */
	public boolean isHalted() {
		return this.state==State.HALT;
	}

	/**
	 * Sets the container where agent is executed. This method can be invoked
	 * only when the agent is in state <code>State.AWAIT</code>.
	 * 
	 * @param context the context where agent is executed.
	 */
	public synchronized void setContext(int id , AgentContext context) {
		if (state != State.AWAIT) {
			throw new IllegalStateException();
		}
		this.context = context;
		this.id = id;
		setState(State.READY);
	}

	/**
	 * Starts agent computation. This method can be invoked only when an agent
	 * is in state <code>State.READY</code> or <code>State.SLEEP</coode>.
	 */
	public synchronized void start() {
		if ((state != State.READY)&&(state != State.SLEEP)) {
			throw new IllegalStateException();
		}
		setState(State.RUNNING);
	}

	public State getState() {
		return state;
	}

}
