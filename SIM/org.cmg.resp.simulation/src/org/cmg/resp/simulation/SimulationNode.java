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
package org.cmg.resp.simulation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.behaviour.ContextState;
import org.cmg.resp.comp.AttributeCollector;
import org.cmg.resp.comp.AttributeListener;
import org.cmg.resp.comp.INode;
import org.cmg.resp.knowledge.AbstractActuator;
import org.cmg.resp.knowledge.AbstractSensor;
import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.knowledge.KnowledgeListener;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.GroupPredicate;
import org.cmg.resp.topology.PointToPoint;
import org.cmg.resp.topology.Target;

/**
 * @author loreti
 *
 */
public class SimulationNode implements INode {
	
	/**
	 * Node name.
	 */
	protected String name;
	
	protected SimulationEnvironment environment;	

	protected LinkedList<AbstractActuator> actuators;
	
	protected LinkedList<Agent> agents;
	
	protected LinkedList<AttributeCollector> collectors;
	
	protected HashMap<String, Attribute> interfaze;
	
	protected LinkedList<AbstractSensor> sensors;
	
	protected SimulationTupleSpace tupleSpace;
	
	public SimulationNode( String name , SimulationEnvironment environment ) {
		this.name = name;
		this.environment = environment;
		this.environment.register( this );
		this.actuators = new LinkedList<AbstractActuator>();
		this.agents = new LinkedList<Agent>();
		this.collectors = new LinkedList<AttributeCollector>();
		this.sensors = new LinkedList<AbstractSensor>();
		this.tupleSpace = new SimulationTupleSpace(environment.getElementSelector());
	}
	
	@Override
	public void addActuator(AbstractActuator actuator) {
		this.actuators.add(actuator);
	}

	@Override
	public void addAgent(Agent a) {
		this.agents.add(a);
		this.environment.execute(this,a);
	}

	@Override
	public void addAttributeCollector(AttributeCollector ac) {
		ac.setNode(this);
		this.collectors.add(ac);
	}

	@Override
	public void addSensor(AbstractSensor sensor) {
		this.sensors.add(sensor);
	}

	@Override
	public Tuple get(Template template) throws InterruptedException {
		return tupleSpace.get(template);
	}

	@Override
	public Tuple get(Template t, Target l) throws InterruptedException,
			IOException {		
		return this.environment.get(this,t,l);
	}

	@Override
	public AbstractActuator[] getActuators() {
		return actuators.toArray(new AbstractActuator[actuators.size()]);
	}

	@Override
	public Attribute getAttribute(String name) {
		return interfaze.get(name);
	}

	@Override
	public Attribute[] getAttributes(String[] attributes) {
		Attribute[] values = new Attribute[attributes.length];
		for ( int i=0 ; i<attributes.length ; i++ ) {
			values[i] = getAttribute(attributes[i]);
		}
		return values;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public AbstractSensor[] getSensors() {
		return sensors.toArray(new AbstractSensor[ sensors.size() ]);
	}

	@Override
	public ContextState getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void put(Tuple tuple) {
		for (AbstractActuator actuator : actuators) {
			if (actuator.getTemplate().match(tuple)) {
				actuator.send(tuple);
				return ;
			}
		}
		tupleSpace.put(tuple);
	}

	@Override
	public boolean put(Tuple t, Target l) throws InterruptedException {
		return environment.put(this,t,l);
	}

	@Override
	public Tuple query(Template template) {
		for (AbstractSensor sensor : sensors) {
			try {
				Tuple value;
				value = sensor.getValue(template , false);
				if (value != null) {
					return value;
				}
			} catch (InterruptedException e) {
			}
		}
		return tupleSpace.query(template);
	}

	@Override
	public Tuple query(Template t, Target l) throws InterruptedException {
		return environment.query(this,t,l);
	}

	@Override
	public HashMap<String, Attribute> getInterface() {
		_computeInterface();
		//FIXME: Replicated method!
		return interfaze;
	}

	private void _computeInterface() {
		interfaze = new HashMap<String, Attribute>();
		for (AttributeCollector ac : collectors) {
			ac.refresh();
			interfaze.put(ac.getName(), ac.eval());
		}
	}

	@Override
	public void sendAttibutes(PointToPoint to, int session, String[] attributes)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendFail(PointToPoint to, int session, String message)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendGroupPutReply(PointToPoint source, int session,
			Attribute[] attributes2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendTuple(PointToPoint to, int session, Tuple tuple)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void put(PointToPoint from, int session, Tuple tuple)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gPut(PointToPoint from, int session,
			GroupPredicate groupPredicate, Tuple tuple) throws IOException,
			InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gGet(PointToPoint from, int session,
			GroupPredicate groupPredicate, Template template) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gQuery(PointToPoint from, int session,
			GroupPredicate groupPredicate, Template template) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String fresh() {
		return environment.fresh(this);
	}

	@Override
	public Tuple queryp(Template template) {
		return query(template);
	}

	@Override
	public void addKnowledgeListener(KnowledgeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeKnowledgeListener(KnowledgeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAttributeListener(AttributeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAttributeListener(AttributeListener listener) {
		// TODO Auto-generated method stub
		
	}

	public LinkedList< PointToPoint >  getLocalAddresses() {
		LinkedList<PointToPoint> l = new LinkedList<PointToPoint>();
		l.add(getLocalAddress());
		return l;
	}

	public PointToPoint getLocalAddress() {
		return new PointToPoint(this.name, SimulationNodeAddress.getInstance());
	}

}
