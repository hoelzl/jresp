package org.cmg.resp.policy.facpl.elements;


import java.util.LinkedList;

import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.facpl.FulfilledObligation;
import org.cmg.resp.policy.facpl.IFacplElement;
import org.cmg.resp.policy.facpl.MatchDecision;
import org.cmg.resp.policy.facpl.RuleEffect;
import org.cmg.resp.policy.facpl.elements.util.TargetTreeRepresentation;


/**
*
* @author Andrea Margheri
*
*/

public abstract class PAFEvalElement implements IFacplElement{
	
	protected TargetTreeRepresentation target;
	protected LinkedList<ScelObligationExpression> obligations;
	protected String idElement;

	protected void addId(String id){
		this.idElement = id;
	}

	protected void addTarget(TargetTreeRepresentation target){
		if (target!= null){
			this.target = target; 
		}
	}
	
	protected void addObligation (ScelObligationExpression obl){
		if (obl != null){
			if(this.obligations == null){
				this.obligations = new LinkedList<ScelObligationExpression>();
			}
			this.obligations.add(obl);
		}
	}
	/**
	 * Target evaluation
	 * @param request
	 * @return
	 */
	@Override
	public MatchDecision getTargetDecision(AuthorizationRequest request){
		MatchDecision decision = null;
		if(this.target == null){
			//empty target
			return MatchDecision.MATCH;
		}
		decision =  this.target.getDecisionValue(request);
		return decision; 
	}

	protected LinkedList<FulfilledObligation> evaluateObl(RuleEffect effect, AuthorizationRequest request) throws Throwable {
		LinkedList<FulfilledObligation> oblVal = new LinkedList<FulfilledObligation>();
		if (this.obligations != null){
			for (ScelObligationExpression oblExpr : this.obligations) {
				//applicability
				if (oblExpr.getEvaluatedOn().name().equals(effect.name())){
					try{
						//the same aplicability effect
						oblVal.add(oblExpr.evalObligation(request));
					}catch(Throwable t){
						//some exception in the evaluation on the obligation's arguments
						throw t;
					}
				}
			}
		}
		return oblVal;
	}

}
