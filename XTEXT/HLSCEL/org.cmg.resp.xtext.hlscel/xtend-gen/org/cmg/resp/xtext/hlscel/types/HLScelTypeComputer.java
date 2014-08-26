package org.cmg.resp.xtext.hlscel.types;

import org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction;
import org.cmg.resp.xtext.hlscel.hLScel.HScelGetAction;
import org.cmg.resp.xtext.hlscel.hLScel.SelfLiteral;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;

@SuppressWarnings("all")
public class HLScelTypeComputer extends XbaseWithAnnotationsTypeComputer {
  public void computeTypes(final XExpression expression, final ITypeComputationState state) {
    if ((expression instanceof SelfLiteral)) {
      LightweightTypeReference result = this.getTypeForName(Boolean.TYPE, state);
      state.acceptActualType(result);
    } else {
      if ((expression instanceof HLScelPutAction)) {
        LightweightTypeReference result_1 = this.getTypeForName(Boolean.TYPE, state);
        state.acceptActualType(result_1);
      } else {
        if ((expression instanceof HScelGetAction)) {
          LightweightTypeReference result_2 = this.getTypeForName(Boolean.TYPE, state);
          state.acceptActualType(result_2);
        } else {
          super.computeTypes(expression, state);
        }
      }
    }
  }
}
