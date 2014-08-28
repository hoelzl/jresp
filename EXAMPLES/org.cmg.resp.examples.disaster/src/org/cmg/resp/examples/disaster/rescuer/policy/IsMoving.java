/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universit? di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp.examples.disaster.rescuer.policy;

import java.io.IOException;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.policy.facpl.IFacplElement;
import org.cmg.resp.policy.facpl.algorithm.PermitUnlessDeny;
import org.cmg.resp.policy.facpl.elements.Policy;
import org.cmg.resp.topology.Self;

/**
 *
 * @author Andrea Margheri
 */
public class IsMoving extends Agent {

	private int robotId;
	
	public IsMoving(int robotId) {
		super("isMoving");
		this.robotId = robotId;
	}

	@Override
	protected void doRun() throws IOException, InterruptedException {
		while (true) {

			query(new Template(
					new ActualTemplateField("WALKING"),
					new ActualTemplateField(true)), Self.SELF);
			
		}
	}

	
	/**
	 * Return the policy in force in the Help_Rescuer state
	 * 
	 * @return
	 */
	public IFacplElement getPolicyLowBattery() {
		return new Policy_LowBattery();
	}
	
	private class Policy_LowBattery extends Policy {

		public Policy_LowBattery() {

			addCombiningAlg(PermitUnlessDeny.class);

			addTarget(null);

			addRule(null);
			
			
			addObligation(null);
		}
		
	}

}
