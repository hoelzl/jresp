/**
 */
package org.cmg.resp.xtext.scellight.scelLight;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#getIntpart <em>Intpart</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#isIsDouble <em>Is Double</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#getDecimal <em>Decimal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getNumberLiteral()
 * @model
 * @generated
 */
public interface NumberLiteral extends Expression
{
  /**
   * Returns the value of the '<em><b>Intpart</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intpart</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intpart</em>' attribute.
   * @see #setIntpart(int)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getNumberLiteral_Intpart()
   * @model
   * @generated
   */
  int getIntpart();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#getIntpart <em>Intpart</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intpart</em>' attribute.
   * @see #getIntpart()
   * @generated
   */
  void setIntpart(int value);

  /**
   * Returns the value of the '<em><b>Is Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Double</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Double</em>' attribute.
   * @see #setIsDouble(boolean)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getNumberLiteral_IsDouble()
   * @model
   * @generated
   */
  boolean isIsDouble();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#isIsDouble <em>Is Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Double</em>' attribute.
   * @see #isIsDouble()
   * @generated
   */
  void setIsDouble(boolean value);

  /**
   * Returns the value of the '<em><b>Decimal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decimal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decimal</em>' attribute.
   * @see #setDecimal(int)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getNumberLiteral_Decimal()
   * @model
   * @generated
   */
  int getDecimal();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.NumberLiteral#getDecimal <em>Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decimal</em>' attribute.
   * @see #getDecimal()
   * @generated
   */
  void setDecimal(int value);

} // NumberLiteral
