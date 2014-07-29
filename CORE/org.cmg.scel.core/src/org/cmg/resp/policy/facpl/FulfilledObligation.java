package org.cmg.resp.policy.facpl;

import java.util.LinkedList;

import org.cmg.resp.policy.ActionID;

/**
 * The obligation fulfilled by the policy evaluation
 * @author Andrea Margheri
 * 
 */
public class FulfilledObligation {

	private RuleEffect effect;
	private ActionID action;
	private LinkedList<Object> arguments;
	
	public FulfilledObligation(RuleEffect evaluatedOn, ActionID action, Object...arguments) {
		this.effect = effect;
		this.action = action;
		this.arguments = new LinkedList<Object>();
	}
	
	public void addArg(Object object){
		if (this.arguments == null){
			this.arguments = new LinkedList<Object>();
		}
		this.arguments.add(object);
	}
	
	
	public LinkedList<Object> getArguments() {
		return arguments;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(action.toString() + "(");
		for(Object o : arguments){
			str.append(o.toString());
		}
		str.append(")");
		return str.toString();
	}

	public RuleEffect getEvaluatedOn() {
		return effect;
	}

	public void setEvaluatedOn(RuleEffect evaluatedOn) {
		this.effect = evaluatedOn;
	}
	
	
}
