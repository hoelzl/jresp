/**
 */
package org.cmg.resp.xtext.scellight.scelLight;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getComponentDeclaration()
 * @model
 * @generated
 */
public interface ComponentDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getComponentDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.cmg.resp.xtext.scellight.scelLight.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getComponentDeclaration_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getParameters();

  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference.
   * @see #setComponent(ComponentExpression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getComponentDeclaration_Component()
   * @model containment="true"
   * @generated
   */
  ComponentExpression getComponent();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration#getComponent <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' containment reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(ComponentExpression value);

} // ComponentDeclaration
