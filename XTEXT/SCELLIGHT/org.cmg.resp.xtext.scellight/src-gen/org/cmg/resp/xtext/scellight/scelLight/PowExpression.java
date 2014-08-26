/**
 */
package org.cmg.resp.xtext.scellight.scelLight;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pow Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.PowExpression#getBase <em>Base</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.PowExpression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getPowExpression()
 * @model
 * @generated
 */
public interface PowExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' containment reference.
   * @see #setBase(Expression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getPowExpression_Base()
   * @model containment="true"
   * @generated
   */
  Expression getBase();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.PowExpression#getBase <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' containment reference.
   * @see #getBase()
   * @generated
   */
  void setBase(Expression value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getPowExpression_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.PowExpression#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // PowExpression
