/**
 */
package org.cmg.resp.xtext.scellight.scelLight;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projection Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration#getProjection <em>Projection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getProjectionDeclaration()
 * @model
 * @generated
 */
public interface ProjectionDeclaration extends ReferenceableElements
{
  /**
   * Returns the value of the '<em><b>Projection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projection</em>' containment reference.
   * @see #setProjection(ProjectionExpression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getProjectionDeclaration_Projection()
   * @model containment="true"
   * @generated
   */
  ProjectionExpression getProjection();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration#getProjection <em>Projection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Projection</em>' containment reference.
   * @see #getProjection()
   * @generated
   */
  void setProjection(ProjectionExpression value);

} // ProjectionDeclaration
