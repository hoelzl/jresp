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

import org.cmg.scel.knowledge.SCELValue.SCELTag;
import org.cmg.scel.knowledge.SCELValue.SCELType;

/**
 * @author Michele Loreti
 *
 */
public class TagTemplateField implements TemplateField {

	private String name;
	private Template template;

	public TagTemplateField(String name) {
		this(name,null);
	}

	public TagTemplateField(String name, Template template) {
		this.name = name;
		this.template = template;
	}

	@Override
	public boolean match(SCELValue o) {
		if (o.getType() == SCELType.TAG) {
			SCELTag tag = (SCELTag) o;
			return (name.equals(tag.getTagName()))&&((template==null)||(template.match(tag.getElements())));
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TagTemplateField) {
			TagTemplateField ttf = (TagTemplateField) obj;
			return name.equals(ttf.name)&&((template==ttf.template)||((template != null)&&template.equals(ttf.template)));
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (template==null?name.hashCode():name.hashCode()^template.hashCode());
	}

	@Override
	public String toString() {
		return name+"[ "+(template==null?"*":template.toString())+" ]";
	}

}
