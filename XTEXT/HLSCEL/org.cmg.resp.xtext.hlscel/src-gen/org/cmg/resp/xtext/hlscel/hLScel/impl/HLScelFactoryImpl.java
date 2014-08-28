/**
 */
package org.cmg.resp.xtext.hlscel.hLScel.impl;

import org.cmg.resp.xtext.hlscel.hLScel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HLScelFactoryImpl extends EFactoryImpl implements HLScelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HLScelFactory init()
  {
    try
    {
      HLScelFactory theHLScelFactory = (HLScelFactory)EPackage.Registry.INSTANCE.getEFactory(HLScelPackage.eNS_URI);
      if (theHLScelFactory != null)
      {
        return theHLScelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HLScelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HLScelPackage.MODEL: return createModel();
      case HLScelPackage.MODEL_ELEMENT: return createModelElement();
      case HLScelPackage.NODE_DECLARATION: return createNodeDeclaration();
      case HLScelPackage.PROCESS_DECLARATION: return createProcessDeclaration();
      case HLScelPackage.HL_SCEL_PREDICATE: return createHLScelPredicate();
      case HLScelPackage.SELF_LITERAL: return createSelfLiteral();
      case HLScelPackage.HL_SCEL_PUT_ACTION: return createHLScelPutAction();
      case HLScelPackage.HL_SCEL_GET_ACTION: return createHLScelGetAction();
      case HLScelPackage.HL_SCEL_QUERY_ACTION: return createHLScelQueryAction();
      case HLScelPackage.HL_SCEL_GET_PACTION: return createHLScelGetPAction();
      case HLScelPackage.HL_SCEL_QUERY_PACTION: return createHLScelQueryPAction();
      case HLScelPackage.HL_SCEL_EXEC_ACTION: return createHLScelExecAction();
      case HLScelPackage.HL_SCEL_CALL_ACTION: return createHLScelCallAction();
      case HLScelPackage.FORMAL_TEMPLATE_FIELD: return createFormalTemplateField();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement createModelElement()
  {
    ModelElementImpl modelElement = new ModelElementImpl();
    return modelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeDeclaration createNodeDeclaration()
  {
    NodeDeclarationImpl nodeDeclaration = new NodeDeclarationImpl();
    return nodeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessDeclaration createProcessDeclaration()
  {
    ProcessDeclarationImpl processDeclaration = new ProcessDeclarationImpl();
    return processDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelPredicate createHLScelPredicate()
  {
    HLScelPredicateImpl hlScelPredicate = new HLScelPredicateImpl();
    return hlScelPredicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfLiteral createSelfLiteral()
  {
    SelfLiteralImpl selfLiteral = new SelfLiteralImpl();
    return selfLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelPutAction createHLScelPutAction()
  {
    HLScelPutActionImpl hlScelPutAction = new HLScelPutActionImpl();
    return hlScelPutAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelGetAction createHLScelGetAction()
  {
    HLScelGetActionImpl hlScelGetAction = new HLScelGetActionImpl();
    return hlScelGetAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelQueryAction createHLScelQueryAction()
  {
    HLScelQueryActionImpl hlScelQueryAction = new HLScelQueryActionImpl();
    return hlScelQueryAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelGetPAction createHLScelGetPAction()
  {
    HLScelGetPActionImpl hlScelGetPAction = new HLScelGetPActionImpl();
    return hlScelGetPAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelQueryPAction createHLScelQueryPAction()
  {
    HLScelQueryPActionImpl hlScelQueryPAction = new HLScelQueryPActionImpl();
    return hlScelQueryPAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelExecAction createHLScelExecAction()
  {
    HLScelExecActionImpl hlScelExecAction = new HLScelExecActionImpl();
    return hlScelExecAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelCallAction createHLScelCallAction()
  {
    HLScelCallActionImpl hlScelCallAction = new HLScelCallActionImpl();
    return hlScelCallAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalTemplateField createFormalTemplateField()
  {
    FormalTemplateFieldImpl formalTemplateField = new FormalTemplateFieldImpl();
    return formalTemplateField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelPackage getHLScelPackage()
  {
    return (HLScelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HLScelPackage getPackage()
  {
    return HLScelPackage.eINSTANCE;
  }

} //HLScelFactoryImpl
