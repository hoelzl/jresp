package org.cmg.resp.xtext.hlscel.types

import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.XExpression
import org.cmg.resp.xtext.hlscel.hLScel.SelfLiteral
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction
import org.cmg.resp.xtext.hlscel.hLScel.HScelGetAction

class HLScelTypeComputer extends XbaseWithAnnotationsTypeComputer {
	
	override computeTypes( XExpression expression , ITypeComputationState state ) {
		if (expression instanceof SelfLiteral) {
			var result = getTypeForName(Boolean.TYPE, state);
			state.acceptActualType(result);
		} else if (expression instanceof HLScelPutAction) {
			var result = getTypeForName(Boolean.TYPE, state);
			state.acceptActualType(result);			
		} else if (expression instanceof HScelGetAction) {
			var result = getTypeForName(Boolean.TYPE, state);
			state.acceptActualType(result)
		} else {
			super.computeTypes( expression , state )
		}
	}
	
}