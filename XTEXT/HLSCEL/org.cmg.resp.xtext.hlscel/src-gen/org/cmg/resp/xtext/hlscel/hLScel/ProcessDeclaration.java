/**
 */
package org.cmg.resp.xtext.hlscel.hLScel;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getProcessDeclaration()
 * @model
 * @generated
 */
public interface ProcessDeclaration extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XExpression)
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getProcessDeclaration_Body()
   * @model containment="true"
   * @generated
   */
  XExpression getBody();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XExpression value);

} // ProcessDeclaration
