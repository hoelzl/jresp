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
package org.cmg.resp.policy.facpl.function.comparison.evaluator;

import org.cmg.resp.exceptions.UnsupportedTypeException;
import org.cmg.resp.policy.ActionID;

/**
 * @author Andrea Margheri
 * 
 */
public class ActionIDComparisonEvaluator implements ComparisonEvaluator {

	private static ActionIDComparisonEvaluator instance;

	private ActionIDComparisonEvaluator() {

	}

	public static ActionIDComparisonEvaluator getInstance() {
		if (instance == null) {
			instance = new ActionIDComparisonEvaluator();
		}
		return instance;
	}

	@Override
	public boolean areEquals(Object o1, Object o2) throws Throwable{	
		return ((ActionID)o1).equals(o2);
	}

	@Override
	public boolean areNotEquals(Object o1, Object o2) throws Throwable{
		return !((ActionID)o1).equals(o2);
	}

	@Override
	public boolean isLessThan(Object o1, Object o2) throws Throwable{
		throw new UnsupportedTypeException("ActionID","Less-Than");
	}

	@Override
	public boolean isLessThanOrEqual(Object o1, Object o2) throws Throwable{
		throw new UnsupportedTypeException("ActionID","Less-Than-Or-Equal");
	}

	@Override
	public boolean isGreaterThan(Object o1, Object o2) throws Throwable{
		throw new UnsupportedTypeException("ActionID","Greater-Than");
	}

	@Override
	public boolean isGreateThanOrEqual(Object o1, Object o2) throws Throwable{
		throw new UnsupportedTypeException("ActionID","Greater-Than-Or-Equal");
	}

	@Override
	public boolean isPatterMatching(Object o1, Object o2) throws Throwable{
		throw new UnsupportedTypeException("ActionID","Pattern-Matching");
	}

	@Override
	public boolean and(Object... objs) throws Throwable{
		throw new UnsupportedTypeException("ActionID","And");
	}

	@Override
	public boolean or(Object... objs) throws Throwable{
		throw new UnsupportedTypeException("ActionID","Or");
	}

	@Override
	public boolean not(Object o1) throws Throwable{
		throw new UnsupportedTypeException("ActionID","Not");
	}

	@Override
	public boolean isSubsetOf(Object o1, Object o2) throws Throwable {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAtLestOneMemberOf(Object o1, Object o2) throws Throwable {
		// TODO Auto-generated method stub
		return false;
	}

}
