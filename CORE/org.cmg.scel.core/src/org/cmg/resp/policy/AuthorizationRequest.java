/**
 * Copyright (c) 2014 Concurrency and Mobility Group.
 * Università di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp.policy;

import java.util.Map;

import org.cmg.resp.knowledge.Attribute;
import org.cmg.resp.policy.facpl.StructName;
import org.cmg.resp.topology.Target;

/**
 * @author Michele Loreti
 * @author Andrea Margheri
 *
 */
public class AuthorizationRequest {

	protected ActionID action;
	
	protected Object argument;
	
	protected Target subject;
	
	protected Map<String,Attribute> interfaze;
	
	
	public AuthorizationRequest( ActionID action , Object argument , Target subject , Map<String,Attribute> interfaze ) {
		this.action = action;
		this.argument = argument;
		this.subject = subject;
		this.interfaze = interfaze;
	}


	/**
	 * @return the action
	 */
	public ActionID getAction() {
		return action;
	}


	/**
	 * @return the argument
	 */
	public Object getArgument() {
		return argument;
	}


	/**
	 * @return the subject
	 */
	public Target getSubject() {
		return subject;
	}


	/**
	 * @return the interface
	 */
	public Map<String, Attribute> getInterface() {
		return interfaze;
	}
	
	public Object getAttributeValue(StructName name){
		
		return null;
	}
	
}
