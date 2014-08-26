/**
 */
package org.cmg.resp.xtext.scellight.scelLight;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Model#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Model#getProjections <em>Projections</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Model#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Model#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Model#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Model#getComponents <em>Components</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Model#getSystems <em>Systems</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getModel_Constants()
   * @model containment="true"
   * @generated
   */
  EList<ConstantDeclaration> getConstants();

  /**
   * Returns the value of the '<em><b>Projections</b></em>' containment reference list.
   * The list contents are of type {@link org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projections</em>' containment reference list.
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getModel_Projections()
   * @model containment="true"
   * @generated
   */
  EList<ProjectionDeclaration> getProjections();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getModel_Functions()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDeclaration> getFunctions();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.cmg.resp.xtext.scellight.scelLight.AttributeDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getModel_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<AttributeDeclaration> getAttributes();

  /**
   * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
   * The list contents are of type {@link org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' containment reference list.
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getModel_Processes()
   * @model containment="true"
   * @generated
   */
  EList<ProcessDeclaration> getProcesses();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getModel_Components()
   * @model containment="true"
   * @generated
   */
  EList<ComponentDeclaration> getComponents();

  /**
   * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
   * The list contents are of type {@link org.cmg.resp.xtext.scellight.scelLight.SystemDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Systems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Systems</em>' containment reference list.
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getModel_Systems()
   * @model containment="true"
   * @generated
   */
  EList<SystemDeclaration> getSystems();

} // Model
