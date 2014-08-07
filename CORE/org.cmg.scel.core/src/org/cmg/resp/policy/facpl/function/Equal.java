package org.cmg.resp.policy.facpl.function;



import java.util.Date;
import java.util.List;

import org.cmg.resp.policy.ActionID;
import org.cmg.resp.policy.facpl.IComparisonFunction;

public class Equal implements IComparisonFunction {

	@Override
	public Boolean evaluateFunction(List<Object> args) throws Throwable {
		if (args.size() == 2) {
			if (args.get(0) instanceof Boolean
					&& args.get(1) instanceof Boolean) {
				// BOOLEAN
				if (args.get(0).equals(args.get(1))) {
					return true;
				} else {
					return false;
				}
			} else if ((args.get(1) instanceof Double || args.get(1) instanceof Integer)
					&& (args.get(0) instanceof Double || args.get(0) instanceof Integer)) {
				// DOUBLE
				if (args.get(0).equals(args.get(1))) {
					return true;
				} else {
					return false;
				}
			} else if (args.get(0) instanceof Integer
					&& args.get(1) instanceof Integer) {
				// INTEGER
				if (args.get(0).equals(args.get(1))) {
					return true;
				} else {
					return false;
				}
			} else if (args.get(0) instanceof String
					&& args.get(1) instanceof String) {
				// STRING
				if (args.get(0).equals(args.get(1))) {
					return true;
				} else {
					return false;
				}
			} else if (args.get(0) instanceof Date || args.get(1) instanceof Date) {
				// DATE / TIME
				Date date0 = null;
				Date date1 = null;
				// manage format date
				if (args.get(0) instanceof Date && args.get(1) instanceof Date) {
					date0 = (Date) args.get(0);
					date1 = (Date) args.get(1);
				} else if (args.get(0) instanceof String && args.get(1) instanceof Date) {
					date0 = Util.parseDate((String) args.get(0));
					date1 = (Date) args.get(1);
				} else if (args.get(0) instanceof Date 	&& args.get(1) instanceof String) {
					date0 = (Date) args.get(0);
					date1 = Util.parseDate((String) args.get(1));
				}
				// parsing date ok
				if (date0.equals(date1)) {
					return true;
				} else {
					return false;
				}
			} else if(args.get(0) instanceof ActionID && args.get(1) instanceof ActionID){
				return ((ActionID)args.get(0)).equals((ActionID)args.get(1));
			} else {
				throw new Exception("Illegal Type of arguments");
			}
		} else {
			throw new Exception("Illegal number of arguments");
		}
	}

}
