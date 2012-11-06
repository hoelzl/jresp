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
package org.cmg.resp.core.simulation;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.comp.INode;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Target;

/**
 * @author loreti
 *
 */
public interface IDelayFactory {

	public double getPutDelay(INode<?> node, Agent a, Tuple t, Target l);

	public double getGetDelay(INode<?> node, Agent a, Template t, Target l);

	public double getQueryDelay(INode<?> node, Agent a, Template t, Target l);

	public double getExecDelay(INode<?> node, Agent a, Agent b);

}
