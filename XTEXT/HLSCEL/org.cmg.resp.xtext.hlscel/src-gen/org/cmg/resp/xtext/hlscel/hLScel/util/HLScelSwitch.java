/**
 */
package org.cmg.resp.xtext.hlscel.hLScel.util;

import org.cmg.resp.xtext.hlscel.hLScel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XListLiteral;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage
 * @generated
 */
public class HLScelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HLScelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = HLScelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case HLScelPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.MODEL_ELEMENT:
      {
        ModelElement modelElement = (ModelElement)theEObject;
        T result = caseModelElement(modelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.NODE_DECLARATION:
      {
        NodeDeclaration nodeDeclaration = (NodeDeclaration)theEObject;
        T result = caseNodeDeclaration(nodeDeclaration);
        if (result == null) result = caseModelElement(nodeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.PROCESS_DECLARATION:
      {
        ProcessDeclaration processDeclaration = (ProcessDeclaration)theEObject;
        T result = caseProcessDeclaration(processDeclaration);
        if (result == null) result = caseModelElement(processDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.HL_SCEL_PREDICATE:
      {
        HLScelPredicate hlScelPredicate = (HLScelPredicate)theEObject;
        T result = caseHLScelPredicate(hlScelPredicate);
        if (result == null) result = caseXExpression(hlScelPredicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.SELF_LITERAL:
      {
        SelfLiteral selfLiteral = (SelfLiteral)theEObject;
        T result = caseSelfLiteral(selfLiteral);
        if (result == null) result = caseXListLiteral(selfLiteral);
        if (result == null) result = caseXCollectionLiteral(selfLiteral);
        if (result == null) result = caseXExpression(selfLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.HL_SCEL_PUT_ACTION:
      {
        HLScelPutAction hlScelPutAction = (HLScelPutAction)theEObject;
        T result = caseHLScelPutAction(hlScelPutAction);
        if (result == null) result = caseXExpression(hlScelPutAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.HL_SCEL_GET_ACTION:
      {
        HLScelGetAction hlScelGetAction = (HLScelGetAction)theEObject;
        T result = caseHLScelGetAction(hlScelGetAction);
        if (result == null) result = caseXExpression(hlScelGetAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.HL_SCEL_QUERY_ACTION:
      {
        HLScelQueryAction hlScelQueryAction = (HLScelQueryAction)theEObject;
        T result = caseHLScelQueryAction(hlScelQueryAction);
        if (result == null) result = caseXExpression(hlScelQueryAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.HL_SCEL_GET_PACTION:
      {
        HLScelGetPAction hlScelGetPAction = (HLScelGetPAction)theEObject;
        T result = caseHLScelGetPAction(hlScelGetPAction);
        if (result == null) result = caseXExpression(hlScelGetPAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.HL_SCEL_QUERY_PACTION:
      {
        HLScelQueryPAction hlScelQueryPAction = (HLScelQueryPAction)theEObject;
        T result = caseHLScelQueryPAction(hlScelQueryPAction);
        if (result == null) result = caseXExpression(hlScelQueryPAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.HL_SCEL_EXEC_ACTION:
      {
        HLScelExecAction hlScelExecAction = (HLScelExecAction)theEObject;
        T result = caseHLScelExecAction(hlScelExecAction);
        if (result == null) result = caseXExpression(hlScelExecAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.HL_SCEL_CALL_ACTION:
      {
        HLScelCallAction hlScelCallAction = (HLScelCallAction)theEObject;
        T result = caseHLScelCallAction(hlScelCallAction);
        if (result == null) result = caseXExpression(hlScelCallAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLScelPackage.FORMAL_TEMPLATE_FIELD:
      {
        FormalTemplateField formalTemplateField = (FormalTemplateField)theEObject;
        T result = caseFormalTemplateField(formalTemplateField);
        if (result == null) result = caseXExpression(formalTemplateField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElement(ModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeDeclaration(NodeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessDeclaration(ProcessDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHLScelPredicate(HLScelPredicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Self Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelfLiteral(SelfLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Put Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Put Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHLScelPutAction(HLScelPutAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHLScelGetAction(HLScelGetAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHLScelQueryAction(HLScelQueryAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get PAction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get PAction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHLScelGetPAction(HLScelGetPAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query PAction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query PAction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHLScelQueryPAction(HLScelQueryPAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exec Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exec Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHLScelExecAction(HLScelExecAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHLScelCallAction(HLScelCallAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Template Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Template Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalTemplateField(FormalTemplateField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression(XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XCollection Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XCollection Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXCollectionLiteral(XCollectionLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XList Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XList Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXListLiteral(XListLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //HLScelSwitch
