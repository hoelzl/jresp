/**
 */
package org.cmg.resp.xtext.scellight.scelLight;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration#getDeclaredVariable <em>Declared Variable</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends Command
{
  /**
   * Returns the value of the '<em><b>Declared Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Variable</em>' containment reference.
   * @see #setDeclaredVariable(Variable)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getVariableDeclaration_DeclaredVariable()
   * @model containment="true"
   * @generated
   */
  Variable getDeclaredVariable();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration#getDeclaredVariable <em>Declared Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declared Variable</em>' containment reference.
   * @see #getDeclaredVariable()
   * @generated
   */
  void setDeclaredVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(Expression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getVariableDeclaration_Init()
   * @model containment="true"
   * @generated
   */
  Expression getInit();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(Expression value);

} // VariableDeclaration
