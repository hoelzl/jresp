package org.cmg.resp.policy.facpl.function;



import java.util.List;

import org.cmg.resp.policy.facpl.IComparisonFunction;

public class And implements IComparisonFunction{

	@Override
	public Boolean evaluateFunction(List<Object> args) throws Throwable {
		if (args.size()> 1){
			Boolean result = true;
			for (Object object : args) {
				if (object instanceof Boolean){
					result &= ((Boolean)object);
				}else{
					throw new Exception("Illegal Type of arguments");
				}
			}
			return result;
		}else{
			throw new Exception("Illegal number of arguments");
		}
	}

}
