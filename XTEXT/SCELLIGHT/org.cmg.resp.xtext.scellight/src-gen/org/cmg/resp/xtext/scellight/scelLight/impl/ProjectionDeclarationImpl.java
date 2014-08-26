/**
 */
package org.cmg.resp.xtext.scellight.scelLight.impl;

import org.cmg.resp.xtext.scellight.scelLight.ProjectionDeclaration;
import org.cmg.resp.xtext.scellight.scelLight.ProjectionExpression;
import org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projection Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.ProjectionDeclarationImpl#getProjection <em>Projection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectionDeclarationImpl extends ReferenceableElementsImpl implements ProjectionDeclaration
{
  /**
   * The cached value of the '{@link #getProjection() <em>Projection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjection()
   * @generated
   * @ordered
   */
  protected ProjectionExpression projection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectionDeclarationImpl()
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
    return ScelLightPackage.Literals.PROJECTION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectionExpression getProjection()
  {
    return projection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProjection(ProjectionExpression newProjection, NotificationChain msgs)
  {
    ProjectionExpression oldProjection = projection;
    projection = newProjection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScelLightPackage.PROJECTION_DECLARATION__PROJECTION, oldProjection, newProjection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjection(ProjectionExpression newProjection)
  {
    if (newProjection != projection)
    {
      NotificationChain msgs = null;
      if (projection != null)
        msgs = ((InternalEObject)projection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.PROJECTION_DECLARATION__PROJECTION, null, msgs);
      if (newProjection != null)
        msgs = ((InternalEObject)newProjection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScelLightPackage.PROJECTION_DECLARATION__PROJECTION, null, msgs);
      msgs = basicSetProjection(newProjection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScelLightPackage.PROJECTION_DECLARATION__PROJECTION, newProjection, newProjection));
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
      case ScelLightPackage.PROJECTION_DECLARATION__PROJECTION:
        return basicSetProjection(null, msgs);
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
      case ScelLightPackage.PROJECTION_DECLARATION__PROJECTION:
        return getProjection();
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
      case ScelLightPackage.PROJECTION_DECLARATION__PROJECTION:
        setProjection((ProjectionExpression)newValue);
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
      case ScelLightPackage.PROJECTION_DECLARATION__PROJECTION:
        setProjection((ProjectionExpression)null);
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
      case ScelLightPackage.PROJECTION_DECLARATION__PROJECTION:
        return projection != null;
    }
    return super.eIsSet(featureID);
  }

} //ProjectionDeclarationImpl
