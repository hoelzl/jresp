/**
 */
package org.cmg.resp.xtext.hlscel.hLScel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Put Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction#getFeatureCallArguments <em>Feature Call Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getHLScelPutAction()
 * @model
 * @generated
 */
public interface HLScelPutAction extends XExpression
{
  /**
   * Returns the value of the '<em><b>Feature Call Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Call Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Call Arguments</em>' containment reference list.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage#getHLScelPutAction_FeatureCallArguments()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getFeatureCallArguments();

} // HLScelPutAction
