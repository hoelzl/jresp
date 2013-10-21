/**
 * Copyright (c) 2013 Concurrency and Mobility Group.
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
package org.cmg.resp.test.poem;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.adaptors.PoemAdaptor;
import org.cmg.resp.knowledge.adaptors.PoemAdaptor.PoemNonce;
import org.cmg.resp.knowledge.adaptors.PoemList;
import org.cmg.resp.knowledge.adaptors.PoemSymbol;
import org.cmg.resp.knowledge.adaptors.PoemVariable;
import org.cmg.resp.topology.Self;

/**
 * @author Michele Loreti
 *
 */
public class TestPoem {
	
	public static void main(String[] argv) throws InterruptedException {
		testRunOneTuple();
	}


	public static void testSimple() throws InterruptedException {
		PoemAdaptor adaptor = new PoemAdaptor();
		PoemNonce nonce = adaptor.getNonce();
		System.out.println( adaptor.poemEval("(+ 1 2)", nonce) );
	}

	public static void testSimpleTuple() throws InterruptedException {
		PoemAdaptor adaptor = new PoemAdaptor();
		Tuple nonceTuple = adaptor.get(
				new Tuple( PoemAdaptor.POEM_KEY , PoemAdaptor.PoemCommand.NONCE ).toTemplate() );
		PoemNonce nonce = nonceTuple.getElementAt(PoemNonce.class , 0);
		System.out.println( adaptor.get(
			PoemAdaptor.getEvalTuple("(+ 1 2)", nonce).toTemplate()
		));
	}

	public static void testSimpleTwo() throws InterruptedException {
		PoemAdaptor adaptor = new PoemAdaptor();
		PoemNonce nonce = adaptor.getNonce();
		System.out.println( adaptor.poemEval("(+ 1.0 2.0)", nonce) );
	}

	public static void testSimpleTwoTuple() throws InterruptedException {
		PoemAdaptor adaptor = new PoemAdaptor();
		Tuple nonceTuple = adaptor.get( PoemAdaptor.getNonceTuple().toTemplate() );
		PoemNonce nonce = nonceTuple.getElementAt(PoemNonce.class , 0);
		System.out.println( adaptor.get(
			PoemAdaptor.getEvalTuple("(+ 1.0 2.0)", nonce).toTemplate()
		));
	}

	public static void testRunOneTuple() throws InterruptedException {
		PoemAdaptor adaptor = new PoemAdaptor();
		Tuple nonceTuple = adaptor.get( PoemAdaptor.getNonceTuple().toTemplate() );
		PoemNonce nonce = nonceTuple.getElementAt(PoemNonce.class , 0);
		System.out.println( adaptor.get(
			PoemAdaptor.getAssertTuple(new PoemList( new PoemSymbol("foo") , new PoemSymbol("a")), nonce).toTemplate()
		));
		System.out.println( adaptor.get(
				PoemAdaptor.getAssertTuple(new PoemList( new PoemSymbol("foo") , new PoemSymbol("b")), nonce).toTemplate()
			));
		System.out.println( adaptor.get(
				PoemAdaptor.getAssertTuple( new PoemList( new PoemSymbol("foo") , new PoemSymbol("z")), nonce).toTemplate()
			));
		System.out.println( adaptor.get(
				PoemAdaptor.getAssertTuple(  
						new PoemList( 
								new PoemSymbol("implies") , 
								new PoemList(
									new PoemSymbol("foo") ,
									new PoemVariable("x")
								) ,
								new PoemList(
									new PoemSymbol("bar") ,
									new PoemVariable("x")
								) 
							),
							nonce).toTemplate()
			));
		System.out.println( adaptor.get(
			PoemAdaptor.getNewProveTuple(  
				new PoemList(
					new PoemSymbol("bar") ,
					new PoemVariable("y") 				
				), 				
				new PoemList(
						new PoemSymbol("RES") ,
						new PoemVariable("y") 				
				), 				
				nonce
			).toTemplate()
		));
		System.out.println( adaptor.get( PoemAdaptor.getNextAnswerTuple(nonce).toTemplate() ) );
		System.out.println( adaptor.get( PoemAdaptor.getNextAnswerTuple(nonce).toTemplate() ) );
		System.out.println( adaptor.get( PoemAdaptor.getNextAnswerTuple(nonce).toTemplate() ) );

	}

