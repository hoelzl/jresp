package org.cmg.resp.policy.facpl.algorithm;


import java.util.LinkedList;
import java.util.List;

import org.cmg.resp.policy.AuthorizationDecision;
import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.AuthorizationResponse;
import org.cmg.resp.policy.facpl.ICombiningAlgorithm;
import org.cmg.resp.policy.facpl.FulfilledObligation;
import org.cmg.resp.policy.facpl.IFacplElement;


public class PermitUnlessDeny implements ICombiningAlgorithm{

	@Override
	public AuthorizationResponse evaluate(List<IFacplElement> elements,
			AuthorizationRequest request){
			
		LinkedList<FulfilledObligation> obls_permit = new LinkedList<FulfilledObligation>();
		
		AuthorizationResponse dr = new AuthorizationResponse();
		for (IFacplElement el : elements) {
			AuthorizationResponse d = el.evaluate(request);
				if (d.getDecision().equals(AuthorizationDecision.DENY)){
				dr.setDecision(AuthorizationDecision.DENY);
				dr.addObligations(d.getObligations());
				return dr;
			}else{
				if (d.getDecision().equals(AuthorizationDecision.PERMIT)){
					obls_permit.addAll(d.getObligations());
				}
			}
		}
		
		dr.setDecision(AuthorizationDecision.PERMIT);
		dr.addObligations(obls_permit);
		return dr;
	}

}