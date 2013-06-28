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

import java.util.LinkedList;

import org.cmg.resp.knowledge.adaptors.PoemAdaptor;
import org.cmg.resp.knowledge.adaptors.PoemList;
import org.cmg.resp.knowledge.adaptors.PoemAdaptor.PoemNonce;
import org.cmg.resp.knowledge.adaptors.PoemSymbol;
import org.cmg.resp.knowledge.adaptors.PoemVariable;

/**
 * @author Michele Loreti
 *
 */
public class TestPoem {
	
	public static void main(String[] argv) throws InterruptedException {
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
		adaptor.poemClosure(nonce);
		adaptor.poemClosure(nonce);
		adaptor.poemClosure(nonce);
	}

}
