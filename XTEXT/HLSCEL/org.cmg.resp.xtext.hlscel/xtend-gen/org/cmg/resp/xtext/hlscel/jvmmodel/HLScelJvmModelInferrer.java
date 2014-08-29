package org.cmg.resp.xtext.hlscel.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.cmg.resp.behaviour.Agent;
import org.cmg.resp.xtext.hlscel.hLScel.ProcessDeclaration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class HLScelJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  /**
   * The dispatch method {@code infer} is called for each instance of the
   * given element's type that is contained in a resource.
   * 
   * @param element
   *            the model to create one or more
   *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
   *            types} from.
   * @param acceptor
   *            each created
   *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
   *            without a container should be passed to the acceptor in order
   *            get attached to the current resource. The acceptor's
   *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
   *            accept(..)} method takes the constructed empty type for the
   *            pre-indexing phase. This one is further initialized in the
   *            indexing phase using the closure you pass to the returned
   *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
   *            initializeLater(..)}.
   * @param isPreIndexingPhase
   *            whether the method is called in a pre-indexing phase, i.e.
   *            when the global index is not yet fully updated. You must not
   *            rely on linking using the index if isPreIndexingPhase is
   *            <code>true</code>.
   */
  protected void _infer(final ProcessDeclaration process, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = process.getName();
    String _plus = ("processes." + _name);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(process, _plus);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = HLScelJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(process);
        HLScelJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _newTypeRef = HLScelJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(it, Agent.class);
        HLScelJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
        EList<JvmMember> _members = it.getMembers();
        final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("super(\"");
                String _name = process.getName();
                _builder.append(_name, "");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
              }
            };
            HLScelJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmConstructor _constructor = HLScelJvmModelInferrer.this._jvmTypesBuilder.toConstructor(process, _function);
        HLScelJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _newTypeRef_1 = HLScelJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(it, Void.TYPE);
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _args = process.getArgs();
            for (final JvmFormalParameter p : _args) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              String _name = p.getName();
              JvmTypeReference _parameterType = p.getParameterType();
              JvmFormalParameter _parameter = HLScelJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name, _parameterType);
              HLScelJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            }
            XExpression _body = process.getBody();
            HLScelJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
          }
        };
        JvmOperation _method = HLScelJvmModelInferrer.this._jvmTypesBuilder.toMethod(process, "doRun", _newTypeRef_1, _function_1);
        HLScelJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
      }
    };
    _accept.initializeLater(_function);
  }
  
  public void infer(final EObject process, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (process instanceof ProcessDeclaration) {
      _infer((ProcessDeclaration)process, acceptor, isPreIndexingPhase);
      return;
    } else if (process != null) {
      _infer(process, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(process, acceptor, isPreIndexingPhase).toString());
    }
  }
}
