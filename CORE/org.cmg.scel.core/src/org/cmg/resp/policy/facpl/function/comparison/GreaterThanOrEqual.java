package org.cmg.resp.policy.facpl.function.comparison;


import java.util.List;

import org.cmg.resp.policy.facpl.IComparisonFunction;
import org.cmg.resp.policy.facpl.function.comparison.evaluator.ComparisonEvaluator;
import org.cmg.resp.policy.facpl.function.comparison.evaluator.ComparisonEvaluatorFactory;

public class GreaterThanOrEqual implements IComparisonFunction{

	@Override
	public Boolean evaluateFunction(List<Object> args) throws Throwable {

		if (args.size() == 2){
			Object o1 = args.get(1);
			Object o2 = args.get(0);

			ComparisonEvaluator evaluator = ComparisonEvaluatorFactory.getInstance().getEvaluator(o1);
			return evaluator.isGreateThanOrEqual(o1, o2);

		}else{
			throw new Exception("Illegal number of arguments");
		}
	}

	
}
