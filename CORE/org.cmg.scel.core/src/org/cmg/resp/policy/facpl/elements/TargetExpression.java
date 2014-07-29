package org.cmg.resp.policy.facpl.elements;


import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.cmg.resp.policy.facpl.IComparisonFunction;
import org.cmg.resp.policy.facpl.MatchDecision;
import org.cmg.resp.policy.facpl.StructName;

/**
 * Target expression representation 
 * 
 * @author Andrea Margheri
 * 
 */
public class TargetExpression{

	private Class<? extends IComparisonFunction> functionMatch;
	private Object value;
	private StructName struct_name; 
	

	public TargetExpression(Class<? extends IComparisonFunction> function, Object value,
			StructName struct_name){
			//, Connector connector){
		this.functionMatch = function;
		this.value = value;
		this.struct_name =  struct_name; 
		//this.element_connector = connector ;
	}


	public MatchDecision evaluateTarget(Object values) throws Throwable{
		//values is Basic Type Object or Bag of values
		if (values == null){
			return MatchDecision.NO_MATCH;
		}

		Class<?> params[] = new Class[1];
		params[0] = List.class;

		Method eval;
		eval = functionMatch.getDeclaredMethod("evaluateFunction",params);

		Object alg = functionMatch.newInstance();
		MatchDecision dec;
		
		//create list of params
		List<Object> args = new LinkedList<Object>();
		args.add(value);
		args.add(values);
		
		try{
			Boolean bool = (Boolean) eval.invoke(alg, args);

			if (bool == true){
				dec = MatchDecision.MATCH;
			}else{
				dec = MatchDecision.NO_MATCH;
			}
		}catch(Throwable t){
			//t.printStackTrace();
			dec = MatchDecision.INDETERMINATE;
		}
		
		return dec;
	}

	public TargetExpression(Class<? extends IComparisonFunction> functionMatch) {
		this.functionMatch = functionMatch;
	}

	public Class<? extends IComparisonFunction> getFunctionMatch() {
		return functionMatch;
	}

	public void setFunctionMatch(Class<? extends IComparisonFunction> functionMatch) {
		this.functionMatch = functionMatch;
	}

	public StructName getStruct_name() {
		return struct_name;
	}

}