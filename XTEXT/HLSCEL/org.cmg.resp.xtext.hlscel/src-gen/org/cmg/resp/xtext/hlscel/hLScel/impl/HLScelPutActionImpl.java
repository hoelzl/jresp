/**
 */
package org.cmg.resp.xtext.hlscel.hLScel.impl;

import java.util.Collection;

import org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Put Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPutActionImpl#getFeatureCallArguments <em>Feature Call Arguments</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.hlscel.hLScel.impl.HLScelPutActionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLScelPutActionImpl extends XExpressionImpl implements HLScelPutAction
{
  /**
   * The cached value of the '{@link #getFeatureCallArguments() <em>Feature Call Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureCallArguments()
   * @generated
   * @ordered
   */
  protected EList<XExpression> featureCallArguments;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected XExpression target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HLScelPutActionImpl()
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
    return HLScelPackage.Literals.HL_SCEL_PUT_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getFeatureCallArguments()
  {
    if (featureCallArguments == null)
    {
      featureCallArguments = new EObjectContainmentEList<XExpression>(XExpression.class, this, HLScelPackage.HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS);
    }
    return featureCallArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(XExpression newTarget, NotificationChain msgs)
  {
    XExpression oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLScelPackage.HL_SCEL_PUT_ACTION__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(XExpression newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLScelPackage.HL_SCEL_PUT_ACTION__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLScelPackage.HL_SCEL_PUT_ACTION__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HLScelPackage.HL_SCEL_PUT_ACTION__TARGET, newTarget, newTarget));
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
      case HLScelPackage.HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS:
        return ((InternalEList<?>)getFeatureCallArguments()).basicRemove(otherEnd, msgs);
      case HLScelPackage.HL_SCEL_PUT_ACTION__TARGET:
        return basicSetTarget(null, msgs);
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
      case HLScelPackage.HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS:
        return getFeatureCallArguments();
      case HLScelPackage.HL_SCEL_PUT_ACTION__TARGET:
        return getTarget();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HLScelPackage.HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS:
        getFeatureCallArguments().clear();
        getFeatureCallArguments().addAll((Collection<? extends XExpression>)newValue);
        return;
      case HLScelPackage.HL_SCEL_PUT_ACTION__TARGET:
        setTarget((XExpression)newValue);
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
      case HLScelPackage.HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS:
        getFeatureCallArguments().clear();
        return;
      case HLScelPackage.HL_SCEL_PUT_ACTION__TARGET:
        setTarget((XExpression)null);
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
      case HLScelPackage.HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS:
        return featureCallArguments != null && !featureCallArguments.isEmpty();
      case HLScelPackage.HL_SCEL_PUT_ACTION__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

} //HLScelPutActionImpl
