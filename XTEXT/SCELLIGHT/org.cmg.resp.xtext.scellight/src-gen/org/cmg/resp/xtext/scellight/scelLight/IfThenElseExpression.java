/**
 */
package org.cmg.resp.xtext.scellight.scelLight;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getIfThenElseExpression()
 * @model
 * @generated
 */
public interface IfThenElseExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Expression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getIfThenElseExpression_Guard()
   * @model containment="true"
   * @generated
   */
  Expression getGuard();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Expression value);

  /**
   * Returns the value of the '<em><b>Then Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Branch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Branch</em>' containment reference.
   * @see #setThenBranch(Expression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getIfThenElseExpression_ThenBranch()
   * @model containment="true"
   * @generated
   */
  Expression getThenBranch();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getThenBranch <em>Then Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Branch</em>' containment reference.
   * @see #getThenBranch()
   * @generated
   */
  void setThenBranch(Expression value);

  /**
   * Returns the value of the '<em><b>Else Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Branch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Branch</em>' containment reference.
   * @see #setElseBranch(Expression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getIfThenElseExpression_ElseBranch()
   * @model containment="true"
   * @generated
   */
  Expression getElseBranch();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression#getElseBranch <em>Else Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Branch</em>' containment reference.
   * @see #getElseBranch()
   * @generated
   */
  void setElseBranch(Expression value);

} // IfThenElseExpression
