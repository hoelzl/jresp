package org.cmg.resp.xtext.scellight.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.cmg.resp.xtext.scellight.scelLight.ACosExpression;
import org.cmg.resp.xtext.scellight.scelLight.ASinExpression;
import org.cmg.resp.xtext.scellight.scelLight.ATanExpression;
import org.cmg.resp.xtext.scellight.scelLight.ActualField;
import org.cmg.resp.xtext.scellight.scelLight.AnyFormalField;
import org.cmg.resp.xtext.scellight.scelLight.AttributeDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation;
import org.cmg.resp.xtext.scellight.scelLight.Block;
import org.cmg.resp.xtext.scellight.scelLight.Call;
import org.cmg.resp.xtext.scellight.scelLight.CeilExpression;
import org.cmg.resp.xtext.scellight.scelLight.ComponentConstant;
import org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.ComponentReference;
import org.cmg.resp.xtext.scellight.scelLight.Conjunction;
import org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.CosExpression;
import org.cmg.resp.xtext.scellight.scelLight.Disjunction;
import org.cmg.resp.xtext.scellight.scelLight.EmptyProcess;
import org.cmg.resp.xtext.scellight.scelLight.ExecAction;
import org.cmg.resp.xtext.scellight.scelLight.FactorialExpression;
import org.cmg.resp.xtext.scellight.scelLight.FalseExpression;
import org.cmg.resp.xtext.scellight.scelLight.FloorExpression;
import org.cmg.resp.xtext.scellight.scelLight.FormalFieldWithDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.GetAction;
import org.cmg.resp.xtext.scellight.scelLight.IdAttributeDefinition;
import org.cmg.resp.xtext.scellight.scelLight.IdExpression;
import org.cmg.resp.xtext.scellight.scelLight.IfThenElse;
import org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression;
import org.cmg.resp.xtext.scellight.scelLight.Interface;
import org.cmg.resp.xtext.scellight.scelLight.Knowledge;
import org.cmg.resp.xtext.scellight.scelLight.LogExpression;
import org.cmg.resp.xtext.scellight.scelLight.MaxExpression;
import org.cmg.resp.xtext.scellight.scelLight.MinExpression;
import org.cmg.resp.xtext.scellight.scelLight.ModExpression;
import org.cmg.resp.xtext.scellight.scelLight.Model;
import org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision;
import org.cmg.resp.xtext.scellight.scelLight.Negation;
import org.cmg.resp.xtext.scellight.scelLight.NumberLiteral;
import org.cmg.resp.xtext.scellight.scelLight.PowExpression;
import org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.ProcessReference;
import org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression;
import org.cmg.resp.xtext.scellight.scelLight.PutAction;
import org.cmg.resp.xtext.scellight.scelLight.QueryAction;
import org.cmg.resp.xtext.scellight.scelLight.Reference;
import org.cmg.resp.xtext.scellight.scelLight.Relation;
import org.cmg.resp.xtext.scellight.scelLight.ReplaceAction;
import org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage;
import org.cmg.resp.xtext.scellight.scelLight.SelfExpression;
import org.cmg.resp.xtext.scellight.scelLight.SinExpression;
import org.cmg.resp.xtext.scellight.scelLight.StandardFormalField;
import org.cmg.resp.xtext.scellight.scelLight.StringLiteral;
import org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction;
import org.cmg.resp.xtext.scellight.scelLight.SystemDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.TanExpression;
import org.cmg.resp.xtext.scellight.scelLight.Template;
import org.cmg.resp.xtext.scellight.scelLight.TrueExpression;
import org.cmg.resp.xtext.scellight.scelLight.Tuple;
import org.cmg.resp.xtext.scellight.scelLight.TypedFormalField;
import org.cmg.resp.xtext.scellight.scelLight.Variable;
import org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.While;
import org.cmg.resp.xtext.scellight.services.ScelLightGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ScelLightSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ScelLightGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ScelLightPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ScelLightPackage.ACOS_EXPRESSION:
				if(context == grammarAccess.getACosExpressionRule() ||
				   context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_ACosExpression(context, (ACosExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.ASIN_EXPRESSION:
				if(context == grammarAccess.getASinExpressionRule() ||
				   context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_ASinExpression(context, (ASinExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.ATAN_EXPRESSION:
				if(context == grammarAccess.getATanExpressionRule() ||
				   context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_ATanExpression(context, (ATanExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.ACTUAL_FIELD:
				if(context == grammarAccess.getActualFieldRule() ||
				   context == grammarAccess.getTemplateFieldRule()) {
					sequence_ActualField(context, (ActualField) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.ANY_FORMAL_FIELD:
				if(context == grammarAccess.getAnyFormalFieldRule() ||
				   context == grammarAccess.getTemplateFieldRule()) {
					sequence_AnyFormalField(context, (AnyFormalField) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.ATTRIBUTE_DECLARATION:
				if(context == grammarAccess.getAttributeDeclarationRule() ||
				   context == grammarAccess.getReferenceableElementsRule()) {
					sequence_AttributeDeclaration(context, (AttributeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.ATTRIBUTE_INSTANTIATION:
				if(context == grammarAccess.getAttributeInstantiationRule()) {
					sequence_AttributeInstantiation(context, (AttributeInstantiation) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getCommandRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.CALL:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getReferenceCallAccessRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_ReferenceCallAccess(context, (Call) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.CEIL_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getCeilExpressionRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_CeilExpression(context, (CeilExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.COMPONENT_CONSTANT:
				if(context == grammarAccess.getComponentConstantRule() ||
				   context == grammarAccess.getComponentExpressionRule()) {
					sequence_ComponentConstant(context, (ComponentConstant) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.COMPONENT_DECLARATION:
				if(context == grammarAccess.getComponentDeclarationRule()) {
					sequence_ComponentDeclaration(context, (ComponentDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.COMPONENT_REFERENCE:
				if(context == grammarAccess.getComponentExpressionRule() ||
				   context == grammarAccess.getComponentReferenceRule()) {
					sequence_ComponentReference(context, (ComponentReference) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.CONJUNCTION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_Conjunction(context, (Conjunction) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.CONSTANT_DECLARATION:
				if(context == grammarAccess.getConstantDeclarationRule() ||
				   context == grammarAccess.getReferenceableElementsRule()) {
					sequence_ConstantDeclaration(context, (ConstantDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.COS_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getCosExpressionRule() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_CosExpression(context, (CosExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.DISJUNCTION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_Disjunction(context, (Disjunction) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.EMPTY_PROCESS:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_ProcessExpression(context, (EmptyProcess) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.EXEC_ACTION:
				if(context == grammarAccess.getExecActionRule()) {
					sequence_ExecAction(context, (ExecAction) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.FACTORIAL_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorialExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_FactorialExpression(context, (FactorialExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.FALSE_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_BaseExpression(context, (FalseExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.FLOOR_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFloorExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_FloorExpression(context, (FloorExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.FORMAL_FIELD_WITH_DECLARATION:
				if(context == grammarAccess.getFormalFieldRule() ||
				   context == grammarAccess.getTemplateFieldRule()) {
					sequence_FormalField(context, (FormalFieldWithDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getFunctionDeclarationRule() ||
				   context == grammarAccess.getReferenceableElementsRule()) {
					sequence_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.GET_ACTION:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getGetActionRule()) {
					sequence_GetAction(context, (GetAction) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.ID_ATTRIBUTE_DEFINITION:
				if(context == grammarAccess.getIdAttributeDefinitionRule()) {
					sequence_IdAttributeDefinition(context, (IdAttributeDefinition) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.ID_EXPRESSION:
				if(context == grammarAccess.getIdAttributeRule()) {
					sequence_IdAttribute(context, (IdExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.IF_THEN_ELSE:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getIfThenElseRule()) {
					sequence_IfThenElse(context, (IfThenElse) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.IF_THEN_ELSE_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_BaseExpression(context, (IfThenElseExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.INTERFACE:
				if(context == grammarAccess.getInterfaceRule()) {
					sequence_Interface(context, (Interface) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.KNOWLEDGE:
				if(context == grammarAccess.getKnowledgeRule()) {
					sequence_Knowledge(context, (Knowledge) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.LOG_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_LogExpression(context, (LogExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.MAX_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMaxExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_MaxExpression(context, (MaxExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.MIN_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMinExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_MinExpression(context, (MinExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.MOD_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_ModExpression(context, (ModExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.MULTIPLICATION_DIVISION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_MultiplicationDivision(context, (MultiplicationDivision) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.NEGATION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_Negation(context, (Negation) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getNumberLiteralRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.POW_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getPowExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_PowExpression(context, (PowExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.PROCESS_DECLARATION:
				if(context == grammarAccess.getProcessDeclarationRule()) {
					sequence_ProcessDeclaration(context, (ProcessDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.PROCESS_REFERENCE:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getProcessExpressionRule()) {
					sequence_ProcessExpression(context, (ProcessReference) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.PROJECTION_DECLARATION:
				if(context == grammarAccess.getProjectionDeclarationRule() ||
				   context == grammarAccess.getReferenceableElementsRule()) {
					sequence_ProjectionDeclaration(context, (ProjectionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.PROJECTION_EXPRESSION:
				if(context == grammarAccess.getProjectionExpressionRule()) {
					sequence_ProjectionExpression(context, (ProjectionExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.PUT_ACTION:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getPutActionRule()) {
					sequence_PutAction(context, (PutAction) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.QUERY_ACTION:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getQueryActionRule()) {
					sequence_QueryAction(context, (QueryAction) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.REFERENCE:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getReferenceRule() ||
				   context == grammarAccess.getReferenceCallAccessRule() ||
				   context == grammarAccess.getReferenceCallAccessAccess().getCallFunctionAction_1_0_0() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.RELATION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_Relation(context, (Relation) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.REPLACE_ACTION:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getReplaceActionRule()) {
					sequence_ReplaceAction(context, (ReplaceAction) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.SELF_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSelfExpressionRule() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_SelfExpression(context, (SelfExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.SIN_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSinExpressionRule() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_SinExpression(context, (SinExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.STANDARD_FORMAL_FIELD:
				if(context == grammarAccess.getFormalFieldRule() ||
				   context == grammarAccess.getTemplateFieldRule()) {
					sequence_FormalField(context, (StandardFormalField) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.STRING_LITERAL:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.SUMMATION_SUBTRACTION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_SummationSubtraction(context, (SummationSubtraction) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.SYSTEM_DECLARATION:
				if(context == grammarAccess.getSystemDeclarationRule()) {
					sequence_SystemDeclaration(context, (SystemDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.TAN_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0() ||
				   context == grammarAccess.getTanExpressionRule()) {
					sequence_TanExpression(context, (TanExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.TEMPLATE:
				if(context == grammarAccess.getTemplateRule()) {
					sequence_Template(context, (Template) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.TRUE_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_BaseExpression(context, (TrueExpression) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.TUPLE:
				if(context == grammarAccess.getTupleRule()) {
					sequence_Tuple(context, (Tuple) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.TYPED_FORMAL_FIELD:
				if(context == grammarAccess.getTemplateFieldRule() ||
				   context == grammarAccess.getTypedFormalFieldRule()) {
					sequence_TypedFormalField(context, (TypedFormalField) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.VARIABLE:
				if(context == grammarAccess.getReferenceableElementsRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ScelLightPackage.WHILE:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getWhileRule()) {
					sequence_While(context, (While) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     arg=Expression
	 */
	protected void sequence_ACosExpression(EObject context, ACosExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.ACOS_EXPRESSION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.ACOS_EXPRESSION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getACosExpressionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg=Expression
	 */
	protected void sequence_ASinExpression(EObject context, ASinExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.ASIN_EXPRESSION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.ASIN_EXPRESSION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getASinExpressionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg=Expression
	 */
	protected void sequence_ATanExpression(EObject context, ATanExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.ATAN_EXPRESSION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.ATAN_EXPRESSION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getATanExpressionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_ActualField(EObject context, ActualField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.ACTUAL_FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.ACTUAL_FIELD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActualFieldAccess().getValueExpressionParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {AnyFormalField}
	 */
	protected void sequence_AnyFormalField(EObject context, AnyFormalField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type)
	 */
	protected void sequence_AttributeDeclaration(EObject context, AttributeDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.REFERENCEABLE_ELEMENTS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.REFERENCEABLE_ELEMENTS__NAME));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.ATTRIBUTE_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.ATTRIBUTE_DECLARATION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getTypeTypeEnumRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (attribute=[AttributeDeclaration|ID] value=Expression)
	 */
	protected void sequence_AttributeInstantiation(EObject context, AttributeInstantiation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.ATTRIBUTE_INSTANTIATION__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.ATTRIBUTE_INSTANTIATION__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.ATTRIBUTE_INSTANTIATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.ATTRIBUTE_INSTANTIATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeInstantiationAccess().getAttributeAttributeDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getAttributeInstantiationAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {FalseExpression}
	 */
	protected void sequence_BaseExpression(EObject context, FalseExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (guard=BaseExpression_IfThenElseExpression_2_2_0 thenBranch=Expression elseBranch=Expression)
	 */
	protected void sequence_BaseExpression(EObject context, IfThenElseExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.IF_THEN_ELSE_EXPRESSION__GUARD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.IF_THEN_ELSE_EXPRESSION__GUARD));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.IF_THEN_ELSE_EXPRESSION__THEN_BRANCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.IF_THEN_ELSE_EXPRESSION__THEN_BRANCH));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBaseExpressionAccess().getIfThenElseExpressionGuardAction_2_2_0(), semanticObject.getGuard());
		feeder.accept(grammarAccess.getBaseExpressionAccess().getThenBranchExpressionParserRuleCall_2_2_2_0(), semanticObject.getThenBranch());
		feeder.accept(grammarAccess.getBaseExpressionAccess().getElseBranchExpressionParserRuleCall_2_2_4_0(), semanticObject.getElseBranch());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {TrueExpression}
	 */
	protected void sequence_BaseExpression(EObject context, TrueExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (commands+=Command*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     arg=Expression
	 */
	protected void sequence_CeilExpression(EObject context, CeilExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.CEIL_EXPRESSION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.CEIL_EXPRESSION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCeilExpressionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (interface=Interface knowledge=Knowledge? processes+=ProcessExpression processes+=ProcessExpression*)
	 */
	protected void sequence_ComponentConstant(EObject context, ComponentConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameters+=Variable parameters+=Variable*)? component=ComponentExpression)
	 */
	protected void sequence_ComponentDeclaration(EObject context, ComponentDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[ComponentDeclaration|ID] (arguments+=Expression arguments+=Expression*)?)
	 */
	protected void sequence_ComponentReference(EObject context, ComponentReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Conjunction_Conjunction_1_0 right=Conjunction)
	 */
	protected void sequence_Conjunction(EObject context, Conjunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.CONJUNCTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.CONJUNCTION__LEFT));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.CONJUNCTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.CONJUNCTION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID value=Expression)
	 */
	protected void sequence_ConstantDeclaration(EObject context, ConstantDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.REFERENCEABLE_ELEMENTS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.REFERENCEABLE_ELEMENTS__NAME));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.CONSTANT_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.CONSTANT_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.CONSTANT_DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.CONSTANT_DECLARATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantDeclarationAccess().getTypeTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConstantDeclarationAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantDeclarationAccess().getValueExpressionParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg=Expression
	 */
	protected void sequence_CosExpression(EObject context, CosExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.COS_EXPRESSION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.COS_EXPRESSION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCosExpressionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Disjunction_Disjunction_1_0 right=Disjunction)
	 */
	protected void sequence_Disjunction(EObject context, Disjunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.DISJUNCTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.DISJUNCTION__LEFT));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.DISJUNCTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.DISJUNCTION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg=Expression
	 */
	protected void sequence_ExecAction(EObject context, ExecAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.EXEC_ACTION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.EXEC_ACTION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExecActionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg=Expression
	 */
	protected void sequence_FactorialExpression(EObject context, FactorialExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.FACTORIAL_EXPRESSION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.FACTORIAL_EXPRESSION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFactorialExpressionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     arg=Expression
	 */
	protected void sequence_FloorExpression(EObject context, FloorExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.FLOOR_EXPRESSION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.FLOOR_EXPRESSION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloorExpressionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     variable=Variable
	 */
	protected void sequence_FormalField(EObject context, FormalFieldWithDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.FORMAL_FIELD_WITH_DECLARATION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.FORMAL_FIELD_WITH_DECLARATION__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormalFieldAccess().getVariableVariableParserRuleCall_1_1_2_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     reference=[Variable|ID]
	 */
	protected void sequence_FormalField(EObject context, StandardFormalField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.STANDARD_FORMAL_FIELD__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.STANDARD_FORMAL_FIELD__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormalFieldAccess().getReferenceVariableIDTerminalRuleCall_1_0_1_0_1(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (returnType=Type name=ID (parameters+=Variable parameters+=Variable*)? body=Expression)
	 */
	protected void sequence_FunctionDeclaration(EObject context, FunctionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (template=Template target=Expression)
	 */
	protected void sequence_GetAction(EObject context, GetAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.GET_ACTION__TEMPLATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.GET_ACTION__TEMPLATE));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.GET_ACTION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.GET_ACTION__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGetActionAccess().getTemplateTemplateParserRuleCall_2_0(), semanticObject.getTemplate());
		feeder.accept(grammarAccess.getGetActionAccess().getTargetExpressionParserRuleCall_5_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     componentId=STRING
	 */
	protected void sequence_IdAttributeDefinition(EObject context, IdAttributeDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.ID_ATTRIBUTE_DEFINITION__COMPONENT_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.ID_ATTRIBUTE_DEFINITION__COMPONENT_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdAttributeDefinitionAccess().getComponentIdSTRINGTerminalRuleCall_2_0(), semanticObject.getComponentId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {IdExpression}
	 */
	protected void sequence_IdAttribute(EObject context, IdExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (guard=Expression thenBranch=Command elseBranch=Command?)
	 */
	protected void sequence_IfThenElse(EObject context, IfThenElse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (attributes+=IdAttributeDefinition | attributes+=AttributeInstantiation) 
	 *         (attributes+=IdAttributeDefinition | attributes+=AttributeInstantiation)*
	 *     )
	 */
	protected void sequence_Interface(EObject context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tuples+=Tuple tuples+=Tuple*)
	 */
	protected void sequence_Knowledge(EObject context, Knowledge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     arg=Expression
	 */
	protected void sequence_LogExpression(EObject context, LogExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.LOG_EXPRESSION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.LOG_EXPRESSION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogExpressionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_MaxExpression(EObject context, MaxExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.MAX_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.MAX_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.MAX_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.MAX_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMaxExpressionAccess().getLeftExpressionParserRuleCall_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMaxExpressionAccess().getRightExpressionParserRuleCall_4_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression right=Expression)
	 */
	protected void sequence_MinExpression(EObject context, MinExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.MIN_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.MIN_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.MIN_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.MIN_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMinExpressionAccess().getLeftExpressionParserRuleCall_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMinExpressionAccess().getRightExpressionParserRuleCall_4_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (arg=Expression mod=Expression)
	 */
	protected void sequence_ModExpression(EObject context, ModExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.MOD_EXPRESSION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.MOD_EXPRESSION__ARG));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.MOD_EXPRESSION__MOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.MOD_EXPRESSION__MOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModExpressionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.accept(grammarAccess.getModExpressionAccess().getModExpressionParserRuleCall_4_0(), semanticObject.getMod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         constants+=ConstantDeclaration | 
	 *         projections+=ProjectionDeclaration | 
	 *         functions+=FunctionDeclaration | 
	 *         attributes+=AttributeDeclaration | 
	 *         processes+=ProcessDeclaration | 
	 *         components+=ComponentDeclaration | 
	 *         systems+=SystemDeclaration
	 *     )*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicationDivision_MultiplicationDivision_1_0 (op='*' | op='/') right=MultiplicationDivision)
	 */
	protected void sequence_MultiplicationDivision(EObject context, MultiplicationDivision semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     arg=Relation
	 */
	protected void sequence_Negation(EObject context, Negation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.NEGATION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.NEGATION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegationAccess().getArgRelationParserRuleCall_0_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (intpart=INT (isDouble?='.' decimal=INT)?)
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=Expression exp=Expression)
	 */
	protected void sequence_PowExpression(EObject context, PowExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.POW_EXPRESSION__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.POW_EXPRESSION__BASE));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.POW_EXPRESSION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.POW_EXPRESSION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPowExpressionAccess().getBaseExpressionParserRuleCall_2_0(), semanticObject.getBase());
		feeder.accept(grammarAccess.getPowExpressionAccess().getExpExpressionParserRuleCall_4_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameters+=Variable parameters+=Variable*)? body=Block)
	 */
	protected void sequence_ProcessDeclaration(EObject context, ProcessDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EmptyProcess}
	 */
	protected void sequence_ProcessExpression(EObject context, EmptyProcess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[ProcessDeclaration|ID] (arguments+=Expression arguments+=Expression*)?)
	 */
	protected void sequence_ProcessExpression(EObject context, ProcessReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID projection=ProjectionExpression)
	 */
	protected void sequence_ProjectionDeclaration(EObject context, ProjectionDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.REFERENCEABLE_ELEMENTS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.REFERENCEABLE_ELEMENTS__NAME));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.PROJECTION_DECLARATION__PROJECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.PROJECTION_DECLARATION__PROJECTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProjectionDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProjectionDeclarationAccess().getProjectionProjectionExpressionParserRuleCall_3_0(), semanticObject.getProjection());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((template=Template value=Expression)? default=Expression)
	 */
	protected void sequence_ProjectionExpression(EObject context, ProjectionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tuple=Tuple target=Expression)
	 */
	protected void sequence_PutAction(EObject context, PutAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.PUT_ACTION__TUPLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.PUT_ACTION__TUPLE));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.PUT_ACTION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.PUT_ACTION__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPutActionAccess().getTupleTupleParserRuleCall_2_0(), semanticObject.getTuple());
		feeder.accept(grammarAccess.getPutActionAccess().getTargetExpressionParserRuleCall_5_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (template=Template target=Expression)
	 */
	protected void sequence_QueryAction(EObject context, QueryAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.QUERY_ACTION__TEMPLATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.QUERY_ACTION__TEMPLATE));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.QUERY_ACTION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.QUERY_ACTION__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQueryActionAccess().getTemplateTemplateParserRuleCall_2_0(), semanticObject.getTemplate());
		feeder.accept(grammarAccess.getQueryActionAccess().getTargetExpressionParserRuleCall_5_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((function=ReferenceCallAccess_Call_1_0_0 (args+=Expression args+=Expression*)?) | function=ReferenceCallAccess_Call_1_0_0)
	 */
	protected void sequence_ReferenceCallAccess(EObject context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[ReferenceableElements|ID]
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.REFERENCE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.REFERENCE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferenceAccess().getRefReferenceableElementsIDTerminalRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Relation_Relation_1_0 rel=RelationSymbol right=Relation)
	 */
	protected void sequence_Relation(EObject context, Relation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.RELATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.RELATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.RELATION__REL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.RELATION__REL));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.RELATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.RELATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationAccess().getRelationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRelationAccess().getRelRelationSymbolEnumRuleCall_1_1_0(), semanticObject.getRel());
		feeder.accept(grammarAccess.getRelationAccess().getRightRelationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (template=Template tuple=Tuple)
	 */
	protected void sequence_ReplaceAction(EObject context, ReplaceAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.REPLACE_ACTION__TEMPLATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.REPLACE_ACTION__TEMPLATE));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.REPLACE_ACTION__TUPLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.REPLACE_ACTION__TUPLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReplaceActionAccess().getTemplateTemplateParserRuleCall_2_0(), semanticObject.getTemplate());
		feeder.accept(grammarAccess.getReplaceActionAccess().getTupleTupleParserRuleCall_4_0(), semanticObject.getTuple());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SelfExpression}
	 */
	protected void sequence_SelfExpression(EObject context, SelfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     arg=Expression
	 */
	protected void sequence_SinExpression(EObject context, SinExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.SIN_EXPRESSION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.SIN_EXPRESSION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSinExpressionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=SummationSubtraction_SummationSubtraction_1_0 (op='+' | op='-') right=SummationSubtraction)
	 */
	protected void sequence_SummationSubtraction(EObject context, SummationSubtraction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=ComponentExpression elements+=ComponentExpression*)
	 */
	protected void sequence_SystemDeclaration(EObject context, SystemDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     arg=Expression
	 */
	protected void sequence_TanExpression(EObject context, TanExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.TAN_EXPRESSION__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.TAN_EXPRESSION__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTanExpressionAccess().getArgExpressionParserRuleCall_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fields+=TemplateField fields+=TemplateField*)
	 */
	protected void sequence_Template(EObject context, Template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fields+=Expression fields+=Expression*)
	 */
	protected void sequence_Tuple(EObject context, Tuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_TypedFormalField(EObject context, TypedFormalField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.TYPED_FORMAL_FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.TYPED_FORMAL_FIELD__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypedFormalFieldAccess().getTypeTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declaredVariable=Variable init=Expression?)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.REFERENCEABLE_ELEMENTS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.REFERENCEABLE_ELEMENTS__NAME));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.VARIABLE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (guard=Expression body=Command)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.WHILE__GUARD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.WHILE__GUARD));
			if(transientValues.isValueTransient(semanticObject, ScelLightPackage.Literals.WHILE__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScelLightPackage.Literals.WHILE__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileAccess().getGuardExpressionParserRuleCall_2_0(), semanticObject.getGuard());
		feeder.accept(grammarAccess.getWhileAccess().getBodyCommandParserRuleCall_4_0(), semanticObject.getBody());
		feeder.finish();
	}
}
