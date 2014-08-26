/**
 */
package org.cmg.resp.xtext.scellight.scelLight;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Knowledge#getTuples <em>Tuples</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getKnowledge()
 * @model
 * @generated
 */
public interface Knowledge extends EObject
{
  /**
   * Returns the value of the '<em><b>Tuples</b></em>' containment reference list.
   * The list contents are of type {@link org.cmg.resp.xtext.scellight.scelLight.Tuple}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tuples</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuples</em>' containment reference list.
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getKnowledge_Tuples()
   * @model containment="true"
   * @generated
   */
  EList<Tuple> getTuples();

} // Knowledge
