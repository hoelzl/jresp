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

import java.lang.reflect.Type;

import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.topology.Locality;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
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
		default:
		}
		return null;
	}

	private Message doDeserializeAck(JsonObject json,
			JsonDeserializationContext context) {
		return new Ack((Locality) context.deserialize(json.get("source"), Locality.class),json.get("session").getAsInt(),json.get("target").getAsString());
	}
	
	private Message doDeserializeFail(JsonObject json,
			JsonDeserializationContext context) {
		return new Fail((Locality) context.deserialize(json.get("source"), Locality.class),json.get("session").getAsInt(),json.get("target").getAsString());
	}
	
	private Message doDeserializeAttributeRequests(JsonObject json,
			JsonDeserializationContext context) {
		return new AttributeRequest((Locality) context.deserialize(json.get("source"), Locality.class),json.get("session").getAsInt(),json.get("target").getAsString(),
				(String[]) context.deserialize( json.get("attributes") , String[].class));
	}

	private Message doDeserializeAttributeReply(JsonObject json,
			JsonDeserializationContext context) {
		return new AttributeReply((Locality) context.deserialize(json.get("source"), Locality.class),json.get("session").getAsInt(),json.get("target").getAsString(),
				(Attribute[]) context.deserialize( json.get("attributes") , Attribute[].class));
	}
	
	private Message doDeserializePutRequest(JsonObject json,
			JsonDeserializationContext context) {
		return new PutRequest(
				(Locality) context.deserialize(json.get("source"), Locality.class),
				json.get("session").getAsInt(),json.get("target").getAsString(),
				(Tuple) context.deserialize( json.get("tuple") , Tuple.class));
	}

	private Message doDeserializeGetRequest(JsonObject json,
			JsonDeserializationContext context) {
		return new GetRequest(
				(Locality) context.deserialize(json.get("source"), Locality.class),
				json.get("session").getAsInt(),json.get("target").getAsString(),
				(Template) context.deserialize( json.get("template") , Template.class));
	}

	private Message doDeserializeQueryRequest(JsonObject json,
			JsonDeserializationContext context) {
		return new QueryRequest(
				(Locality) context.deserialize(json.get("source"), Locality.class),
				json.get("session").getAsInt(),json.get("target").getAsString(),
				(Template) context.deserialize( json.get("template") , Template.class));
	}

	private Message doDeserializeTupleReply(JsonObject json,
			JsonDeserializationContext context) {
		return new TupleReply(
				(Locality) context.deserialize(json.get("source"), Locality.class),
				json.get("session").getAsInt(),json.get("target").getAsString(),
				(Tuple) context.deserialize( json.get("tuple") , Tuple.class));
	}

}
