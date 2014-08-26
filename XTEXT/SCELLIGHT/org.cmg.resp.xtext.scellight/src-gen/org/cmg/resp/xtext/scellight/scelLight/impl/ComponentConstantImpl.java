/**
 */
package org.cmg.resp.xtext.scellight.scelLight.impl;

import java.util.Collection;

import org.cmg.resp.xtext.scellight.scelLight.ComponentConstant;
import org.cmg.resp.xtext.scellight.scelLight.Interface;
import org.cmg.resp.xtext.scellight.scelLight.Knowledge;
import org.cmg.resp.xtext.scellight.scelLight.ProcessExpression;
import org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.ComponentConstantImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.ComponentConstantImpl#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.ComponentConstantImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentConstantImpl extends ComponentExpressionImpl implements ComponentConstant
{
  /**
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected Interface interface_;

  /**
   * The cached value of the '{@link #getKnowledge() <em>Knowledge</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledge()
   * @generated
   * @ordered
   */
  protected Knowledge knowledge;

  /**
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected EList<ProcessExpression> processes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentConstantImpl()
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
    return ScelLightPackage.Literals.COMPONENT_CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs)
  {
    Interface oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScelLightPackage.COMPONENT_CONSTANT__INTERFACE, oldInterface, newInterface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(Interface newInterface)
  {
    if (newInterface != interface_)
    {
      NotificationChain msgs = null;
      if (interface_ != null)
        msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.COMPONENT_CONSTANT__INTERFACE, null, msgs);
      if (newInterface != null)
        msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.COMPONENT_CONSTANT__INTERFACE, null, msgs);
      msgs = basicSetInterface(newInterface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScelLightPackage.COMPONENT_CONSTANT__INTERFACE, newInterface, newInterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Knowledge getKnowledge()
  {
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKnowledge(Knowledge newKnowledge, NotificationChain msgs)
  {
    Knowledge oldKnowledge = knowledge;
    knowledge = newKnowledge;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScelLightPackage.COMPONENT_CONSTANT__KNOWLEDGE, oldKnowledge, newKnowledge);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKnowledge(Knowledge newKnowledge)
  {
    if (newKnowledge != knowledge)
    {
      NotificationChain msgs = null;
      if (knowledge != null)
        msgs = ((InternalEObject)knowledge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.COMPONENT_CONSTANT__KNOWLEDGE, null, msgs);
      if (newKnowledge != null)
        msgs = ((InternalEObject)newKnowledge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.COMPONENT_CONSTANT__KNOWLEDGE, null, msgs);
      msgs = basicSetKnowledge(newKnowledge, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScelLightPackage.COMPONENT_CONSTANT__KNOWLEDGE, newKnowledge, newKnowledge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessExpression> getProcesses()
  {
    if (processes == null)
    {
      processes = new EObjectContainmentEList<ProcessExpression>(ProcessExpression.class, this, ScelLightPackage.COMPONENT_CONSTANT__PROCESSES);
    }
    return processes;
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
      case ScelLightPackage.COMPONENT_CONSTANT__INTERFACE:
        return basicSetInterface(null, msgs);
      case ScelLightPackage.COMPONENT_CONSTANT__KNOWLEDGE:
        return basicSetKnowledge(null, msgs);
      case ScelLightPackage.COMPONENT_CONSTANT__PROCESSES:
        return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
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
      case ScelLightPackage.COMPONENT_CONSTANT__INTERFACE:
        return getInterface();
      case ScelLightPackage.COMPONENT_CONSTANT__KNOWLEDGE:
        return getKnowledge();
      case ScelLightPackage.COMPONENT_CONSTANT__PROCESSES:
        return getProcesses();
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
      case ScelLightPackage.COMPONENT_CONSTANT__INTERFACE:
        setInterface((Interface)newValue);
        return;
      case ScelLightPackage.COMPONENT_CONSTANT__KNOWLEDGE:
        setKnowledge((Knowledge)newValue);
        return;
      case ScelLightPackage.COMPONENT_CONSTANT__PROCESSES:
        getProcesses().clear();
        getProcesses().addAll((Collection<? extends ProcessExpression>)newValue);
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
      case ScelLightPackage.COMPONENT_CONSTANT__INTERFACE:
        setInterface((Interface)null);
        return;
      case ScelLightPackage.COMPONENT_CONSTANT__KNOWLEDGE:
        setKnowledge((Knowledge)null);
        return;
      case ScelLightPackage.COMPONENT_CONSTANT__PROCESSES:
        getProcesses().clear();
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
      case ScelLightPackage.COMPONENT_CONSTANT__INTERFACE:
        return interface_ != null;
      case ScelLightPackage.COMPONENT_CONSTANT__KNOWLEDGE:
        return knowledge != null;
      case ScelLightPackage.COMPONENT_CONSTANT__PROCESSES:
        return processes != null && !processes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComponentConstantImpl
