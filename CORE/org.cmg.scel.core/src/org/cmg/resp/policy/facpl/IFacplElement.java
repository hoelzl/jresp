/**
 * 
 */
package org.cmg.resp.policy.facpl;

import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.AuthorizationResponse;


/**
 * Interface for the FACPL element, i.e. policy, policy set or rule, that could
 * be evaluate a combining algorithm
 * 
 * @author Andrea Margheri
 */
public interface IFacplElement {

	/**
	 * The method for retrieving an authorization decision for a request
	 * @param request
	 * @return
	 */
	AuthorizationResponse evaluate(AuthorizationRequest request);
			//Boolean extendedIndeterminate);

	MatchDecision getTargetDecision(AuthorizationRequest request);

//	MatchDecision getTargetDecision(ContextRequest cxtRequest);
	
}
