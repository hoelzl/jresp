/**
 */
package org.cmg.resp.xtext.hlscel.hLScel.impl;

import org.cmg.resp.xtext.hlscel.hLScel.FormalTemplateField;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelFactory;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction;
import org.cmg.resp.xtext.hlscel.hLScel.HScelGetAction;
import org.cmg.resp.xtext.hlscel.hLScel.Model;
import org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration;
import org.cmg.resp.xtext.hlscel.hLScel.SelfLiteral;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HLScelPackageImpl extends EPackageImpl implements HLScelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selfLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hlScelPutActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hScelGetActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalTemplateFieldEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private HLScelPackageImpl()
  {
    super(eNS_URI, HLScelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link HLScelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static HLScelPackage init()
  {
    if (isInited) return (HLScelPackage)EPackage.Registry.INSTANCE.getEPackage(HLScelPackage.eNS_URI);

    // Obtain or create and register package
    HLScelPackageImpl theHLScelPackage = (HLScelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HLScelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HLScelPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theHLScelPackage.createPackageContents();

    // Initialize created meta-data
    theHLScelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theHLScelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(HLScelPackage.eNS_URI, theHLScelPackage);
    return theHLScelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessDeclaration()
  {
    return processDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessDeclaration_Name()
  {
    return (EAttribute)processDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessDeclaration_Args()
  {
    return (EReference)processDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessDeclaration_Body()
  {
    return (EReference)processDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelfLiteral()
  {
    return selfLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHLScelPutAction()
  {
    return hlScelPutActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelPutAction_FeatureCallArguments()
  {
    return (EReference)hlScelPutActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHScelGetAction()
  {
    return hScelGetActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHScelGetAction_Fields()
  {
    return (EReference)hScelGetActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHScelGetAction_Target()
  {
    return (EReference)hScelGetActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalTemplateField()
  {
    return formalTemplateFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalTemplateField_Reference()
  {
    return (EReference)formalTemplateFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelFactory getHLScelFactory()
  {
    return (HLScelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    processDeclarationEClass = createEClass(PROCESS_DECLARATION);
    createEAttribute(processDeclarationEClass, PROCESS_DECLARATION__NAME);
    createEReference(processDeclarationEClass, PROCESS_DECLARATION__ARGS);
    createEReference(processDeclarationEClass, PROCESS_DECLARATION__BODY);

    selfLiteralEClass = createEClass(SELF_LITERAL);

    hlScelPutActionEClass = createEClass(HL_SCEL_PUT_ACTION);
    createEReference(hlScelPutActionEClass, HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS);

    hScelGetActionEClass = createEClass(HSCEL_GET_ACTION);
    createEReference(hScelGetActionEClass, HSCEL_GET_ACTION__FIELDS);
    createEReference(hScelGetActionEClass, HSCEL_GET_ACTION__TARGET);

    formalTemplateFieldEClass = createEClass(FORMAL_TEMPLATE_FIELD);
    createEReference(formalTemplateFieldEClass, FORMAL_TEMPLATE_FIELD__REFERENCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    selfLiteralEClass.getESuperTypes().add(theXbasePackage.getXListLiteral());
    hlScelPutActionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    hScelGetActionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    formalTemplateFieldEClass.getESuperTypes().add(theXbasePackage.getXExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getProcessDeclaration(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processDeclarationEClass, ProcessDeclaration.class, "ProcessDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcessDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessDeclaration_Args(), theTypesPackage.getJvmFormalParameter(), null, "args", null, 0, -1, ProcessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessDeclaration_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, ProcessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selfLiteralEClass, SelfLiteral.class, "SelfLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(hlScelPutActionEClass, HLScelPutAction.class, "HLScelPutAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHLScelPutAction_FeatureCallArguments(), theXbasePackage.getXExpression(), null, "featureCallArguments", null, 0, -1, HLScelPutAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hScelGetActionEClass, HScelGetAction.class, "HScelGetAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHScelGetAction_Fields(), theXbasePackage.getXExpression(), null, "fields", null, 0, -1, HScelGetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHScelGetAction_Target(), theXbasePackage.getXExpression(), null, "target", null, 0, 1, HScelGetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formalTemplateFieldEClass, FormalTemplateField.class, "FormalTemplateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormalTemplateField_Reference(), theTypesPackage.getJvmIdentifiableElement(), null, "reference", null, 0, 1, FormalTemplateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //HLScelPackageImpl
