package org.cmg.resp.policy.facpl.function;

import java.util.List;

import org.cmg.resp.policy.facpl.IExpressionFunction;

public class Divide implements IExpressionFunction{

	@Override
	public Object evaluateFunction(List<Object> args)	throws Throwable {
		
		double div = 0;
		if (args.size() == 2){
			Object arg0 = args.get(0);
			Object arg1 = args.get(1);
			if ((arg0 instanceof Integer || arg1 instanceof Integer )){
				int div_i = 0; 
				div_i =  ((Integer)arg0) / ((Integer)arg1);
				return div_i;
			}
			if ((arg1 instanceof Double || arg1 instanceof Integer ) && (arg0 instanceof Double || arg0 instanceof Integer )){
				double _arg1,_arg0;
				if (arg1 instanceof Integer)
					_arg1 = (Integer)arg1;
				else
					_arg1 = (Double)arg1;
				if (arg0 instanceof Integer)
					_arg0 = (Integer)arg0;
				else
					_arg0 = (Double)arg0;
				div = (_arg0) / (_arg1);
			}else {
				throw new Exception("Illegal Type of arguments");
			}
		}else{
			throw new Exception("Illegal number of arguments");
		}
		return div;
	}

}
