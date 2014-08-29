/**
 */
package org.cmg.resp.xtext.scellight.scelLight.impl;

import org.cmg.resp.xtext.scellight.scelLight.NumberLiteral;
import org.cmg.resp.xtext.scellight.scelLight.ScelLightPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.NumberLiteralImpl#getIntpart <em>Intpart</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.NumberLiteralImpl#isIsDouble <em>Is Double</em>}</li>
 *   <li>{@link org.cmg.resp.xtext.scellight.scelLight.impl.NumberLiteralImpl#getDecimal <em>Decimal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberLiteralImpl extends ExpressionImpl implements NumberLiteral
{
  /**
   * The default value of the '{@link #getIntpart() <em>Intpart</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntpart()
   * @generated
   * @ordered
   */
  protected static final int INTPART_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntpart() <em>Intpart</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntpart()
   * @generated
   * @ordered
   */
  protected int intpart = INTPART_EDEFAULT;

  /**
   * The default value of the '{@link #isIsDouble() <em>Is Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDouble()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DOUBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDouble() <em>Is Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDouble()
   * @generated
   * @ordered
   */
  protected boolean isDouble = IS_DOUBLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDecimal() <em>Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimal()
   * @generated
   * @ordered
   */
  protected static final int DECIMAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDecimal() <em>Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimal()
   * @generated
   * @ordered
   */
  protected int decimal = DECIMAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberLiteralImpl()
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
    return ScelLightPackage.Literals.NUMBER_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntpart()
  {
    return intpart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntpart(int newIntpart)
  {
    int oldIntpart = intpart;
    intpart = newIntpart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScelLightPackage.NUMBER_LITERAL__INTPART, oldIntpart, intpart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDouble()
  {
    return isDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDouble(boolean newIsDouble)
  {
    boolean oldIsDouble = isDouble;
    isDouble = newIsDouble;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScelLightPackage.NUMBER_LITERAL__IS_DOUBLE, oldIsDouble, isDouble));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDecimal()
  {
    return decimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecimal(int newDecimal)
  {
    int oldDecimal = decimal;
    decimal = newDecimal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScelLightPackage.NUMBER_LITERAL__DECIMAL, oldDecimal, decimal));
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
      case ScelLightPackage.NUMBER_LITERAL__INTPART:
        return getIntpart();
      case ScelLightPackage.NUMBER_LITERAL__IS_DOUBLE:
        return isIsDouble();
      case ScelLightPackage.NUMBER_LITERAL__DECIMAL:
        return getDecimal();
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
      case ScelLightPackage.NUMBER_LITERAL__INTPART:
        setIntpart((Integer)newValue);
        return;
      case ScelLightPackage.NUMBER_LITERAL__IS_DOUBLE:
        setIsDouble((Boolean)newValue);
        return;
      case ScelLightPackage.NUMBER_LITERAL__DECIMAL:
        setDecimal((Integer)newValue);
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
      case ScelLightPackage.NUMBER_LITERAL__INTPART:
        setIntpart(INTPART_EDEFAULT);
        return;
      case ScelLightPackage.NUMBER_LITERAL__IS_DOUBLE:
        setIsDouble(IS_DOUBLE_EDEFAULT);
        return;
      case ScelLightPackage.NUMBER_LITERAL__DECIMAL:
        setDecimal(DECIMAL_EDEFAULT);
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
      case ScelLightPackage.NUMBER_LITERAL__INTPART:
        return intpart != INTPART_EDEFAULT;
      case ScelLightPackage.NUMBER_LITERAL__IS_DOUBLE:
        return isDouble != IS_DOUBLE_EDEFAULT;
      case ScelLightPackage.NUMBER_LITERAL__DECIMAL:
        return decimal != DECIMAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (intpart: ");
    result.append(intpart);
    result.append(", isDouble: ");
    result.append(isDouble);
    result.append(", decimal: ");
    result.append(decimal);
    result.append(')');
    return result.toString();
  }

} //NumberLiteralImpl
