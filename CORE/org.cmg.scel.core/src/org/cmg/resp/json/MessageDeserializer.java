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
package org.cmg.resp.json;

import java.lang.reflect.Type;

import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.protocol.Ack;
import org.cmg.resp.protocol.AttributeReply;
import org.cmg.resp.protocol.AttributeRequest;
import org.cmg.resp.protocol.Fail;
import org.cmg.resp.protocol.GetRequest;
import org.cmg.resp.protocol.GroupGetReply;
import org.cmg.resp.protocol.GroupGetRequest;
import org.cmg.resp.protocol.GroupPutReply;
import org.cmg.resp.protocol.GroupPutRequest;
import org.cmg.resp.protocol.GroupQueryReply;
import org.cmg.resp.protocol.GroupQueryRequest;
import org.cmg.resp.protocol.Message;
import org.cmg.resp.protocol.MessageType;
import org.cmg.resp.protocol.PutRequest;
import org.cmg.resp.protocol.QueryRequest;
import org.cmg.resp.protocol.TupleReply;
import org.cmg.resp.topology.PointToPoint;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * This class is used to deserialize messages from {@link JsonElement}.
 * 
 * @author Michele Loreti
 *
 */
public class MessageDeserializer implements JsonDeserializer<Message> {

	@Override
	public Message deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		if (json.isJsonObject()) {
			JsonObject o = json.getAsJsonObject();			
			return doDeserialize((MessageType) context.deserialize(o.get("type"),MessageType.class),o,context);
		}
		throw new IllegalStateException("This is not a Message!");
	}

	private Message doDeserialize(MessageType deserialize,JsonObject json,JsonDeserializationContext context) {
		switch (deserialize) {
		case ACK:
			return doDeserializeAck(json,context);
		case ATTRIBUTE_REPLY:
			return doDeserializeAttributeReply(json,context);
		case ATTRIBUTE_REQUEST:			
			return doDeserializeAttributeRequests(json,context);
		case FAIL:
			return doDeserializeFail(json,context);
		case GET_REQUEST:
			return doDeserializeGetRequest(json,context);
		case PUT_REQUEST:
			return doDeserializePutRequest(json,context);
		case QUERY_REQUEST:
			return doDeserializeQueryRequest(json,context);
		case TUPLE_REPLY:
			return doDeserializeTupleReply(json,context);
		case GROUP_GET_REPLY: 
			return doDeserializeGroupGetReply(json,context);
		case GROUP_GET_REQUEST:
			return doDeserializeGroupGetRequest(json,context);
		case GROUP_PUT_REPLY: 
			return doDeserializeGroupPutReply(json,context);
		case GROUP_PUT_REQUEST: 
			return doDeserializeGroupPutRequest(json,context);
		case GROUP_QUERY_REPLY:
			return doDeserializeGroupQueryReply(json,context);
		case GROUP_QUERY_REQUEST:
			return doDeserializeGroupQueryRequest(json,context);
		}
		return null;
	}

	private Message doDeserializeGroupGetRequest(JsonObject json,
			JsonDeserializationContext context) {
		return new GroupGetRequest( 
				(PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),
				json.get("session").getAsInt(),
				(Template) context.deserialize( json.get("template") , Template.class),				
				(String[]) context.deserialize( json.get("attributes") , String[].class)
			);
	}

	private Message doDeserializeGroupQueryRequest(JsonObject json,
			JsonDeserializationContext context) {
		return new GroupQueryRequest( 
				(PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),
				json.get("session").getAsInt(),
				(Template) context.deserialize( json.get("template") , Template.class),				
				(String[]) context.deserialize( json.get("attributes") , String[].class)
			);
	}

	private Message doDeserializeGroupPutRequest(JsonObject json,
			JsonDeserializationContext context) {
		return new GroupPutRequest( 
				(PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),
				json.get("session").getAsInt(),
				(String[]) context.deserialize( json.get("attributes") , String[].class),
				(Tuple) context.deserialize( json.get("tuple") , Tuple.class)
			);
	}

	private Message doDeserializeGroupGetReply(JsonObject json,
			JsonDeserializationContext context) {
		return new GroupGetReply( 
				(PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),
				json.get("session").getAsInt(),
				json.get("target").getAsString(),
				json.get("tupleSession").getAsInt(),
				(Attribute[]) context.deserialize( json.get("values") , Attribute[].class),
				(Tuple) context.deserialize( json.get("tuple") , Tuple.class)
			);
	}

	private Message doDeserializeGroupQueryReply(JsonObject json,
			JsonDeserializationContext context) {
		return new GroupQueryReply( 
				(PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),
				json.get("session").getAsInt(),
				json.get("target").getAsString(),
				(Attribute[]) context.deserialize( json.get("values") , Attribute[].class),
				(Tuple) context.deserialize( json.get("tuple") , Tuple.class)
			);
	}

	private Message doDeserializeAck(JsonObject json,
			JsonDeserializationContext context) {
		return new Ack((PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),json.get("session").getAsInt(),json.get("target").getAsString());
	}
	
	private Message doDeserializeFail(JsonObject json,
			JsonDeserializationContext context) {
		return new Fail((PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),json.get("session").getAsInt(),json.get("target").getAsString(),json.get("message").getAsString());
	}
	
	private Message doDeserializeAttributeRequests(JsonObject json,
			JsonDeserializationContext context) {
		return new AttributeRequest((PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),json.get("session").getAsInt(),json.get("target").getAsString(),
				(String[]) context.deserialize( json.get("attributes") , String[].class));
	}

	private Message doDeserializeAttributeReply(JsonObject json,
			JsonDeserializationContext context) {
		return new AttributeReply((PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),json.get("session").getAsInt(),json.get("target").getAsString(),
				(Attribute[]) context.deserialize( json.get("values") , Attribute[].class));
	}

	private Message doDeserializeGroupPutReply(JsonObject json,
			JsonDeserializationContext context) {
		return new GroupPutReply(
				(PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),
				json.get("session").getAsInt(),
				json.get("target").getAsString(),
				json.get("tupleSession").getAsInt(),
				(Attribute[]) context.deserialize( json.get("values") , Attribute[].class));
	}

	private Message doDeserializePutRequest(JsonObject json,
			JsonDeserializationContext context) {
		return new PutRequest(
				(PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),
				json.get("session").getAsInt(),json.get("target").getAsString(),
				(Tuple) context.deserialize( json.get("tuple") , Tuple.class));
	}

	private Message doDeserializeGetRequest(JsonObject json,
			JsonDeserializationContext context) {
		return new GetRequest(
				(PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),
				json.get("session").getAsInt(),json.get("target").getAsString(),
				(Template) context.deserialize( json.get("template") , Template.class));
	}

	private Message doDeserializeQueryRequest(JsonObject json,
			JsonDeserializationContext context) {
		return new QueryRequest(
				(PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),
				json.get("session").getAsInt(),json.get("target").getAsString(),
				(Template) context.deserialize( json.get("template") , Template.class));
	}

	private Message doDeserializeTupleReply(JsonObject json,
			JsonDeserializationContext context) {
		return new TupleReply(
				(PointToPoint) context.deserialize(json.get("source"), PointToPoint.class),
				json.get("session").getAsInt(),json.get("target").getAsString(),
				(Tuple) context.deserialize( json.get("tuple") , Tuple.class));
	}

}
