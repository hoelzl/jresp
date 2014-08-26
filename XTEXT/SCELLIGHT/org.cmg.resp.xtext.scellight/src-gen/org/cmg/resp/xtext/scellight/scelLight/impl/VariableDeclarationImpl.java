/**
 */
package org.cmg.resp.xtext.scellight.scelLight.impl;

import org.cmg.resp.xtext.scellight.scelLight.Expression;
import org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage;
import org.cmg.resp.xtext.scellight.scelLight.Variable;
import org.cmg.resp.xtext.scellight.scelLight.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.VariableDeclarationImpl#getDeclaredVariable <em>Declared Variable</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.VariableDeclarationImpl#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationImpl extends CommandImpl implements VariableDeclaration
{
  /**
   * The cached value of the '{@link #getDeclaredVariable() <em>Declared Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredVariable()
   * @generated
   * @ordered
   */
  protected Variable declaredVariable;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected Expression init;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ScelLightPackage.Literals.VARIABLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getDeclaredVariable()
  {
    return declaredVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaredVariable(Variable newDeclaredVariable, NotificationChain msgs)
  {
    Variable oldDeclaredVariable = declaredVariable;
    declaredVariable = newDeclaredVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScelLightPackage.VARIABLE_DECLARATION__DECLARED_VARIABLE, oldDeclaredVariable, newDeclaredVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredVariable(Variable newDeclaredVariable)
  {
    if (newDeclaredVariable != declaredVariable)
    {
      NotificationChain msgs = null;
      if (declaredVariable != null)
        msgs = ((InternalEObject)declaredVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.VARIABLE_DECLARATION__DECLARED_VARIABLE, null, msgs);
      if (newDeclaredVariable != null)
        msgs = ((InternalEObject)newDeclaredVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.VARIABLE_DECLARATION__DECLARED_VARIABLE, null, msgs);
      msgs = basicSetDeclaredVariable(newDeclaredVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScelLightPackage.VARIABLE_DECLARATION__DECLARED_VARIABLE, newDeclaredVariable, newDeclaredVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(Expression newInit, NotificationChain msgs)
  {
    Expression oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScelLightPackage.VARIABLE_DECLARATION__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(Expression newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.VARIABLE_DECLARATION__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.VARIABLE_DECLARATION__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScelLightPackage.VARIABLE_DECLARATION__INIT, newInit, newInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ScelLightPackage.VARIABLE_DECLARATION__DECLARED_VARIABLE:
        return basicSetDeclaredVariable(null, msgs);
      case ScelLightPackage.VARIABLE_DECLARATION__INIT:
        return basicSetInit(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ScelLightPackage.VARIABLE_DECLARATION__DECLARED_VARIABLE:
        return getDeclaredVariable();
      case ScelLightPackage.VARIABLE_DECLARATION__INIT:
        return getInit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ScelLightPackage.VARIABLE_DECLARATION__DECLARED_VARIABLE:
        setDeclaredVariable((Variable)newValue);
        return;
      case ScelLightPackage.VARIABLE_DECLARATION__INIT:
        setInit((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ScelLightPackage.VARIABLE_DECLARATION__DECLARED_VARIABLE:
        setDeclaredVariable((Variable)null);
        return;
      case ScelLightPackage.VARIABLE_DECLARATION__INIT:
        setInit((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ScelLightPackage.VARIABLE_DECLARATION__DECLARED_VARIABLE:
        return declaredVariable != null;
      case ScelLightPackage.VARIABLE_DECLARATION__INIT:
        return init != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableDeclarationImpl
