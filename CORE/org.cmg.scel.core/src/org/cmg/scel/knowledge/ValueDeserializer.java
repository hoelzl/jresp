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
package org.cmg.scel.knowledge;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * @author Michele Loreti
 *
 */
public class ValueDeserializer implements JsonDeserializer<SCELValue> {

	@Override
	public SCELValue deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		if (json.isJsonObject()) {
			JsonObject o = json.getAsJsonObject();			
			return doDeserialize((SCELValue.SCELType) context.deserialize(o.get("type"),SCELValue.SCELType.class),o,context);
		}
		throw new IllegalStateException("This is not a Value!");
	}

	private SCELValue doDeserialize(SCELValue.SCELType type,JsonObject json,JsonDeserializationContext context) {
		switch (type) {
		case BOOLEAN:
			return new SCELValue.SCELBoolean(json.get("value").getAsBoolean());
		case BYTE:
			return new SCELValue.SCELByte(json.get("value").getAsByte());
		case CHAR:
			return new SCELValue.SCELChar(json.get("value").getAsCharacter());
		case DOUBLE:
			return new SCELValue.SCELDouble(json.get("value").getAsDouble());
		case FLOAT:
			return new SCELValue.SCELFloat(json.get("value").getAsFloat());
		case INT:
			return new SCELValue.SCELInteger(json.get("value").getAsInt());
		case LONG:
			return new SCELValue.SCELLong(json.get("value").getAsLong());
		case SHORT:
			return new SCELValue.SCELShort(json.get("value").getAsShort());
		case STRING:
			return new SCELValue.SCELString(json.get("value").getAsString());
		case TAG:
			return doDeserializeTag(json,context);
		}
		return null;
	}

	private SCELValue doDeserializeTag(JsonObject json,JsonDeserializationContext context) {
		String tagName = json.get("tagName").getAsString();
		Tuple elements = (Tuple) context.deserialize(json.get("elements"), Tuple.class);
		return new SCELValue.SCELTag(tagName, elements);
	}
}
