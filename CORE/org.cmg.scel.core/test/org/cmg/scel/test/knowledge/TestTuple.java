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
package org.cmg.scel.test.knowledge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.cmg.scel.exceptions.IllegalTypeException;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.knowledge.SCELValue;
import org.junit.Test;

/**
 * @author loreti
 * 
 *
 */
public class TestTuple {

	/**
	 * Test method for {@link org.cmg.scel.knowledge.Tuple#Tuple(java.lang.Object[])}.
	 */
	@Test
	public void testTuple() {
		Tuple t = new Tuple( new SCELValue.SCELInteger(2) , new SCELValue.SCELInteger(3) , new SCELValue.SCELInteger(2) , new SCELValue.SCELInteger(3) );
		assertNotNull(t);
	}

	/**
	 * Test method for {@link org.cmg.scel.knowledge.Tuple#length()}.
	 */
	@Test
	public void testLength() {
		Tuple t = new Tuple( new SCELValue.SCELInteger(2) , new SCELValue.SCELInteger(3) , new SCELValue.SCELInteger(2) , new SCELValue.SCELInteger(3) );
		assertEquals(4,t.length());
	}

	/**
	 * Test method for {@link org.cmg.scel.knowledge.Tuple#getElementAt(int)}.
	 */
	@Test
	public void testGetElementAtInt() {
		Tuple t = new Tuple( new SCELValue.SCELInteger(1) , new SCELValue.SCELInteger(2) , new SCELValue.SCELInteger(3) , new SCELValue.SCELInteger(4) );
		for( int i=0 ; i<t.length() ; i++ ) {
			assertEquals(new SCELValue.SCELInteger(i+1),t.getElementAt(i));
		}
	}

	/**
	 * Test method for {@link org.cmg.scel.knowledge.Tuple#getElementAt(java.lang.Class, int)}.
	 */
	@Test
	public void testGetElementAtClassOfTInt() {
		Tuple t = new Tuple( new SCELValue.SCELInteger(1) , new SCELValue.SCELInteger(2) , new SCELValue.SCELInteger(3) , new SCELValue.SCELInteger(4) );
		assertEquals(new SCELValue.SCELInteger(3),t.getElementAt(2));
	}

	/**
	 * Test method for {@link org.cmg.scel.knowledge.Tuple#getTypeAt(int)}.
	 */
	@Test
	public void testGetTypeAt() {
		Tuple t = new Tuple( new SCELValue.SCELInteger(1) , new SCELValue.SCELInteger(2) , new SCELValue.SCELInteger(3) , new SCELValue.SCELInteger(4) );
		assertEquals(SCELValue.SCELType.INT, t.getTypeAt(2));
	}

}
