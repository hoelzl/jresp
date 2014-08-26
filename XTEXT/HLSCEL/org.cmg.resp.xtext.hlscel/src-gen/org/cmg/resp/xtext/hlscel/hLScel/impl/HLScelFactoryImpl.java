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
      case HLScelPackage.PROCESS_DECLARATION: return createProcessDeclaration();
      case HLScelPackage.SELF_LITERAL: return createSelfLiteral();
      case HLScelPackage.HL_SCEL_PUT_ACTION: return createHLScelPutAction();
      case HLScelPackage.HSCEL_GET_ACTION: return createHScelGetAction();
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
  public HScelGetAction createHScelGetAction()
  {
    HScelGetActionImpl hScelGetAction = new HScelGetActionImpl();
    return hScelGetAction;
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
