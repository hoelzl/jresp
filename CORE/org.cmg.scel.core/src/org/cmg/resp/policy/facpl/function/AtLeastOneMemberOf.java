package org.cmg.resp.policy.facpl.function;


import java.util.List;

import org.cmg.resp.policy.facpl.Bag;
import org.cmg.resp.policy.facpl.IComparisonFunction;

public class AtLeastOneMemberOf implements IComparisonFunction {

	@Override
	public Boolean evaluateFunction(List<Object> args) throws Throwable {
		if (args.size()==2){
			if (args.get(0) instanceof Bag && args.get(1) instanceof Bag){
				//check for each element. This function must return true 
				//if AT-LEAST one member of the first argument is contained in the second
				Boolean flag = false;
				for (Object obj : ((Bag)args.get(0)).getBag_values()){
					if (((Bag)(args.get(1))).contains(obj)){
						flag = true;
						break;
					}
				}
				return flag;
				
			}else if (args.get(0) instanceof String && args.get(1) instanceof Bag){
				if (((Bag)args.get(1)).contains((String)args.get(0))){
					return true;
				}else{
					return false;
				}
			}else if (args.get(0) instanceof Bag && args.get(1) instanceof String){
				//first argument BAG 
				//second argument STRING
				// BAG atLeastOneMemberOf into STRING -> iff one of the BAG el is equal to the string element
				Bag b = (Bag)(args.get(0));
				Boolean flag = false;
				for (Object obj : b.getBag_values()){
					if (obj.equals((String)args.get(1))){
						flag = true;
						break;
					}
				}
				return flag;	

			}else{
				throw new Exception("Illegal Type of arguments");
			}
		}else{
			throw new Exception("Illegal number of arguments");
		}
	}
}
