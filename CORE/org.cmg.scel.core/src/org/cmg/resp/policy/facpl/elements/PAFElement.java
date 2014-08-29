package org.cmg.resp.policy.facpl.elements;


import org.cmg.resp.policy.facpl.ICombiningAlgorithm;


public abstract class PAFElement extends PAFEvalElement{

	protected Class<? extends ICombiningAlgorithm> algCombining;
	
	protected void addCombiningAlg (Class<? extends ICombiningAlgorithm> alg){
		
		this.algCombining = alg;
	}

}
