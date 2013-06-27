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
package org.cmg.resp.knowledge.adaptors;

import java.util.LinkedList;

import org.cmg.resp.knowledge.KnowledgeAdapter;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;

/**
 * @author Michele Loreti
 *
 */
public class PoemAdaptor implements KnowledgeAdapter {
	
	@Override
	public boolean put(Tuple t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Tuple get(Template template) throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple getp(Template template) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Tuple> getAll(Template template) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple query(Template template) throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple queryp(Template template) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Tuple> queryAll(Template template) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple[] getKnowledgeItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isResponsibleFor(Tuple t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isResponsibleFor(Template t) {
		// TODO Auto-generated method stub
		return false;
	}

}
