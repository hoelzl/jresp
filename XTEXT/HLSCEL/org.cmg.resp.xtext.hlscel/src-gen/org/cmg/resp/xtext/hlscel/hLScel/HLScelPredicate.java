/**
 */
package org.cmg.resp.xtext.hlscel.hLScel;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelPredicate#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getHLScelPredicate()
 * @model
 * @generated
 */
public interface HLScelPredicate extends XExpression
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(XExpression)
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getHLScelPredicate_Exp()
   * @model containment="true"
   * @generated
   */
  XExpression getExp();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelPredicate#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(XExpression value);

} // HLScelPredicate
