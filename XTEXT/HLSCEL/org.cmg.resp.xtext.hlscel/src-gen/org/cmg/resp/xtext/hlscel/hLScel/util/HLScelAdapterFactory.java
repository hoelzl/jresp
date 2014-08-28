/**
 */
package org.cmg.resp.xtext.hlscel.hLScel.util;

import org.cmg.resp.xtext.hlscel.hLScel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XListLiteral;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPackage
 * @generated
 */
public class HLScelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HLScelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLScelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = HLScelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HLScelSwitch<Adapter> modelSwitch =
    new HLScelSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseModelElement(ModelElement object)
      {
        return createModelElementAdapter();
      }
      @Override
      public Adapter caseNodeDeclaration(NodeDeclaration object)
      {
        return createNodeDeclarationAdapter();
      }
      @Override
      public Adapter caseProcessDeclaration(ProcessDeclaration object)
      {
        return createProcessDeclarationAdapter();
      }
      @Override
      public Adapter caseHLScelPredicate(HLScelPredicate object)
      {
        return createHLScelPredicateAdapter();
      }
      @Override
      public Adapter caseSelfLiteral(SelfLiteral object)
      {
        return createSelfLiteralAdapter();
      }
      @Override
      public Adapter caseHLScelPutAction(HLScelPutAction object)
      {
        return createHLScelPutActionAdapter();
      }
      @Override
      public Adapter caseHLScelGetAction(HLScelGetAction object)
      {
        return createHLScelGetActionAdapter();
      }
      @Override
      public Adapter caseHLScelQueryAction(HLScelQueryAction object)
      {
        return createHLScelQueryActionAdapter();
      }
      @Override
      public Adapter caseHLScelGetPAction(HLScelGetPAction object)
      {
        return createHLScelGetPActionAdapter();
      }
      @Override
      public Adapter caseHLScelQueryPAction(HLScelQueryPAction object)
      {
        return createHLScelQueryPActionAdapter();
      }
      @Override
      public Adapter caseHLScelExecAction(HLScelExecAction object)
      {
        return createHLScelExecActionAdapter();
      }
      @Override
      public Adapter caseHLScelCallAction(HLScelCallAction object)
      {
        return createHLScelCallActionAdapter();
      }
      @Override
      public Adapter caseFormalTemplateField(FormalTemplateField object)
      {
        return createFormalTemplateFieldAdapter();
      }
      @Override
      public Adapter caseXExpression(XExpression object)
      {
        return createXExpressionAdapter();
      }
      @Override
      public Adapter caseXCollectionLiteral(XCollectionLiteral object)
      {
        return createXCollectionLiteralAdapter();
      }
      @Override
      public Adapter caseXListLiteral(XListLiteral object)
      {
        return createXListLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.NodeDeclaration <em>Node Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.NodeDeclaration
   * @generated
   */
  public Adapter createNodeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration <em>Process Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration
   * @generated
   */
  public Adapter createProcessDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPredicate
   * @generated
   */
  public Adapter createHLScelPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.SelfLiteral <em>Self Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.SelfLiteral
   * @generated
   */
  public Adapter createSelfLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction <em>Put Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction
   * @generated
   */
  public Adapter createHLScelPutActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelGetAction <em>Get Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelGetAction
   * @generated
   */
  public Adapter createHLScelGetActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryAction <em>Query Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryAction
   * @generated
   */
  public Adapter createHLScelQueryActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelGetPAction <em>Get PAction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelGetPAction
   * @generated
   */
  public Adapter createHLScelGetPActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryPAction <em>Query PAction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryPAction
   * @generated
   */
  public Adapter createHLScelQueryPActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction <em>Exec Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction
   * @generated
   */
  public Adapter createHLScelExecActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.HLScelCallAction <em>Call Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.HLScelCallAction
   * @generated
   */
  public Adapter createHLScelCallActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.cmg.resp.xtext.hlscel.hLScel.FormalTemplateField <em>Formal Template Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.cmg.resp.xtext.hlscel.hLScel.FormalTemplateField
   * @generated
   */
  public Adapter createFormalTemplateFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XExpression
   * @generated
   */
  public Adapter createXExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XCollectionLiteral <em>XCollection Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XCollectionLiteral
   * @generated
   */
  public Adapter createXCollectionLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XListLiteral <em>XList Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XListLiteral
   * @generated
   */
  public Adapter createXListLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //HLScelAdapterFactory
