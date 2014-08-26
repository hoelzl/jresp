/**
 */
package org.cmg.resp.xtext.scellight.scelLight.impl;

import org.cmg.resp.xtext.scellight.scelLight.Expression;
import org.cmg.resp.xtext.scellight.scelLight.IfThenElseExpression;
import org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Then Else Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.IfThenElseExpressionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.IfThenElseExpressionImpl#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.IfThenElseExpressionImpl#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfThenElseExpressionImpl extends ExpressionImpl implements IfThenElseExpression
{
  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected Expression guard;

  /**
   * The cached value of the '{@link #getThenBranch() <em>Then Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenBranch()
   * @generated
   * @ordered
   */
  protected Expression thenBranch;

  /**
   * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBranch()
   * @generated
   * @ordered
   */
  protected Expression elseBranch;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfThenElseExpressionImpl()
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
    return ScelLightPackage.Literals.IF_THEN_ELSE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(Expression newGuard, NotificationChain msgs)
  {
    Expression oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScelLightPackage.IF_THEN_ELSE_EXPRESSION__GUARD, oldGuard, newGuard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(Expression newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.IF_THEN_ELSE_EXPRESSION__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.IF_THEN_ELSE_EXPRESSION__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScelLightPackage.IF_THEN_ELSE_EXPRESSION__GUARD, newGuard, newGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getThenBranch()
  {
    return thenBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenBranch(Expression newThenBranch, NotificationChain msgs)
  {
    Expression oldThenBranch = thenBranch;
    thenBranch = newThenBranch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScelLightPackage.IF_THEN_ELSE_EXPRESSION__THEN_BRANCH, oldThenBranch, newThenBranch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenBranch(Expression newThenBranch)
  {
    if (newThenBranch != thenBranch)
    {
      NotificationChain msgs = null;
      if (thenBranch != null)
        msgs = ((InternalEObject)thenBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.IF_THEN_ELSE_EXPRESSION__THEN_BRANCH, null, msgs);
      if (newThenBranch != null)
        msgs = ((InternalEObject)newThenBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.IF_THEN_ELSE_EXPRESSION__THEN_BRANCH, null, msgs);
      msgs = basicSetThenBranch(newThenBranch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScelLightPackage.IF_THEN_ELSE_EXPRESSION__THEN_BRANCH, newThenBranch, newThenBranch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getElseBranch()
  {
    return elseBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseBranch(Expression newElseBranch, NotificationChain msgs)
  {
    Expression oldElseBranch = elseBranch;
    elseBranch = newElseBranch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScelLightPackage.IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH, oldElseBranch, newElseBranch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseBranch(Expression newElseBranch)
  {
    if (newElseBranch != elseBranch)
    {
      NotificationChain msgs = null;
      if (elseBranch != null)
        msgs = ((InternalEObject)elseBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH, null, msgs);
      if (newElseBranch != null)
        msgs = ((InternalEObject)newElseBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH, null, msgs);
      msgs = basicSetElseBranch(newElseBranch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScelLightPackage.IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH, newElseBranch, newElseBranch));
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
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__GUARD:
        return basicSetGuard(null, msgs);
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__THEN_BRANCH:
        return basicSetThenBranch(null, msgs);
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH:
        return basicSetElseBranch(null, msgs);
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
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__GUARD:
        return getGuard();
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__THEN_BRANCH:
        return getThenBranch();
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH:
        return getElseBranch();
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
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__GUARD:
        setGuard((Expression)newValue);
        return;
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__THEN_BRANCH:
        setThenBranch((Expression)newValue);
        return;
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH:
        setElseBranch((Expression)newValue);
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
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__GUARD:
        setGuard((Expression)null);
        return;
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__THEN_BRANCH:
        setThenBranch((Expression)null);
        return;
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH:
        setElseBranch((Expression)null);
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
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__GUARD:
        return guard != null;
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__THEN_BRANCH:
        return thenBranch != null;
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION__ELSE_BRANCH:
        return elseBranch != null;
    }
    return super.eIsSet(featureID);
  }

} //IfThenElseExpressionImpl
