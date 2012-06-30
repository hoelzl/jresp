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

import java.util.Arrays;

import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.topology.Locality;

/**
 * @author Michele Loreti
 *
 */
public class Protocol {
	
	public enum MessageType {
		ATTRIBUTE_REQUEST(0,"A_REQUEST"),
		ATTRIBUTE_REPLY(1,"A_REQUEST"),
		PUT_REQUEST(2,"P_REQUEST"),
		GET_REQUEST(3,"G_REQUEST"),
		QUERY_REQUEST(4,"Q_REQUEST"),
		TUPLE_REPLY(5,"T_REPLY"),
		ACK(6,"ACK"),
		FAIL(7,"FAIL");
		
		private int code;
		private String string;
		
		MessageType( int code , String string ) {
			this.code = code;
			this.string = string;
		}

		@Override
		public String toString() {
			return string;
		}		
		
		public int code() {
			return code;
		}
	}

	public static class Message {
		
		private Locality source;
		private int 	 session;
		private MessageType type;
		
		public Message( MessageType type , Locality source , int session ) {
			this.source = source;
			this.session = session;
			this.type = type;
		}

		public Locality getSource() {
			return source;
		}

		public int getSession() {
			return session;
		}

		public MessageType getType() {
			return type;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Message) {
				Message msg = (Message) obj;
				return (type==msg.type)&&(source.equals(msg.source))&&(session==msg.session);
			}
			return false;
		}

		@Override
		public int hashCode() {
			return type.toString().hashCode()^source.hashCode()^session;
		}

		@Override
		public String toString() {
			return source+":"+session;
		}
	}
	
	
	public static class AttributeRequest extends Message {
		
		private String[] attributes;
		
		public AttributeRequest(Locality source, int session,
				String[] attributes) {
			super(MessageType.ATTRIBUTE_REQUEST,source,session);
			this.attributes = attributes;
		}

		public String[] getAttributes() {
			return attributes;
		}

		@Override
		public boolean equals(Object obj) {
			if (super.equals(obj)) {
				return Arrays.deepEquals(attributes, ((AttributeRequest) obj).attributes);
			}
			return false;
		}

		@Override
		public int hashCode() {
			return super.hashCode()^Arrays.hashCode(attributes);
		}

		@Override
		public String toString() {
			return getType()+"["+super.toString()+","+Arrays.toString(attributes)+"]";
		}
		
		
		
	}
	
	public static class AttributeReply extends Message {
		
		private Attribute[] values;
		
		public AttributeReply(Locality source, int session, Attribute[] values) {
			super(MessageType.ATTRIBUTE_REPLY,source,session);
			this.values = values;
		}

		public Attribute[] getValues() {
			return values;
		}
				
	}
	
	public static class PutRequest extends Message {
		
		private Tuple tuple;
		
		public PutRequest(Locality source, int session, Tuple tuple) {
			super(MessageType.PUT_REQUEST,source,session);
			this.tuple = tuple;
		}

		public Tuple getTuple() {
			return tuple;
		}
		
	}
	
	public static class GetRequest extends Message {

		private Template template;
		
		public GetRequest(Locality source, int session, Template template) {
			super(MessageType.GET_REQUEST,source,session);
			this.template = template;
		}

		public Template getTemplate() {
			return template;
		}
		
	}

	public static class QueryRequest extends Message {

		private Template template;
		
		public QueryRequest(Locality source, int session, Template template) {
			super(MessageType.QUERY_REQUEST,source,session);
			this.template = template;
		}
	
		public Template getTemplate() {
			return template;
		}
		
	}
	
	public static class TupleReply extends Message {
		private Tuple tuple;
		
		public TupleReply(Locality source, int session, Tuple tuple) {
			super(MessageType.TUPLE_REPLY,source,session);
			this.tuple = tuple;
		}

		public Tuple getTuple() {
			return tuple;
		}
		
	}
	
	public static class Ack extends Message {

		public Ack(Locality source, int session) {
			super(MessageType.ACK,source,session);
		}

		@Override
		public boolean equals(Object obj) {
			return super.equals(obj);
		}

		@Override
		public String toString() {
			return getType()+"[ "+super.toString()+" ]";
		}
		
	}

	public static class Fail extends Message {

		public Fail(Locality source, int session) {
			super(MessageType.FAIL,source,session);
		}

		@Override
		public boolean equals(Object obj) {
			return super.equals(obj);
		}

		@Override
		public String toString() {
			return getType()+"[ "+super.toString()+" ]";
		}

	}
}

