/**
 */
package org.cmg.resp.xtext.scellight.scelLight.util;

import org.cmg.resp.xtext.scellight.scelLight.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage
 * @generated
 */
public class ScelLightSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ScelLightPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScelLightSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ScelLightPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ScelLightPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.ATTRIBUTE_DECLARATION:
      {
        AttributeDeclaration attributeDeclaration = (AttributeDeclaration)theEObject;
        T result = caseAttributeDeclaration(attributeDeclaration);
        if (result == null) result = caseReferenceableElements(attributeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.PROJECTION_DECLARATION:
      {
        ProjectionDeclaration projectionDeclaration = (ProjectionDeclaration)theEObject;
        T result = caseProjectionDeclaration(projectionDeclaration);
        if (result == null) result = caseReferenceableElements(projectionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.PROJECTION_EXPRESSION:
      {
        ProjectionExpression projectionExpression = (ProjectionExpression)theEObject;
        T result = caseProjectionExpression(projectionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.CONSTANT_DECLARATION:
      {
        ConstantDeclaration constantDeclaration = (ConstantDeclaration)theEObject;
        T result = caseConstantDeclaration(constantDeclaration);
        if (result == null) result = caseReferenceableElements(constantDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.COMPONENT_DECLARATION:
      {
        ComponentDeclaration componentDeclaration = (ComponentDeclaration)theEObject;
        T result = caseComponentDeclaration(componentDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.COMPONENT_EXPRESSION:
      {
        ComponentExpression componentExpression = (ComponentExpression)theEObject;
        T result = caseComponentExpression(componentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.COMPONENT_REFERENCE:
      {
        ComponentReference componentReference = (ComponentReference)theEObject;
        T result = caseComponentReference(componentReference);
        if (result == null) result = caseComponentExpression(componentReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.COMPONENT_CONSTANT:
      {
        ComponentConstant componentConstant = (ComponentConstant)theEObject;
        T result = caseComponentConstant(componentConstant);
        if (result == null) result = caseComponentExpression(componentConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.PROCESS_EXPRESSION:
      {
        ProcessExpression processExpression = (ProcessExpression)theEObject;
        T result = caseProcessExpression(processExpression);
        if (result == null) result = caseCommand(processExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.KNOWLEDGE:
      {
        Knowledge knowledge = (Knowledge)theEObject;
        T result = caseKnowledge(knowledge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.INTERFACE:
      {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.ID_ATTRIBUTE_DEFINITION:
      {
        IdAttributeDefinition idAttributeDefinition = (IdAttributeDefinition)theEObject;
        T result = caseIdAttributeDefinition(idAttributeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.ATTRIBUTE_INSTANTIATION:
      {
        AttributeInstantiation attributeInstantiation = (AttributeInstantiation)theEObject;
        T result = caseAttributeInstantiation(attributeInstantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.FUNCTION_DECLARATION:
      {
        FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
        T result = caseFunctionDeclaration(functionDeclaration);
        if (result == null) result = caseReferenceableElements(functionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.PROCESS_DECLARATION:
      {
        ProcessDeclaration processDeclaration = (ProcessDeclaration)theEObject;
        T result = caseProcessDeclaration(processDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseReferenceableElements(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.REFERENCEABLE_ELEMENTS:
      {
        ReferenceableElements referenceableElements = (ReferenceableElements)theEObject;
        T result = caseReferenceableElements(referenceableElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.COMMAND:
      {
        Command command = (Command)theEObject;
        T result = caseCommand(command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseCommand(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = caseCommand(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.REPLACE_ACTION:
      {
        ReplaceAction replaceAction = (ReplaceAction)theEObject;
        T result = caseReplaceAction(replaceAction);
        if (result == null) result = caseAction(replaceAction);
        if (result == null) result = caseCommand(replaceAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.GET_ACTION:
      {
        GetAction getAction = (GetAction)theEObject;
        T result = caseGetAction(getAction);
        if (result == null) result = caseAction(getAction);
        if (result == null) result = caseCommand(getAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.QUERY_ACTION:
      {
        QueryAction queryAction = (QueryAction)theEObject;
        T result = caseQueryAction(queryAction);
        if (result == null) result = caseAction(queryAction);
        if (result == null) result = caseCommand(queryAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.PUT_ACTION:
      {
        PutAction putAction = (PutAction)theEObject;
        T result = casePutAction(putAction);
        if (result == null) result = caseAction(putAction);
        if (result == null) result = caseCommand(putAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.EXEC_ACTION:
      {
        ExecAction execAction = (ExecAction)theEObject;
        T result = caseExecAction(execAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.TUPLE:
      {
        Tuple tuple = (Tuple)theEObject;
        T result = caseTuple(tuple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.TEMPLATE:
      {
        Template template = (Template)theEObject;
        T result = caseTemplate(template);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.TEMPLATE_FIELD:
      {
        TemplateField templateField = (TemplateField)theEObject;
        T result = caseTemplateField(templateField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.ANY_FORMAL_FIELD:
      {
        AnyFormalField anyFormalField = (AnyFormalField)theEObject;
        T result = caseAnyFormalField(anyFormalField);
        if (result == null) result = caseTemplateField(anyFormalField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.TYPED_FORMAL_FIELD:
      {
        TypedFormalField typedFormalField = (TypedFormalField)theEObject;
        T result = caseTypedFormalField(typedFormalField);
        if (result == null) result = caseTemplateField(typedFormalField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.FORMAL_FIELD:
      {
        FormalField formalField = (FormalField)theEObject;
        T result = caseFormalField(formalField);
        if (result == null) result = caseTemplateField(formalField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.ACTUAL_FIELD:
      {
        ActualField actualField = (ActualField)theEObject;
        T result = caseActualField(actualField);
        if (result == null) result = caseTemplateField(actualField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.WHILE:
      {
        While while_ = (While)theEObject;
        T result = caseWhile(while_);
        if (result == null) result = caseCommand(while_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.IF_THEN_ELSE:
      {
        IfThenElse ifThenElse = (IfThenElse)theEObject;
        T result = caseIfThenElse(ifThenElse);
        if (result == null) result = caseCommand(ifThenElse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseCommand(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.SELF_EXPRESSION:
      {
        SelfExpression selfExpression = (SelfExpression)theEObject;
        T result = caseSelfExpression(selfExpression);
        if (result == null) result = caseExpression(selfExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.ID_ATTRIBUTE:
      {
        IdAttribute idAttribute = (IdAttribute)theEObject;
        T result = caseIdAttribute(idAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = caseExpression(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = caseExpression(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.FACTORIAL_EXPRESSION:
      {
        FactorialExpression factorialExpression = (FactorialExpression)theEObject;
        T result = caseFactorialExpression(factorialExpression);
        if (result == null) result = caseExpression(factorialExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.LOG_EXPRESSION:
      {
        LogExpression logExpression = (LogExpression)theEObject;
        T result = caseLogExpression(logExpression);
        if (result == null) result = caseExpression(logExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.MOD_EXPRESSION:
      {
        ModExpression modExpression = (ModExpression)theEObject;
        T result = caseModExpression(modExpression);
        if (result == null) result = caseExpression(modExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.POW_EXPRESSION:
      {
        PowExpression powExpression = (PowExpression)theEObject;
        T result = casePowExpression(powExpression);
        if (result == null) result = caseExpression(powExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.FLOOR_EXPRESSION:
      {
        FloorExpression floorExpression = (FloorExpression)theEObject;
        T result = caseFloorExpression(floorExpression);
        if (result == null) result = caseExpression(floorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.CEIL_EXPRESSION:
      {
        CeilExpression ceilExpression = (CeilExpression)theEObject;
        T result = caseCeilExpression(ceilExpression);
        if (result == null) result = caseExpression(ceilExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.MIN_EXPRESSION:
      {
        MinExpression minExpression = (MinExpression)theEObject;
        T result = caseMinExpression(minExpression);
        if (result == null) result = caseExpression(minExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.MAX_EXPRESSION:
      {
        MaxExpression maxExpression = (MaxExpression)theEObject;
        T result = caseMaxExpression(maxExpression);
        if (result == null) result = caseExpression(maxExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.SIN_EXPRESSION:
      {
        SinExpression sinExpression = (SinExpression)theEObject;
        T result = caseSinExpression(sinExpression);
        if (result == null) result = caseExpression(sinExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.COS_EXPRESSION:
      {
        CosExpression cosExpression = (CosExpression)theEObject;
        T result = caseCosExpression(cosExpression);
        if (result == null) result = caseExpression(cosExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.TAN_EXPRESSION:
      {
        TanExpression tanExpression = (TanExpression)theEObject;
        T result = caseTanExpression(tanExpression);
        if (result == null) result = caseExpression(tanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.ATAN_EXPRESSION:
      {
        ATanExpression aTanExpression = (ATanExpression)theEObject;
        T result = caseATanExpression(aTanExpression);
        if (result == null) result = caseExpression(aTanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.ASIN_EXPRESSION:
      {
        ASinExpression aSinExpression = (ASinExpression)theEObject;
        T result = caseASinExpression(aSinExpression);
        if (result == null) result = caseExpression(aSinExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.ACOS_EXPRESSION:
      {
        ACosExpression aCosExpression = (ACosExpression)theEObject;
        T result = caseACosExpression(aCosExpression);
        if (result == null) result = caseExpression(aCosExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.SYSTEM_DECLARATION:
      {
        SystemDeclaration systemDeclaration = (SystemDeclaration)theEObject;
        T result = caseSystemDeclaration(systemDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.PROCESS_REFERENCE:
      {
        ProcessReference processReference = (ProcessReference)theEObject;
        T result = caseProcessReference(processReference);
        if (result == null) result = caseProcessExpression(processReference);
        if (result == null) result = caseCommand(processReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.EMPTY_PROCESS:
      {
        EmptyProcess emptyProcess = (EmptyProcess)theEObject;
        T result = caseEmptyProcess(emptyProcess);
        if (result == null) result = caseProcessExpression(emptyProcess);
        if (result == null) result = caseCommand(emptyProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.STANDARD_FORMAL_FIELD:
      {
        StandardFormalField standardFormalField = (StandardFormalField)theEObject;
        T result = caseStandardFormalField(standardFormalField);
        if (result == null) result = caseFormalField(standardFormalField);
        if (result == null) result = caseTemplateField(standardFormalField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.FORMAL_FIELD_WITH_DECLARATION:
      {
        FormalFieldWithDeclaration formalFieldWithDeclaration = (FormalFieldWithDeclaration)theEObject;
        T result = caseFormalFieldWithDeclaration(formalFieldWithDeclaration);
        if (result == null) result = caseFormalField(formalFieldWithDeclaration);
        if (result == null) result = caseTemplateField(formalFieldWithDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.DISJUNCTION:
      {
        Disjunction disjunction = (Disjunction)theEObject;
        T result = caseDisjunction(disjunction);
        if (result == null) result = caseExpression(disjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.CONJUNCTION:
      {
        Conjunction conjunction = (Conjunction)theEObject;
        T result = caseConjunction(conjunction);
        if (result == null) result = caseExpression(conjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.NEGATION:
      {
        Negation negation = (Negation)theEObject;
        T result = caseNegation(negation);
        if (result == null) result = caseExpression(negation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = caseExpression(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.SUMMATION_SUBTRACTION:
      {
        SummationSubtraction summationSubtraction = (SummationSubtraction)theEObject;
        T result = caseSummationSubtraction(summationSubtraction);
        if (result == null) result = caseExpression(summationSubtraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.MULTIPLICATION_DIVISION:
      {
        MultiplicationDivision multiplicationDivision = (MultiplicationDivision)theEObject;
        T result = caseMultiplicationDivision(multiplicationDivision);
        if (result == null) result = caseExpression(multiplicationDivision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.TRUE_EXPRESSION:
      {
        TrueExpression trueExpression = (TrueExpression)theEObject;
        T result = caseTrueExpression(trueExpression);
        if (result == null) result = caseExpression(trueExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.FALSE_EXPRESSION:
      {
        FalseExpression falseExpression = (FalseExpression)theEObject;
        T result = caseFalseExpression(falseExpression);
        if (result == null) result = caseExpression(falseExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION:
      {
        IfThenElseExpression ifThenElseExpression = (IfThenElseExpression)theEObject;
        T result = caseIfThenElseExpression(ifThenElseExpression);
        if (result == null) result = caseExpression(ifThenElseExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.ID_EXPRESSION:
      {
        IdExpression idExpression = (IdExpression)theEObject;
        T result = caseIdExpression(idExpression);
        if (result == null) result = caseIdAttribute(idExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScelLightPackage.CALL:
      {
        Call call = (Call)theEObject;
        T result = caseCall(call);
        if (result == null) result = caseExpression(call);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeDeclaration(AttributeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Projection Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Projection Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjectionDeclaration(ProjectionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Projection Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Projection Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjectionExpression(ProjectionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantDeclaration(ConstantDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentDeclaration(ComponentDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentExpression(ComponentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentReference(ComponentReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentConstant(ComponentConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessExpression(ProcessExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Knowledge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Knowledge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKnowledge(Knowledge object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Attribute Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Attribute Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdAttributeDefinition(IdAttributeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeInstantiation(AttributeInstantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDeclaration(FunctionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessDeclaration(ProcessDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenceable Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenceable Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceableElements(ReferenceableElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommand(Command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Replace Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Replace Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReplaceAction(ReplaceAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetAction(GetAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryAction(QueryAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Put Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Put Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePutAction(PutAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exec Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exec Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecAction(ExecAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTuple(Tuple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplate(Template object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateField(TemplateField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Formal Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Formal Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyFormalField(AnyFormalField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Formal Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Formal Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedFormalField(TypedFormalField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalField(FormalField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actual Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actual Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActualField(ActualField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile(While object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Then Else</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Then Else</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfThenElse(IfThenElse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Self Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelfExpression(SelfExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdAttribute(IdAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Factorial Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Factorial Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactorialExpression(FactorialExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Log Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Log Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogExpression(LogExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModExpression(ModExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pow Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pow Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePowExpression(PowExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Floor Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Floor Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloorExpression(FloorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ceil Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ceil Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCeilExpression(CeilExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinExpression(MinExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Max Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Max Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaxExpression(MaxExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sin Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sin Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSinExpression(SinExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cos Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cos Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCosExpression(CosExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tan Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tan Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTanExpression(TanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ATan Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ATan Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseATanExpression(ATanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ASin Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ASin Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASinExpression(ASinExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ACos Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ACos Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseACosExpression(ACosExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemDeclaration(SystemDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessReference(ProcessReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyProcess(EmptyProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Standard Formal Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Standard Formal Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStandardFormalField(StandardFormalField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Field With Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Field With Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalFieldWithDeclaration(FormalFieldWithDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisjunction(Disjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConjunction(Conjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegation(Negation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Summation Subtraction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Summation Subtraction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSummationSubtraction(SummationSubtraction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication Division</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication Division</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicationDivision(MultiplicationDivision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>True Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>True Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrueExpression(TrueExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>False Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>False Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFalseExpression(FalseExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Then Else Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Then Else Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfThenElseExpression(IfThenElseExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdExpression(IdExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCall(Call object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ScelLightSwitch
