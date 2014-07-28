package org.cmg.resp.policy.facpl.function;

import java.util.List;

import org.cmg.resp.policy.facpl.IComparisonFunction;

public class Not implements IComparisonFunction{

	@Override
	public Boolean evaluateFunction(List<Object> args) throws Throwable {
		if (args.size()== 1){
			if (args.get(0) instanceof Boolean){
					return !((Boolean)args.get(0));
			}else{
				throw new Exception("Illegal Type of arguments");
			}
		}else{
			throw new Exception("Illegal number of arguments");
		}
	}

}
