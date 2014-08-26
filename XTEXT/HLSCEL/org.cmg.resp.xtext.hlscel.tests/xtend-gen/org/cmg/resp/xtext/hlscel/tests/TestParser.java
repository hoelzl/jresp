package org.cmg.resp.xtext.hlscel.tests;

import com.google.inject.Inject;
import org.cmg.resp.xtext.hlscel.HLScelInjectorProvider;
import org.cmg.resp.xtext.hlscel.hLScel.Model;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
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
  
  @Test
  public void firstTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("process Test( ) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("put( 2 )@self");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
