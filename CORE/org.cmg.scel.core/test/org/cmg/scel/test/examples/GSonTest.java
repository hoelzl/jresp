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
package org.cmg.scel.test.examples;

import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.protocol.Message;
import org.cmg.scel.protocol.MessageDeserializer;
import org.cmg.scel.topology.Locality;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Michele Loreti
 *
 */
public class GSonTest {
	
	
	public static void main(String[] argv) {
		
//		AttributeRequest request = new AttributeRequest(new Locality("pippo", 999), 23, new String[] {"ciao", "come"} );
		byte value = 10;
		
//		Tuple t = new Tuple(3,2.4,"ciao",true);
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeHierarchyAdapter(Message.class, new MessageDeserializer());
		Gson gson = gsonBuilder.create();
		String test = gson.toJson(value);
		System.out.println(test);

//		Protocol.Message request2 = 
//				gson.fromJson(test, Protocol.Message.class );
//		System.out.println(request2.toString());
	}

}
