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
package org.cmg.resp.simulation;

import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.GroupPredicate;

/**
 * @author loreti
 *
 */
public interface IDelayFactory {

	double getRetryTime(String string);

	double getLocalGetTime(String name);

	double getRemoteGetTime(String name, Template t, String name2);

	double getGroupGetTime(String name, Template t, GroupPredicate target);

	double getLocalPutTime(String name);

	double getRemotePutTime(String name, Tuple t, String name2);

	double getGroupPutTime(String name, Tuple t, GroupPredicate target);

	double getLocalQueryTime(String name);

	double getRemoteQueryTime(String name, Template t, String name2);

	double getGroupQueryTime(String name, Template t, GroupPredicate target);

}
