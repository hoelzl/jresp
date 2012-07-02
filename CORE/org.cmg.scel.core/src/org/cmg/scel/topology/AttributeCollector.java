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

import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;

/**
 * @author Michele Loreti
 *
 */
public abstract class AttributeCollector {
	
	private String name;
	
	private Template template;

	private Node<?> node;

	public AttributeCollector(String name , Template template) {
		this.name = name;
		this.template = template;
	}
	
	public void setNode( Node<?> node ) {
		this.node = node;
	}
	
	protected Tuple retrieveTuple() {
		return node.queryp(template);
	}
	
	public Attribute eval() {
		Tuple t = retrieveTuple();
		if (t  == null) {
			return new Attribute(name, null);
		}
		return doEval(t);
	}

	protected abstract Attribute doEval(Tuple t);

	public String getName() {
		return name;
	}
	
	
}
