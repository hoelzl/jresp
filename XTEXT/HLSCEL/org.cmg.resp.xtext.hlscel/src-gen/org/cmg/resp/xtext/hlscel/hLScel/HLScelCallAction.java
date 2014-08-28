/**
 */
package org.cmg.resp.xtext.hlscel.hLScel;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelCallAction#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getHLScelCallAction()
 * @model
 * @generated
 */
public interface HLScelCallAction extends XExpression
{
  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(XExpression)
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getHLScelCallAction_Arg()
   * @model containment="true"
   * @generated
   */
  XExpression getArg();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelCallAction#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(XExpression value);

} // HLScelCallAction