	public static void testRunOne() throws InterruptedException {
		PoemAdaptor adaptor = new PoemAdaptor();
		PoemNonce nonce = adaptor.getNonce();
		adaptor.poemAssert( new PoemList( new PoemSymbol("foo") , new PoemSymbol("a")) , nonce);
		adaptor.poemAssert( new PoemList( new PoemSymbol("foo") , new PoemSymbol("b")) , nonce);
		adaptor.poemAssert( new PoemList( new PoemSymbol("foo") , new PoemSymbol("z")) , nonce);
		adaptor.poemAssert( 
				new PoemList( 
					new PoemSymbol("implies") , 
					new PoemList(
						new PoemSymbol("foo") ,
						new PoemVariable("x")
					) ,
					new PoemList(
						new PoemSymbol("bar") ,
						new PoemVariable("x")
					) 
				),
				nonce
			);
		adaptor.poemNewProve(
			new PoemList(
				new PoemSymbol("bar") ,
				new PoemVariable("y") 				
			), 				
			new PoemList(
					new PoemSymbol("RES") ,
					new PoemVariable("y") 				
				), 				
			nonce
		);
		System.out.println( adaptor.poemClosure(nonce) );
		System.out.println( adaptor.poemClosure(nonce) );
		System.out.println( adaptor.poemClosure(nonce) );

	}
	
	public static void testRunTwo() throws InterruptedException {
		PoemAdaptor adaptor = new PoemAdaptor();
		PoemNonce nonce = adaptor.getNonce();
		adaptor.poemAssert( new PoemList( new PoemSymbol("parent") , new PoemSymbol("a"), new PoemSymbol("b") ) , nonce);
		adaptor.poemAssert( new PoemList( new PoemSymbol("parent") , new PoemSymbol("b"), new PoemSymbol("c") ) , nonce);
		adaptor.poemAssert( new PoemList( new PoemSymbol("level") , new PoemSymbol("z") , new PoemSymbol("0")) , nonce);
		adaptor.poemAssert( 
				new PoemList( 
					new PoemSymbol("implies") , 
					new PoemList(
						new PoemSymbol("and") ,
						new PoemList(
							new PoemSymbol("parent") ,
							new PoemVariable("x") ,
							new PoemVariable("y") 
						) ,
						new PoemList(
							new PoemSymbol("level") ,
							new PoemVariable("x") ,
							new PoemVariable("z")
						) 
					) ,
					new PoemList(
							new PoemSymbol("level") ,
							new PoemVariable("y") ,
							new PoemList(
								new PoemSymbol("+") ,
								new PoemVariable("z") ,
								new PoemSymbol("1") 
							)
						) 
				),
				nonce
			);
		adaptor.poemNewProve(
			new PoemList(
				new PoemSymbol("lebel") ,
				new PoemSymbol("b") ,
				new PoemVariable("l")
			), 				
			new PoemList(
					new PoemSymbol("LEVELIS") ,
					new PoemVariable("l") 				
				), 				
			nonce
		);
		adaptor.poemClosure(nonce);
//		adaptor.poemClosure(nonce);
//		adaptor.poemClosure(nonce);

	}
	
	public class PoemAgent extends Agent {

		public PoemAgent(String name) {
			super(name);
		}

		@Override
		protected void doRun() throws Exception {
			put( new Tuple( 
					"POEM" ,
					"ASSERT" , 
					new PoemList( 
						new PoemSymbol("implies") , 
						new PoemList(
							new PoemSymbol("foo") ,
							new PoemVariable("x")
						) ,
						new PoemList(
							new PoemSymbol("bar") ,
							new PoemVariable("x")
						) 
					)
				), 				
				Self.SELF
			);
			
		}
		
	}
}
