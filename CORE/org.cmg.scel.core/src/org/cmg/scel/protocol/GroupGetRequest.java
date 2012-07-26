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
package org.cmg.scel.protocol;

import java.io.IOException;
import java.util.Arrays;

import org.cmg.scel.knowledge.Template;
import org.cmg.scel.topology.PointToPoint;

/**
 * Identify a message sent to retrieve a tuple from a gruop of nodes.
 * 
 * @author Michele Loreti
 *
 */
public class GroupGetRequest extends Message {

	/**
	 * Get template.
	 * 
	 */
	private Template template;
	
	/**
	 * Attributes used to select target nodes.
	 */
	private String[] attributes;

	/**
	 * Crate a new instance.
	 * 
	 * @param source address of the node originating the message
	 * @param session an integer used to relate this message to a conversation
	 * @param template get template
	 * @param attributes attribute values
	 */
	public GroupGetRequest(PointToPoint source, int session, Template template, String[] attributes) {
		super(MessageType.GROUP_GET_REQUEST, source, session);
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
	 * Returns template of get action
	 * 
	 * @return template of get action
	 */
	public Template getTemplate() {
		return template;
	}

	/**
	 * Returns attributes used to identify target nodes.
	 * 
	 * @return attributes used to identify target nodes.
	 */
	public String[] getAttributes() {
		return attributes;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			GroupGetRequest ggr = (GroupGetRequest) obj;
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
