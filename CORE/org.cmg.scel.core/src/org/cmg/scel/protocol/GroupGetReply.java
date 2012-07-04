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
public class GroupGetReply extends UnicastMessage {

	private Attribute[] values;
	private int tupleSession;
	private Tuple tuple;

	public GroupGetReply(PointToPoint source, int session,
			String target, int tupleSession, Attribute[] values, Tuple tuple) {
		super(MessageType.GROUP_GET_REPLY, source, session, target);
		this.tupleSession = tupleSession;
		this.values = values;
		this.tuple = tuple;

	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.protocol.Message#accept(org.cmg.scel.protocol.MessageHandler)
	 */
	@Override
	public void accept(MessageHandler messageHandler) throws IOException, InterruptedException {
		messageHandler.handle(this);
	}

	public int getTupleSession() {
		return tupleSession;
	}

	public Attribute[] getAttributes() {
		return values;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			GroupGetReply ggr = (GroupGetReply) obj;
			return (tupleSession == ggr.tupleSession)&&Arrays.deepEquals(values, ggr.values)&&tuple.equals(ggr.tuple);
		}
		return false;
	}

	@Override
	public String toString() {
		return getType()+"["+super.toString()+","+tupleSession+" , "+Arrays.toString(values)+" , "+tuple.toString()+"]";
	}

	@Override
	public int hashCode() {
		return super.hashCode()^tupleSession^Arrays.hashCode(values)^tuple.hashCode();
	}

	public Attribute[] getValues() {
		return values;
	}

	public Tuple getTuple() {
		return tuple;
	}

	
}
