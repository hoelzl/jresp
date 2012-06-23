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

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author loreti
 * 
 *
 */
public class TupleSpace implements Knowledge {
	
	Condition newTuple;
	Lock lock;
	LinkedList<Tuple> elements;
	
	public TupleSpace() {
		elements = new LinkedList<Tuple>();
		lock = new ReentrantLock(true);
		newTuple = lock.newCondition();
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.knowledge.Knowledge#put(org.cmg.scel.knowledge.Tuple)
	 */
	@Override
	public synchronized void put(Tuple t) {
		elements.add(t);
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.knowledge.Knowledge#get(org.cmg.scel.knowledge.Template)
	 */
	@Override
	public Tuple get(Template template) throws InterruptedException {
		return _InRead(template,true);
	}

	/**
	 * @param template
	 * @param b
	 * @return
	 * @throws InterruptedException 
	 */
	private Tuple _InRead(Template template, boolean isIn) throws InterruptedException {
		Tuple t;
		lock.lock();
		while (((t=_get(template,isIn))==null)) {
			newTuple.await();
		}
		lock.unlock();
		return t;
	}

	/**
	 * @param template
	 * @param b
	 * @return
	 * @throws InterruptedException 
	 */
	private Tuple _get(Template template, boolean remove) {
		for( int i=0 ; i<elements.size() ; i++ ) {
			Tuple t = elements.get(i);
			if (template.match(t)) {
				if (remove) {
					elements.remove(i);
				}
				return t;
			}
		}
		return null;
	}
	
	/**
	 * @param template
	 * @param b
	 * @return
	 * @throws InterruptedException 
	 */
	private Tuple _InReadP(Template template, boolean remove) {
		lock.lock();
		Tuple t=_get(template,remove);
		return t;
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.knowledge.Knowledge#getp(org.cmg.scel.knowledge.Template)
	 */
	@Override
	public Tuple getp(Template template) {
		Tuple t;
		lock.lock();
		t=_InReadP(template,true);
		lock.unlock();
		return t;
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.knowledge.Knowledge#getAll(org.cmg.scel.knowledge.Template)
	 */
	@Override
	public LinkedList<Tuple> getAll(Template template) {
		return _InReadAll(template,true);
	}

	/**
	 * @param template
	 * @param b
	 * @return
	 */
	private LinkedList<Tuple> _InReadAll(Template template, boolean remove) {
		LinkedList<Tuple> toReturn = new LinkedList<Tuple>();
		lock.lock();
		for( int i=0 ; i<elements.size() ; i++ ) {
			Tuple t = elements.get(i);
			if (template.match(t)) {
				if (remove) {
					elements.remove(i);
				}
				toReturn.add(t);
			}
		}
		lock.unlock();
		return toReturn;
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.knowledge.Knowledge#query(org.cmg.scel.knowledge.Template)
	 */
	@Override
	public Tuple query(Template template) throws InterruptedException {
		return _InRead(template, false);
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.knowledge.Knowledge#queryp(org.cmg.scel.knowledge.Template)
	 */
	@Override
	public Tuple queryp(Template template) {
		return _InReadP(template, false);
	}

	/* (non-Javadoc)
	 * @see org.cmg.scel.knowledge.Knowledge#queryAll(org.cmg.scel.knowledge.Template)
	 */
	@Override
	public LinkedList<Tuple> queryAll(Template template) {
		return _InReadAll(template, false);
	}

}
