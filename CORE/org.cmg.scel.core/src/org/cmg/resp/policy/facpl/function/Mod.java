package org.cmg.resp.policy.facpl.function;

import java.util.List;

import org.cmg.resp.policy.facpl.IExpressionFunction;

public class Mod implements IExpressionFunction{

	/**
	 * Defined only for Integer values
	 */
	@Override
	public Integer evaluateFunction(List<Object> args)	throws Throwable {
		
		int mod = 0;
		if (args.size() == 2){
			//only defined for Integer
			Object arg0 = args.get(0);
			Object arg1 = args.get(1);
			if (arg1 instanceof Integer && arg0 instanceof Integer){
				mod = ((Integer)arg0) % ((Integer)arg1);
			}else if(arg1 instanceof String && arg0 instanceof String){
				int num0 = Integer.parseInt((String) arg0);
				int	num1 = Integer.parseInt((String) arg1);
				mod = num0 % num1;
			}else{
				throw new Exception("Illegal Type of arguments");
			}
		}else{
			throw new Exception("Illegal number of arguments");
		}
		return mod;
	}

}
