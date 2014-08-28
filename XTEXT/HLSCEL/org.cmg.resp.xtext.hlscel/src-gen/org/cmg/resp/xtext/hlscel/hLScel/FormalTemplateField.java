/**
 */
package org.cmg.resp.xtext.hlscel.hLScel;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Template Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.hlscel.hLScel.FormalTemplateField#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getFormalTemplateField()
 * @model
 * @generated
 */
public interface FormalTemplateField extends XExpression
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(XExpression)
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getFormalTemplateField_Reference()
   * @model containment="true"
   * @generated
   */
  XExpression getReference();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.hlscel.hLScel.FormalTemplateField#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(XExpression value);

} // FormalTemplateField
