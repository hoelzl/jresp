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
import org.cmg.scel.topology.Locality;

/**
 * @author Michele Loreti
 *
 */
public class GroupPutRequest extends Message {

	
	private String[] attributes;

	public GroupPutRequest(Locality source, int session,
			String target, String[] attributes) {
		super(MessageType.GROUP_PUT_REQUEST, source, session, target);
		this.attributes = attributes;

	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.protocol.Message#accept(org.cmg.scel.protocol.MessageHandler)
	 */
	@Override
	public void accept(MessageHandler messageHandler) throws IOException {
		messageHandler.handle(this);
	}

	public String[] getAttributes() {
		return attributes;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			GroupPutRequest ggr = (GroupPutRequest) obj;
			return Arrays.deepEquals(attributes, ggr.attributes);
		}
		return false;
	}

	@Override
	public String toString() {
		return getType()+"["+super.toString()+" , "+Arrays.toString(attributes)+"]";
	}

	@Override
	public int hashCode() {
		return super.hashCode()^Arrays.hashCode(attributes);
	}

	
}
