/**
 */
package org.cmg.resp.xtext.hlscel.hLScel;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction#getArg <em>Arg</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getHLScelExecAction()
 * @model
 * @generated
 */
public interface HLScelExecAction extends XExpression
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
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getHLScelExecAction_Arg()
   * @model containment="true"
   * @generated
   */
  XExpression getArg();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(XExpression value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(XExpression)
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getHLScelExecAction_Target()
   * @model containment="true"
   * @generated
   */
  XExpression getTarget();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(XExpression value);

} // HLScelExecAction
