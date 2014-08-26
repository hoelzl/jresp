/**
 */
package org.cmg.resp.xtext.scellight.scelLight;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getIfThenElse()
 * @model
 * @generated
 */
public interface IfThenElse extends Command
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
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getIfThenElse_Guard()
   * @model containment="true"
   * @generated
   */
  Expression getGuard();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getGuard <em>Guard</em>}' containment reference.
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
   * @see #setThenBranch(Command)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getIfThenElse_ThenBranch()
   * @model containment="true"
   * @generated
   */
  Command getThenBranch();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getThenBranch <em>Then Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Branch</em>' containment reference.
   * @see #getThenBranch()
   * @generated
   */
  void setThenBranch(Command value);

  /**
   * Returns the value of the '<em><b>Else Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Branch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Branch</em>' containment reference.
   * @see #setElseBranch(Command)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getIfThenElse_ElseBranch()
   * @model containment="true"
   * @generated
   */
  Command getElseBranch();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.IfThenElse#getElseBranch <em>Else Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Branch</em>' containment reference.
   * @see #getElseBranch()
   * @generated
   */
  void setElseBranch(Command value);

} // IfThenElse
