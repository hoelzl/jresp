/**
 */
package org.cmg.resp.xtext.hlscel.hLScel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelFactory
 * @model kind="package"
 * @generated
 */
public interface HLScelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "hLScel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cmg.org/resp/xtext/hlscel/HLScel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "hLScel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HLScelPackage eINSTANCE = org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.ModelImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.ModelElementImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT__ARGS = 1;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.NodeDeclarationImpl <em>Node Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.NodeDeclarationImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getNodeDeclaration()
   * @generated
   */
  int NODE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DECLARATION__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DECLARATION__ARGS = MODEL_ELEMENT__ARGS;

  /**
   * The number of structural features of the '<em>Node Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DECLARATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.ProcessDeclarationImpl <em>Process Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.ProcessDeclarationImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getProcessDeclaration()
   * @generated
   */
  int PROCESS_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECLARATION__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECLARATION__ARGS = MODEL_ELEMENT__ARGS;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECLARATION__BODY = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Process Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECLARATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPredicateImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelPredicate()
   * @generated
   */
  int HL_SCEL_PREDICATE = 4;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_PREDICATE__EXP = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_PREDICATE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.SelfLiteralImpl <em>Self Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.SelfLiteralImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getSelfLiteral()
   * @generated
   */
  int SELF_LITERAL = 5;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_LITERAL__ELEMENTS = XbasePackage.XLIST_LITERAL__ELEMENTS;

  /**
   * The number of structural features of the '<em>Self Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_LITERAL_FEATURE_COUNT = XbasePackage.XLIST_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPutActionImpl <em>Put Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPutActionImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelPutAction()
   * @generated
   */
  int HL_SCEL_PUT_ACTION = 6;

  /**
   * The feature id for the '<em><b>Feature Call Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_PUT_ACTION__TARGET = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Put Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_PUT_ACTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelGetActionImpl <em>Get Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelGetActionImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelGetAction()
   * @generated
   */
  int HL_SCEL_GET_ACTION = 7;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_GET_ACTION__FIELDS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_GET_ACTION__TARGET = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Get Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_GET_ACTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelQueryActionImpl <em>Query Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelQueryActionImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelQueryAction()
   * @generated
   */
  int HL_SCEL_QUERY_ACTION = 8;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_QUERY_ACTION__FIELDS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_QUERY_ACTION__TARGET = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Query Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_QUERY_ACTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelGetPActionImpl <em>Get PAction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelGetPActionImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelGetPAction()
   * @generated
   */
  int HL_SCEL_GET_PACTION = 9;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_GET_PACTION__FIELDS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_GET_PACTION__TARGET = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Get PAction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_GET_PACTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelQueryPActionImpl <em>Query PAction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelQueryPActionImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelQueryPAction()
   * @generated
   */
  int HL_SCEL_QUERY_PACTION = 10;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_QUERY_PACTION__FIELDS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_QUERY_PACTION__TARGET = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Query PAction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_QUERY_PACTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelExecActionImpl <em>Exec Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelExecActionImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelExecAction()
   * @generated
   */
  int HL_SCEL_EXEC_ACTION = 11;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_EXEC_ACTION__ARG = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_EXEC_ACTION__TARGET = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exec Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_EXEC_ACTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelCallActionImpl <em>Call Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelCallActionImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelCallAction()
   * @generated
   */
  int HL_SCEL_CALL_ACTION = 12;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_CALL_ACTION__ARG = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Call Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_CALL_ACTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.FormalTemplateFieldImpl <em>Formal Template Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.FormalTemplateFieldImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getFormalTemplateField()
   * @generated
   */
  int FORMAL_TEMPLATE_FIELD = 13;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_TEMPLATE_FIELD__REFERENCE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Formal Template Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_TEMPLATE_FIELD_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.hlscel.hLScel.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.hlscel.hLScel.ModelElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.ModelElement#getName()
   * @see #getModelElement()
   * @generated
   */
  EAttribute getModelElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.hlscel.hLScel.ModelElement#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.ModelElement#getArgs()
   * @see #getModelElement()
   * @generated
   */
  EReference getModelElement_Args();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.NodeDeclaration <em>Node Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Declaration</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.NodeDeclaration
   * @generated
   */
  EClass getNodeDeclaration();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration <em>Process Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Declaration</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration
   * @generated
   */
  EClass getProcessDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration#getBody()
   * @see #getProcessDeclaration()
   * @generated
   */
  EReference getProcessDeclaration_Body();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPredicate
   * @generated
   */
  EClass getHLScelPredicate();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelPredicate#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPredicate#getExp()
   * @see #getHLScelPredicate()
   * @generated
   */
  EReference getHLScelPredicate_Exp();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.SelfLiteral <em>Self Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Literal</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.SelfLiteral
   * @generated
   */
  EClass getSelfLiteral();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction <em>Put Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Put Action</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction
   * @generated
   */
  EClass getHLScelPutAction();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction#getFeatureCallArguments <em>Feature Call Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature Call Arguments</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction#getFeatureCallArguments()
   * @see #getHLScelPutAction()
   * @generated
   */
  EReference getHLScelPutAction_FeatureCallArguments();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction#getTarget()
   * @see #getHLScelPutAction()
   * @generated
   */
  EReference getHLScelPutAction_Target();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelGetAction <em>Get Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Action</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelGetAction
   * @generated
   */
  EClass getHLScelGetAction();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelGetAction#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelGetAction#getFields()
   * @see #getHLScelGetAction()
   * @generated
   */
  EReference getHLScelGetAction_Fields();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelGetAction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelGetAction#getTarget()
   * @see #getHLScelGetAction()
   * @generated
   */
  EReference getHLScelGetAction_Target();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryAction <em>Query Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Action</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryAction
   * @generated
   */
  EClass getHLScelQueryAction();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryAction#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryAction#getFields()
   * @see #getHLScelQueryAction()
   * @generated
   */
  EReference getHLScelQueryAction_Fields();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryAction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryAction#getTarget()
   * @see #getHLScelQueryAction()
   * @generated
   */
  EReference getHLScelQueryAction_Target();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelGetPAction <em>Get PAction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get PAction</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelGetPAction
   * @generated
   */
  EClass getHLScelGetPAction();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelGetPAction#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelGetPAction#getFields()
   * @see #getHLScelGetPAction()
   * @generated
   */
  EReference getHLScelGetPAction_Fields();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelGetPAction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelGetPAction#getTarget()
   * @see #getHLScelGetPAction()
   * @generated
   */
  EReference getHLScelGetPAction_Target();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryPAction <em>Query PAction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query PAction</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryPAction
   * @generated
   */
  EClass getHLScelQueryPAction();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryPAction#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryPAction#getFields()
   * @see #getHLScelQueryPAction()
   * @generated
   */
  EReference getHLScelQueryPAction_Fields();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryPAction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryPAction#getTarget()
   * @see #getHLScelQueryPAction()
   * @generated
   */
  EReference getHLScelQueryPAction_Target();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction <em>Exec Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec Action</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction
   * @generated
   */
  EClass getHLScelExecAction();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction#getArg()
   * @see #getHLScelExecAction()
   * @generated
   */
  EReference getHLScelExecAction_Arg();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction#getTarget()
   * @see #getHLScelExecAction()
   * @generated
   */
  EReference getHLScelExecAction_Target();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelCallAction <em>Call Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Action</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelCallAction
   * @generated
   */
  EClass getHLScelCallAction();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelCallAction#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelCallAction#getArg()
   * @see #getHLScelCallAction()
   * @generated
   */
  EReference getHLScelCallAction_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.FormalTemplateField <em>Formal Template Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Template Field</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.FormalTemplateField
   * @generated
   */
  EClass getFormalTemplateField();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.FormalTemplateField#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.FormalTemplateField#getReference()
   * @see #getFormalTemplateField()
   * @generated
   */
  EReference getFormalTemplateField_Reference();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HLScelFactory getHLScelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.ModelImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.ModelElementImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_ELEMENT__ARGS = eINSTANCE.getModelElement_Args();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.NodeDeclarationImpl <em>Node Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.NodeDeclarationImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getNodeDeclaration()
     * @generated
     */
    EClass NODE_DECLARATION = eINSTANCE.getNodeDeclaration();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.ProcessDeclarationImpl <em>Process Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.ProcessDeclarationImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getProcessDeclaration()
     * @generated
     */
    EClass PROCESS_DECLARATION = eINSTANCE.getProcessDeclaration();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_DECLARATION__BODY = eINSTANCE.getProcessDeclaration_Body();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPredicateImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelPredicate()
     * @generated
     */
    EClass HL_SCEL_PREDICATE = eINSTANCE.getHLScelPredicate();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_PREDICATE__EXP = eINSTANCE.getHLScelPredicate_Exp();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.SelfLiteralImpl <em>Self Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.SelfLiteralImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getSelfLiteral()
     * @generated
     */
    EClass SELF_LITERAL = eINSTANCE.getSelfLiteral();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPutActionImpl <em>Put Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPutActionImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelPutAction()
     * @generated
     */
    EClass HL_SCEL_PUT_ACTION = eINSTANCE.getHLScelPutAction();

    /**
     * The meta object literal for the '<em><b>Feature Call Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS = eINSTANCE.getHLScelPutAction_FeatureCallArguments();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_PUT_ACTION__TARGET = eINSTANCE.getHLScelPutAction_Target();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelGetActionImpl <em>Get Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelGetActionImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelGetAction()
     * @generated
     */
    EClass HL_SCEL_GET_ACTION = eINSTANCE.getHLScelGetAction();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_GET_ACTION__FIELDS = eINSTANCE.getHLScelGetAction_Fields();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_GET_ACTION__TARGET = eINSTANCE.getHLScelGetAction_Target();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelQueryActionImpl <em>Query Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelQueryActionImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelQueryAction()
     * @generated
     */
    EClass HL_SCEL_QUERY_ACTION = eINSTANCE.getHLScelQueryAction();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_QUERY_ACTION__FIELDS = eINSTANCE.getHLScelQueryAction_Fields();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_QUERY_ACTION__TARGET = eINSTANCE.getHLScelQueryAction_Target();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelGetPActionImpl <em>Get PAction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelGetPActionImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelGetPAction()
     * @generated
     */
    EClass HL_SCEL_GET_PACTION = eINSTANCE.getHLScelGetPAction();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_GET_PACTION__FIELDS = eINSTANCE.getHLScelGetPAction_Fields();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_GET_PACTION__TARGET = eINSTANCE.getHLScelGetPAction_Target();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelQueryPActionImpl <em>Query PAction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelQueryPActionImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelQueryPAction()
     * @generated
     */
    EClass HL_SCEL_QUERY_PACTION = eINSTANCE.getHLScelQueryPAction();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_QUERY_PACTION__FIELDS = eINSTANCE.getHLScelQueryPAction_Fields();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_QUERY_PACTION__TARGET = eINSTANCE.getHLScelQueryPAction_Target();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelExecActionImpl <em>Exec Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelExecActionImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelExecAction()
     * @generated
     */
    EClass HL_SCEL_EXEC_ACTION = eINSTANCE.getHLScelExecAction();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_EXEC_ACTION__ARG = eINSTANCE.getHLScelExecAction_Arg();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_EXEC_ACTION__TARGET = eINSTANCE.getHLScelExecAction_Target();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelCallActionImpl <em>Call Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelCallActionImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHLScelCallAction()
     * @generated
     */
    EClass HL_SCEL_CALL_ACTION = eINSTANCE.getHLScelCallAction();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HL_SCEL_CALL_ACTION__ARG = eINSTANCE.getHLScelCallAction_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.FormalTemplateFieldImpl <em>Formal Template Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.FormalTemplateFieldImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getFormalTemplateField()
     * @generated
     */
    EClass FORMAL_TEMPLATE_FIELD = eINSTANCE.getFormalTemplateField();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_TEMPLATE_FIELD__REFERENCE = eINSTANCE.getFormalTemplateField_Reference();

  }

} //HLScelPackage
