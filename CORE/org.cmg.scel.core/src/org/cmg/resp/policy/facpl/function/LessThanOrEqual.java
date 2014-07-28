package org.cmg.resp.policy.facpl.function;


import java.util.Date;
import java.util.List;

import org.cmg.resp.policy.facpl.IComparisonFunction;

public class LessThanOrEqual implements IComparisonFunction{

	@Override
	public Boolean evaluateFunction(List<Object> args) throws Throwable {

		if (args.size() == 2){
			Object arg1 = args.get(1);
			Object arg0 = args.get(0);
			//DOUBLE AND INTEGER
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
				if (_arg0 <= _arg1){
					return true;
				}else{
					return false;
				}
			}
			//DATE / TIME
			Date date0 = null;
			Date date1 = null;
			if (arg0 instanceof Date && arg1 instanceof Date){
				//manage format date		
				date0 = (Date) arg0;
				date1 = (Date) arg1;
			}else if (arg0 instanceof String && arg1 instanceof Date){
				date0 = Util.parseDate((String)arg0);
				date1 = (Date)arg1;
			}else if (arg0 instanceof Date && arg1 instanceof String){ 
				date0 = (Date)arg0; 
				date1 = Util.parseDate((String)arg1); 
			}else if (arg0 instanceof String && arg1 instanceof String){
				date0 = Util.parseDate((String)arg0);
				date1 = Util.parseDate((String)arg1);
			}else{
				throw new Exception("Illegal Type of arguments");
			}
			//parsing date ok
			if (date0.before(date1) || date0.equals(date1)){
				return true;
			}else{
				return false;
			}
		}else{
			throw new Exception("Illegal number of arguments");
		}
	}
	
}
