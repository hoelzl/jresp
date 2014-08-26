/**
 */
package org.cmg.resp.xtext.scellight.scelLight;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.QueryAction#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.QueryAction#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getQueryAction()
 * @model
 * @generated
 */
public interface QueryAction extends Action
{
  /**
   * Returns the value of the '<em><b>Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' containment reference.
   * @see #setTemplate(Template)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getQueryAction_Template()
   * @model containment="true"
   * @generated
   */
  Template getTemplate();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.QueryAction#getTemplate <em>Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' containment reference.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(Template value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Expression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getQueryAction_Target()
   * @model containment="true"
   * @generated
   */
  Expression getTarget();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.QueryAction#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Expression value);

} // QueryAction
