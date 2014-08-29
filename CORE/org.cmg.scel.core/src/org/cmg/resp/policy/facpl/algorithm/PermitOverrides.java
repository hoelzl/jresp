package org.cmg.resp.policy.facpl.algorithm;

import java.util.LinkedList;
import java.util.List;

import org.cmg.resp.policy.AuthorizationDecision;
import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.AuthorizationResponse;
import org.cmg.resp.policy.facpl.ICombiningAlgorithm;
import org.cmg.resp.policy.facpl.FulfilledObligation;
import org.cmg.resp.policy.facpl.IFacplElement;

public class PermitOverrides implements ICombiningAlgorithm{
	
	@Override
	public AuthorizationResponse evaluate(List<IFacplElement> elements,
			AuthorizationRequest request){
		
		Boolean atLeastOneError= false;
		Boolean atLeastOneDeny = false;
		
		LinkedList<FulfilledObligation> obligationDeny = new LinkedList<FulfilledObligation>();
		
		AuthorizationResponse dr = new AuthorizationResponse();
		for (IFacplElement el : elements) {
			AuthorizationResponse d = el.evaluate(request);
			
			if (AuthorizationDecision.PERMIT.equals(d.getDecision())){ 
				dr.setDecision(AuthorizationDecision.PERMIT);
				dr.addObligations(d.getObligations());
				return dr;
			}			
			
			if(AuthorizationDecision.DENY.equals(d.getDecision())){
				atLeastOneDeny=true;
				//add Obligation_Deny
				obligationDeny.addAll(d.getObligations());
				continue;
			}
			
			if(AuthorizationDecision.NOT_APPLICABLE.equals(d.getDecision())){
				continue;
			}
			if(AuthorizationDecision.INDETERMINATE.equals(d.getDecision())){
				atLeastOneError = true;
				continue;
			}
		}
		if (atLeastOneError){
			dr.setDecision(AuthorizationDecision.INDETERMINATE);
			return dr;
		}
		if (atLeastOneDeny){
			dr.setDecision(AuthorizationDecision.DENY);
			dr.addObligations(obligationDeny);
			return dr;
		}
		//otherwise return not app
		dr.setDecision(AuthorizationDecision.NOT_APPLICABLE);
		return dr;
	}
}
