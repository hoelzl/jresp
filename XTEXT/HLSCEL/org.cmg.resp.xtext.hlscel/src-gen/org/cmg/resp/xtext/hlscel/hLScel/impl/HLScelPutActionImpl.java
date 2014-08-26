/**
 */
package org.cmg.resp.xtext.hlscel.hLScel.impl;

import java.util.Collection;

import org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HLScelPackage.HL_SCEL_PUT_ACTION__FEATURE_CALL_ARGUMENTS:
        return ((InternalEList<?>)getFeatureCallArguments()).basicRemove(otherEnd, msgs);
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
    }
    return super.eIsSet(featureID);
  }

} //HLScelPutActionImpl
