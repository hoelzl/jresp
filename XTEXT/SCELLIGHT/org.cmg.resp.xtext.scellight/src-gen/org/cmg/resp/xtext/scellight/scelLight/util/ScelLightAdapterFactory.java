/**
 */
package org.cmg.resp.xtext.scellight.scelLight.util;

import org.cmg.resp.xtext.scellight.scelLight.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage
 * @generated
 */
public class ScelLightAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ScelLightPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScelLightAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ScelLightPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScelLightSwitch<Adapter> modelSwitch =
    new ScelLightSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseAttributeDeclaration(AttributeDeclaration object)
      {
        return createAttributeDeclarationAdapter();
      }
      @Override
      public Adapter caseProjectionDeclaration(ProjectionDeclaration object)
      {
        return createProjectionDeclarationAdapter();
      }
      @Override
      public Adapter caseProjectionExpression(ProjectionExpression object)
      {
        return createProjectionExpressionAdapter();
      }
      @Override
      public Adapter caseConstantDeclaration(ConstantDeclaration object)
      {
        return createConstantDeclarationAdapter();
      }
      @Override
      public Adapter caseComponentDeclaration(ComponentDeclaration object)
      {
        return createComponentDeclarationAdapter();
      }
      @Override
      public Adapter caseComponentExpression(ComponentExpression object)
      {
        return createComponentExpressionAdapter();
      }
      @Override
      public Adapter caseComponentReference(ComponentReference object)
      {
        return createComponentReferenceAdapter();
      }
      @Override
      public Adapter caseComponentConstant(ComponentConstant object)
      {
        return createComponentConstantAdapter();
      }
      @Override
      public Adapter caseProcessExpression(ProcessExpression object)
      {
        return createProcessExpressionAdapter();
      }
      @Override
      public Adapter caseKnowledge(Knowledge object)
      {
        return createKnowledgeAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object)
      {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseIdAttributeDefinition(IdAttributeDefinition object)
      {
        return createIdAttributeDefinitionAdapter();
      }
      @Override
      public Adapter caseAttributeInstantiation(AttributeInstantiation object)
      {
        return createAttributeInstantiationAdapter();
      }
      @Override
      public Adapter caseFunctionDeclaration(FunctionDeclaration object)
      {
        return createFunctionDeclarationAdapter();
      }
      @Override
      public Adapter caseProcessDeclaration(ProcessDeclaration object)
      {
        return createProcessDeclarationAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseReferenceableElements(ReferenceableElements object)
      {
        return createReferenceableElementsAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseReplaceAction(ReplaceAction object)
      {
        return createReplaceActionAdapter();
      }
      @Override
      public Adapter caseGetAction(GetAction object)
      {
        return createGetActionAdapter();
      }
      @Override
      public Adapter caseQueryAction(QueryAction object)
      {
        return createQueryActionAdapter();
      }
      @Override
      public Adapter casePutAction(PutAction object)
      {
        return createPutActionAdapter();
      }
      @Override
      public Adapter caseExecAction(ExecAction object)
      {
        return createExecActionAdapter();
      }
      @Override
      public Adapter caseTuple(Tuple object)
      {
        return createTupleAdapter();
      }
      @Override
      public Adapter caseTemplate(Template object)
      {
        return createTemplateAdapter();
      }
      @Override
      public Adapter caseTemplateField(TemplateField object)
      {
        return createTemplateFieldAdapter();
      }
      @Override
      public Adapter caseAnyFormalField(AnyFormalField object)
      {
        return createAnyFormalFieldAdapter();
      }
      @Override
      public Adapter caseTypedFormalField(TypedFormalField object)
      {
        return createTypedFormalFieldAdapter();
      }
      @Override
      public Adapter caseFormalField(FormalField object)
      {
        return createFormalFieldAdapter();
      }
      @Override
      public Adapter caseActualField(ActualField object)
      {
        return createActualFieldAdapter();
      }
      @Override
      public Adapter caseWhile(While object)
      {
        return createWhileAdapter();
      }
      @Override
      public Adapter caseIfThenElse(IfThenElse object)
      {
        return createIfThenElseAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseSelfExpression(SelfExpression object)
      {
        return createSelfExpressionAdapter();
      }
      @Override
      public Adapter caseIdAttribute(IdAttribute object)
      {
        return createIdAttributeAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseFactorialExpression(FactorialExpression object)
      {
        return createFactorialExpressionAdapter();
      }
      @Override
      public Adapter caseLogExpression(LogExpression object)
      {
        return createLogExpressionAdapter();
      }
      @Override
      public Adapter caseModExpression(ModExpression object)
      {
        return createModExpressionAdapter();
      }
      @Override
      public Adapter casePowExpression(PowExpression object)
      {
        return createPowExpressionAdapter();
      }
      @Override
      public Adapter caseFloorExpression(FloorExpression object)
      {
        return createFloorExpressionAdapter();
      }
      @Override
      public Adapter caseCeilExpression(CeilExpression object)
      {
        return createCeilExpressionAdapter();
      }
      @Override
      public Adapter caseMinExpression(MinExpression object)
      {
        return createMinExpressionAdapter();
      }
      @Override
      public Adapter caseMaxExpression(MaxExpression object)
      {
        return createMaxExpressionAdapter();
      }
      @Override
      public Adapter caseSinExpression(SinExpression object)
      {
        return createSinExpressionAdapter();
      }
      @Override
      public Adapter caseCosExpression(CosExpression object)
      {
        return createCosExpressionAdapter();
      }
      @Override
      public Adapter caseTanExpression(TanExpression object)
      {
        return createTanExpressionAdapter();
      }
      @Override
      public Adapter caseATanExpression(ATanExpression object)
      {
        return createATanExpressionAdapter();
      }
      @Override
      public Adapter caseASinExpression(ASinExpression object)
      {
        return createASinExpressionAdapter();
      }
      @Override
      public Adapter caseACosExpression(ACosExpression object)
      {
        return createACosExpressionAdapter();
      }
      @Override
      public Adapter caseSystemDeclaration(SystemDeclaration object)
      {
        return createSystemDeclarationAdapter();
      }
      @Override
      public Adapter caseProcessReference(ProcessReference object)
      {
        return createProcessReferenceAdapter();
      }
      @Override
      public Adapter caseEmptyProcess(EmptyProcess object)
      {
        return createEmptyProcessAdapter();
      }
      @Override
      public Adapter caseStandardFormalField(StandardFormalField object)
      {
        return createStandardFormalFieldAdapter();
      }
      @Override
      public Adapter caseFormalFieldWithDeclaration(FormalFieldWithDeclaration object)
      {
        return createFormalFieldWithDeclarationAdapter();
      }
      @Override
      public Adapter caseDisjunction(Disjunction object)
      {
        return createDisjunctionAdapter();
      }
      @Override
      public Adapter caseConjunction(Conjunction object)
      {
        return createConjunctionAdapter();
      }
      @Override
      public Adapter caseNegation(Negation object)
      {
        return createNegationAdapter();
      }
      @Override
      public Adapter caseRelation(Relation object)
      {
        return createRelationAdapter();
      }
      @Override
      public Adapter caseSummationSubtraction(SummationSubtraction object)
      {
        return createSummationSubtractionAdapter();
      }
      @Override
      public Adapter caseMultiplicationDivision(MultiplicationDivision object)
      {
        return createMultiplicationDivisionAdapter();
      }
      @Override
      public Adapter caseTrueExpression(TrueExpression object)
      {
        return createTrueExpressionAdapter();
      }
      @Override
      public Adapter caseFalseExpression(FalseExpression object)
      {
        return createFalseExpressionAdapter();
      }
      @Override
      public Adapter caseIfThenElseExpression(IfThenElseExpression object)
      {
        return createIfThenElseExpressionAdapter();
      }
      @Override
      public Adapter caseIdExpression(IdExpression object)
      {
        return createIdExpressionAdapter();
      }
      @Override
      public Adapter caseCall(Call object)
      {
        return createCallAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.AttributeDeclaration <em>Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.AttributeDeclaration
   * @generated
   */
  public Adapter createAttributeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration <em>Projection Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration
   * @generated
   */
  public Adapter createProjectionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression <em>Projection Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression
   * @generated
   */
  public Adapter createProjectionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration <em>Constant Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration
   * @generated
   */
  public Adapter createConstantDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration <em>Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration
   * @generated
   */
  public Adapter createComponentDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentExpression <em>Component Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentExpression
   * @generated
   */
  public Adapter createComponentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentReference <em>Component Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentReference
   * @generated
   */
  public Adapter createComponentReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentConstant <em>Component Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentConstant
   * @generated
   */
  public Adapter createComponentConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ProcessExpression <em>Process Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProcessExpression
   * @generated
   */
  public Adapter createProcessExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Knowledge <em>Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Knowledge
   * @generated
   */
  public Adapter createKnowledgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.IdAttributeDefinition <em>Id Attribute Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.IdAttributeDefinition
   * @generated
   */
  public Adapter createIdAttributeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation <em>Attribute Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation
   * @generated
   */
  public Adapter createAttributeInstantiationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration
   * @generated
   */
  public Adapter createFunctionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration <em>Process Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration
   * @generated
   */
  public Adapter createProcessDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ReferenceableElements <em>Referenceable Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ReferenceableElements
   * @generated
   */
  public Adapter createReferenceableElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ReplaceAction <em>Replace Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ReplaceAction
   * @generated
   */
  public Adapter createReplaceActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.GetAction <em>Get Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.GetAction
   * @generated
   */
  public Adapter createGetActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.QueryAction <em>Query Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.QueryAction
   * @generated
   */
  public Adapter createQueryActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.PutAction <em>Put Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.PutAction
   * @generated
   */
  public Adapter createPutActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ExecAction <em>Exec Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ExecAction
   * @generated
   */
  public Adapter createExecActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Tuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Tuple
   * @generated
   */
  public Adapter createTupleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Template
   * @generated
   */
  public Adapter createTemplateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.TemplateField <em>Template Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.TemplateField
   * @generated
   */
  public Adapter createTemplateFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.AnyFormalField <em>Any Formal Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.AnyFormalField
   * @generated
   */
  public Adapter createAnyFormalFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.TypedFormalField <em>Typed Formal Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.TypedFormalField
   * @generated
   */
  public Adapter createTypedFormalFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.FormalField <em>Formal Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.FormalField
   * @generated
   */
  public Adapter createFormalFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ActualField <em>Actual Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ActualField
   * @generated
   */
  public Adapter createActualFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.While
   * @generated
   */
  public Adapter createWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.IfThenElse
   * @generated
   */
  public Adapter createIfThenElseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.SelfExpression <em>Self Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.SelfExpression
   * @generated
   */
  public Adapter createSelfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.IdAttribute <em>Id Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.IdAttribute
   * @generated
   */
  public Adapter createIdAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.FactorialExpression <em>Factorial Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.FactorialExpression
   * @generated
   */
  public Adapter createFactorialExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.LogExpression <em>Log Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.LogExpression
   * @generated
   */
  public Adapter createLogExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ModExpression <em>Mod Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ModExpression
   * @generated
   */
  public Adapter createModExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.PowExpression <em>Pow Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.PowExpression
   * @generated
   */
  public Adapter createPowExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.FloorExpression <em>Floor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.FloorExpression
   * @generated
   */
  public Adapter createFloorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.CeilExpression <em>Ceil Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.CeilExpression
   * @generated
   */
  public Adapter createCeilExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.MinExpression <em>Min Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.MinExpression
   * @generated
   */
  public Adapter createMinExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.MaxExpression <em>Max Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.MaxExpression
   * @generated
   */
  public Adapter createMaxExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.SinExpression <em>Sin Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.SinExpression
   * @generated
   */
  public Adapter createSinExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.CosExpression <em>Cos Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.CosExpression
   * @generated
   */
  public Adapter createCosExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.TanExpression <em>Tan Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.TanExpression
   * @generated
   */
  public Adapter createTanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ATanExpression <em>ATan Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ATanExpression
   * @generated
   */
  public Adapter createATanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ASinExpression <em>ASin Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ASinExpression
   * @generated
   */
  public Adapter createASinExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ACosExpression <em>ACos Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ACosExpression
   * @generated
   */
  public Adapter createACosExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.SystemDeclaration <em>System Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.SystemDeclaration
   * @generated
   */
  public Adapter createSystemDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.ProcessReference <em>Process Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProcessReference
   * @generated
   */
  public Adapter createProcessReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.EmptyProcess <em>Empty Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.EmptyProcess
   * @generated
   */
  public Adapter createEmptyProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.StandardFormalField <em>Standard Formal Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.StandardFormalField
   * @generated
   */
  public Adapter createStandardFormalFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.FormalFieldWithDeclaration <em>Formal Field With Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.FormalFieldWithDeclaration
   * @generated
   */
  public Adapter createFormalFieldWithDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Disjunction <em>Disjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Disjunction
   * @generated
   */
  public Adapter createDisjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Conjunction <em>Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Conjunction
   * @generated
   */
  public Adapter createConjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Negation <em>Negation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Negation
   * @generated
   */
  public Adapter createNegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Relation
   * @generated
   */
  public Adapter createRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction <em>Summation Subtraction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction
   * @generated
   */
  public Adapter createSummationSubtractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision <em>Multiplication Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision
   * @generated
   */
  public Adapter createMultiplicationDivisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.TrueExpression <em>True Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.TrueExpression
   * @generated
   */
  public Adapter createTrueExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.FalseExpression <em>False Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.FalseExpression
   * @generated
   */
  public Adapter createFalseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression <em>If Then Else Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression
   * @generated
   */
  public Adapter createIfThenElseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.IdExpression <em>Id Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.IdExpression
   * @generated
   */
  public Adapter createIdExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.scellight.scelLight.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.scellight.scelLight.Call
   * @generated
   */
  public Adapter createCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ScelLightAdapterFactory
