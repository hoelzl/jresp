package org.cmg.resp.policy.facpl.elements;


import java.util.LinkedList;

import org.cmg.resp.policy.ActionID;
import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.facpl.FulfilledObligation;
import org.cmg.resp.policy.facpl.RuleEffect;
import org.cmg.resp.policy.facpl.StructName;


/**
 *
 * @author Andrea Margheri
 *
 */
public class ScelObligationExpression{

	private RuleEffect evaluatedOn;

	private ActionID scelAction;

	private LinkedList<Object> argsFunction;

	public ScelObligationExpression(RuleEffect evaluatedOn, ActionID scelAction, Object...args){
		this.scelAction = scelAction;
		this.evaluatedOn = evaluatedOn;
		this.argsFunction = new LinkedList<Object>();
		if (args != null){
			for (Object ob : args) {
				argsFunction.add(ob);
			}
		}
	}

	public FulfilledObligation evalObligation(AuthorizationRequest request) throws Throwable{
		FulfilledObligation obl = new FulfilledObligation(this.evaluatedOn, this.scelAction);
		for (Object a : argsFunction) {
			if (a instanceof ExpressionItem){
				//expression
				obl.addArg(((ExpressionItem)a).getValue(request));
			}else if (a instanceof StructName){
				//attribute
				obl.addArg(request.getAttributeValue((StructName) a));
			}else{
				//literal or bag
				obl.addArg(a);
			}
		}
		return obl;
	}

	public RuleEffect getEvaluatedOn() {
		return evaluatedOn;
	}

	public void setEvaluatedOn(RuleEffect evaluatedOn) {
		this.evaluatedOn = evaluatedOn;
	}

	public ActionID getScelAction() {
		return scelAction;
	}

	public void setScelAction(ActionID scelAction) {
		this.scelAction = scelAction;
	}

	public LinkedList<Object> getArgsFunction() {
		return argsFunction;
	}

	public void setArgsFunction(LinkedList<Object> argsFunction) {
		this.argsFunction = argsFunction;
	}

	
	
	
}
