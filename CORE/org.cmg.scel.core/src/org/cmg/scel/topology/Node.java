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
package org.cmg.scel.topology;

import java.util.LinkedList;

import org.cmg.scel.knowledge.Knowledge;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;

/**
 * @author loreti
 * 
 *
 */
public class Node implements AgentContext {

	
	protected Knowledge knowledge;
	
	protected Policy	policy;

	public void put(Agent a, Tuple t, Target l) throws InterruptedException {
		policy.put(a, t, l);
	}

	public Tuple get(Agent a, Template t, Target l) {
		return policy.get(a, t, l);
	}

	public Tuple getp(Agent a, Template t, Target l) {
		return policy.getp(a, t, l);
	}

	public LinkedList<Tuple> getAll(Agent a, Template t, Target l) {
		return policy.getAll(a, t, l);
	}

	public Tuple query(Agent a, Template t, Target l) {
		return policy.query(a, t, l);
	}

	public Tuple queryp(Agent a, Template t, Target l) {
		return policy.queryp(a, t, l);
	}

	public LinkedList<Tuple> queryAll(Agent a, Template t, Target l) {
		return policy.queryAll(a, t, l);
	}

}
