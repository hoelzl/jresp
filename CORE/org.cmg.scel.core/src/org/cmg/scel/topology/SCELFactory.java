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
package org.cmg.scel.topology;

import org.cmg.scel.connections.Address;
import org.cmg.scel.json.ActualTemplateFieldDeserializer;
import org.cmg.scel.json.ActualTemplateFieldSerializer;
import org.cmg.scel.json.AddressDeserializer;
import org.cmg.scel.json.AttributeDeserializer;
import org.cmg.scel.json.AttributeSerializer;
import org.cmg.scel.json.FormalTemplateFieldDeserializer;
import org.cmg.scel.json.FormalTemplateFieldSerializer;
import org.cmg.scel.json.MessageDeserializer;
import org.cmg.scel.json.TemplateDeserializer;
import org.cmg.scel.json.TemplateSerializer;
import org.cmg.scel.json.TupleDeserializer;
import org.cmg.scel.json.TupleSerializer;
import org.cmg.scel.knowledge.ActualTemplateField;
import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.FormalTemplateField;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.protocol.Message;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Michele Loreti
 *
 */
public class SCELFactory {

	public static Gson getGSon() {
		GsonBuilder builder = new GsonBuilder();
		//
		// JSon Deserializers
		//
		builder.registerTypeAdapter(ActualTemplateField.class, new ActualTemplateFieldDeserializer());
		builder.registerTypeHierarchyAdapter(Address.class, new AddressDeserializer());
		builder.registerTypeAdapter(Attribute.class, new AttributeDeserializer());
		builder.registerTypeAdapter(FormalTemplateField.class, new FormalTemplateFieldDeserializer());
		builder.registerTypeHierarchyAdapter(Message.class, new MessageDeserializer());		
		builder.registerTypeHierarchyAdapter(Template.class, new TemplateDeserializer());
		builder.registerTypeAdapter(Tuple.class, new TupleDeserializer());
		
		
		//
		// JSon Serializers
		//
		builder.registerTypeAdapter(ActualTemplateField.class, new ActualTemplateFieldSerializer());
		builder.registerTypeAdapter(Attribute.class, new AttributeSerializer());
		builder.registerTypeAdapter(FormalTemplateField.class, new FormalTemplateFieldSerializer());
		builder.registerTypeHierarchyAdapter(Template.class, new TemplateSerializer());
		builder.registerTypeAdapter(Tuple.class, new TupleSerializer());
		return builder.setPrettyPrinting().create();
	}

}
