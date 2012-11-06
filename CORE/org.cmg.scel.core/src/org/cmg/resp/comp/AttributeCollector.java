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
package org.cmg.resp.comp;

import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;

/**
 * Instances of this class are used to collect attribute values from
 * a node. 
 * 
 * @author Michele Loreti
 *
 */
public abstract class AttributeCollector {
	
	/**
	 * Name of the collected attribute.
	 */
	private String name;
	
	/**
	 * The template that identifies the knowledge element that is used
	 * to compute the attribute value.
	 */
	private Template template;

	/**
	 * A reference to the node where the attribute is computed.
	 */
	private INode<?> node;

	/**
	 * Creates a new attribute collector.
	 * 
	 * @param name attribute name
	 * @param template attribute template
	 */
	public AttributeCollector(String name , Template template) {
		this.name = name;
		this.template = template;
	}
	
	/**
	 * Associates collector to node <code>n</code>.
	 * 
	 * @param n node to be associated to the collector. If <code>n</code> is
	 * null, a <code>NullPointerException</code> is thrown.
	 */
	public void setNode( INode<?> n ) {
		if (n == null) {
			throw new NullPointerException();
		}
		this.node = n;
	}
	
	/**
	 * Retrieves the knowledge element used to compute attribute value.
	 * 
	 * @return the knowledge element used to compute attribute value.
	 */
	protected Tuple retrieveTuple() {
		return node.queryp(template);
	}
	
	/**
	 * Computes the attribute value.
	 * 
	 * @return the attribute value.
	 */
	public Attribute eval() {
		Tuple t = retrieveTuple();
		if (t  == null) {
			return new Attribute(name, null);
		}
		return doEval(t);
	}

	/**
	 * Subclasses has to implement this method to compute the actual attribute
	 * value when the associated knowledge element is <code>t</code>.
	 * 
	 * @param t knowledge element to use to compute the attribute value
	 * @return the attribute value
	 */
	protected abstract Attribute doEval(Tuple t);

	/**
	 * Returns the attribute name.
	 * 
	 * @return the attribute name.
	 */
	public String getName() {
		return name;
	}
	
	
}
