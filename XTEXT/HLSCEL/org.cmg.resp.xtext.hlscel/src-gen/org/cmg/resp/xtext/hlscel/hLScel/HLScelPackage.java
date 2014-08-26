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
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.ProcessDeclarationImpl <em>Process Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.ProcessDeclarationImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getProcessDeclaration()
   * @generated
   */
  int PROCESS_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECLARATION__ARGS = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECLARATION__BODY = 2;

  /**
   * The number of structural features of the '<em>Process Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.SelfLiteralImpl <em>Self Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.SelfLiteralImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getSelfLiteral()
   * @generated
   */
  int SELF_LITERAL = 2;

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
  int HL_SCEL_PUT_ACTION = 3;

  /**
   * The feature id for the '<em><b>Feature Call Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Put Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HL_SCEL_PUT_ACTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HScelGetActionImpl <em>HScel Get Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HScelGetActionImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHScelGetAction()
   * @generated
   */
  int HSCEL_GET_ACTION = 4;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSCEL_GET_ACTION__FIELDS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSCEL_GET_ACTION__TARGET = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>HScel Get Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSCEL_GET_ACTION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.FormalTemplateFieldImpl <em>Formal Template Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.FormalTemplateFieldImpl
   * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getFormalTemplateField()
   * @generated
   */
  int FORMAL_TEMPLATE_FIELD = 5;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
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
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration <em>Process Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Declaration</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration
   * @generated
   */
  EClass getProcessDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration#getName()
   * @see #getProcessDeclaration()
   * @generated
   */
  EAttribute getProcessDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration#getArgs()
   * @see #getProcessDeclaration()
   * @generated
   */
  EReference getProcessDeclaration_Args();

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
   * Returns the meta object for class '{@link org.cmg.resp.xtext.hlscel.hLScel.HScelGetAction <em>HScel Get Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HScel Get Action</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HScelGetAction
   * @generated
   */
  EClass getHScelGetAction();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.hlscel.hLScel.HScelGetAction#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HScelGetAction#getFields()
   * @see #getHScelGetAction()
   * @generated
   */
  EReference getHScelGetAction_Fields();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.hlscel.hLScel.HScelGetAction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HScelGetAction#getTarget()
   * @see #getHScelGetAction()
   * @generated
   */
  EReference getHScelGetAction_Target();

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
   * Returns the meta object for the reference '{@link org.cmg.resp.xtext.hlscel.hLScel.FormalTemplateField#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
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
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.ProcessDeclarationImpl <em>Process Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.ProcessDeclarationImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getProcessDeclaration()
     * @generated
     */
    EClass PROCESS_DECLARATION = eINSTANCE.getProcessDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS_DECLARATION__NAME = eINSTANCE.getProcessDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_DECLARATION__ARGS = eINSTANCE.getProcessDeclaration_Args();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_DECLARATION__BODY = eINSTANCE.getProcessDeclaration_Body();

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
     * The meta object literal for the '{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HScelGetActionImpl <em>HScel Get Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HScelGetActionImpl
     * @see org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPackageImpl#getHScelGetAction()
     * @generated
     */
    EClass HSCEL_GET_ACTION = eINSTANCE.getHScelGetAction();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HSCEL_GET_ACTION__FIELDS = eINSTANCE.getHScelGetAction_Fields();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HSCEL_GET_ACTION__TARGET = eINSTANCE.getHScelGetAction_Target();

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
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_TEMPLATE_FIELD__REFERENCE = eINSTANCE.getFormalTemplateField_Reference();

  }

} //HLScelPackage
