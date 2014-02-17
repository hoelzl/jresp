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
package org.cmg.resp.behaviour;

import java.io.IOException;

import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.topology.Target;

/**
 * @author Michele Loreti
 *
 */
public abstract class Action {
	
	protected abstract Tuple doRun( Agent a ) throws InterruptedException, IOException;

	public final Tuple execute( Agent a ) throws InterruptedException, IOException {
		return doRun( a );
	}
	
	public static class PutAction extends Action {
		
		protected Tuple tuple;
		protected Target target;

		@Override
		protected Tuple doRun(Agent a) throws InterruptedException, IOException {
			return new Tuple( a.put(tuple, target ) );
		}

		/**
		 * @param tuple
		 * @param target
		 */
		public PutAction(Tuple tuple, Target target) {
			super();
			this.tuple = tuple;
			this.target = target;
		}
		
	}

	public static class GetAction extends Action {
		
		protected Template template;
		protected Target target;

		@Override
		protected Tuple doRun(Agent a) throws InterruptedException, IOException {
			return a.get(template, target);
		}

		/**
		 * @param template
		 * @param target
		 */
		public GetAction(Template template, Target target) {
			super();
			this.template = template;
			this.target = target;
		}
		
	}

	public static class Query extends Action {
		
		protected Template template;
		protected Target target;

		@Override
		protected Tuple doRun(Agent a) throws InterruptedException, IOException {
			return a.query(template, target);
		}

		/**
		 * @param template
		 * @param target
		 */
		public Query(Template template, Target target) {
			super();
			this.template = template;
			this.target = target;
		}
		
	}

	public static class Execute extends Action {
		
		protected Agent agent;

		@Override
		protected Tuple doRun(Agent a) throws InterruptedException, IOException {
			a.call(agent);
			return new Tuple(true);
		}

		/**
		 * @param agent
		 */
		public Execute(Agent agent) {
			super();
			this.agent = agent;
		}
		
	}

}
