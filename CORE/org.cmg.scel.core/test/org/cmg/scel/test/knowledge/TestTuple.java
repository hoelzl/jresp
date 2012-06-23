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

import static org.junit.Assert.*;

import org.cmg.scel.exceptions.IllegalTypeException;
import org.cmg.scel.knowledge.Tuple;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

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
		Tuple t = new Tuple( 2 , 3 , 2 , 3 );
		assertNotNull(t);
	}

	/**
	 * Test method for {@link org.cmg.scel.knowledge.Tuple#length()}.
	 */
	@Test
	public void testLength() {
		Tuple t = new Tuple( 2 , 3 , 2 , 3 );
		assertEquals(4,t.length());
	}

	/**
	 * Test method for {@link org.cmg.scel.knowledge.Tuple#getElementAt(int)}.
	 */
	@Test
	public void testGetElementAtInt() {
		Tuple t = new Tuple( 0 , 1 , 2 , 3 );
		for( int i=0 ; i<t.length() ; i++ ) {
			assertEquals(i,t.getElementAt(i));
		}
	}

	/**
	 * Test method for {@link org.cmg.scel.knowledge.Tuple#getElementAt(java.lang.Class, int)}.
	 */
	@Test
	public void testGetElementAtClassOfTInt() {
		Tuple t = new Tuple( 0 , 1 , 2 , 3 );
		assertEquals(new Integer(2),t.getElementAt(Integer.class, 2));
	}

	/**
	 * Test method for {@link org.cmg.scel.knowledge.Tuple#getElementAt(java.lang.Class, int)}.
	 */
	@Test(expected=IllegalTypeException.class)
	public void testGetElementAtClassOfTIntFailure() {
		Tuple t = new Tuple( 0 , 1 , 2 , 3 );
		t.getElementAt(String.class, 2);
	}

	/**
	 * Test method for {@link org.cmg.scel.knowledge.Tuple#getTypeAt(int)}.
	 */
	@Test
	public void testGetTypeAt() {
		Tuple t = new Tuple( 0 , 1 , 2 , 3 );
		assertEquals(Integer.class, t.getTypeAt(2));
	}

}
