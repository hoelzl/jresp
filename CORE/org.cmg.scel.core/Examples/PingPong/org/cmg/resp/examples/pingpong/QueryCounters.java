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
package org.cmg.resp.examples.pingpong;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Self;
import org.cmg.resp.topology.SocketPort;
import org.cmg.resp.topology.SocketPortAddress;

/**
 * @author Michele Loreti
 *
 */
public class QueryCounters {

	public static void main(String[] argv) throws IOException {
		SocketPort portOne = new SocketPort(9999);
		SocketPort portTwo = new SocketPort(9998);
		Node<TupleSpace> nodeOne = new Node<TupleSpace>("one", new TupleSpace());
		nodeOne.addPort(portOne);
		nodeOne.put(new Tuple( "COUNTER" , 0 ) );
		Agent one = new Counter("agentOne", new PointToPoint("two", new SocketPortAddress(9998)));
		Agent two = new Counter("agentTwo", new PointToPoint("one", new SocketPortAddress(9999)));
		nodeOne.addAgent(one);
		one.start();
		Node<TupleSpace> nodeTwo = new Node<TupleSpace>("two", new TupleSpace());
		nodeTwo.addPort(portTwo);
		nodeTwo.put(new Tuple( "COUNTER" , 0 ) );
		nodeTwo.addAgent(two);
		two.start();
		nodeTwo.start();
		nodeOne.start();
	}
	
	
	public static class Counter extends Agent {

		PointToPoint other;
		Template counterTemplate = new Template( new ActualTemplateField( "COUNTER" ) , new FormalTemplateField(Integer.class) );
		
		public Counter( String name , PointToPoint other ) {
			super(name);
			this.other = other;
			
		}

		@Override
		protected void doRun() {
			try {
				while (true) {
					System.out.println(getName()+": RETRIEVING COUNTER VALUE REMOTELY!");
					Tuple t = query( counterTemplate , other);
					System.out.println(getName()+": COUNTER VALUE RETRIEVED!");
					get(counterTemplate,Self.SELF);
					System.out.println(getName()+": LOCAL COUNTER REMOVED!");
					put( new Tuple( "COUNTER" , t.getElementAt(Integer.class,1)+1 ) , Self.SELF);
					System.out.println(getName()+": COUNTER UPDATED TO "+(t.getElementAt(Integer.class,1)+1)+"!");
					Thread.sleep(10);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
