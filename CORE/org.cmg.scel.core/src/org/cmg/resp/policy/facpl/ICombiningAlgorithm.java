package org.cmg.resp.policy.facpl;

import java.util.List;

import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.AuthorizationResponse;

public interface ICombiningAlgorithm {

	/**
	 * Given a set of IFacplElement the authorization request given as parameter
	 * is evaluated. We do not consider the extended indeterminate values.
	 * 
	 * @param elements
	 * @param request
	 * @param extendedIndeterminate
	 * @return
	 */
	AuthorizationResponse evaluate(List<IFacplElement> elements,
			AuthorizationRequest request); // , Boolean extendedIndeterminate
}
