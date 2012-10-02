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

import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.topology.PointToPoint;

/**
 * This is message identifies the replay to a {@link GroupPutRequest}.
 * 
 * @author Michele Loreti
 *
 */
public class GroupPutReply extends UnicastMessage {
	
	private int tupleSession;
	private Attribute[] values;
	
	/**
	 * Creates a new object instance.
	 * 
	 * @param source address of the node originating the message
	 * @param session an integer used to relate this message to a conversation
	 * @param target name of target node
	 * @param tupleSession an integer value that will be used to confirm the execution
	 * of put.
	 * @param values values of attributes contained in the associated {@link GroupPutRequest}
	 */
	public GroupPutReply(PointToPoint source, int session, String target, int tupleSession , Attribute[] values) {
		super(MessageType.GROUP_PUT_REPLY,source,session,target);
		this.values = values;
		this.tupleSession = tupleSession;
	}

	/**
	 * Returns the values of attributes
	 * 
	 * @return values of attributes.
	 */
	public Attribute[] getValues() {
		return values;
	}

	@Override
	public void accept(MessageHandler messageHandler) throws IOException, InterruptedException {
		messageHandler.handle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return (tupleSession == ((GroupPutReply) obj).tupleSession)&&Arrays.deepEquals(values, ((GroupPutReply) obj).values); 
		}
		return false;
	}

	@Override
	public String toString() {
		return getType()+"[ "+ super.toString() + " , "+ tupleSession + " , "+ Arrays.toString(values) +"]";
	}

	@Override
	public int hashCode() {
		return super.hashCode()^Arrays.hashCode(values)^tupleSession;
	}

	public int getTupleSession() {
		return tupleSession;
	}

			
}