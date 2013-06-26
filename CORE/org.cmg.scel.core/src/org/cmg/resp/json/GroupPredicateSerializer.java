/**
 * Copyright (c) 2013 Concurrency and Mobility Group.
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

import org.cmg.resp.topology.And;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.HasValue;
import org.cmg.resp.topology.IsGreaterOrEqualThan;
import org.cmg.resp.topology.IsGreaterThan;
import org.cmg.resp.topology.IsLessOrEqualThan;
import org.cmg.resp.topology.IsLessThan;
import org.cmg.resp.topology.Not;
import org.cmg.resp.topology.Or;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * @author Michele Loreti
 *
 */
public class GroupPredicateSerializer implements JsonSerializer<GroupPredicate> {

	@Override
	public JsonElement serialize(GroupPredicate src, Type typeOfSrc,
			JsonSerializationContext context) {
		GroupPredicate.PredicateType gType = src.getType();
		JsonObject json = new JsonObject();
		json.add("type", context.serialize(gType, GroupPredicate.PredicateType.class));
		switch (gType) {
			case TRUE:
				return json;
			case ISEQUAL:
				return doSerializeHasValuePredicate( (HasValue) src , json , context );
			case ISGTR:
				return doSerializeIsGreaterThanPredicate( (IsGreaterThan) src , json , context );
			case ISGEQ:
				return doSerializeIsGreaterOrEqualThanPredicate( (IsGreaterOrEqualThan) src , json , context );
			case ISLEQ:
				return doSerializeIsLessOrEqualThanPredicate( (IsLessOrEqualThan) src , json , context );
			case ISLES:
				return doSerializeIsLessThanPredicate( (IsLessThan) src , json , context );
			case AND:
				return doSerializeAndPredicate( (And) src , json , context );
			case OR:
				return doSerializeOrPredicate( (Or) src , json , context );
			case NOT:				
				return doSerializeNotPredicate( (Not) src, json, context);
			}
		return json;
	}

	private JsonElement doSerializeNotPredicate(Not src, JsonObject json,
			JsonSerializationContext context) {
		json.add("arg", context.serialize(src.getArgument() , GroupPredicate.class));
		return json;
	}

	private JsonElement doSerializeAndPredicate(And src, JsonObject json,
			JsonSerializationContext context) {
		json.add("left", context.serialize(src.getLeft(), GroupPredicate.class));
		json.add("right", context.serialize(src.getRight(), GroupPredicate.class));
		return json;
	}

	private JsonElement doSerializeOrPredicate(Or src, JsonObject json,
			JsonSerializationContext context) {
		json.add("left", context.serialize(src.getLeft(), GroupPredicate.class));
		json.add("right", context.serialize(src.getRight(), GroupPredicate.class));
		return json;
	}

	private JsonElement doSerializeIsGreaterOrEqualThanPredicate(
			IsGreaterOrEqualThan src, JsonObject json, JsonSerializationContext context) {
		json.addProperty("attribute", src.getAttribute());
		json.add("value", SCELJsonUtil.jsonFromObject(src.getValue(), context) );
		return json;
	}

	private JsonElement doSerializeIsGreaterThanPredicate(IsGreaterThan src,
			JsonObject json, JsonSerializationContext context) {
		json.addProperty("attribute", src.getAttribute());
		json.add("value", SCELJsonUtil.jsonFromObject(src.getValue(), context) );
		return json;
	}

	private JsonElement doSerializeIsLessThanPredicate(IsLessThan src,
			JsonObject json, JsonSerializationContext context) {
		json.addProperty("attribute", src.getAttribute());
		json.add("value", SCELJsonUtil.jsonFromObject(src.getValue(), context) );
		return json;
	}

	private JsonElement doSerializeIsLessOrEqualThanPredicate(IsLessOrEqualThan src,
			JsonObject json, JsonSerializationContext context) {
		json.addProperty("attribute", src.getAttribute());
		json.add("value", SCELJsonUtil.jsonFromObject(src.getValue(), context) );
		return json;
	}

	
	private JsonElement doSerializeHasValuePredicate(HasValue src, JsonObject json,
			JsonSerializationContext context) {
		json.addProperty("attribute", src.getAttribute());
		json.add("value", SCELJsonUtil.jsonFromObject(src.getValue(), context) );
		return json;
	}
}
