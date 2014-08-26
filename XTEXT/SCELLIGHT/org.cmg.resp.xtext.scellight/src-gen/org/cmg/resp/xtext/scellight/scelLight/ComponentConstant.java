/**
 */
package org.cmg.resp.xtext.scellight.scelLight;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.ComponentConstant#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.ComponentConstant#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.ComponentConstant#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getComponentConstant()
 * @model
 * @generated
 */
public interface ComponentConstant extends ComponentExpression
{
  /**
   * Returns the value of the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' containment reference.
   * @see #setInterface(Interface)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getComponentConstant_Interface()
   * @model containment="true"
   * @generated
   */
  Interface getInterface();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentConstant#getInterface <em>Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' containment reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(Interface value);

  /**
   * Returns the value of the '<em><b>Knowledge</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Knowledge</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Knowledge</em>' containment reference.
   * @see #setKnowledge(Knowledge)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getComponentConstant_Knowledge()
   * @model containment="true"
   * @generated
   */
  Knowledge getKnowledge();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.ComponentConstant#getKnowledge <em>Knowledge</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Knowledge</em>' containment reference.
   * @see #getKnowledge()
   * @generated
   */
  void setKnowledge(Knowledge value);

  /**
   * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
   * The list contents are of type {@link org.cmg.resp.xtext.scellight.scelLight.ProcessExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' containment reference list.
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getComponentConstant_Processes()
   * @model containment="true"
   * @generated
   */
  EList<ProcessExpression> getProcesses();

} // ComponentConstant
