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

import org.cmg.scel.knowledge.SCELValue;
import org.cmg.scel.knowledge.TemplateDeserializer;
import org.cmg.scel.knowledge.TemplateField;
import org.cmg.scel.knowledge.ValueDeserializer;
import org.cmg.scel.protocol.Message;
import org.cmg.scel.protocol.MessageDeserializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Michele Loreti
 *
 */
public class SCELFactory {

	public static Gson getGSon() {
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeHierarchyAdapter(SCELValue.class, new ValueDeserializer());
		builder.registerTypeHierarchyAdapter(TemplateField.class, new TemplateDeserializer());
		builder.registerTypeHierarchyAdapter(Message.class, new MessageDeserializer());
		return builder.setPrettyPrinting().create();
	}

}
