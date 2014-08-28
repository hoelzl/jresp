/**
 */
package org.cmg.resp.xtext.hlscel.hLScel.impl;

import org.cmg.resp.xtext.hlscel.hLScel.FormalTemplateField;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelCallAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelFactory;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelGetAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelGetPAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPredicate;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryPAction;
import org.cmg.resp.xtext.hlscel.hLScel.Model;
import org.cmg.resp.xtext.hlscel.hLScel.ModelElement;
import org.cmg.resp.xtext.hlscel.hLScel.NodeDeclaration;
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
  private EClass modelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeDeclarationEClass = null;

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
  private EClass hlScelPredicateEClass = null;

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
  private EClass hlScelGetActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hlScelQueryActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hlScelGetPActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hlScelQueryPActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hlScelExecActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hlScelCallActionEClass = null;

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
  public EClass getModelElement()
  {
    return modelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelElement_Name()
  {
    return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelElement_Args()
  {
    return (EReference)modelElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeDeclaration()
  {
    return nodeDeclarationEClass;
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
  public EReference getProcessDeclaration_Body()
  {
    return (EReference)processDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHLScelPredicate()
  {
    return hlScelPredicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelPredicate_Exp()
  {
    return (EReference)hlScelPredicateEClass.getEStructuralFeatures().get(0);
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
  public EReference getHLScelPutAction_Target()
  {
    return (EReference)hlScelPutActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHLScelGetAction()
  {
    return hlScelGetActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelGetAction_Fields()
  {
    return (EReference)hlScelGetActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelGetAction_Target()
  {
    return (EReference)hlScelGetActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHLScelQueryAction()
  {
    return hlScelQueryActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelQueryAction_Fields()
  {
    return (EReference)hlScelQueryActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelQueryAction_Target()
  {
    return (EReference)hlScelQueryActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHLScelGetPAction()
  {
    return hlScelGetPActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelGetPAction_Fields()
  {
    return (EReference)hlScelGetPActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelGetPAction_Target()
  {
    return (EReference)hlScelGetPActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHLScelQueryPAction()
  {
    return hlScelQueryPActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelQueryPAction_Fields()
  {
    return (EReference)hlScelQueryPActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelQueryPAction_Target()
  {
    return (EReference)hlScelQueryPActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHLScelExecAction()
  {
    return hlScelExecActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelExecAction_Arg()
  {
    return (EReference)hlScelExecActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelExecAction_Target()
  {
    return (EReference)hlScelExecActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHLScelCallAction()
  {
    return hlScelCallActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHLScelCallAction_Arg()
  {
    return (EReference)hlScelCallActionEClass.getEStructuralFeatures().get(0);
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

    modelElementEClass = createEClass(MODEL_ELEMENT);
    createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
    createEReference(modelElementEClass, MODEL_ELEMENT__ARGS);

    nodeDeclarationEClass = createEClass(NODE_DECLARATION);

    processDeclarationEClass = createEClass(PROCESS_DECLARATION);
    createEReference(processDeclarationEClass, PROCESS_DECLARATION__BODY);

    hlScelPredicateEClass = createEClass(HL_SCEL_PREDICATE);
    createEReference(hlScelPredicateEClass, HL_SCEL_PREDICATE__EXP);

    selfLiteralEClass = createEClass(SELF_LITERAL);

    hlScelPutActionEClass = createEClass(HL_SCEL_PUT_ACTION);
    createEReference(hlScelPutActionEClass, HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS);
    createEReference(hlScelPutActionEClass, HL_SCEL_PUT_ACTION__TARGET);

    hlScelGetActionEClass = createEClass(HL_SCEL_GET_ACTION);
    createEReference(hlScelGetActionEClass, HL_SCEL_GET_ACTION__FIELDS);
    createEReference(hlScelGetActionEClass, HL_SCEL_GET_ACTION__TARGET);

    hlScelQueryActionEClass = createEClass(HL_SCEL_QUERY_ACTION);
    createEReference(hlScelQueryActionEClass, HL_SCEL_QUERY_ACTION__FIELDS);
    createEReference(hlScelQueryActionEClass, HL_SCEL_QUERY_ACTION__TARGET);

    hlScelGetPActionEClass = createEClass(HL_SCEL_GET_PACTION);
    createEReference(hlScelGetPActionEClass, HL_SCEL_GET_PACTION__FIELDS);
    createEReference(hlScelGetPActionEClass, HL_SCEL_GET_PACTION__TARGET);

    hlScelQueryPActionEClass = createEClass(HL_SCEL_QUERY_PACTION);
    createEReference(hlScelQueryPActionEClass, HL_SCEL_QUERY_PACTION__FIELDS);
    createEReference(hlScelQueryPActionEClass, HL_SCEL_QUERY_PACTION__TARGET);

    hlScelExecActionEClass = createEClass(HL_SCEL_EXEC_ACTION);
    createEReference(hlScelExecActionEClass, HL_SCEL_EXEC_ACTION__ARG);
    createEReference(hlScelExecActionEClass, HL_SCEL_EXEC_ACTION__TARGET);

    hlScelCallActionEClass = createEClass(HL_SCEL_CALL_ACTION);
    createEReference(hlScelCallActionEClass, HL_SCEL_CALL_ACTION__ARG);

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
    nodeDeclarationEClass.getESuperTypes().add(this.getModelElement());
    processDeclarationEClass.getESuperTypes().add(this.getModelElement());
    hlScelPredicateEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    selfLiteralEClass.getESuperTypes().add(theXbasePackage.getXListLiteral());
    hlScelPutActionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    hlScelGetActionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    hlScelQueryActionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    hlScelGetPActionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    hlScelQueryPActionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    hlScelExecActionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    hlScelCallActionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    formalTemplateFieldEClass.getESuperTypes().add(theXbasePackage.getXExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getModelElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelElement_Args(), theTypesPackage.getJvmFormalParameter(), null, "args", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeDeclarationEClass, NodeDeclaration.class, "NodeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(processDeclarationEClass, ProcessDeclaration.class, "ProcessDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcessDeclaration_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, ProcessDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hlScelPredicateEClass, HLScelPredicate.class, "HLScelPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHLScelPredicate_Exp(), theXbasePackage.getXExpression(), null, "exp", null, 0, 1, HLScelPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selfLiteralEClass, SelfLiteral.class, "SelfLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(hlScelPutActionEClass, HLScelPutAction.class, "HLScelPutAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHLScelPutAction_FeatureCallArguments(), theXbasePackage.getXExpression(), null, "featureCallArguments", null, 0, -1, HLScelPutAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHLScelPutAction_Target(), theXbasePackage.getXExpression(), null, "target", null, 0, 1, HLScelPutAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hlScelGetActionEClass, HLScelGetAction.class, "HLScelGetAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHLScelGetAction_Fields(), theXbasePackage.getXExpression(), null, "fields", null, 0, -1, HLScelGetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHLScelGetAction_Target(), theXbasePackage.getXExpression(), null, "target", null, 0, 1, HLScelGetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hlScelQueryActionEClass, HLScelQueryAction.class, "HLScelQueryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHLScelQueryAction_Fields(), theXbasePackage.getXExpression(), null, "fields", null, 0, -1, HLScelQueryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHLScelQueryAction_Target(), theXbasePackage.getXExpression(), null, "target", null, 0, 1, HLScelQueryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hlScelGetPActionEClass, HLScelGetPAction.class, "HLScelGetPAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHLScelGetPAction_Fields(), theXbasePackage.getXExpression(), null, "fields", null, 0, -1, HLScelGetPAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHLScelGetPAction_Target(), theXbasePackage.getXExpression(), null, "target", null, 0, 1, HLScelGetPAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hlScelQueryPActionEClass, HLScelQueryPAction.class, "HLScelQueryPAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHLScelQueryPAction_Fields(), theXbasePackage.getXExpression(), null, "fields", null, 0, -1, HLScelQueryPAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHLScelQueryPAction_Target(), theXbasePackage.getXExpression(), null, "target", null, 0, 1, HLScelQueryPAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hlScelExecActionEClass, HLScelExecAction.class, "HLScelExecAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHLScelExecAction_Arg(), theXbasePackage.getXExpression(), null, "arg", null, 0, 1, HLScelExecAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHLScelExecAction_Target(), theXbasePackage.getXExpression(), null, "target", null, 0, 1, HLScelExecAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hlScelCallActionEClass, HLScelCallAction.class, "HLScelCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHLScelCallAction_Arg(), theXbasePackage.getXExpression(), null, "arg", null, 0, 1, HLScelCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formalTemplateFieldEClass, FormalTemplateField.class, "FormalTemplateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormalTemplateField_Reference(), theXbasePackage.getXExpression(), null, "reference", null, 0, 1, FormalTemplateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //HLScelPackageImpl
