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

import org.cmg.scel.knowledge.SCELValue.SCELType;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * @author Michele Loreti
 *
 */
public class TemplateDeserializer implements JsonDeserializer<TemplateField> {

	@Override
	public TemplateField deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		if (json.isJsonObject()) {
			JsonObject o = json.getAsJsonObject();			
			if (o.has("value")) {
				return new ActualTemplateField((SCELValue) context.deserialize(o.get("value"), SCELValue.class));
			}
			if (o.has("type")) {
				return new FormalTemplateField((SCELType) context.deserialize(o.get("type"), SCELType.class));
			}
			if (o.has("name")&&o.has("template")) {
				return 
					new TagTemplateField(
						o.get("name").getAsString(),
						(Template) context.deserialize(o.get("template"), Template.class)
					);
			}
		}
		throw new IllegalStateException("This is not a Template!");
	}


}
