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
package org.cmg.scel.policy;

import java.io.IOException;

import org.cmg.scel.behaviour.Agent;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.topology.PointToPoint;
import org.cmg.scel.topology.Target;


/**
 * @author Michele Loreti
 *
 */
public interface IPolicy {

	void acceptPut(PointToPoint from, int session , Tuple tuple) throws InterruptedException, IOException;;

	void acceptGet(PointToPoint source, int session , Template template) throws InterruptedException, IOException;

	void acceptQuery(PointToPoint source, int session , Template template) throws InterruptedException, IOException;

	public boolean put( Agent a , Tuple t , Target l ) throws InterruptedException, IOException;
	
	public Tuple get( Agent a , Template t , Target l )  throws InterruptedException, IOException;;
		
	public Tuple query( Agent a , Template t , Target l )  throws InterruptedException, IOException;;
		
	public void exec( Agent a , Agent b) throws InterruptedException;

	void acceptGroupPut(PointToPoint source, int session, String[] attributes,
			Tuple tuple) throws IOException, InterruptedException;
	
	void acceptGroupGet(PointToPoint source, int session, String[] attributes,
			Template template) throws IOException, InterruptedException;

	void acceptGroupQuery(PointToPoint source, int session, String[] attributes,
			Template template) throws IOException, InterruptedException;

}
