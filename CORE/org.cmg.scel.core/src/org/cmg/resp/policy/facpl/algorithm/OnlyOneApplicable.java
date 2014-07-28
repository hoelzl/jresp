package org.cmg.resp.policy.facpl.algorithm;


import java.util.List;

import org.cmg.resp.policy.AuthorizationDecision;
import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.AuthorizationResponse;
import org.cmg.resp.policy.facpl.ICombiningAlgorithm;
import org.cmg.resp.policy.facpl.IFacplElement;
import org.cmg.resp.policy.facpl.MatchDecision;

public class OnlyOneApplicable implements ICombiningAlgorithm{

	@Override
	public AuthorizationResponse evaluate(List<IFacplElement> elements,
			AuthorizationRequest request){
				
		Boolean atLeastOne = false;
		IFacplElement selectedPolicy = null;
		MatchDecision appResult;
		
		AuthorizationResponse dr = new AuthorizationResponse();
		for (IFacplElement el : elements) {
			appResult = el.getTargetDecision(request); 
			
			if (appResult.equals(MatchDecision.INDETERMINATE)){
				dr.setDecision(AuthorizationDecision.INDETERMINATE);
				return dr;
			}
			if (appResult.equals(MatchDecision.MATCH)){
				if(atLeastOne){
					dr.setDecision(AuthorizationDecision.INDETERMINATE);
					return dr;
				}else{
					atLeastOne = true;
					selectedPolicy = el;
				}
			}
			if(appResult.equals(MatchDecision.NO_MATCH)){
				continue;
			}
		}
		if (atLeastOne){
			return selectedPolicy.evaluate(request);
		}else{
			dr.setDecision(AuthorizationDecision.NOT_APPLICABLE);
			return dr;
		}
		
	}

}
