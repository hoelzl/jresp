/*
 * generated by Xtext
 */
package org.cmg.resp.xtext.scellight.validation

import org.cmg.resp.xtext.scellight.scelLight.AttributeDeclaration
import org.cmg.resp.xtext.scellight.scelLight.Command
import org.cmg.resp.xtext.scellight.scelLight.ComponentExpression
import org.cmg.resp.xtext.scellight.scelLight.FalseExpression
import org.cmg.resp.xtext.scellight.scelLight.Model
import org.cmg.resp.xtext.scellight.scelLight.NumberLiteral
import org.cmg.resp.xtext.scellight.scelLight.ProcessExpression
import org.cmg.resp.xtext.scellight.scelLight.Reference
import org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage
import org.cmg.resp.xtext.scellight.scelLight.StringLiteral
import org.cmg.resp.xtext.scellight.scelLight.TrueExpression
import org.cmg.resp.xtext.scellight.scelLight.Variable
import org.cmg.resp.xtext.scellight.utils.Utils
import org.eclipse.xtext.validation.Check

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.cmg.resp.xtext.scellight.scelLight.ComponentReference
import org.cmg.resp.xtext.scellight.scelLight.Expression
import org.cmg.resp.xtext.scellight.scelLight.Type
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EStructuralFeature
import org.cmg.resp.xtext.scellight.scelLight.ProcessReference

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class ScelLightValidator extends AbstractScelLightValidator {

	
	@Check
	def checkAttributeNameIsUnique(AttributeDeclaration a) {
		if((a.eContainer as Model).attributes.filter[att | att.name.equals(a.name)].length > 1)
			 error("Attribute names must be unique", ScelLightPackage.Literals.ATTRIBUTE_DECLARATION.EIDAttribute);
	}

	@Check
	def checkVariableIsUnique(Variable v) {
		if(Utils::getPreviuslyDeclaredVariablesInABlock(v.getContainerOfType(Command)).filter[d | d.name.equals(v.name)].length > 0)
			error("Variable names must be unique", ScelLightPackage.Literals.VARIABLE_DECLARATION.EIDAttribute);
	}
	
	
	@Check
	def checkProcessParametersType(ProcessReference p) {
		var result=Utils::typeChecker(p.arguments.iterator, p.reference.parameters.iterator)
		if(!result.equals("")){
			error(result as String, ScelLightPackage.Literals.ATTRIBUTE_DECLARATION.EIDAttribute);
		}
	}
	
	@Check
	def checkComponentsAttributesNumber(ComponentReference c) {
		var expressionParameters=c.arguments
		var declaredParameters=c.reference.parameters
		if(expressionParameters.size!=declaredParameters.size){
			error("Components parameters number mismatch", ScelLightPackage.Literals.COMPONENT_REFERENCE.EIDAttribute);
		}
	}

	@Check
	def checkComponentsAttributeType(ComponentReference c) {
		var result=Utils::typeChecker(c.arguments.iterator,c.reference.parameters.iterator)
		if(!result.equals("")){
			error(result as String, ScelLightPackage.Literals.COMPONENT_REFERENCE.EIDAttribute);
		}
	}
	
	
	@Check
	def checkProcessParametersNumber(ProcessReference p) {
		var localParameters=p.arguments
		var remoteParameters=p.reference.parameters
		if(localParameters.size!=remoteParameters.size)
		 error("Process parameters number mismatch", ScelLightPackage.Literals.PROCESS_REFERENCE__REFERENCE);
}

}