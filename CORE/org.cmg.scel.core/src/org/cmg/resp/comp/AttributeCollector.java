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

import java.util.Observable;

import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.KnowledgeListener;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;

/**
 * Instances of this class are used to collect attribute values from
 * a node. 
 * 
 * @author Michele Loreti
 *
 */
public abstract class AttributeCollector implements KnowledgeListener {
	
	/**
	 * Name of the collected attribute.
	 */
	private String name;
	
	/**
	 * The templates used to retrieve the knowledge elements that will
	 * be used to compute attribute value.
	 */
	private Template[] templates;
	
	/**
	 * The tuples used to compute the attribute value. This array is
	 * automatically updated when a new tuple is added to the knowledge. 
	 */
	private Tuple[] tuples;

	/**
	 * A reference to the node where the attribute is computed.
	 */
	private INode node;

	/**
	 * Creates a new attribute collector.
	 * 
	 * @param name attribute name
	 * @param template attribute template
	 */
	public AttributeCollector(String name , Template ... templates) {
		this.name = name;
		this.templates = templates;
		this.tuples = new Tuple[templates.length];
	}
	
	/**
	 * Associates collector to node <code>n</code>.
	 * 
	 * @param n node to be associated to the collector. If <code>n</code> is
	 * null, a <code>NullPointerException</code> is thrown.
	 */
	public void setNode( INode n ) {
		if (n == null) {
			throw new NullPointerException();
		}
		this.node = n;
		this.node.addKnowledgeListener(this);
		this.retrieveTuples();
	}
	
	/**
	 * Retrieves the knowledge element used to compute attribute value.
	 * 
	 * @return the knowledge element used to compute attribute value.
	 */
	protected Tuple[] retrieveTuples() {
		tuples = new Tuple[this.templates.length];
		for( int i=0 ; i<this.templates.length ; i++ ) {
			tuples[i] = node.queryp(templates[i]);
		}
		return tuples;
	}
	
	/**
	 * Computes the attribute value.
	 * 
	 * @return the attribute value.
	 */
	public final Attribute eval() {
//		Tuple[] tuples = retrieveTuples();
		return new Attribute( name , doEval(tuples));
	}

	/**
	 * Subclasses has to implement this method to compute the actual attribute
	 * value when the associated knowledge element is <code>t</code>.
	 * 
	 * @param t knowledge element to use to compute the attribute value
	 * @return the attribute value
	 */
	protected abstract Object doEval(Tuple ... t);

	/**
	 * Returns the attribute name.
	 * 
	 * @return the attribute name.
	 */
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * @see org.cmg.resp.knowledge.KnowledgeListener#putOfTuple(org.cmg.resp.knowledge.Tuple)
	 */
	@Override
	public void putOfTuple(Tuple t) {
		for( int i=0 ; i<templates.length ; i++ ) {
			if (templates[i].match(t)) {
				tuples[i] = t;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.cmg.resp.knowledge.KnowledgeListener#getOfTuple(org.cmg.resp.knowledge.Tuple)
	 */
	@Override
	public void getOfTuple(Tuple t) {
		for( int i=0 ; i<templates.length ; i++ ) {
			if (templates[i].match(t)) {
				tuples[i] = node.queryp(templates[i]);
			}
		}
	}
	
	
}
