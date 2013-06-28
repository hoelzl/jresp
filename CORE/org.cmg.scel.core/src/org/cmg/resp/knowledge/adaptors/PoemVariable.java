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
public class PoemVariable implements PoemCommandArgument {

	private String symbol;
	
	public PoemVariable(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String getString() {
		return "?"+symbol;
	}

	@Override
	public int size() {
		return 1;
	}

}
