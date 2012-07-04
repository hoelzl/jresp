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
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.topology.PointToPoint;

/**
 * @author Michele Loreti
 *
 */
public class GroupPutRequest extends Message {

	private Tuple tuple;
	private String[] attributes;

	public GroupPutRequest(PointToPoint source, int session, String[] attributes, Tuple tuple) {
		super(MessageType.GROUP_PUT_REQUEST, source, session);
		this.attributes = attributes;
		this.tuple = tuple;

	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.protocol.Message#accept(org.cmg.scel.protocol.MessageHandler)
	 */
	@Override
	public void accept(MessageHandler messageHandler) throws IOException, InterruptedException {
		messageHandler.handle(this);
	}

	public String[] getAttributes() {
		return attributes;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			GroupPutRequest ggr = (GroupPutRequest) obj;
			return Arrays.deepEquals(attributes, ggr.attributes)&&tuple.equals(ggr.tuple);
		}
		return false;
	}

	@Override
	public String toString() {
		return getType()+"["+super.toString()+" , "+Arrays.toString(attributes)+" , "+tuple.toString()+" ]";
	}

	@Override
	public int hashCode() {
		return super.hashCode()^Arrays.hashCode(attributes)^tuple.hashCode();
	}

	public Tuple getTuple() {
		return tuple;
	}

	
}
