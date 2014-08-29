package org.cmg.resp.xtext.hlscel.types;

import org.cmg.resp.topology.Group;
import org.cmg.resp.topology.Self;
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
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;

@SuppressWarnings("all")
public class HLScelTypeComputer extends XbaseWithAnnotationsTypeComputer {
  public void computeTypes(final XExpression expression, final ITypeComputationState state) {
    boolean _matched = false;
    if (!_matched) {
      if (expression instanceof SelfLiteral) {
        _matched=true;
        LightweightTypeReference _typeForName = this.getTypeForName(Self.class, state);
        state.acceptActualType(_typeForName);
      }
    }
    if (!_matched) {
      if (expression instanceof HLScelPredicate) {
        _matched=true;
        LightweightTypeReference _typeForName = this.getTypeForName(Group.class, state);
        state.acceptActualType(_typeForName);
      }
    }
    if (!_matched) {
      if (expression instanceof HLScelPutAction) {
        _matched=true;
        LightweightTypeReference _typeForName = this.getTypeForName(Void.TYPE, state);
        state.acceptActualType(_typeForName);
      }
    }
    if (!_matched) {
      if (expression instanceof HLScelGetAction) {
        _matched=true;
        LightweightTypeReference _typeForName = this.getTypeForName(Void.TYPE, state);
        state.acceptActualType(_typeForName);
      }
    }
    if (!_matched) {
      if (expression instanceof HLScelQueryAction) {
        _matched=true;
        LightweightTypeReference _typeForName = this.getTypeForName(Void.TYPE, state);
        state.acceptActualType(_typeForName);
      }
    }
    if (!_matched) {
      if (expression instanceof HLScelGetPAction) {
        _matched=true;
        LightweightTypeReference _typeForName = this.getTypeForName(Void.TYPE, state);
        state.acceptActualType(_typeForName);
      }
    }
    if (!_matched) {
      if (expression instanceof HLScelQueryPAction) {
        _matched=true;
        LightweightTypeReference _typeForName = this.getTypeForName(Void.TYPE, state);
        state.acceptActualType(_typeForName);
      }
    }
    if (!_matched) {
      if (expression instanceof HLScelExecAction) {
        _matched=true;
        LightweightTypeReference _typeForName = this.getTypeForName(Void.TYPE, state);
        state.acceptActualType(_typeForName);
      }
    }
    if (!_matched) {
      if (expression instanceof HLScelCallAction) {
        _matched=true;
        LightweightTypeReference _typeForName = this.getTypeForName(Void.TYPE, state);
        state.acceptActualType(_typeForName);
      }
    }
    if (!_matched) {
      super.computeTypes(expression, state);
    }
  }
}
