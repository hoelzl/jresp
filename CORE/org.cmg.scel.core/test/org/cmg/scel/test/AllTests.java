package org.cmg.scel.test;
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


import org.cmg.scel.test.json.JSonTests;
import org.cmg.scel.test.knowledge.KnowledgeTests;
import org.cmg.scel.test.topology.AgentTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author loreti
 * 
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ JSonTests.class , KnowledgeTests.class , AgentTests.class })
public class AllTests {
}
