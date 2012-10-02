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
package org.cmg.resp.behaviour;

import java.io.IOException;

import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Target;

/**
 * Identifies a generic context are an agent is executed. A context
 * provides the mean used by agents to perform SCEL actions. 
 * 
 * @author Michele Loreti
 *
 */
public interface AgentContext {

	/**
	 * Agent <code>a</code> puts tuple <code>t</code> at <code>l</code>.
	 * 
	 * @param a agent executing the action
	 * @param t knowledge element to add to knowledge located at l
	 * @param l target locality
	 * @return true if the knowledge element has been successfully added at l
	 * @throws InterruptedException if any thread interrupted the current thread before 
	 * or while the current thread was waiting for a notification.
	 * @throws IOException If an I/O error occurs
	 */
	public boolean put( Agent a , Tuple t , Target l ) throws InterruptedException, IOException;
	
	/**
	 * Agent <code>a</code> removes a tuple matching template <code>t</code> from tuple space locate at l
	 * 
	 * @param a agent executing the action
	 * @param t	template used to select the tuple to remove
	 * @param l	target locality
	 * @return	removed tuple
	 * @throws InterruptedException if any thread interrupted the current thread before 
	 * or while the current thread was waiting for a notification.
	 * @throws IOException If an I/O error occurs
	 */
	public Tuple get( Agent a , Template t , Target l )  throws InterruptedException, IOException;;

	/**
	 * Agent <code>a</code> queries a tuple matching template <code>t</code> from tuple space locate at l
	 * 
	 * @param a agent executing the action
	 * @param t	template used to selecte the tuple to query
	 * @param l	target locality
	 * @return	queried tuple
	 * @throws InterruptedException if any thread interrupted the current thread before 
	 * or while the current thread was waiting for a notification.
	 * @throws IOException If an I/O error occurs
	 */
	public Tuple query( Agent a , Template t , Target l )  throws InterruptedException, IOException;;

	/**
	 * Agent a executes agent b.
	 * 
	 * @param a agent executing the action
	 * @param b	activated action
	 * @throws InterruptedException if any thread interrupted the current thread before 
	 * or while the current thread was waiting for a notification.
	 */
	public void exec( Agent a , Agent b) throws InterruptedException;

	/**
	 * Returns context status.
	 * 
	 * @return context status.
	 */
	public ContextState getState();
	
	/**
	 * Wait until context is in statatus state.
	 * 
	 * @param expected context status.
	 * @throws InterruptedException if any thread interrupted the current thread before 
	 * or while the current thread was waiting for a notification.
	 */
	public void waitState( ContextState state ) throws InterruptedException;

}
