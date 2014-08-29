package org.cmg.resp.policy.facpl.algorithm;


import java.util.List;

import org.cmg.resp.policy.AuthorizationDecision;
import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.AuthorizationResponse;
import org.cmg.resp.policy.facpl.ICombiningAlgorithm;
import org.cmg.resp.policy.facpl.IFacplElement;

public class FirstApplicable implements ICombiningAlgorithm{

	@Override
	public AuthorizationResponse evaluate(List<IFacplElement> elements,
			AuthorizationRequest request){

		AuthorizationResponse dr = new AuthorizationResponse();

		for (IFacplElement el : elements) {
			dr = el.evaluate(request);
			if (dr.getDecision().equals(AuthorizationDecision.DENY)){
				return dr;
			}
			if (dr.getDecision().equals(AuthorizationDecision.PERMIT)){
				return dr;
			}
			if (dr.getDecision().equals(AuthorizationDecision.NOT_APPLICABLE)){
				continue;
			}
			if (dr.getDecision().equals(AuthorizationDecision.INDETERMINATE)){
				return dr;
			}
		}
		dr.setDecision(AuthorizationDecision.NOT_APPLICABLE);
		return dr;
	}

}

