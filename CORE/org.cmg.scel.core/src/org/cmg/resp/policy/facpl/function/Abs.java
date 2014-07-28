package org.cmg.resp.policy.facpl.function;

import java.util.List;

import org.cmg.resp.policy.facpl.IExpressionFunction;

public class Abs implements IExpressionFunction{

	@Override
	public Object evaluateFunction(List<Object> args)	throws Throwable {

		if (args.size() == 1){
			if ((args.get(0) instanceof Double)){
				return Math.abs((Double)args.get(0));				
			}else if (args.get(0)instanceof Integer){
				return Math.abs((Integer)args.get(0));				
			}else {
				throw new Exception("Illegal Type of arguments");
			}
		}else{
			throw new Exception("Illegal number of arguments");
		}
	}



	
}
