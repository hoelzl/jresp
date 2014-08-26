/**
 */
package org.cmg.resp.xtext.scellight.scelLight;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Relation#getLeft <em>Left</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Relation#getRel <em>Rel</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Relation#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getRelation_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.Relation#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Rel</b></em>' attribute.
   * The literals are from the enumeration {@link org.cmg.resp.xtext.scellight.scelLight.RelationSymbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel</em>' attribute.
   * @see org.cmg.resp.xtext.scellight.scelLight.RelationSymbol
   * @see #setRel(RelationSymbol)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getRelation_Rel()
   * @model
   * @generated
   */
  RelationSymbol getRel();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.Relation#getRel <em>Rel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel</em>' attribute.
   * @see org.cmg.resp.xtext.scellight.scelLight.RelationSymbol
   * @see #getRel()
   * @generated
   */
  void setRel(RelationSymbol value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getRelation_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link org.cmg.resp.xtext.scellight.scelLight.Relation#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Relation
