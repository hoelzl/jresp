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
package org.cmg.resp.knowledge;

import java.util.LinkedList;

/**
 * This class handles the knowledge installed in a SCEL component. 
 * 
 * 
 * @author Michele Loreti
 *
 */
public class Knowledge {

	/**
	 * A reference to a <code>KnowledgeManager</code>.
	 */
	protected KnowledgeManager knowledgeManager;
	

	/**
	 * A list of <code>KnowledgeAdapter</code>s. These adapters can be
	 * used to include external knowledge repositories in the knowledge. 
	 */
	protected LinkedList<KnowledgeAdapter> adapters;

	/**
	 * Active listeners registered to the knowledge. When a knowledge item
	 * is inserted/removed to/from the knowledge, all listeners are notified.
	 */
	protected LinkedList<KnowledgeListener> listeners;
	
	/**
	 * A list of <code>AbstractSensors</code>. These objects let available
	 * knowledge elements retrieved from external sources.
	 */
	protected LinkedList<AbstractSensor> sensors;
	
	/**
	 * A lit of <code>AbstractActuators</code>. These objects are used to
	 * transmit knowledge items to actuators so to control
	 * external components.
	 */
	protected LinkedList<AbstractActuator> actuators;
	
	
	public Knowledge( KnowledgeManager knowledgeMangaer , KnowledgeAdapter ... adapters ) {
		this.knowledgeManager = knowledgeMangaer;
		this.adapters = new LinkedList<KnowledgeAdapter>();
		for (KnowledgeAdapter knowledgeAdapter : adapters) {
			this.adapters.add(knowledgeAdapter);
		}
		this.sensors = new LinkedList<AbstractSensor>();
		this.actuators = new LinkedList<AbstractActuator>();
		this.listeners = new LinkedList<KnowledgeListener>();
		this.adapters = new LinkedList<KnowledgeAdapter>();
	}
	
	public boolean put( Tuple t ) {
		boolean result;
		if (putToActuator(t)) {
			return true;
		}
		KnowledgeAdapter knowledgeAdapter = getAdapterFor( t );
		if (knowledgeAdapter != null) {
			result = knowledgeAdapter.put(t);
		} else {
			result = this.knowledgeManager.put(t);
		}		
		notifyListernersOfAPut(t);
		return result;
	}

	private boolean putToActuator(Tuple t) {
		for (AbstractActuator a : this.actuators) {
			if (a.getTemplate().match(t)) {
				a.send(t);
				return true;
			}
		}
		return false;
	}

	public Tuple get( Template t ) throws InterruptedException {
		Tuple result;
		KnowledgeAdapter knowledgeAdapter = getAdapterFor( t );
		if (knowledgeAdapter != null) {
			result = knowledgeAdapter.get(t);
		} else {
			result = this.knowledgeManager.get(t);
		}
		notifyListernersOfAGet(result);
		return result;
	}

	public Tuple getp( Template t ) {
		Tuple result;
		KnowledgeAdapter knowledgeAdapter = getAdapterFor( t );
		if (knowledgeAdapter != null) {
			result = knowledgeAdapter.getp(t);
		} else {
			result = this.knowledgeManager.getp(t);
		}
		if (result != null) {
			notifyListernersOfAGet(result);
		}
		return result;
	}

	public Tuple query( Template t ) throws InterruptedException {
		Tuple result = queryFromSensors(t,true);
		if (result != null) {
			return result;
		}
		KnowledgeAdapter knowledgeAdapter = getAdapterFor( t );
		if (knowledgeAdapter != null) {
			result = knowledgeAdapter.query(t);
		} else {
			result = this.knowledgeManager.query(t);
		}
		return result;
	}

	public Tuple queryp( Template t ) {
		Tuple result = null;
		try {
			result = queryFromSensors(t,false);
		} catch (InterruptedException e) {
			//This exception cannot be raised!
		}
		if (result != null) {
			return result;
		}
		KnowledgeAdapter knowledgeAdapter = getAdapterFor( t );
		if (knowledgeAdapter != null) {
			result = knowledgeAdapter.queryp(t);
		} else {
			result = this.knowledgeManager.queryp(t);
		}
		return result;
	}

	private Tuple queryFromSensors(Template template , boolean blocking ) throws InterruptedException {
		for (AbstractSensor s : this.sensors) {
			Tuple result = s.getValue(template,blocking);
			if (result!=null) {
				return result;
			}
		}
		return null;
	}

	private synchronized void notifyListernersOfAGet(Tuple t) {
		for (KnowledgeListener listener : this.listeners) {
			listener.getOfTuple(t);
		}		
	}

	private synchronized void notifyListernersOfAPut(Tuple t) {
		for (KnowledgeListener listener : this.listeners) {
			listener.putOfTuple(t);
		}		
	}

	private synchronized KnowledgeAdapter getAdapterFor(Tuple t) {
		for (KnowledgeAdapter knowledgeAdapter : this.adapters) {
			if (knowledgeAdapter.isResponsibleFor(t)) {
				return knowledgeAdapter;
			}
		}
		return null;
	}
	
	private synchronized KnowledgeAdapter getAdapterFor(Template t) {
		for (KnowledgeAdapter knowledgeAdapter : this.adapters) {
			if (knowledgeAdapter.isResponsibleFor(t)) {
				return knowledgeAdapter;
			}
		}
		return null;
	}

	public synchronized void addSensor( AbstractSensor s ) {
		this.sensors.add(s);
	}
	
	public synchronized void addActuator( AbstractActuator a ) {
		this.actuators.add(a);
	}
	
	public synchronized void addKnowledgeListener( KnowledgeListener listener ) {
		this.listeners.add(listener);
	}
	
	public synchronized void addKnowledgeAdapter( KnowledgeAdapter adapter ) {
		this.adapters.add(adapter);
	}

	public AbstractActuator[] getActuators() {
		return actuators.toArray(new AbstractActuator[sensors.size()]);
	}

	public AbstractSensor[] getSensors() {
		return sensors.toArray(new AbstractSensor[sensors.size()]);
	}

	public void removeKnowledgeListener(KnowledgeListener listener) {
		this.listeners.remove(listener);
	}
	
}
