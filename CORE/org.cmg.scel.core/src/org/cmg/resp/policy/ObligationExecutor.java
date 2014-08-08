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

import java.io.IOException;
import java.util.List;

import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.policy.facpl.FulfilledObligation;
import org.cmg.resp.topology.Target;

/**
 * @author Andrea Margheri
 * @author Michele Loreti
 *
 */
public class ObligationExecutor extends Agent {

	private List<FulfilledObligation> obls;

	public ObligationExecutor( List<FulfilledObligation> obls ) {
		super("ObligationExecutor");
		this.obls = obls;
	}

	@Override
	protected void doRun() throws Exception {
		for (FulfilledObligation o : obls) {
			execute( o );
		}
	}

	/**
	 * Given a Fulfilled Obligation execute the corresponding action
	 * @param o FulfilledObligation returned by the policy evaluation
	 * @throws InterruptedException
	 * @throws IOException
	 */
	private void execute(FulfilledObligation o) throws Exception {
		switch (o.getActionId()) {
		case GET:
			System.out.println("Obligation - Eseguita azione GET");
			get( (Template)o.getArguments().get(0), (Target)o.getArguments().get(1));
			break;
		case QRY:
			System.out.println("Obligation - Eseguita azione QUERY");
			query( (Template)o.getArguments().get(0), (Target)o.getArguments().get(1));
			break;
		case PUT:
			System.out.println("Obligation - Eseguita azione PUT");
			put( (Tuple)o.getArguments().get(0), (Target)o.getArguments().get(1));
			break;
		case EXEC:
			
			/*
			 * TODO 
			 */
			
			System.out.println("DA IMPLEMENTARE");
			
			break;

		default:
			System.out.println("Obligation cannot be executed");
			throw new Exception("Obligation cannot be executed");
		}
		
	}
	
	
	

}
