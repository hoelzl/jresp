package org.cmg.resp.policy.facpl.elements;


import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.cmg.resp.policy.AuthorizationRequest;
import org.cmg.resp.policy.facpl.Bag;
import org.cmg.resp.policy.facpl.IExpressionFunction;
import org.cmg.resp.policy.facpl.StructName;

/**
*
* @author Andrea Margheri
*
*/

public class ExpressionItem {

	private Class<? extends IExpressionFunction> functionCond;

	// struct_name, literal, ConditionExpressionArgument, list<Object> (bag),...
	private LinkedList<Object> arguments;

	public ExpressionItem(){
	}


	public ExpressionItem(Class<? extends IExpressionFunction> function, Object...args) {
		this.functionCond = function; 
		//Arguments=StructName, Value o ConditionItem
		this.arguments = new LinkedList<Object>();
		for (Object object : args) {
			this.arguments.add(object);
		}
	}

	/**
	 * Return the evaluation of the function on the argument's list
	 * @param context to get value from request
	 * @return
	 */
	public Object getValue(AuthorizationRequest request) throws Throwable{

		//returned value
		Object value = null;
		
		LinkedList<Object> values = new LinkedList<Object>();
		for (Object obj : this.arguments) {
			//structName
			if (obj instanceof StructName){
				//l.debug("arg= struct name");
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
			//letterali
			if (obj instanceof Integer || obj instanceof String || obj instanceof Boolean|| obj instanceof Double){
				values.add(obj);
			}
		}
		
		Class<?> params[] = new Class[1];
		params[0] = List.class;
		//params[1] = List.class;

		Method eval;
		eval = functionCond.getDeclaredMethod("evaluateFunction",params);

		Object alg = functionCond.newInstance();
		value =  eval.invoke(alg,values);
		
		return value;
	}

}
