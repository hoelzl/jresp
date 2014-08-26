package org.cmg.resp.xtext.scellight.utils

import java.util.Iterator
import org.cmg.resp.xtext.scellight.scelLight.Action
import org.cmg.resp.xtext.scellight.scelLight.Block
import org.cmg.resp.xtext.scellight.scelLight.Command
import org.cmg.resp.xtext.scellight.scelLight.Expression
import org.cmg.resp.xtext.scellight.scelLight.FalseExpression
import org.cmg.resp.xtext.scellight.scelLight.FormalFieldWithDeclaration
import org.cmg.resp.xtext.scellight.scelLight.GetAction
import org.cmg.resp.xtext.scellight.scelLight.NumberLiteral
import org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration
import org.cmg.resp.xtext.scellight.scelLight.QueryAction
import org.cmg.resp.xtext.scellight.scelLight.Reference
import org.cmg.resp.xtext.scellight.scelLight.ReplaceAction
import org.cmg.resp.xtext.scellight.scelLight.StringLiteral
import org.cmg.resp.xtext.scellight.scelLight.Template
import org.cmg.resp.xtext.scellight.scelLight.TrueExpression
import org.cmg.resp.xtext.scellight.scelLight.Variable
import org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.cmg.resp.xtext.scellight.scelLight.Type
import javax.swing.tree.VariableHeightLayoutCache
import org.cmg.resp.xtext.scellight.scelLight.Disjunction
import org.cmg.resp.xtext.scellight.scelLight.Conjunction
import org.cmg.resp.xtext.scellight.scelLight.Negation
import org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction
import org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision
import org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration

class Utils {
	static def getDeclaredVariables( Command c ) {
		switch c {
			VariableDeclaration:
				newLinkedList( c.declaredVariable )
			Action:   
				c.declaredVariablesInAction
			default:
				newLinkedList()
		}
	}
	
	static def getDeclaredVariablesInAction( Action a ) {
		switch a {
			QueryAction: a.template.declaredVariablesInTemplate
			GetAction: a.template.declaredVariablesInTemplate
			ReplaceAction: a.template.declaredVariablesInTemplate
			default:
				newLinkedList()
		}
	}
	
	static def getDeclaredVariablesInTemplate( Template t ) {
		t.fields.filter(FormalFieldWithDeclaration).map[ f | f.variable ]
	}
	
	static def Iterable<Variable> getPreviuslyDeclaredVariablesInABlock( Block block , Command c ) {
		var localVariables = block.commands.subList(0 , block.commands.indexOf( c ) ).map[declaredVariables].flatten
		var parent = block.eContainer
		switch parent {
			Block: {
				newLinkedList(localVariables , parent.getPreviuslyDeclaredVariablesInABlock( block )).flatten
			}
			Command: {
				newLinkedList(localVariables , parent.getPreviuslyDeclaredVariablesInABlock ).flatten
			}
			ProcessDeclaration: {
				newLinkedList(localVariables , parent.parameters ).flatten
			}
			default:
				localVariables
		}
	}
	
	static def getPreviuslyDeclaredVariablesInABlock( Command c ) {
		var block = c.getContainerOfType(Block)		
		if (block == null) {
			var process = c.getContainerOfType(ProcessDeclaration)
			if (process == null) {
				newLinkedList()
			} else {
				process.parameters
			}
		} else {
			block.getPreviuslyDeclaredVariablesInABlock( c )
		}
	}
	
	static def typeChecker(Iterator<Expression> expressionParameters, Iterator<Variable>  declaredParameters){
		while(declaredParameters.hasNext){
			var e=expressionParameters.next
			var type=declaredParameters.next.type
			if(!getType(e).equals(type)){
				return type+ " mismatching"
			}
			
		}
		
	}
	
	static def getType(Expression e){
		switch e{
				TrueExpression:	Type.SBOOL
			
				FalseExpression: Type.SBOOL
				
				StringLiteral:{
					Type.SSTRING
				}
				
				NumberLiteral:{
					if(e.isDouble){
						 Type.SDOUBLE
					}else {
						 Type.SINT
					}
				}
				Reference:{
					var tmp=e.ref
					switch tmp{
						Variable:tmp.type
						ConstantDeclaration:tmp.type
						default:throw new Exception("Type not supported")
					}
				}
				Disjunction:{
					if(getType(e.left).equals(Type.SBOOL)&&	getType(e.right).equals(Type.SBOOL)){
						Type.SBOOL
					}else{
						throw new Exception("Disjunction type error")
					}	
				}
				Conjunction:{
					if(getType(e.left).equals(Type.SBOOL)&&getType(e.right).equals(Type.SBOOL)){
						Type.SBOOL
					}else{
						throw new Exception("Conjunction type error")
					}
				}
				Negation:{
					if(getType(e.arg).equals(Type.SBOOL)){
						Type.SBOOL
					}else{
						throw new Exception("Negation type error")
					}
				}
				SummationSubtraction:{
					if((getType(e.left).equals(Type.SINT)||getType(e.left).equals(Type.SDOUBLE))&&( getType(e.right).equals(Type.SINT)||getType(e.right).equals(Type.SDOUBLE))){
						if(!(getType(e.left).equals(Type.SINT) && getType(e.right).equals(Type.SINT))){
							Type.SDOUBLE
						}else{
							Type.SINT
						}
					}else{
						throw new Exception("SummationSubtraction type error")
					}
				}
				MultiplicationDivision:{
					if((getType(e.left).equals(Type.SINT)||getType(e.left).equals(Type.SDOUBLE))&&( getType(e.right).equals(Type.SINT)||getType(e.right).equals(Type.SDOUBLE))){
						if(getType(e.left).equals(Type.SINT) && getType(e.right).equals(Type.SINT) && e.op.equals("*")){
							Type.SINT
						}else{
							Type.SDOUBLE
						}
						
					}else{
						throw new Exception("MultiplicationDivision type error")
					}
				}
		}
	}
	
}