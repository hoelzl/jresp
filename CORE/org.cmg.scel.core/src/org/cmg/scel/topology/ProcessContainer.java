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
package org.cmg.scel.topology;

import org.cmg.scel.knowledge.Tuple;

/**
 * @author loreti
 * 
 *
 */
public interface ProcessContainer {

	public void put( Tuple t , Target l );
	
	public void get( Tuple t , Target l );
	
	public void getp( Tuple t , Target l );
	
	public void getAll( Tuple t , Target l );
	
	public void query( Tuple t , Target l );
	
	public void queryp( Tuple t , Target l );
	
	public void queryAll( Tuple t , Target l );
	
}
