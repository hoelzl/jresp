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

import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.topology.PointToPoint;

/**
 * @author Michele Loreti
 *
 */
public class GroupGetReply extends Message {

	
	private Tuple tuple;
	private Attribute[] values;

	public GroupGetReply(PointToPoint source, int session,
			String target, Tuple tuple, Attribute[] values) {
		super(MessageType.GROUP_GET_REPLY, source, session, target);
		this.tuple = tuple;
		this.values = values;

	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.protocol.Message#accept(org.cmg.scel.protocol.MessageHandler)
	 */
	@Override
	public void accept(MessageHandler messageHandler) throws IOException {
		messageHandler.handle(this);
	}

	public Tuple getTuple() {
		return tuple;
	}

	public Attribute[] getAttributes() {
		return values;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			GroupGetReply ggr = (GroupGetReply) obj;
			return tuple.equals(ggr.tuple)&&Arrays.deepEquals(values, ggr.values);
		}
		return false;
	}

	@Override
	public String toString() {
		return getType()+"["+super.toString()+","+tuple.toString()+" , "+Arrays.toString(values)+"]";
	}

	@Override
	public int hashCode() {
		return super.hashCode()^tuple.hashCode()^Arrays.hashCode(values);
	}

	
}
