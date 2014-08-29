package org.cmg.resp.policy.facpl.elements;


import java.util.LinkedList;

import org.cmg.resp.exceptions.MissingAttributeException;
import org.cmg.resp.policy.AuthorizationDecision;
import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.AuthorizationResponse;
import org.cmg.resp.policy.facpl.ConditionDecision;
import org.cmg.resp.policy.facpl.FulfilledObligation;
import org.cmg.resp.policy.facpl.MatchDecision;
import org.cmg.resp.policy.facpl.RuleEffect;

/**
*
* @author Andrea Margheri
*
*/

public abstract class Rule extends PAFEvalElement{

	private RuleEffect effect;
	private ConditionExpression condition;

	protected void addEffect(RuleEffect ef){
		this.effect = ef;
	}

	protected void addConditionExpression (ConditionExpression condition){
		this.condition = condition;
	}


	@Override
	public AuthorizationResponse evaluate(AuthorizationRequest request) {
		//extendedIndeterminate not used in rule evaluation
	
		AuthorizationResponse dr = new AuthorizationResponse();
		try{
			//eval target
			MatchDecision match_target = getTargetDecision(request);
			switch (match_target) {
			case NO_MATCH:
				dr.setDecision(AuthorizationDecision.NOT_APPLICABLE);
				return dr;

			case MATCH:
				//check condition
				ConditionDecision bool_condition;
				if (this.condition!= null){
					bool_condition = this.condition.evaluateCondition(request);
				}else{
					bool_condition = ConditionDecision.TRUE;
				}

				switch (bool_condition) {
				case TRUE:		
					//Eval obligation
					//l.info("condition true. Eval Obligation");
					try{
						LinkedList<FulfilledObligation> listObl = this.evaluateObl(this.effect,request);
						//all obligations discharge
						//effect
						if (this.effect.equals(RuleEffect.PERMIT)){
							dr.setDecision(AuthorizationDecision.PERMIT);
						}else{
							dr.setDecision(AuthorizationDecision.DENY);	
						}
						//addObligation to decision result
						dr.addObligations(listObl);
						return dr;
					}catch(Throwable t){
						//exception from obligation evaluatedOn rule effect
						//return indeterminate decision
						dr.setDecision(AuthorizationDecision.INDETERMINATE);
						return dr;
					}
				case FALSE:
					dr.setDecision(AuthorizationDecision.NOT_APPLICABLE);
					return dr;

				case INDETERMINATE:
					dr.setDecision(AuthorizationDecision.INDETERMINATE);
					return dr;
				default:
					//no way to arrive here
					throw new Exception();
				}

			case INDETERMINATE:
				dr.setDecision(AuthorizationDecision.INDETERMINATE);
				return dr;
			default:
				//no way to arrive here
				throw new Exception();
			}	
		} catch (Throwable e) {
			//catch exception from condition
			if (e instanceof MissingAttributeException){
				dr.setDecision(AuthorizationDecision.NOT_APPLICABLE);
			}else{
				dr.setDecision(AuthorizationDecision.INDETERMINATE);				
			}
			return dr;
		}
	}
}
