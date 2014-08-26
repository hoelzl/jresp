/**
 */
package org.cmg.resp.xtext.scellight.scelLight;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends ReferenceableElements
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.cmg.resp.xtext.scellight.scelLight.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see org.cmg.resp.xtext.scellight.scelLight.Type
   * @see #setReturnType(Type)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getFunctionDeclaration_ReturnType()
   * @model
   * @generated
   */
  Type getReturnType();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see org.cmg.resp.xtext.scellight.scelLight.Type
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Type value);

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
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getFunctionDeclaration_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getParameters();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Expression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getFunctionDeclaration_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

} // FunctionDeclaration
