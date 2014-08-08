package org.cmg.resp.policy.facpl.function.comparison;

import java.util.List;

import org.cmg.resp.policy.facpl.IComparisonFunction;
import org.cmg.resp.policy.facpl.function.comparison.evaluator.ComparisonEvaluator;
import org.cmg.resp.policy.facpl.function.comparison.evaluator.ComparisonEvaluatorFactory;

public class Or implements IComparisonFunction{

	@Override
	public Boolean evaluateFunction(List<Object> args) throws Throwable {
		if (args.size()> 1){
			
			ComparisonEvaluator evaluator = ComparisonEvaluatorFactory.getInstance().getEvaluator(args.get(0));
			return evaluator.or(args);
			
		}else{
			throw new Exception("Illegal number of arguments");
		}
	}

}
