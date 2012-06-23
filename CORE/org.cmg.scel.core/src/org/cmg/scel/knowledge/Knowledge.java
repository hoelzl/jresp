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
package org.cmg.scel.knowledge;

import java.util.LinkedList;

import org.cmg.scel.exceptions.IllegalActionException;

/**
 * This interface identifies a generic <em>knowledge</em>. This provides the high 
 * level primitives to manage pieces of relevant information coming from different 
 * sources. 
 * 
 * @author loreti
 *
 */
public interface Knowledge {
	
	/**
	 * Adds <code>element<code> to the knowledge. This method returns <code>true</code>
	 * if the new element has been successfully added to the knowledge
	 * and <code>false</code> if the action has not be executed.
	 * 
	 * @param element	the element to add to the knowledge.
	 * 
	 */
	public void put( Tuple t );
	
	/**
	 * 
	 * @param template
	 * @return
	 * @throws IllegalActionException
	 * @throws InterruptedException
	 */
	public Tuple get( Template template ) throws InterruptedException;
	
	public Tuple getp( Template template );

	public LinkedList<Tuple> getAll( Template template );
	
	public Tuple query( Template template ) throws InterruptedException;

	public Tuple queryp( Template template );

	public LinkedList<Tuple> queryAll( Template template );
}
