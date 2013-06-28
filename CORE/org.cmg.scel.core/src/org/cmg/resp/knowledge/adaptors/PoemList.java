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

/**
 * @author Michele Loreti
 *
 */
public class PoemList implements PoemCommandArgument {

	private PoemCommandArgument[] args;
	
	public PoemList( PoemCommandArgument ... args ) {
		this.args = args;
	}
	
	@Override
	public String getString() {
		String toReturn = "(";
		for (PoemCommandArgument arg : args) {
			toReturn += arg.getString()+" ";
		}
		toReturn += ")";
		return toReturn;
	}

	@Override
	public int size() {
		int toReturn = 0;
		for (PoemCommandArgument arg : args) {
			toReturn += arg.size();
		}
		return toReturn;
	}

}
