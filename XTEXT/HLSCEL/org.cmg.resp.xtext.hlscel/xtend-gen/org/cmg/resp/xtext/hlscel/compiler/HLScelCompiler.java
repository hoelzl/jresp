package org.cmg.resp.xtext.hlscel.compiler;

import org.cmg.resp.xtext.hlscel.hLScel.HLScelCallAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelGetAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelGetPAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPredicate;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryAction;
import org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryPAction;
import org.cmg.resp.xtext.hlscel.hLScel.SelfLiteral;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;

@SuppressWarnings("all")
public class HLScelCompiler extends XbaseCompiler {
  protected void doInternalToJavaStatement(final XExpression expr, final ITreeAppendable it, final boolean isReferenced) {
    boolean _matched = false;
    if (!_matched) {
      if (expr instanceof SelfLiteral) {
        _matched=true;
        this._toJavaStatement(((SelfLiteral)expr), it, isReferenced);
      }
    }
    if (!_matched) {
      if (expr instanceof HLScelPredicate) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (expr instanceof HLScelPutAction) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (expr instanceof HLScelGetAction) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (expr instanceof HLScelQueryAction) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (expr instanceof HLScelGetPAction) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (expr instanceof HLScelQueryPAction) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (expr instanceof HLScelExecAction) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (expr instanceof HLScelCallAction) {
        _matched=true;
      }
    }
    if (!_matched) {
      super.doInternalToJavaStatement(expr, it, isReferenced);
    }
  }
  
  protected void internalToConvertedExpression(final XExpression obj, final ITreeAppendable b) {
    boolean _matched = false;
    if (!_matched) {
      if (obj instanceof SelfLiteral) {
        _matched=true;
        this._toJavaExpression(((SelfLiteral)obj), b);
      }
    }
    if (!_matched) {
      super.internalToConvertedExpression(obj, b);
    }
  }
  
  protected void _toJavaStatement(final SelfLiteral expr, final ITreeAppendable b, final boolean isRefenced) {
    this.generateComment(expr, b, isRefenced);
  }
  
  protected ITreeAppendable _toJavaExpression(final SelfLiteral expr, final ITreeAppendable b) {
    return b.append("true");
  }
}
