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
package org.cmg.resp.knowledge.adaptors;

import org.armedbear.lisp.Cons;
import org.armedbear.lisp.Fixnum;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Nil;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.SimpleString;
import org.armedbear.lisp.SingleFloat;
import org.armedbear.lisp.StructureObject;
import org.armedbear.lisp.Symbol;

/**
 * @author Michele Loreti
 *
 */
public class PoemValueFactory {

	public static PoemValue getValue( LispObject o ) {
		if (o instanceof Nil) {
			return new PoemSymbol("NIL");
		}
		if (o instanceof Fixnum) {
			return new PoemInteger(((Fixnum) o).value);
		}
		if (o instanceof SingleFloat) {
			return new PoemFloat(((SingleFloat) o).value);
		}
		if (o instanceof Symbol) {
			return new PoemSymbol(((Symbol) o).getName());
		}
		if (o instanceof Package) {
			return new PoemSymbol(((Package) o).getName());
		}
		if (o instanceof Cons) {
			return new PoemList( getValues( ((Cons) o).copyToArray()) );
		}
		if (o instanceof SimpleString) {
			return new PoemString( ((SimpleString) o).getStringValue() );
		}
		if (o instanceof StructureObject) {
			return getValueFromStructure((StructureObject) o);
		}
		throw new IllegalArgumentException("Unknown LispObject: "+o);
	}

	private static PoemValue getValueFromStructure(StructureObject o) {
		return getValue( o.getSlotValue_0() );
	}

	public static PoemValue[] getValues(LispObject[] array) {
		PoemValue[] toReturn = new PoemValue[array.length];
		for( int i=0 ; i<toReturn.length ; i++ ) {
			toReturn[i] = getValue(array[i]);
		}
		return toReturn;
	}
	
}
