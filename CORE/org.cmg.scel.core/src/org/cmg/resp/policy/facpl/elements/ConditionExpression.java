package org.cmg.resp.policy.facpl.elements;


import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.facpl.Bag;
import org.cmg.resp.policy.facpl.ConditionDecision;
import org.cmg.resp.policy.facpl.IComparisonFunction;
import org.cmg.resp.policy.facpl.StructName;


/**
 * 
 * @author Andrea Margheri
 * 
 */
public class ConditionExpression {

	private Class<? extends IComparisonFunction> functionCond; //Boolean Function

	private LinkedList<Object> arguments;

	public ConditionExpression(Class<? extends IComparisonFunction> function, Object...arguments ) {
		this.functionCond = function;
		//Arguments=StructName, Value o ConditionItem
		this.arguments = new LinkedList<Object>();
		for (Object object : arguments) {
			this.arguments.add(object);
		}

	}


	public ConditionDecision evaluateCondition(AuthorizationRequest request) throws Throwable{
	
		Class<?> params[] = new Class[1];
		params[0] = List.class;

		Method eval;
		eval = functionCond.getDeclaredMethod("evaluateFunction",params);

		Object alg = functionCond.newInstance();

		//l.debug("calcolo valori argomenti condition expression");
		LinkedList<Object> values = new LinkedList<Object>();
		for (Object obj : this.arguments) {
			//structName
			if (obj instanceof StructName){
				values.add(request.getAttributeValue((StructName)obj));
			}
			//condition item
			if (obj instanceof ExpressionItem){
				//l.debug("arg = condExprItem");
				values.add(((ExpressionItem) obj).getValue(request));
			}
			//bag
			if (obj instanceof Bag){
				values.add(obj);
			}
			if (obj instanceof Integer || obj instanceof String || obj instanceof Boolean || obj instanceof Double){
				//l.debug("arg = literal");
				values.add(obj);
			}
		}

		ConditionDecision dec;
		Boolean bool;
		
		try {
			bool = (Boolean) eval.invoke(alg,values);

			if (bool == true){
				dec = ConditionDecision.TRUE;
			}else{
				dec = ConditionDecision.FALSE;
			}
		} catch (Throwable e) {
			dec = ConditionDecision.INDETERMINATE;
		}
		return dec;
	}

}
