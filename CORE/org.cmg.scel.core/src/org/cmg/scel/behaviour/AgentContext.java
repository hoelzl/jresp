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
package org.cmg.scel.behaviour;

import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.topology.Target;

/**
 * @author loreti
 * 
 *
 */
public interface AgentContext {

	public void put( Agent a , Tuple t , Target l ) throws InterruptedException;
	
	public Tuple get( Agent a , Template t , Target l )  throws InterruptedException;;
	
//	public Tuple getp( Agent a , Template t , Target l );
	
//	public LinkedList<Tuple> getAll( Agent a , Template t , Target l );
	
	public Tuple query( Agent a , Template t , Target l )  throws InterruptedException;;
	
//	public Tuple queryp( Agent a , Template t , Target l );
	
//	public LinkedList<Tuple> queryAll( Agent a , Template t , Target l );
	
	public void exec( Agent a , Agent b) throws InterruptedException;
	
}
