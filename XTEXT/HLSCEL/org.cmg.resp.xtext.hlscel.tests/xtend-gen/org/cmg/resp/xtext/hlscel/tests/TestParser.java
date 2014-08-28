package org.cmg.resp.xtext.hlscel.tests;

import com.google.inject.Inject;
import org.cmg.resp.xtext.hlscel.HLScelInjectorProvider;
import org.cmg.resp.xtext.hlscel.hLScel.Model;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(HLScelInjectorProvider.class)
@SuppressWarnings("all")
public class TestParser {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  private String EMPTY_PROCESS = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("process Test( ) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  private String PUT_PROCESS = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("process Test( ) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("put( 2 )@true");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  private String PUT_VARIABLE = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("process Test( ) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x = 1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("put( x )@self");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  @Test
  public void parseEmptyProcess() {
    try {
      Model _parse = this._parseHelper.parse(this.EMPTY_PROCESS);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void compileEmptyProcess() {
    try {
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          Class<?> _compiledClass = it.getCompiledClass();
          Assert.assertNotNull(_compiledClass);
        }
      };
      this._compilationTestHelper.compile(this.EMPTY_PROCESS, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parsePutProcess() {
    try {
      Model _parse = this._parseHelper.parse(this.PUT_PROCESS);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void compilePutProcess() {
    try {
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          Class<?> _compiledClass = it.getCompiledClass();
          Assert.assertNotNull(_compiledClass);
        }
      };
      this._compilationTestHelper.compile(this.PUT_PROCESS, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parsePutVariable() {
    try {
      Model _parse = this._parseHelper.parse(this.PUT_VARIABLE);
      this._validationTestHelper.assertNoIssues(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void compilePutVariable() {
    try {
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          Class<?> _compiledClass = it.getCompiledClass();
          Assert.assertNotNull(_compiledClass);
        }
      };
      this._compilationTestHelper.compile(this.PUT_VARIABLE, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
