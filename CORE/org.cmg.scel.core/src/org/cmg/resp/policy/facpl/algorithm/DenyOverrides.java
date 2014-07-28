package org.cmg.resp.policy.facpl.algorithm;

import java.util.LinkedList;
import java.util.List;

import org.cmg.resp.policy.AuthorizationDecision;
import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.AuthorizationResponse;
import org.cmg.resp.policy.facpl.ICombiningAlgorithm;
import org.cmg.resp.policy.facpl.FulfilledObligation;
import org.cmg.resp.policy.facpl.IFacplElement;


public class DenyOverrides implements ICombiningAlgorithm{

	@Override
	public AuthorizationResponse evaluate(List<IFacplElement> elements,
			AuthorizationRequest request){
		
		boolean atLeastOnePermit = false;
		boolean atLeastOneError = false;
		
		LinkedList<FulfilledObligation> obligationPermit = new LinkedList<FulfilledObligation>();
		
		AuthorizationResponse authResp = new AuthorizationResponse();
		
		for (IFacplElement el : elements) {
			AuthorizationResponse d = el.evaluate(request);
			
			if (AuthorizationDecision.DENY.equals(d.getDecision())){
				//only last obligations evaluated are returned
				authResp.setDecision(AuthorizationDecision.DENY);
				authResp.addObligations(authResp.getObligations());
				return authResp;
			}
			if(AuthorizationDecision.PERMIT.equals(authResp.getDecision())){
				atLeastOnePermit=true;
				//manage obligation
				obligationPermit.addAll(authResp.getObligations());
				
				continue;
			}
			if(AuthorizationDecision.NOT_APPLICABLE.equals(authResp.getDecision())){
				continue;
			}
			
			if(AuthorizationDecision.INDETERMINATE.equals(authResp.getDecision())){
				atLeastOneError = true;
				continue;
			}
		}
	
		if (atLeastOneError){
			authResp.setDecision(AuthorizationDecision.INDETERMINATE);
			return authResp;
		}
		
		if (atLeastOnePermit){
			authResp.setDecision(AuthorizationDecision.PERMIT);
			authResp.addObligations(obligationPermit);
			return authResp;
		}
		
		//otherwise return not app
		authResp.setDecision(AuthorizationDecision.NOT_APPLICABLE);
		
		return authResp;
	}
	
}
