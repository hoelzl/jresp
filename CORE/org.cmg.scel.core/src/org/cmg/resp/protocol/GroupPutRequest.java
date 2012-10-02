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

import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.PointToPoint;

/**
 * This message is sent when a node performs a put on a group of 
 * nodes. 
 * 
 * @author Michele Loreti
 *
 */
public class GroupPutRequest extends Message {

	/**
	 * Tuple argument of put action
	 */
	private Tuple tuple;
	
	/**
	 * Names of attributes used to select target nodes
	 */
	private String[] attributes;

	/**
	 * Creates a new object instance.
	 * 
	 * @param source address of the node originating the message
	 * @param session an integer used to relate this message to a conversation
	 * @param attributes names of attributes used to select target nodes
	 * @param tuple tuple to put
	 */
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

	/**
	 * Returns the names of attributes used to select target nodes.
	 * 
	 * @return the names of attributes used to select target nodes.
	 */
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

	/**
	 * Return the tuple argument of put action
	 * 
	 * @return 	the tuple argument of put action
	 */
	public Tuple getTuple() {
		return tuple;
	}

	
}
