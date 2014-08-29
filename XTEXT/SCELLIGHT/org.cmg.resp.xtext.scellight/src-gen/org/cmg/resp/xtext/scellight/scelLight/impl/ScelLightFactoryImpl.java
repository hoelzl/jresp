/**
 */
package org.cmg.resp.xtext.scellight.scelLight.impl;

import org.cmg.resp.xtext.scellight.scelLight.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScelLightFactoryImpl extends EFactoryImpl implements ScelLightFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScelLightFactory init()
  {
    try
    {
      ScelLightFactory theScelLightFactory = (ScelLightFactory)EPackage.Registry.INSTANCE.getEFactory(ScelLightPackage.eNS_URI);
      if (theScelLightFactory != null)
      {
        return theScelLightFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ScelLightFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScelLightFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ScelLightPackage.MODEL: return createModel();
      case ScelLightPackage.ATTRIBUTE_DECLARATION: return createAttributeDeclaration();
      case ScelLightPackage.PROJECTION_DECLARATION: return createProjectionDeclaration();
      case ScelLightPackage.PROJECTION_EXPRESSION: return createProjectionExpression();
      case ScelLightPackage.CONSTANT_DECLARATION: return createConstantDeclaration();
      case ScelLightPackage.COMPONENT_DECLARATION: return createComponentDeclaration();
      case ScelLightPackage.COMPONENT_EXPRESSION: return createComponentExpression();
      case ScelLightPackage.COMPONENT_REFERENCE: return createComponentReference();
      case ScelLightPackage.COMPONENT_CONSTANT: return createComponentConstant();
      case ScelLightPackage.PROCESS_EXPRESSION: return createProcessExpression();
      case ScelLightPackage.KNOWLEDGE: return createKnowledge();
      case ScelLightPackage.INTERFACE: return createInterface();
      case ScelLightPackage.ID_ATTRIBUTE_DEFINITION: return createIdAttributeDefinition();
      case ScelLightPackage.ATTRIBUTE_INSTANTIATION: return createAttributeInstantiation();
      case ScelLightPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      case ScelLightPackage.PROCESS_DECLARATION: return createProcessDeclaration();
      case ScelLightPackage.VARIABLE: return createVariable();
      case ScelLightPackage.REFERENCEABLE_ELEMENTS: return createReferenceableElements();
      case ScelLightPackage.COMMAND: return createCommand();
      case ScelLightPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case ScelLightPackage.ACTION: return createAction();
      case ScelLightPackage.REPLACE_ACTION: return createReplaceAction();
      case ScelLightPackage.GET_ACTION: return createGetAction();
      case ScelLightPackage.QUERY_ACTION: return createQueryAction();
      case ScelLightPackage.PUT_ACTION: return createPutAction();
      case ScelLightPackage.EXEC_ACTION: return createExecAction();
      case ScelLightPackage.TUPLE: return createTuple();
      case ScelLightPackage.TEMPLATE: return createTemplate();
      case ScelLightPackage.TEMPLATE_FIELD: return createTemplateField();
      case ScelLightPackage.ANY_FORMAL_FIELD: return createAnyFormalField();
      case ScelLightPackage.TYPED_FORMAL_FIELD: return createTypedFormalField();
      case ScelLightPackage.FORMAL_FIELD: return createFormalField();
      case ScelLightPackage.ACTUAL_FIELD: return createActualField();
      case ScelLightPackage.WHILE: return createWhile();
      case ScelLightPackage.IF_THEN_ELSE: return createIfThenElse();
      case ScelLightPackage.BLOCK: return createBlock();
      case ScelLightPackage.EXPRESSION: return createExpression();
      case ScelLightPackage.SELF_EXPRESSION: return createSelfExpression();
      case ScelLightPackage.ID_ATTRIBUTE: return createIdAttribute();
      case ScelLightPackage.STRING_LITERAL: return createStringLiteral();
      case ScelLightPackage.REFERENCE: return createReference();
      case ScelLightPackage.NUMBER_LITERAL: return createNumberLiteral();
      case ScelLightPackage.FACTORIAL_EXPRESSION: return createFactorialExpression();
      case ScelLightPackage.LOG_EXPRESSION: return createLogExpression();
      case ScelLightPackage.MOD_EXPRESSION: return createModExpression();
      case ScelLightPackage.POW_EXPRESSION: return createPowExpression();
      case ScelLightPackage.FLOOR_EXPRESSION: return createFloorExpression();
      case ScelLightPackage.CEIL_EXPRESSION: return createCeilExpression();
      case ScelLightPackage.MIN_EXPRESSION: return createMinExpression();
      case ScelLightPackage.MAX_EXPRESSION: return createMaxExpression();
      case ScelLightPackage.SIN_EXPRESSION: return createSinExpression();
      case ScelLightPackage.COS_EXPRESSION: return createCosExpression();
      case ScelLightPackage.TAN_EXPRESSION: return createTanExpression();
      case ScelLightPackage.ATAN_EXPRESSION: return createATanExpression();
      case ScelLightPackage.ASIN_EXPRESSION: return createASinExpression();
      case ScelLightPackage.ACOS_EXPRESSION: return createACosExpression();
      case ScelLightPackage.SYSTEM_DECLARATION: return createSystemDeclaration();
      case ScelLightPackage.PROCESS_REFERENCE: return createProcessReference();
      case ScelLightPackage.EMPTY_PROCESS: return createEmptyProcess();
      case ScelLightPackage.STANDARD_FORMAL_FIELD: return createStandardFormalField();
      case ScelLightPackage.FORMAL_FIELD_WITH_DECLARATION: return createFormalFieldWithDeclaration();
      case ScelLightPackage.DISJUNCTION: return createDisjunction();
      case ScelLightPackage.CONJUNCTION: return createConjunction();
      case ScelLightPackage.NEGATION: return createNegation();
      case ScelLightPackage.RELATION: return createRelation();
      case ScelLightPackage.SUMMATION_SUBTRACTION: return createSummationSubtraction();
      case ScelLightPackage.MULTIPLICATION_DIVISION: return createMultiplicationDivision();
      case ScelLightPackage.TRUE_EXPRESSION: return createTrueExpression();
      case ScelLightPackage.FALSE_EXPRESSION: return createFalseExpression();
      case ScelLightPackage.IF_THEN_ELSE_EXPRESSION: return createIfThenElseExpression();
      case ScelLightPackage.ID_EXPRESSION: return createIdExpression();
      case ScelLightPackage.CALL: return createCall();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ScelLightPackage.TYPE:
        return createTypeFromString(eDataType, initialValue);
      case ScelLightPackage.RELATION_SYMBOL:
        return createRelationSymbolFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ScelLightPackage.TYPE:
        return convertTypeToString(eDataType, instanceValue);
      case ScelLightPackage.RELATION_SYMBOL:
        return convertRelationSymbolToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDeclaration createAttributeDeclaration()
  {
    AttributeDeclarationImpl attributeDeclaration = new AttributeDeclarationImpl();
    return attributeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectionDeclaration createProjectionDeclaration()
  {
    ProjectionDeclarationImpl projectionDeclaration = new ProjectionDeclarationImpl();
    return projectionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectionExpression createProjectionExpression()
  {
    ProjectionExpressionImpl projectionExpression = new ProjectionExpressionImpl();
    return projectionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDeclaration createConstantDeclaration()
  {
    ConstantDeclarationImpl constantDeclaration = new ConstantDeclarationImpl();
    return constantDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDeclaration createComponentDeclaration()
  {
    ComponentDeclarationImpl componentDeclaration = new ComponentDeclarationImpl();
    return componentDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentExpression createComponentExpression()
  {
    ComponentExpressionImpl componentExpression = new ComponentExpressionImpl();
    return componentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentReference createComponentReference()
  {
    ComponentReferenceImpl componentReference = new ComponentReferenceImpl();
    return componentReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentConstant createComponentConstant()
  {
    ComponentConstantImpl componentConstant = new ComponentConstantImpl();
    return componentConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessExpression createProcessExpression()
  {
    ProcessExpressionImpl processExpression = new ProcessExpressionImpl();
    return processExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Knowledge createKnowledge()
  {
    KnowledgeImpl knowledge = new KnowledgeImpl();
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdAttributeDefinition createIdAttributeDefinition()
  {
    IdAttributeDefinitionImpl idAttributeDefinition = new IdAttributeDefinitionImpl();
    return idAttributeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeInstantiation createAttributeInstantiation()
  {
    AttributeInstantiationImpl attributeInstantiation = new AttributeInstantiationImpl();
    return attributeInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessDeclaration createProcessDeclaration()
  {
    ProcessDeclarationImpl processDeclaration = new ProcessDeclarationImpl();
    return processDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceableElements createReferenceableElements()
  {
    ReferenceableElementsImpl referenceableElements = new ReferenceableElementsImpl();
    return referenceableElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReplaceAction createReplaceAction()
  {
    ReplaceActionImpl replaceAction = new ReplaceActionImpl();
    return replaceAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetAction createGetAction()
  {
    GetActionImpl getAction = new GetActionImpl();
    return getAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryAction createQueryAction()
  {
    QueryActionImpl queryAction = new QueryActionImpl();
    return queryAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PutAction createPutAction()
  {
    PutActionImpl putAction = new PutActionImpl();
    return putAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecAction createExecAction()
  {
    ExecActionImpl execAction = new ExecActionImpl();
    return execAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tuple createTuple()
  {
    TupleImpl tuple = new TupleImpl();
    return tuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template createTemplate()
  {
    TemplateImpl template = new TemplateImpl();
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateField createTemplateField()
  {
    TemplateFieldImpl templateField = new TemplateFieldImpl();
    return templateField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyFormalField createAnyFormalField()
  {
    AnyFormalFieldImpl anyFormalField = new AnyFormalFieldImpl();
    return anyFormalField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedFormalField createTypedFormalField()
  {
    TypedFormalFieldImpl typedFormalField = new TypedFormalFieldImpl();
    return typedFormalField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalField createFormalField()
  {
    FormalFieldImpl formalField = new FormalFieldImpl();
    return formalField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualField createActualField()
  {
    ActualFieldImpl actualField = new ActualFieldImpl();
    return actualField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThenElse createIfThenElse()
  {
    IfThenElseImpl ifThenElse = new IfThenElseImpl();
    return ifThenElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfExpression createSelfExpression()
  {
    SelfExpressionImpl selfExpression = new SelfExpressionImpl();
    return selfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdAttribute createIdAttribute()
  {
    IdAttributeImpl idAttribute = new IdAttributeImpl();
    return idAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactorialExpression createFactorialExpression()
  {
    FactorialExpressionImpl factorialExpression = new FactorialExpressionImpl();
    return factorialExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogExpression createLogExpression()
  {
    LogExpressionImpl logExpression = new LogExpressionImpl();
    return logExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModExpression createModExpression()
  {
    ModExpressionImpl modExpression = new ModExpressionImpl();
    return modExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PowExpression createPowExpression()
  {
    PowExpressionImpl powExpression = new PowExpressionImpl();
    return powExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloorExpression createFloorExpression()
  {
    FloorExpressionImpl floorExpression = new FloorExpressionImpl();
    return floorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CeilExpression createCeilExpression()
  {
    CeilExpressionImpl ceilExpression = new CeilExpressionImpl();
    return ceilExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinExpression createMinExpression()
  {
    MinExpressionImpl minExpression = new MinExpressionImpl();
    return minExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxExpression createMaxExpression()
  {
    MaxExpressionImpl maxExpression = new MaxExpressionImpl();
    return maxExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SinExpression createSinExpression()
  {
    SinExpressionImpl sinExpression = new SinExpressionImpl();
    return sinExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CosExpression createCosExpression()
  {
    CosExpressionImpl cosExpression = new CosExpressionImpl();
    return cosExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TanExpression createTanExpression()
  {
    TanExpressionImpl tanExpression = new TanExpressionImpl();
    return tanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ATanExpression createATanExpression()
  {
    ATanExpressionImpl aTanExpression = new ATanExpressionImpl();
    return aTanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASinExpression createASinExpression()
  {
    ASinExpressionImpl aSinExpression = new ASinExpressionImpl();
    return aSinExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ACosExpression createACosExpression()
  {
    ACosExpressionImpl aCosExpression = new ACosExpressionImpl();
    return aCosExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemDeclaration createSystemDeclaration()
  {
    SystemDeclarationImpl systemDeclaration = new SystemDeclarationImpl();
    return systemDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessReference createProcessReference()
  {
    ProcessReferenceImpl processReference = new ProcessReferenceImpl();
    return processReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyProcess createEmptyProcess()
  {
    EmptyProcessImpl emptyProcess = new EmptyProcessImpl();
    return emptyProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StandardFormalField createStandardFormalField()
  {
    StandardFormalFieldImpl standardFormalField = new StandardFormalFieldImpl();
    return standardFormalField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalFieldWithDeclaration createFormalFieldWithDeclaration()
  {
    FormalFieldWithDeclarationImpl formalFieldWithDeclaration = new FormalFieldWithDeclarationImpl();
    return formalFieldWithDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disjunction createDisjunction()
  {
    DisjunctionImpl disjunction = new DisjunctionImpl();
    return disjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conjunction createConjunction()
  {
    ConjunctionImpl conjunction = new ConjunctionImpl();
    return conjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Negation createNegation()
  {
    NegationImpl negation = new NegationImpl();
    return negation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SummationSubtraction createSummationSubtraction()
  {
    SummationSubtractionImpl summationSubtraction = new SummationSubtractionImpl();
    return summationSubtraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicationDivision createMultiplicationDivision()
  {
    MultiplicationDivisionImpl multiplicationDivision = new MultiplicationDivisionImpl();
    return multiplicationDivision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrueExpression createTrueExpression()
  {
    TrueExpressionImpl trueExpression = new TrueExpressionImpl();
    return trueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FalseExpression createFalseExpression()
  {
    FalseExpressionImpl falseExpression = new FalseExpressionImpl();
    return falseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThenElseExpression createIfThenElseExpression()
  {
    IfThenElseExpressionImpl ifThenElseExpression = new IfThenElseExpressionImpl();
    return ifThenElseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdExpression createIdExpression()
  {
    IdExpressionImpl idExpression = new IdExpressionImpl();
    return idExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createTypeFromString(EDataType eDataType, String initialValue)
  {
    Type result = Type.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationSymbol createRelationSymbolFromString(EDataType eDataType, String initialValue)
  {
    RelationSymbol result = RelationSymbol.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRelationSymbolToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScelLightPackage getScelLightPackage()
  {
    return (ScelLightPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ScelLightPackage getPackage()
  {
    return ScelLightPackage.eINSTANCE;
  }

} //ScelLightFactoryImpl
