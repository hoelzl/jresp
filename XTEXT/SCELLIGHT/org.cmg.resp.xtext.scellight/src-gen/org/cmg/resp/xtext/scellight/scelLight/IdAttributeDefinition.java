/**
 */
package org.cmg.resp.xtext.scellight.scelLight;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.IdAttributeDefinition#getComponentId <em>Component Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getIdAttributeDefinition()
 * @model
 * @generated
 */
public interface IdAttributeDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Component Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Id</em>' attribute.
   * @see #setComponentId(String)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getIdAttributeDefinition_ComponentId()
   * @model
   * @generated
   */
  String getComponentId();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.IdAttributeDefinition#getComponentId <em>Component Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Id</em>' attribute.
   * @see #getComponentId()
   * @generated
   */
  void setComponentId(String value);

} // IdAttributeDefinition
