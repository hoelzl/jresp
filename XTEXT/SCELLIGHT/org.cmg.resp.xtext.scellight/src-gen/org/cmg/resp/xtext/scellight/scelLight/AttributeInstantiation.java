/**
 */
package org.cmg.resp.xtext.scellight.scelLight;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getAttributeInstantiation()
 * @model
 * @generated
 */
public interface AttributeInstantiation extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(AttributeDeclaration)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getAttributeInstantiation_Attribute()
   * @model
   * @generated
   */
  AttributeDeclaration getAttribute();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(AttributeDeclaration value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getAttributeInstantiation_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.AttributeInstantiation#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // AttributeInstantiation
