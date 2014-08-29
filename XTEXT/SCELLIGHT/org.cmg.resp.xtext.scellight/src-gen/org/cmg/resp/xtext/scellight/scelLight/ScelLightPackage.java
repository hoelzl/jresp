/**
 */
package org.cmg.resp.xtext.scellight.scelLight;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightFactory
 * @model kind="package"
 * @generated
 */
public interface ScelLightPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "scelLight";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cmg.org/resp/xtext/scellight/ScelLight";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "scelLight";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScelLightPackage eINSTANCE = org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl.init();

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ModelImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONSTANTS = 0;

  /**
   * The feature id for the '<em><b>Projections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROJECTIONS = 1;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FUNCTIONS = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ATTRIBUTES = 3;

  /**
   * The feature id for the '<em><b>Processes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROCESSES = 4;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMPONENTS = 5;

  /**
   * The feature id for the '<em><b>Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SYSTEMS = 6;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ReferenceableElementsImpl <em>Referenceable Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ReferenceableElementsImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getReferenceableElements()
   * @generated
   */
  int REFERENCEABLE_ELEMENTS = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCEABLE_ELEMENTS__NAME = 0;

  /**
   * The number of structural features of the '<em>Referenceable Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCEABLE_ELEMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.AttributeDeclarationImpl <em>Attribute Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.AttributeDeclarationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getAttributeDeclaration()
   * @generated
   */
  int ATTRIBUTE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DECLARATION__NAME = REFERENCEABLE_ELEMENTS__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DECLARATION__TYPE = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DECLARATION_FEATURE_COUNT = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ProjectionDeclarationImpl <em>Projection Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ProjectionDeclarationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getProjectionDeclaration()
   * @generated
   */
  int PROJECTION_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_DECLARATION__NAME = REFERENCEABLE_ELEMENTS__NAME;

  /**
   * The feature id for the '<em><b>Projection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_DECLARATION__PROJECTION = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Projection Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_DECLARATION_FEATURE_COUNT = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ProjectionExpressionImpl <em>Projection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ProjectionExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getProjectionExpression()
   * @generated
   */
  int PROJECTION_EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_EXPRESSION__TEMPLATE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_EXPRESSION__VALUE = 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_EXPRESSION__DEFAULT = 2;

  /**
   * The number of structural features of the '<em>Projection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ConstantDeclarationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getConstantDeclaration()
   * @generated
   */
  int CONSTANT_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__NAME = REFERENCEABLE_ELEMENTS__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__TYPE = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__VALUE = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION_FEATURE_COUNT = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ComponentDeclarationImpl <em>Component Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ComponentDeclarationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getComponentDeclaration()
   * @generated
   */
  int COMPONENT_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION__COMPONENT = 2;

  /**
   * The number of structural features of the '<em>Component Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ComponentExpressionImpl <em>Component Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ComponentExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getComponentExpression()
   * @generated
   */
  int COMPONENT_EXPRESSION = 6;

  /**
   * The number of structural features of the '<em>Component Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ComponentReferenceImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getComponentReference()
   * @generated
   */
  int COMPONENT_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REFERENCE__REFERENCE = COMPONENT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REFERENCE__ARGUMENTS = COMPONENT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Component Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REFERENCE_FEATURE_COUNT = COMPONENT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ComponentConstantImpl <em>Component Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ComponentConstantImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getComponentConstant()
   * @generated
   */
  int COMPONENT_CONSTANT = 8;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CONSTANT__INTERFACE = COMPONENT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Knowledge</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CONSTANT__KNOWLEDGE = COMPONENT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Processes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CONSTANT__PROCESSES = COMPONENT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Component Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_CONSTANT_FEATURE_COUNT = COMPONENT_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.CommandImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 18;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ProcessExpressionImpl <em>Process Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ProcessExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getProcessExpression()
   * @generated
   */
  int PROCESS_EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Process Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_EXPRESSION_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.KnowledgeImpl <em>Knowledge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.KnowledgeImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getKnowledge()
   * @generated
   */
  int KNOWLEDGE = 10;

  /**
   * The feature id for the '<em><b>Tuples</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWLEDGE__TUPLES = 0;

  /**
   * The number of structural features of the '<em>Knowledge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWLEDGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.InterfaceImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 11;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.IdAttributeDefinitionImpl <em>Id Attribute Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.IdAttributeDefinitionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getIdAttributeDefinition()
   * @generated
   */
  int ID_ATTRIBUTE_DEFINITION = 12;

  /**
   * The feature id for the '<em><b>Component Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ATTRIBUTE_DEFINITION__COMPONENT_ID = 0;

  /**
   * The number of structural features of the '<em>Id Attribute Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ATTRIBUTE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.AttributeInstantiationImpl <em>Attribute Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.AttributeInstantiationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getAttributeInstantiation()
   * @generated
   */
  int ATTRIBUTE_INSTANTIATION = 13;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_INSTANTIATION__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_INSTANTIATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_INSTANTIATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.FunctionDeclarationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = REFERENCEABLE_ELEMENTS__NAME;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__RETURN_TYPE = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__PARAMETERS = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__BODY = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ProcessDeclarationImpl <em>Process Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ProcessDeclarationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getProcessDeclaration()
   * @generated
   */
  int PROCESS_DECLARATION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_DECLARATION__PARAMETERS = 1;

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
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.VariableImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = REFERENCEABLE_ELEMENTS__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = REFERENCEABLE_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.VariableDeclarationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 19;

  /**
   * The feature id for the '<em><b>Declared Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__DECLARED_VARIABLE = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__INIT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ActionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getAction()
   * @generated
   */
  int ACTION = 20;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ReplaceActionImpl <em>Replace Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ReplaceActionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getReplaceAction()
   * @generated
   */
  int REPLACE_ACTION = 21;

  /**
   * The feature id for the '<em><b>Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACE_ACTION__TEMPLATE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACE_ACTION__TUPLE = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Replace Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.GetActionImpl <em>Get Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.GetActionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getGetAction()
   * @generated
   */
  int GET_ACTION = 22;

  /**
   * The feature id for the '<em><b>Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ACTION__TEMPLATE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ACTION__TARGET = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Get Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.QueryActionImpl <em>Query Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.QueryActionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getQueryAction()
   * @generated
   */
  int QUERY_ACTION = 23;

  /**
   * The feature id for the '<em><b>Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ACTION__TEMPLATE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ACTION__TARGET = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Query Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.PutActionImpl <em>Put Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.PutActionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getPutAction()
   * @generated
   */
  int PUT_ACTION = 24;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUT_ACTION__TUPLE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUT_ACTION__TARGET = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Put Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ExecActionImpl <em>Exec Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ExecActionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getExecAction()
   * @generated
   */
  int EXEC_ACTION = 25;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_ACTION__ARG = 0;

  /**
   * The number of structural features of the '<em>Exec Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TupleImpl <em>Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.TupleImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTuple()
   * @generated
   */
  int TUPLE = 26;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE__FIELDS = 0;

  /**
   * The number of structural features of the '<em>Tuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TemplateImpl <em>Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.TemplateImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTemplate()
   * @generated
   */
  int TEMPLATE = 27;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__FIELDS = 0;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TemplateFieldImpl <em>Template Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.TemplateFieldImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTemplateField()
   * @generated
   */
  int TEMPLATE_FIELD = 28;

  /**
   * The number of structural features of the '<em>Template Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FIELD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.AnyFormalFieldImpl <em>Any Formal Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.AnyFormalFieldImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getAnyFormalField()
   * @generated
   */
  int ANY_FORMAL_FIELD = 29;

  /**
   * The number of structural features of the '<em>Any Formal Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_FORMAL_FIELD_FEATURE_COUNT = TEMPLATE_FIELD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TypedFormalFieldImpl <em>Typed Formal Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.TypedFormalFieldImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTypedFormalField()
   * @generated
   */
  int TYPED_FORMAL_FIELD = 30;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_FORMAL_FIELD__TYPE = TEMPLATE_FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Typed Formal Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_FORMAL_FIELD_FEATURE_COUNT = TEMPLATE_FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FormalFieldImpl <em>Formal Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.FormalFieldImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFormalField()
   * @generated
   */
  int FORMAL_FIELD = 31;

  /**
   * The number of structural features of the '<em>Formal Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_FIELD_FEATURE_COUNT = TEMPLATE_FIELD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ActualFieldImpl <em>Actual Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ActualFieldImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getActualField()
   * @generated
   */
  int ACTUAL_FIELD = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_FIELD__VALUE = TEMPLATE_FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Actual Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_FIELD_FEATURE_COUNT = TEMPLATE_FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.WhileImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 33;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__GUARD = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__BODY = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.IfThenElseImpl <em>If Then Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.IfThenElseImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getIfThenElse()
   * @generated
   */
  int IF_THEN_ELSE = 34;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__GUARD = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__THEN_BRANCH = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__ELSE_BRANCH = COMMAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Then Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.BlockImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 35;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__COMMANDS = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 36;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.SelfExpressionImpl <em>Self Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.SelfExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getSelfExpression()
   * @generated
   */
  int SELF_EXPRESSION = 37;

  /**
   * The number of structural features of the '<em>Self Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.IdAttributeImpl <em>Id Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.IdAttributeImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getIdAttribute()
   * @generated
   */
  int ID_ATTRIBUTE = 38;

  /**
   * The number of structural features of the '<em>Id Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.StringLiteralImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 39;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ReferenceImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 40;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.NumberLiteralImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 41;

  /**
   * The feature id for the '<em><b>Intpart</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__INTPART = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__IS_DOUBLE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Decimal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__DECIMAL = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FactorialExpressionImpl <em>Factorial Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.FactorialExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFactorialExpression()
   * @generated
   */
  int FACTORIAL_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTORIAL_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Factorial Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTORIAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.LogExpressionImpl <em>Log Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.LogExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getLogExpression()
   * @generated
   */
  int LOG_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Log Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ModExpressionImpl <em>Mod Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ModExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getModExpression()
   * @generated
   */
  int MOD_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mod</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__MOD = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mod Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.PowExpressionImpl <em>Pow Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.PowExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getPowExpression()
   * @generated
   */
  int POW_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_EXPRESSION__BASE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_EXPRESSION__EXP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pow Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FloorExpressionImpl <em>Floor Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.FloorExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFloorExpression()
   * @generated
   */
  int FLOOR_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOOR_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Floor Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.CeilExpressionImpl <em>Ceil Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.CeilExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getCeilExpression()
   * @generated
   */
  int CEIL_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEIL_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ceil Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEIL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.MinExpressionImpl <em>Min Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.MinExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getMinExpression()
   * @generated
   */
  int MIN_EXPRESSION = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Min Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.MaxExpressionImpl <em>Max Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.MaxExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getMaxExpression()
   * @generated
   */
  int MAX_EXPRESSION = 49;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Max Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.SinExpressionImpl <em>Sin Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.SinExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getSinExpression()
   * @generated
   */
  int SIN_EXPRESSION = 50;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIN_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sin Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.CosExpressionImpl <em>Cos Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.CosExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getCosExpression()
   * @generated
   */
  int COS_EXPRESSION = 51;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COS_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Cos Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TanExpressionImpl <em>Tan Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.TanExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTanExpression()
   * @generated
   */
  int TAN_EXPRESSION = 52;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAN_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tan Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ATanExpressionImpl <em>ATan Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ATanExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getATanExpression()
   * @generated
   */
  int ATAN_EXPRESSION = 53;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATAN_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ATan Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ASinExpressionImpl <em>ASin Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ASinExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getASinExpression()
   * @generated
   */
  int ASIN_EXPRESSION = 54;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIN_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ASin Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASIN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ACosExpressionImpl <em>ACos Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ACosExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getACosExpression()
   * @generated
   */
  int ACOS_EXPRESSION = 55;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOS_EXPRESSION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ACos Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.SystemDeclarationImpl <em>System Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.SystemDeclarationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getSystemDeclaration()
   * @generated
   */
  int SYSTEM_DECLARATION = 56;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DECLARATION__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>System Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ProcessReferenceImpl <em>Process Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ProcessReferenceImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getProcessReference()
   * @generated
   */
  int PROCESS_REFERENCE = 57;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_REFERENCE__REFERENCE = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_REFERENCE__ARGUMENTS = PROCESS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Process Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_REFERENCE_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.EmptyProcessImpl <em>Empty Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.EmptyProcessImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getEmptyProcess()
   * @generated
   */
  int EMPTY_PROCESS = 58;

  /**
   * The number of structural features of the '<em>Empty Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_PROCESS_FEATURE_COUNT = PROCESS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.StandardFormalFieldImpl <em>Standard Formal Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.StandardFormalFieldImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getStandardFormalField()
   * @generated
   */
  int STANDARD_FORMAL_FIELD = 59;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STANDARD_FORMAL_FIELD__REFERENCE = FORMAL_FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Standard Formal Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STANDARD_FORMAL_FIELD_FEATURE_COUNT = FORMAL_FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FormalFieldWithDeclarationImpl <em>Formal Field With Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.FormalFieldWithDeclarationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFormalFieldWithDeclaration()
   * @generated
   */
  int FORMAL_FIELD_WITH_DECLARATION = 60;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_FIELD_WITH_DECLARATION__VARIABLE = FORMAL_FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Formal Field With Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_FIELD_WITH_DECLARATION_FEATURE_COUNT = FORMAL_FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.DisjunctionImpl <em>Disjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.DisjunctionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getDisjunction()
   * @generated
   */
  int DISJUNCTION = 61;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Disjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ConjunctionImpl <em>Conjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ConjunctionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getConjunction()
   * @generated
   */
  int CONJUNCTION = 62;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Conjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.NegationImpl <em>Negation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.NegationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getNegation()
   * @generated
   */
  int NEGATION = 63;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__ARG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Negation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.RelationImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 64;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__REL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.SummationSubtractionImpl <em>Summation Subtraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.SummationSubtractionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getSummationSubtraction()
   * @generated
   */
  int SUMMATION_SUBTRACTION = 65;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMATION_SUBTRACTION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMATION_SUBTRACTION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMATION_SUBTRACTION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Summation Subtraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMATION_SUBTRACTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.MultiplicationDivisionImpl <em>Multiplication Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.MultiplicationDivisionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getMultiplicationDivision()
   * @generated
   */
  int MULTIPLICATION_DIVISION = 66;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_DIVISION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_DIVISION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_DIVISION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Multiplication Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TrueExpressionImpl <em>True Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.TrueExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTrueExpression()
   * @generated
   */
  int TRUE_EXPRESSION = 67;

  /**
   * The number of structural features of the '<em>True Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FalseExpressionImpl <em>False Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.FalseExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFalseExpression()
   * @generated
   */
  int FALSE_EXPRESSION = 68;

  /**
   * The number of structural features of the '<em>False Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALSE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.IfThenElseExpressionImpl <em>If Then Else Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.IfThenElseExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getIfThenElseExpression()
   * @generated
   */
  int IF_THEN_ELSE_EXPRESSION = 69;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPRESSION__GUARD = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPRESSION__THEN_BRANCH = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Then Else Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.IdExpressionImpl <em>Id Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.IdExpressionImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getIdExpression()
   * @generated
   */
  int ID_EXPRESSION = 70;

  /**
   * The number of structural features of the '<em>Id Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_EXPRESSION_FEATURE_COUNT = ID_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.CallImpl
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getCall()
   * @generated
   */
  int CALL = 71;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__ARGS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.Type <em>Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.Type
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getType()
   * @generated
   */
  int TYPE = 72;

  /**
   * The meta object id for the '{@link org.cmg.resp.xtext.scellight.scelLight.RelationSymbol <em>Relation Symbol</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cmg.resp.xtext.scellight.scelLight.RelationSymbol
   * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getRelationSymbol()
   * @generated
   */
  int RELATION_SYMBOL = 73;


  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Model#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Model#getConstants()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Constants();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Model#getProjections <em>Projections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projections</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Model#getProjections()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Projections();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Model#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Model#getFunctions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Model#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Model#getAttributes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Model#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processes</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Model#getProcesses()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Processes();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Model#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Model#getComponents()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Components();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Model#getSystems <em>Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Systems</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Model#getSystems()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Systems();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.AttributeDeclaration <em>Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Declaration</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.AttributeDeclaration
   * @generated
   */
  EClass getAttributeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.AttributeDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.AttributeDeclaration#getType()
   * @see #getAttributeDeclaration()
   * @generated
   */
  EAttribute getAttributeDeclaration_Type();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration <em>Projection Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Projection Declaration</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration
   * @generated
   */
  EClass getProjectionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration#getProjection <em>Projection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Projection</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration#getProjection()
   * @see #getProjectionDeclaration()
   * @generated
   */
  EReference getProjectionDeclaration_Projection();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression <em>Projection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Projection Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression
   * @generated
   */
  EClass getProjectionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression#getTemplate()
   * @see #getProjectionExpression()
   * @generated
   */
  EReference getProjectionExpression_Template();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression#getValue()
   * @see #getProjectionExpression()
   * @generated
   */
  EReference getProjectionExpression_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression#getDefault()
   * @see #getProjectionExpression()
   * @generated
   */
  EReference getProjectionExpression_Default();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration <em>Constant Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Declaration</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration
   * @generated
   */
  EClass getConstantDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration#getType()
   * @see #getConstantDeclaration()
   * @generated
   */
  EAttribute getConstantDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration#getValue()
   * @see #getConstantDeclaration()
   * @generated
   */
  EReference getConstantDeclaration_Value();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration <em>Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Declaration</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration
   * @generated
   */
  EClass getComponentDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration#getName()
   * @see #getComponentDeclaration()
   * @generated
   */
  EAttribute getComponentDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration#getParameters()
   * @see #getComponentDeclaration()
   * @generated
   */
  EReference getComponentDeclaration_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration#getComponent()
   * @see #getComponentDeclaration()
   * @generated
   */
  EReference getComponentDeclaration_Component();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentExpression <em>Component Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentExpression
   * @generated
   */
  EClass getComponentExpression();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentReference <em>Component Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Reference</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentReference
   * @generated
   */
  EClass getComponentReference();

  /**
   * Returns the meta object for the reference '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentReference#getReference()
   * @see #getComponentReference()
   * @generated
   */
  EReference getComponentReference_Reference();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentReference#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentReference#getArguments()
   * @see #getComponentReference()
   * @generated
   */
  EReference getComponentReference_Arguments();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentConstant <em>Component Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Constant</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentConstant
   * @generated
   */
  EClass getComponentConstant();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentConstant#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentConstant#getInterface()
   * @see #getComponentConstant()
   * @generated
   */
  EReference getComponentConstant_Interface();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentConstant#getKnowledge <em>Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Knowledge</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentConstant#getKnowledge()
   * @see #getComponentConstant()
   * @generated
   */
  EReference getComponentConstant_Knowledge();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentConstant#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processes</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ComponentConstant#getProcesses()
   * @see #getComponentConstant()
   * @generated
   */
  EReference getComponentConstant_Processes();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ProcessExpression <em>Process Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProcessExpression
   * @generated
   */
  EClass getProcessExpression();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Knowledge <em>Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Knowledge</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Knowledge
   * @generated
   */
  EClass getKnowledge();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Knowledge#getTuples <em>Tuples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tuples</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Knowledge#getTuples()
   * @see #getKnowledge()
   * @generated
   */
  EReference getKnowledge_Tuples();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Interface#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Interface#getAttributes()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Attributes();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.IdAttributeDefinition <em>Id Attribute Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Attribute Definition</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IdAttributeDefinition
   * @generated
   */
  EClass getIdAttributeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.IdAttributeDefinition#getComponentId <em>Component Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Id</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IdAttributeDefinition#getComponentId()
   * @see #getIdAttributeDefinition()
   * @generated
   */
  EAttribute getIdAttributeDefinition_ComponentId();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation <em>Attribute Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Instantiation</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation
   * @generated
   */
  EClass getAttributeInstantiation();

  /**
   * Returns the meta object for the reference '{@link org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation#getAttribute()
   * @see #getAttributeInstantiation()
   * @generated
   */
  EReference getAttributeInstantiation_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation#getValue()
   * @see #getAttributeInstantiation()
   * @generated
   */
  EReference getAttributeInstantiation_Value();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Declaration</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration
   * @generated
   */
  EClass getFunctionDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration#getReturnType()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration#getParameters()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration#getBody()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Body();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration <em>Process Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Declaration</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration
   * @generated
   */
  EClass getProcessDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration#getName()
   * @see #getProcessDeclaration()
   * @generated
   */
  EAttribute getProcessDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration#getParameters()
   * @see #getProcessDeclaration()
   * @generated
   */
  EReference getProcessDeclaration_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration#getBody()
   * @see #getProcessDeclaration()
   * @generated
   */
  EReference getProcessDeclaration_Body();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.Variable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Variable#getType()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Type();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ReferenceableElements <em>Referenceable Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenceable Elements</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ReferenceableElements
   * @generated
   */
  EClass getReferenceableElements();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.ReferenceableElements#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ReferenceableElements#getName()
   * @see #getReferenceableElements()
   * @generated
   */
  EAttribute getReferenceableElements_Name();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration#getDeclaredVariable <em>Declared Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declared Variable</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration#getDeclaredVariable()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_DeclaredVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration#getInit()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Init();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ReplaceAction <em>Replace Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Replace Action</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ReplaceAction
   * @generated
   */
  EClass getReplaceAction();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ReplaceAction#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ReplaceAction#getTemplate()
   * @see #getReplaceAction()
   * @generated
   */
  EReference getReplaceAction_Template();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ReplaceAction#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ReplaceAction#getTuple()
   * @see #getReplaceAction()
   * @generated
   */
  EReference getReplaceAction_Tuple();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.GetAction <em>Get Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Action</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.GetAction
   * @generated
   */
  EClass getGetAction();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.GetAction#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.GetAction#getTemplate()
   * @see #getGetAction()
   * @generated
   */
  EReference getGetAction_Template();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.GetAction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.GetAction#getTarget()
   * @see #getGetAction()
   * @generated
   */
  EReference getGetAction_Target();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.QueryAction <em>Query Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Action</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.QueryAction
   * @generated
   */
  EClass getQueryAction();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.QueryAction#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.QueryAction#getTemplate()
   * @see #getQueryAction()
   * @generated
   */
  EReference getQueryAction_Template();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.QueryAction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.QueryAction#getTarget()
   * @see #getQueryAction()
   * @generated
   */
  EReference getQueryAction_Target();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.PutAction <em>Put Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Put Action</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.PutAction
   * @generated
   */
  EClass getPutAction();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.PutAction#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.PutAction#getTuple()
   * @see #getPutAction()
   * @generated
   */
  EReference getPutAction_Tuple();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.PutAction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.PutAction#getTarget()
   * @see #getPutAction()
   * @generated
   */
  EReference getPutAction_Target();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ExecAction <em>Exec Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec Action</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ExecAction
   * @generated
   */
  EClass getExecAction();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ExecAction#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ExecAction#getArg()
   * @see #getExecAction()
   * @generated
   */
  EReference getExecAction_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Tuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Tuple
   * @generated
   */
  EClass getTuple();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Tuple#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Tuple#getFields()
   * @see #getTuple()
   * @generated
   */
  EReference getTuple_Fields();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Template
   * @generated
   */
  EClass getTemplate();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Template#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Template#getFields()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_Fields();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.TemplateField <em>Template Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Field</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.TemplateField
   * @generated
   */
  EClass getTemplateField();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.AnyFormalField <em>Any Formal Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Formal Field</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.AnyFormalField
   * @generated
   */
  EClass getAnyFormalField();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.TypedFormalField <em>Typed Formal Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Formal Field</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.TypedFormalField
   * @generated
   */
  EClass getTypedFormalField();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.TypedFormalField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.TypedFormalField#getType()
   * @see #getTypedFormalField()
   * @generated
   */
  EAttribute getTypedFormalField_Type();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.FormalField <em>Formal Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Field</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FormalField
   * @generated
   */
  EClass getFormalField();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ActualField <em>Actual Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Field</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ActualField
   * @generated
   */
  EClass getActualField();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ActualField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ActualField#getValue()
   * @see #getActualField()
   * @generated
   */
  EReference getActualField_Value();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.While#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.While#getGuard()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Guard();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.While#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.While#getBody()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Body();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IfThenElse
   * @generated
   */
  EClass getIfThenElse();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getGuard()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Guard();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getThenBranch <em>Then Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Branch</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getThenBranch()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_ThenBranch();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getElseBranch <em>Else Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Branch</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getElseBranch()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_ElseBranch();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Block#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Block#getCommands()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Commands();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.SelfExpression <em>Self Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.SelfExpression
   * @generated
   */
  EClass getSelfExpression();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.IdAttribute <em>Id Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Attribute</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IdAttribute
   * @generated
   */
  EClass getIdAttribute();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link org.cmg.resp.xtext.scellight.scelLight.Reference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Reference#getRef()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Ref();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#getIntpart <em>Intpart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Intpart</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#getIntpart()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Intpart();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#isIsDouble <em>Is Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Double</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#isIsDouble()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_IsDouble();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#getDecimal <em>Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decimal</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#getDecimal()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Decimal();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.FactorialExpression <em>Factorial Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factorial Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FactorialExpression
   * @generated
   */
  EClass getFactorialExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.FactorialExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FactorialExpression#getArg()
   * @see #getFactorialExpression()
   * @generated
   */
  EReference getFactorialExpression_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.LogExpression <em>Log Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Log Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.LogExpression
   * @generated
   */
  EClass getLogExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.LogExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.LogExpression#getArg()
   * @see #getLogExpression()
   * @generated
   */
  EReference getLogExpression_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ModExpression <em>Mod Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ModExpression
   * @generated
   */
  EClass getModExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ModExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ModExpression#getArg()
   * @see #getModExpression()
   * @generated
   */
  EReference getModExpression_Arg();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ModExpression#getMod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mod</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ModExpression#getMod()
   * @see #getModExpression()
   * @generated
   */
  EReference getModExpression_Mod();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.PowExpression <em>Pow Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pow Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.PowExpression
   * @generated
   */
  EClass getPowExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.PowExpression#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.PowExpression#getBase()
   * @see #getPowExpression()
   * @generated
   */
  EReference getPowExpression_Base();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.PowExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.PowExpression#getExp()
   * @see #getPowExpression()
   * @generated
   */
  EReference getPowExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.FloorExpression <em>Floor Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Floor Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FloorExpression
   * @generated
   */
  EClass getFloorExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.FloorExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FloorExpression#getArg()
   * @see #getFloorExpression()
   * @generated
   */
  EReference getFloorExpression_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.CeilExpression <em>Ceil Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ceil Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.CeilExpression
   * @generated
   */
  EClass getCeilExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.CeilExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.CeilExpression#getArg()
   * @see #getCeilExpression()
   * @generated
   */
  EReference getCeilExpression_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.MinExpression <em>Min Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.MinExpression
   * @generated
   */
  EClass getMinExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.MinExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.MinExpression#getLeft()
   * @see #getMinExpression()
   * @generated
   */
  EReference getMinExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.MinExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.MinExpression#getRight()
   * @see #getMinExpression()
   * @generated
   */
  EReference getMinExpression_Right();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.MaxExpression <em>Max Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.MaxExpression
   * @generated
   */
  EClass getMaxExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.MaxExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.MaxExpression#getLeft()
   * @see #getMaxExpression()
   * @generated
   */
  EReference getMaxExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.MaxExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.MaxExpression#getRight()
   * @see #getMaxExpression()
   * @generated
   */
  EReference getMaxExpression_Right();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.SinExpression <em>Sin Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sin Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.SinExpression
   * @generated
   */
  EClass getSinExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.SinExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.SinExpression#getArg()
   * @see #getSinExpression()
   * @generated
   */
  EReference getSinExpression_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.CosExpression <em>Cos Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cos Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.CosExpression
   * @generated
   */
  EClass getCosExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.CosExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.CosExpression#getArg()
   * @see #getCosExpression()
   * @generated
   */
  EReference getCosExpression_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.TanExpression <em>Tan Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tan Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.TanExpression
   * @generated
   */
  EClass getTanExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.TanExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.TanExpression#getArg()
   * @see #getTanExpression()
   * @generated
   */
  EReference getTanExpression_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ATanExpression <em>ATan Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ATan Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ATanExpression
   * @generated
   */
  EClass getATanExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ATanExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ATanExpression#getArg()
   * @see #getATanExpression()
   * @generated
   */
  EReference getATanExpression_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ASinExpression <em>ASin Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ASin Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ASinExpression
   * @generated
   */
  EClass getASinExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ASinExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ASinExpression#getArg()
   * @see #getASinExpression()
   * @generated
   */
  EReference getASinExpression_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ACosExpression <em>ACos Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ACos Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ACosExpression
   * @generated
   */
  EClass getACosExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.ACosExpression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ACosExpression#getArg()
   * @see #getACosExpression()
   * @generated
   */
  EReference getACosExpression_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.SystemDeclaration <em>System Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Declaration</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.SystemDeclaration
   * @generated
   */
  EClass getSystemDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.SystemDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.SystemDeclaration#getName()
   * @see #getSystemDeclaration()
   * @generated
   */
  EAttribute getSystemDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.SystemDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.SystemDeclaration#getElements()
   * @see #getSystemDeclaration()
   * @generated
   */
  EReference getSystemDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.ProcessReference <em>Process Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Reference</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProcessReference
   * @generated
   */
  EClass getProcessReference();

  /**
   * Returns the meta object for the reference '{@link org.cmg.resp.xtext.scellight.scelLight.ProcessReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProcessReference#getReference()
   * @see #getProcessReference()
   * @generated
   */
  EReference getProcessReference_Reference();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.ProcessReference#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.ProcessReference#getArguments()
   * @see #getProcessReference()
   * @generated
   */
  EReference getProcessReference_Arguments();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.EmptyProcess <em>Empty Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Process</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.EmptyProcess
   * @generated
   */
  EClass getEmptyProcess();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.StandardFormalField <em>Standard Formal Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Standard Formal Field</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.StandardFormalField
   * @generated
   */
  EClass getStandardFormalField();

  /**
   * Returns the meta object for the reference '{@link org.cmg.resp.xtext.scellight.scelLight.StandardFormalField#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.StandardFormalField#getReference()
   * @see #getStandardFormalField()
   * @generated
   */
  EReference getStandardFormalField_Reference();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.FormalFieldWithDeclaration <em>Formal Field With Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Field With Declaration</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FormalFieldWithDeclaration
   * @generated
   */
  EClass getFormalFieldWithDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.FormalFieldWithDeclaration#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FormalFieldWithDeclaration#getVariable()
   * @see #getFormalFieldWithDeclaration()
   * @generated
   */
  EReference getFormalFieldWithDeclaration_Variable();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Disjunction <em>Disjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjunction</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Disjunction
   * @generated
   */
  EClass getDisjunction();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.Disjunction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Disjunction#getLeft()
   * @see #getDisjunction()
   * @generated
   */
  EReference getDisjunction_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.Disjunction#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Disjunction#getRight()
   * @see #getDisjunction()
   * @generated
   */
  EReference getDisjunction_Right();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Conjunction <em>Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conjunction</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Conjunction
   * @generated
   */
  EClass getConjunction();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.Conjunction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Conjunction#getLeft()
   * @see #getConjunction()
   * @generated
   */
  EReference getConjunction_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.Conjunction#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Conjunction#getRight()
   * @see #getConjunction()
   * @generated
   */
  EReference getConjunction_Right();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Negation <em>Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negation</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Negation
   * @generated
   */
  EClass getNegation();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.Negation#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Negation#getArg()
   * @see #getNegation()
   * @generated
   */
  EReference getNegation_Arg();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.Relation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Relation#getLeft()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Left();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.Relation#getRel <em>Rel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Relation#getRel()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Rel();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.Relation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Relation#getRight()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Right();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction <em>Summation Subtraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Summation Subtraction</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction
   * @generated
   */
  EClass getSummationSubtraction();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction#getLeft()
   * @see #getSummationSubtraction()
   * @generated
   */
  EReference getSummationSubtraction_Left();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction#getOp()
   * @see #getSummationSubtraction()
   * @generated
   */
  EAttribute getSummationSubtraction_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.SummationSubtraction#getRight()
   * @see #getSummationSubtraction()
   * @generated
   */
  EReference getSummationSubtraction_Right();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision <em>Multiplication Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication Division</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision
   * @generated
   */
  EClass getMultiplicationDivision();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision#getLeft()
   * @see #getMultiplicationDivision()
   * @generated
   */
  EReference getMultiplicationDivision_Left();

  /**
   * Returns the meta object for the attribute '{@link org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision#getOp()
   * @see #getMultiplicationDivision()
   * @generated
   */
  EAttribute getMultiplicationDivision_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.MultiplicationDivision#getRight()
   * @see #getMultiplicationDivision()
   * @generated
   */
  EReference getMultiplicationDivision_Right();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.TrueExpression <em>True Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>True Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.TrueExpression
   * @generated
   */
  EClass getTrueExpression();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.FalseExpression <em>False Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>False Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.FalseExpression
   * @generated
   */
  EClass getFalseExpression();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression <em>If Then Else Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression
   * @generated
   */
  EClass getIfThenElseExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getGuard()
   * @see #getIfThenElseExpression()
   * @generated
   */
  EReference getIfThenElseExpression_Guard();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getThenBranch <em>Then Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Branch</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getThenBranch()
   * @see #getIfThenElseExpression()
   * @generated
   */
  EReference getIfThenElseExpression_ThenBranch();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getElseBranch <em>Else Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Branch</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getElseBranch()
   * @see #getIfThenElseExpression()
   * @generated
   */
  EReference getIfThenElseExpression_ElseBranch();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.IdExpression <em>Id Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Expression</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.IdExpression
   * @generated
   */
  EClass getIdExpression();

  /**
   * Returns the meta object for class '{@link org.cmg.resp.xtext.scellight.scelLight.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the containment reference '{@link org.cmg.resp.xtext.scellight.scelLight.Call#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Call#getFunction()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Function();

  /**
   * Returns the meta object for the containment reference list '{@link org.cmg.resp.xtext.scellight.scelLight.Call#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Call#getArgs()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Args();

  /**
   * Returns the meta object for enum '{@link org.cmg.resp.xtext.scellight.scelLight.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.Type
   * @generated
   */
  EEnum getType();

  /**
   * Returns the meta object for enum '{@link org.cmg.resp.xtext.scellight.scelLight.RelationSymbol <em>Relation Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Relation Symbol</em>'.
   * @see org.cmg.resp.xtext.scellight.scelLight.RelationSymbol
   * @generated
   */
  EEnum getRelationSymbol();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ScelLightFactory getScelLightFactory();

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
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ModelImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONSTANTS = eINSTANCE.getModel_Constants();

    /**
     * The meta object literal for the '<em><b>Projections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROJECTIONS = eINSTANCE.getModel_Projections();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FUNCTIONS = eINSTANCE.getModel_Functions();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ATTRIBUTES = eINSTANCE.getModel_Attributes();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROCESSES = eINSTANCE.getModel_Processes();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMPONENTS = eINSTANCE.getModel_Components();

    /**
     * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SYSTEMS = eINSTANCE.getModel_Systems();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.AttributeDeclarationImpl <em>Attribute Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.AttributeDeclarationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getAttributeDeclaration()
     * @generated
     */
    EClass ATTRIBUTE_DECLARATION = eINSTANCE.getAttributeDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_DECLARATION__TYPE = eINSTANCE.getAttributeDeclaration_Type();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ProjectionDeclarationImpl <em>Projection Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ProjectionDeclarationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getProjectionDeclaration()
     * @generated
     */
    EClass PROJECTION_DECLARATION = eINSTANCE.getProjectionDeclaration();

    /**
     * The meta object literal for the '<em><b>Projection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECTION_DECLARATION__PROJECTION = eINSTANCE.getProjectionDeclaration_Projection();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ProjectionExpressionImpl <em>Projection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ProjectionExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getProjectionExpression()
     * @generated
     */
    EClass PROJECTION_EXPRESSION = eINSTANCE.getProjectionExpression();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECTION_EXPRESSION__TEMPLATE = eINSTANCE.getProjectionExpression_Template();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECTION_EXPRESSION__VALUE = eINSTANCE.getProjectionExpression_Value();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECTION_EXPRESSION__DEFAULT = eINSTANCE.getProjectionExpression_Default();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ConstantDeclarationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getConstantDeclaration()
     * @generated
     */
    EClass CONSTANT_DECLARATION = eINSTANCE.getConstantDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DECLARATION__TYPE = eINSTANCE.getConstantDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLARATION__VALUE = eINSTANCE.getConstantDeclaration_Value();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ComponentDeclarationImpl <em>Component Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ComponentDeclarationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getComponentDeclaration()
     * @generated
     */
    EClass COMPONENT_DECLARATION = eINSTANCE.getComponentDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DECLARATION__NAME = eINSTANCE.getComponentDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DECLARATION__PARAMETERS = eINSTANCE.getComponentDeclaration_Parameters();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DECLARATION__COMPONENT = eINSTANCE.getComponentDeclaration_Component();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ComponentExpressionImpl <em>Component Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ComponentExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getComponentExpression()
     * @generated
     */
    EClass COMPONENT_EXPRESSION = eINSTANCE.getComponentExpression();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ComponentReferenceImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getComponentReference()
     * @generated
     */
    EClass COMPONENT_REFERENCE = eINSTANCE.getComponentReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_REFERENCE__REFERENCE = eINSTANCE.getComponentReference_Reference();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_REFERENCE__ARGUMENTS = eINSTANCE.getComponentReference_Arguments();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ComponentConstantImpl <em>Component Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ComponentConstantImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getComponentConstant()
     * @generated
     */
    EClass COMPONENT_CONSTANT = eINSTANCE.getComponentConstant();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_CONSTANT__INTERFACE = eINSTANCE.getComponentConstant_Interface();

    /**
     * The meta object literal for the '<em><b>Knowledge</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_CONSTANT__KNOWLEDGE = eINSTANCE.getComponentConstant_Knowledge();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_CONSTANT__PROCESSES = eINSTANCE.getComponentConstant_Processes();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ProcessExpressionImpl <em>Process Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ProcessExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getProcessExpression()
     * @generated
     */
    EClass PROCESS_EXPRESSION = eINSTANCE.getProcessExpression();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.KnowledgeImpl <em>Knowledge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.KnowledgeImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getKnowledge()
     * @generated
     */
    EClass KNOWLEDGE = eINSTANCE.getKnowledge();

    /**
     * The meta object literal for the '<em><b>Tuples</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KNOWLEDGE__TUPLES = eINSTANCE.getKnowledge_Tuples();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.InterfaceImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__ATTRIBUTES = eINSTANCE.getInterface_Attributes();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.IdAttributeDefinitionImpl <em>Id Attribute Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.IdAttributeDefinitionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getIdAttributeDefinition()
     * @generated
     */
    EClass ID_ATTRIBUTE_DEFINITION = eINSTANCE.getIdAttributeDefinition();

    /**
     * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_ATTRIBUTE_DEFINITION__COMPONENT_ID = eINSTANCE.getIdAttributeDefinition_ComponentId();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.AttributeInstantiationImpl <em>Attribute Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.AttributeInstantiationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getAttributeInstantiation()
     * @generated
     */
    EClass ATTRIBUTE_INSTANTIATION = eINSTANCE.getAttributeInstantiation();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_INSTANTIATION__ATTRIBUTE = eINSTANCE.getAttributeInstantiation_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_INSTANTIATION__VALUE = eINSTANCE.getAttributeInstantiation_Value();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.FunctionDeclarationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__RETURN_TYPE = eINSTANCE.getFunctionDeclaration_ReturnType();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__PARAMETERS = eINSTANCE.getFunctionDeclaration_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__BODY = eINSTANCE.getFunctionDeclaration_Body();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ProcessDeclarationImpl <em>Process Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ProcessDeclarationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getProcessDeclaration()
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
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_DECLARATION__PARAMETERS = eINSTANCE.getProcessDeclaration_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_DECLARATION__BODY = eINSTANCE.getProcessDeclaration_Body();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.VariableImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ReferenceableElementsImpl <em>Referenceable Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ReferenceableElementsImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getReferenceableElements()
     * @generated
     */
    EClass REFERENCEABLE_ELEMENTS = eINSTANCE.getReferenceableElements();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCEABLE_ELEMENTS__NAME = eINSTANCE.getReferenceableElements_Name();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.CommandImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.VariableDeclarationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Declared Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__DECLARED_VARIABLE = eINSTANCE.getVariableDeclaration_DeclaredVariable();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__INIT = eINSTANCE.getVariableDeclaration_Init();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ActionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ReplaceActionImpl <em>Replace Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ReplaceActionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getReplaceAction()
     * @generated
     */
    EClass REPLACE_ACTION = eINSTANCE.getReplaceAction();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACE_ACTION__TEMPLATE = eINSTANCE.getReplaceAction_Template();

    /**
     * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACE_ACTION__TUPLE = eINSTANCE.getReplaceAction_Tuple();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.GetActionImpl <em>Get Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.GetActionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getGetAction()
     * @generated
     */
    EClass GET_ACTION = eINSTANCE.getGetAction();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET_ACTION__TEMPLATE = eINSTANCE.getGetAction_Template();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET_ACTION__TARGET = eINSTANCE.getGetAction_Target();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.QueryActionImpl <em>Query Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.QueryActionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getQueryAction()
     * @generated
     */
    EClass QUERY_ACTION = eINSTANCE.getQueryAction();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_ACTION__TEMPLATE = eINSTANCE.getQueryAction_Template();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_ACTION__TARGET = eINSTANCE.getQueryAction_Target();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.PutActionImpl <em>Put Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.PutActionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getPutAction()
     * @generated
     */
    EClass PUT_ACTION = eINSTANCE.getPutAction();

    /**
     * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PUT_ACTION__TUPLE = eINSTANCE.getPutAction_Tuple();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PUT_ACTION__TARGET = eINSTANCE.getPutAction_Target();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ExecActionImpl <em>Exec Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ExecActionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getExecAction()
     * @generated
     */
    EClass EXEC_ACTION = eINSTANCE.getExecAction();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC_ACTION__ARG = eINSTANCE.getExecAction_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TupleImpl <em>Tuple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.TupleImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTuple()
     * @generated
     */
    EClass TUPLE = eINSTANCE.getTuple();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE__FIELDS = eINSTANCE.getTuple_Fields();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.TemplateImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTemplate()
     * @generated
     */
    EClass TEMPLATE = eINSTANCE.getTemplate();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__FIELDS = eINSTANCE.getTemplate_Fields();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TemplateFieldImpl <em>Template Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.TemplateFieldImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTemplateField()
     * @generated
     */
    EClass TEMPLATE_FIELD = eINSTANCE.getTemplateField();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.AnyFormalFieldImpl <em>Any Formal Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.AnyFormalFieldImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getAnyFormalField()
     * @generated
     */
    EClass ANY_FORMAL_FIELD = eINSTANCE.getAnyFormalField();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TypedFormalFieldImpl <em>Typed Formal Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.TypedFormalFieldImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTypedFormalField()
     * @generated
     */
    EClass TYPED_FORMAL_FIELD = eINSTANCE.getTypedFormalField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPED_FORMAL_FIELD__TYPE = eINSTANCE.getTypedFormalField_Type();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FormalFieldImpl <em>Formal Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.FormalFieldImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFormalField()
     * @generated
     */
    EClass FORMAL_FIELD = eINSTANCE.getFormalField();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ActualFieldImpl <em>Actual Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ActualFieldImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getActualField()
     * @generated
     */
    EClass ACTUAL_FIELD = eINSTANCE.getActualField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_FIELD__VALUE = eINSTANCE.getActualField_Value();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.WhileImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__GUARD = eINSTANCE.getWhile_Guard();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__BODY = eINSTANCE.getWhile_Body();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.IfThenElseImpl <em>If Then Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.IfThenElseImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getIfThenElse()
     * @generated
     */
    EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__GUARD = eINSTANCE.getIfThenElse_Guard();

    /**
     * The meta object literal for the '<em><b>Then Branch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__THEN_BRANCH = eINSTANCE.getIfThenElse_ThenBranch();

    /**
     * The meta object literal for the '<em><b>Else Branch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__ELSE_BRANCH = eINSTANCE.getIfThenElse_ElseBranch();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.BlockImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__COMMANDS = eINSTANCE.getBlock_Commands();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.SelfExpressionImpl <em>Self Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.SelfExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getSelfExpression()
     * @generated
     */
    EClass SELF_EXPRESSION = eINSTANCE.getSelfExpression();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.IdAttributeImpl <em>Id Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.IdAttributeImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getIdAttribute()
     * @generated
     */
    EClass ID_ATTRIBUTE = eINSTANCE.getIdAttribute();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.StringLiteralImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ReferenceImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__REF = eINSTANCE.getReference_Ref();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.NumberLiteralImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Intpart</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__INTPART = eINSTANCE.getNumberLiteral_Intpart();

    /**
     * The meta object literal for the '<em><b>Is Double</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__IS_DOUBLE = eINSTANCE.getNumberLiteral_IsDouble();

    /**
     * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__DECIMAL = eINSTANCE.getNumberLiteral_Decimal();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FactorialExpressionImpl <em>Factorial Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.FactorialExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFactorialExpression()
     * @generated
     */
    EClass FACTORIAL_EXPRESSION = eINSTANCE.getFactorialExpression();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTORIAL_EXPRESSION__ARG = eINSTANCE.getFactorialExpression_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.LogExpressionImpl <em>Log Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.LogExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getLogExpression()
     * @generated
     */
    EClass LOG_EXPRESSION = eINSTANCE.getLogExpression();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOG_EXPRESSION__ARG = eINSTANCE.getLogExpression_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ModExpressionImpl <em>Mod Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ModExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getModExpression()
     * @generated
     */
    EClass MOD_EXPRESSION = eINSTANCE.getModExpression();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_EXPRESSION__ARG = eINSTANCE.getModExpression_Arg();

    /**
     * The meta object literal for the '<em><b>Mod</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_EXPRESSION__MOD = eINSTANCE.getModExpression_Mod();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.PowExpressionImpl <em>Pow Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.PowExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getPowExpression()
     * @generated
     */
    EClass POW_EXPRESSION = eINSTANCE.getPowExpression();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW_EXPRESSION__BASE = eINSTANCE.getPowExpression_Base();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW_EXPRESSION__EXP = eINSTANCE.getPowExpression_Exp();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FloorExpressionImpl <em>Floor Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.FloorExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFloorExpression()
     * @generated
     */
    EClass FLOOR_EXPRESSION = eINSTANCE.getFloorExpression();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOOR_EXPRESSION__ARG = eINSTANCE.getFloorExpression_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.CeilExpressionImpl <em>Ceil Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.CeilExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getCeilExpression()
     * @generated
     */
    EClass CEIL_EXPRESSION = eINSTANCE.getCeilExpression();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CEIL_EXPRESSION__ARG = eINSTANCE.getCeilExpression_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.MinExpressionImpl <em>Min Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.MinExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getMinExpression()
     * @generated
     */
    EClass MIN_EXPRESSION = eINSTANCE.getMinExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIN_EXPRESSION__LEFT = eINSTANCE.getMinExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIN_EXPRESSION__RIGHT = eINSTANCE.getMinExpression_Right();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.MaxExpressionImpl <em>Max Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.MaxExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getMaxExpression()
     * @generated
     */
    EClass MAX_EXPRESSION = eINSTANCE.getMaxExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAX_EXPRESSION__LEFT = eINSTANCE.getMaxExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAX_EXPRESSION__RIGHT = eINSTANCE.getMaxExpression_Right();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.SinExpressionImpl <em>Sin Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.SinExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getSinExpression()
     * @generated
     */
    EClass SIN_EXPRESSION = eINSTANCE.getSinExpression();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIN_EXPRESSION__ARG = eINSTANCE.getSinExpression_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.CosExpressionImpl <em>Cos Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.CosExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getCosExpression()
     * @generated
     */
    EClass COS_EXPRESSION = eINSTANCE.getCosExpression();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COS_EXPRESSION__ARG = eINSTANCE.getCosExpression_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TanExpressionImpl <em>Tan Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.TanExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTanExpression()
     * @generated
     */
    EClass TAN_EXPRESSION = eINSTANCE.getTanExpression();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAN_EXPRESSION__ARG = eINSTANCE.getTanExpression_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ATanExpressionImpl <em>ATan Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ATanExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getATanExpression()
     * @generated
     */
    EClass ATAN_EXPRESSION = eINSTANCE.getATanExpression();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATAN_EXPRESSION__ARG = eINSTANCE.getATanExpression_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ASinExpressionImpl <em>ASin Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ASinExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getASinExpression()
     * @generated
     */
    EClass ASIN_EXPRESSION = eINSTANCE.getASinExpression();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASIN_EXPRESSION__ARG = eINSTANCE.getASinExpression_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ACosExpressionImpl <em>ACos Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ACosExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getACosExpression()
     * @generated
     */
    EClass ACOS_EXPRESSION = eINSTANCE.getACosExpression();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACOS_EXPRESSION__ARG = eINSTANCE.getACosExpression_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.SystemDeclarationImpl <em>System Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.SystemDeclarationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getSystemDeclaration()
     * @generated
     */
    EClass SYSTEM_DECLARATION = eINSTANCE.getSystemDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_DECLARATION__NAME = eINSTANCE.getSystemDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_DECLARATION__ELEMENTS = eINSTANCE.getSystemDeclaration_Elements();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ProcessReferenceImpl <em>Process Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ProcessReferenceImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getProcessReference()
     * @generated
     */
    EClass PROCESS_REFERENCE = eINSTANCE.getProcessReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_REFERENCE__REFERENCE = eINSTANCE.getProcessReference_Reference();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_REFERENCE__ARGUMENTS = eINSTANCE.getProcessReference_Arguments();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.EmptyProcessImpl <em>Empty Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.EmptyProcessImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getEmptyProcess()
     * @generated
     */
    EClass EMPTY_PROCESS = eINSTANCE.getEmptyProcess();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.StandardFormalFieldImpl <em>Standard Formal Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.StandardFormalFieldImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getStandardFormalField()
     * @generated
     */
    EClass STANDARD_FORMAL_FIELD = eINSTANCE.getStandardFormalField();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STANDARD_FORMAL_FIELD__REFERENCE = eINSTANCE.getStandardFormalField_Reference();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FormalFieldWithDeclarationImpl <em>Formal Field With Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.FormalFieldWithDeclarationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFormalFieldWithDeclaration()
     * @generated
     */
    EClass FORMAL_FIELD_WITH_DECLARATION = eINSTANCE.getFormalFieldWithDeclaration();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_FIELD_WITH_DECLARATION__VARIABLE = eINSTANCE.getFormalFieldWithDeclaration_Variable();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.DisjunctionImpl <em>Disjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.DisjunctionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getDisjunction()
     * @generated
     */
    EClass DISJUNCTION = eINSTANCE.getDisjunction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJUNCTION__LEFT = eINSTANCE.getDisjunction_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJUNCTION__RIGHT = eINSTANCE.getDisjunction_Right();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.ConjunctionImpl <em>Conjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ConjunctionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getConjunction()
     * @generated
     */
    EClass CONJUNCTION = eINSTANCE.getConjunction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONJUNCTION__LEFT = eINSTANCE.getConjunction_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONJUNCTION__RIGHT = eINSTANCE.getConjunction_Right();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.NegationImpl <em>Negation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.NegationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getNegation()
     * @generated
     */
    EClass NEGATION = eINSTANCE.getNegation();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATION__ARG = eINSTANCE.getNegation_Arg();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.RelationImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__LEFT = eINSTANCE.getRelation_Left();

    /**
     * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__REL = eINSTANCE.getRelation_Rel();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__RIGHT = eINSTANCE.getRelation_Right();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.SummationSubtractionImpl <em>Summation Subtraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.SummationSubtractionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getSummationSubtraction()
     * @generated
     */
    EClass SUMMATION_SUBTRACTION = eINSTANCE.getSummationSubtraction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUMMATION_SUBTRACTION__LEFT = eINSTANCE.getSummationSubtraction_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUMMATION_SUBTRACTION__OP = eINSTANCE.getSummationSubtraction_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUMMATION_SUBTRACTION__RIGHT = eINSTANCE.getSummationSubtraction_Right();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.MultiplicationDivisionImpl <em>Multiplication Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.MultiplicationDivisionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getMultiplicationDivision()
     * @generated
     */
    EClass MULTIPLICATION_DIVISION = eINSTANCE.getMultiplicationDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION_DIVISION__LEFT = eINSTANCE.getMultiplicationDivision_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATION_DIVISION__OP = eINSTANCE.getMultiplicationDivision_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION_DIVISION__RIGHT = eINSTANCE.getMultiplicationDivision_Right();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.TrueExpressionImpl <em>True Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.TrueExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getTrueExpression()
     * @generated
     */
    EClass TRUE_EXPRESSION = eINSTANCE.getTrueExpression();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.FalseExpressionImpl <em>False Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.FalseExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getFalseExpression()
     * @generated
     */
    EClass FALSE_EXPRESSION = eINSTANCE.getFalseExpression();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.IfThenElseExpressionImpl <em>If Then Else Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.IfThenElseExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getIfThenElseExpression()
     * @generated
     */
    EClass IF_THEN_ELSE_EXPRESSION = eINSTANCE.getIfThenElseExpression();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_EXPRESSION__GUARD = eINSTANCE.getIfThenElseExpression_Guard();

    /**
     * The meta object literal for the '<em><b>Then Branch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_EXPRESSION__THEN_BRANCH = eINSTANCE.getIfThenElseExpression_ThenBranch();

    /**
     * The meta object literal for the '<em><b>Else Branch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH = eINSTANCE.getIfThenElseExpression_ElseBranch();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.IdExpressionImpl <em>Id Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.IdExpressionImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getIdExpression()
     * @generated
     */
    EClass ID_EXPRESSION = eINSTANCE.getIdExpression();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.CallImpl
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getCall()
     * @generated
     */
    EClass CALL = eINSTANCE.getCall();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__FUNCTION = eINSTANCE.getCall_Function();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__ARGS = eINSTANCE.getCall_Args();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.Type <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.Type
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getType()
     * @generated
     */
    EEnum TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.cmg.resp.xtext.scellight.scelLight.RelationSymbol <em>Relation Symbol</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cmg.resp.xtext.scellight.scelLight.RelationSymbol
     * @see org.cmg.resp.xtext.scellight.scelLight.impl.ScelLightPackageImpl#getRelationSymbol()
     * @generated
     */
    EEnum RELATION_SYMBOL = eINSTANCE.getRelationSymbol();

  }

} //ScelLightPackage
