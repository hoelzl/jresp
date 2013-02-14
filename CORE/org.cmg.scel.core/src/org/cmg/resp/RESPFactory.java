/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universitą di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp;

import java.lang.reflect.Type;
import java.util.logging.Logger;

import org.cmg.resp.json.ActualTemplateFieldDeserializer;
import org.cmg.resp.json.ActualTemplateFieldSerializer;
import org.cmg.resp.json.AddressDeserializer;
import org.cmg.resp.json.AttributeDeserializer;
import org.cmg.resp.json.AttributeSerializer;
import org.cmg.resp.json.FormalTemplateFieldDeserializer;
import org.cmg.resp.json.FormalTemplateFieldSerializer;
import org.cmg.resp.json.MessageDeserializer;
import org.cmg.resp.json.TemplateDeserializer;
import org.cmg.resp.json.TemplateSerializer;
import org.cmg.resp.json.TupleDeserializer;
import org.cmg.resp.json.TupleSerializer;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.protocol.Message;
import org.cmg.resp.topology.Address;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * This class is used to build and manage json serializers. 
 * 
 * @author Michele Loreti
 *
 */
public class RESPFactory {

	/**
	 * This is a reference to the GsonBuilder that is used to create
	 * instances of Gson serializers.
	 */
	private static GsonBuilder builder;

	
	/**
	 * Creates a new instance of Gson
	 * 
	 * @return a new instance of Gson
	 */
	public static Gson getGSon() {
		if (builder==null) {
			createBuilder();
		}
		return builder.create();
	}


	/**
	 * Creates the GsonBuilder
	 */
	private static void createBuilder() {
		builder = new GsonBuilder();
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
	}

	/**
	 * Register a json serializer/deserializer for type <code>t</code>.
	 * 
	 * @param t a type
	 * @param typeAdapter adapter that will be used for serialization/deserialization of elements that are instances type t
	 */
	public static void registerTypeAdapter( Type t , Object typeAdapter ) {
		if (builder == null) {
			createBuilder();
		}
		builder.registerTypeAdapter(t, typeAdapter);
	}
	
	/**
	 * Register a json serializer/deserializer for all the sub-types of <code>t</code>.
	 * 
	 * @param t a type
	 * @param typeAdapter adapter that will be used for serialization/deserialization of elements that has type <code>t</code>
	 */
	public static void registerTypeHierarchyAdapter( Type t , Object typeAdapter ) {
		if (builder == null) {
			createBuilder();
		}
		builder.registerTypeAdapter(t, typeAdapter);
	}
	
	/**
	 * Find or create a logger for a named subsystem.
	 * 
	 * @param name A name for the logger
	 * @return a suitable Logger 
	 */
	public static Logger getLogger(String name) {
		return Logger.getLogger(name);
	}
	
}
