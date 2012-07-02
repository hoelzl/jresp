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
 * @author Michele Loreti
 *
 */
public class GroupGetRequest extends Message {

	
	private Template template;
	private String[] attributes;

	public GroupGetRequest(PointToPoint source, int session,
			String target, Template template, String[] attributes) {
		super(MessageType.GROUP_GET_REQUEST, source, session, target);
		this.template = template;
		this.attributes = attributes;

	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.protocol.Message#accept(org.cmg.scel.protocol.MessageHandler)
	 */
	@Override
	public void accept(MessageHandler messageHandler) throws IOException {
		messageHandler.handle(this);
	}

	public Template getTemplate() {
		return template;
	}

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
