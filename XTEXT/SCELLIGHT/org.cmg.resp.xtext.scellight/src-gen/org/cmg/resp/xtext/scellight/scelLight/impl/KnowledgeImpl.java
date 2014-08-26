/**
 */
package org.cmg.resp.xtext.scellight.scelLight.impl;

import java.util.Collection;

import org.cmg.resp.xtext.scellight.scelLight.Knowledge;
import org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage;
import org.cmg.resp.xtext.scellight.scelLight.Tuple;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.KnowledgeImpl#getTuples <em>Tuples</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KnowledgeImpl extends MinimalEObjectImpl.Container implements Knowledge
{
  /**
   * The cached value of the '{@link #getTuples() <em>Tuples</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuples()
   * @generated
   * @ordered
   */
  protected EList<Tuple> tuples;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KnowledgeImpl()
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
    return ScelLightPackage.Literals.KNOWLEDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tuple> getTuples()
  {
    if (tuples == null)
    {
      tuples = new EObjectContainmentEList<Tuple>(Tuple.class, this, ScelLightPackage.KNOWLEDGE__TUPLES);
    }
    return tuples;
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
      case ScelLightPackage.KNOWLEDGE__TUPLES:
        return ((InternalEList<?>)getTuples()).basicRemove(otherEnd, msgs);
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
      case ScelLightPackage.KNOWLEDGE__TUPLES:
        return getTuples();
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
      case ScelLightPackage.KNOWLEDGE__TUPLES:
        getTuples().clear();
        getTuples().addAll((Collection<? extends Tuple>)newValue);
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
      case ScelLightPackage.KNOWLEDGE__TUPLES:
        getTuples().clear();
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
      case ScelLightPackage.KNOWLEDGE__TUPLES:
        return tuples != null && !tuples.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //KnowledgeImpl
