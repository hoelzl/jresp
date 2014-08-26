/**
 */
package org.cmg.resp.xtext.scellight.scelLight.impl;

import java.util.Collection;

import org.cmg.resp.xtext.scellight.scelLight.AttributeDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.ComponentDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.ConstantDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.FunctionDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.Model;
import org.cmg.resp.xtext.scellight.scelLight.ProcessDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage;
import org.cmg.resp.xtext.scellight.scelLight.SystemDeclaration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.ModelImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.ModelImpl#getProjections <em>Projections</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.ModelImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.ModelImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.ModelImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.ModelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.ModelImpl#getSystems <em>Systems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstants()
   * @generated
   * @ordered
   */
  protected EList<ConstantDeclaration> constants;

  /**
   * The cached value of the '{@link #getProjections() <em>Projections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjections()
   * @generated
   * @ordered
   */
  protected EList<ProjectionDeclaration> projections;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<FunctionDeclaration> functions;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<AttributeDeclaration> attributes;

  /**
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected EList<ProcessDeclaration> processes;

  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<ComponentDeclaration> components;

  /**
   * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystems()
   * @generated
   * @ordered
   */
  protected EList<SystemDeclaration> systems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return ScelLightPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstantDeclaration> getConstants()
  {
    if (constants == null)
    {
      constants = new EObjectContainmentEList<ConstantDeclaration>(ConstantDeclaration.class, this, ScelLightPackage.MODEL__CONSTANTS);
    }
    return constants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProjectionDeclaration> getProjections()
  {
    if (projections == null)
    {
      projections = new EObjectContainmentEList<ProjectionDeclaration>(ProjectionDeclaration.class, this, ScelLightPackage.MODEL__PROJECTIONS);
    }
    return projections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionDeclaration> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<FunctionDeclaration>(FunctionDeclaration.class, this, ScelLightPackage.MODEL__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeDeclaration> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<AttributeDeclaration>(AttributeDeclaration.class, this, ScelLightPackage.MODEL__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessDeclaration> getProcesses()
  {
    if (processes == null)
    {
      processes = new EObjectContainmentEList<ProcessDeclaration>(ProcessDeclaration.class, this, ScelLightPackage.MODEL__PROCESSES);
    }
    return processes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentDeclaration> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<ComponentDeclaration>(ComponentDeclaration.class, this, ScelLightPackage.MODEL__COMPONENTS);
    }
    return components;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SystemDeclaration> getSystems()
  {
    if (systems == null)
    {
      systems = new EObjectContainmentEList<SystemDeclaration>(SystemDeclaration.class, this, ScelLightPackage.MODEL__SYSTEMS);
    }
    return systems;
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
      case ScelLightPackage.MODEL__CONSTANTS:
        return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
      case ScelLightPackage.MODEL__PROJECTIONS:
        return ((InternalEList<?>)getProjections()).basicRemove(otherEnd, msgs);
      case ScelLightPackage.MODEL__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case ScelLightPackage.MODEL__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case ScelLightPackage.MODEL__PROCESSES:
        return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
      case ScelLightPackage.MODEL__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case ScelLightPackage.MODEL__SYSTEMS:
        return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
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
      case ScelLightPackage.MODEL__CONSTANTS:
        return getConstants();
      case ScelLightPackage.MODEL__PROJECTIONS:
        return getProjections();
      case ScelLightPackage.MODEL__FUNCTIONS:
        return getFunctions();
      case ScelLightPackage.MODEL__ATTRIBUTES:
        return getAttributes();
      case ScelLightPackage.MODEL__PROCESSES:
        return getProcesses();
      case ScelLightPackage.MODEL__COMPONENTS:
        return getComponents();
      case ScelLightPackage.MODEL__SYSTEMS:
        return getSystems();
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
      case ScelLightPackage.MODEL__CONSTANTS:
        getConstants().clear();
        getConstants().addAll((Collection<? extends ConstantDeclaration>)newValue);
        return;
      case ScelLightPackage.MODEL__PROJECTIONS:
        getProjections().clear();
        getProjections().addAll((Collection<? extends ProjectionDeclaration>)newValue);
        return;
      case ScelLightPackage.MODEL__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends FunctionDeclaration>)newValue);
        return;
      case ScelLightPackage.MODEL__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends AttributeDeclaration>)newValue);
        return;
      case ScelLightPackage.MODEL__PROCESSES:
        getProcesses().clear();
        getProcesses().addAll((Collection<? extends ProcessDeclaration>)newValue);
        return;
      case ScelLightPackage.MODEL__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends ComponentDeclaration>)newValue);
        return;
      case ScelLightPackage.MODEL__SYSTEMS:
        getSystems().clear();
        getSystems().addAll((Collection<? extends SystemDeclaration>)newValue);
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
      case ScelLightPackage.MODEL__CONSTANTS:
        getConstants().clear();
        return;
      case ScelLightPackage.MODEL__PROJECTIONS:
        getProjections().clear();
        return;
      case ScelLightPackage.MODEL__FUNCTIONS:
        getFunctions().clear();
        return;
      case ScelLightPackage.MODEL__ATTRIBUTES:
        getAttributes().clear();
        return;
      case ScelLightPackage.MODEL__PROCESSES:
        getProcesses().clear();
        return;
      case ScelLightPackage.MODEL__COMPONENTS:
        getComponents().clear();
        return;
      case ScelLightPackage.MODEL__SYSTEMS:
        getSystems().clear();
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
      case ScelLightPackage.MODEL__CONSTANTS:
        return constants != null && !constants.isEmpty();
      case ScelLightPackage.MODEL__PROJECTIONS:
        return projections != null && !projections.isEmpty();
      case ScelLightPackage.MODEL__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case ScelLightPackage.MODEL__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case ScelLightPackage.MODEL__PROCESSES:
        return processes != null && !processes.isEmpty();
      case ScelLightPackage.MODEL__COMPONENTS:
        return components != null && !components.isEmpty();
      case ScelLightPackage.MODEL__SYSTEMS:
        return systems != null && !systems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
