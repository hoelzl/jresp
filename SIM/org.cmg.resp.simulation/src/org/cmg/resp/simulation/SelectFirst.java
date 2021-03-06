/**
 * Copyright (c) 2013 Concurrency and Mobility Group.
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
package org.cmg.resp.simulation;

import java.util.ArrayList;

/**
 * @author loreti
 *
 */
public class SelectFirst implements ElementSelector {

	@Override
	public <T> T select(ArrayList<T> elements) {
		if (elements.size()<=0) {
			return null;
		}
		return elements.get(0);
	}

}
