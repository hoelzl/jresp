/**
 */
package org.cmg.resp.xtext.hlscel.hLScel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage
 * @generated
 */
public interface HLScelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HLScelFactory eINSTANCE = org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Process Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Declaration</em>'.
   * @generated
   */
  ProcessDeclaration createProcessDeclaration();

  /**
   * Returns a new object of class '<em>Self Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Self Literal</em>'.
   * @generated
   */
  SelfLiteral createSelfLiteral();

  /**
   * Returns a new object of class '<em>Put Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Put Action</em>'.
   * @generated
   */
  HLScelPutAction createHLScelPutAction();

  /**
   * Returns a new object of class '<em>HScel Get Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HScel Get Action</em>'.
   * @generated
   */
  HScelGetAction createHScelGetAction();

  /**
   * Returns a new object of class '<em>Formal Template Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Template Field</em>'.
   * @generated
   */
  FormalTemplateField createFormalTemplateField();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HLScelPackage getHLScelPackage();

} //HLScelFactory
