/**
 */
package org.cmg.resp.xtext.scellight.scelLight;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.Block#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Command
{
  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.cmg.resp.xtext.scellight.scelLight.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage#getBlock_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // Block
