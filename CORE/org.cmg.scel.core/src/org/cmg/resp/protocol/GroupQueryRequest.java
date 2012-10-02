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
package org.cmg.resp.protocol;

import java.io.IOException;
import java.util.Arrays;

import org.cmg.resp.knowledge.Template;
import org.cmg.resp.topology.PointToPoint;

/**
 * This message is sent by a node that performs a query of on a group of
 * nodes satisfying a given predicate on attributes.
 * 
 * @author Michele Loreti
 *
 */
public class GroupQueryRequest extends Message {

	
	private Template template;
	private String[] attributes;

	/**
	 * 
	 * Creates a new object instance.
	 * 
	 * @param source address of the node originating the message
	 * @param session an integer used to relate this message to a conversation
	 * @param template query termplate
	 * @param attributes attribute names
	 */
	public GroupQueryRequest(PointToPoint source, int session,
			Template template, String[] attributes) {
		super(MessageType.GROUP_QUERY_REQUEST, source, session);
		this.template = template;
		this.attributes = attributes;

	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.protocol.Message#accept(org.cmg.scel.protocol.MessageHandler)
	 */
	@Override
	public void accept(MessageHandler messageHandler) throws IOException, InterruptedException {
		messageHandler.handle(this);
	}

	/**
	 * Returns the template used to perform the query.
	 * 
	 * @return the template used to perform the query.
	 */
	public Template getTemplate() {
		return template;
	}

	/**
	 * Returns the attribute names used to evaluate if a node is involved
	 * or not in the communication.
	 * 
	 * @return the attribute names used to evaluate if a node is involved
	 * or not in the communication.
	 */
	public String[] getAttributes() {
		return attributes;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			GroupQueryRequest ggr = (GroupQueryRequest) obj;
			return template.equals(ggr.template)&&Arrays.deepEquals(attributes, ggr.attributes);
		}
		return false;
	}

	@Override
	public String toString() {
		return getType()+"["+super.toString()+","+template.toString()+" , "+Arrays.toString(attributes)+"]";
	}

	@Override
	public int hashCode() {
		return super.hashCode()^template.hashCode()^Arrays.hashCode(attributes);
	}

}
