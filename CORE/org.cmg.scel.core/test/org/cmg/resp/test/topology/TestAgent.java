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
package org.cmg.resp.test.topology;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.INode;
import org.cmg.resp.comp.Node;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.ts.TupleSpace;
import org.cmg.resp.topology.Self;
import org.junit.Test;


/**
 * @author Michele Loreti
 *
 */
public class TestAgent {

	@Test
	public void testAgent() {
		Agent a = new Agent("test") {

			@Override
			protected void doRun() {
				
				try {
					
					while ( true ) {
						Tuple t = query(
							new Template( 
								new ActualTemplateField("motion") ,
								new FormalTemplateField( Boolean.class )										
							) , 
							Self.SELF 
						);
						boolean canMove = t.getElementAt( Boolean.class , 1 );
						if (!canMove) {
							put( new Tuple( "rescue" , true ) , Self.SELF );
							query(
								new Template( 
									new ActualTemplateField("motion") ,
									new ActualTemplateField( true )										
								) , 
								Self.SELF 
							);
						}
						t = query(
								new Template( 
									new ActualTemplateField("rescueMode") ,
									new FormalTemplateField( Boolean.class )										
								) , 
								Self.SELF 
							);
						boolean isInvolved = t.getElementAt( Boolean.class , 1 );
						if (isInvolved) {
							new rescueHandler().call();
						} else {
							put( new Tuple( "wheels" , Math.random()*Math.PI ) , Self.SELF );
						}
					}
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};
//		assertEquals(State.AWAIT,a.getState());
		INode<TupleSpace> n = new Node<TupleSpace>("test", new TupleSpace());
		n.addAgent(a);
//		assertEquals(State.READY,a.getState());
	}
	
	public class rescueHandler {
		
		public void call() {
			
		}
		
	}
	

	
}
