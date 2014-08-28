package org.cmg.resp.xtext.hlscel.types

import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.XExpression
import org.cmg.resp.xtext.hlscel.hLScel.SelfLiteral
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction
import org.cmg.resp.xtext.hlscel.hLScel.HLScelGetAction
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPredicate
import org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryAction
import org.cmg.resp.xtext.hlscel.hLScel.HLScelGetPAction
import org.cmg.resp.xtext.hlscel.hLScel.HLScelQueryPAction
import org.cmg.resp.xtext.hlscel.hLScel.HLScelExecAction
import org.cmg.resp.xtext.hlscel.hLScel.HLScelCallAction
import org.cmg.resp.topology.Self
import org.cmg.resp.topology.Group

class HLScelTypeComputer extends XbaseWithAnnotationsTypeComputer {
	
	override computeTypes( XExpression expression , ITypeComputationState state ) {
		switch expression {
			SelfLiteral: {
				state.acceptActualType( getTypeForName( typeof(Self) , state ) )				
			}
			HLScelPredicate: {
				state.acceptActualType( getTypeForName( typeof(Group) , state ) )				
			}
			HLScelPutAction: {
				state.acceptActualType( getTypeForName( Void::TYPE , state ) )
			}
			HLScelGetAction: {
				state.acceptActualType( getTypeForName( Void::TYPE , state ) )				
			}
			HLScelQueryAction: {
				state.acceptActualType( getTypeForName( Void::TYPE , state ) )
			}
			HLScelGetPAction: {
				state.acceptActualType( getTypeForName( Void::TYPE , state ) )
			}
			HLScelQueryPAction: {
				state.acceptActualType( getTypeForName( Void::TYPE , state ) )
			}
			HLScelExecAction: {
				state.acceptActualType( getTypeForName( Void::TYPE , state ) )
			}
			HLScelCallAction: {
				state.acceptActualType( getTypeForName( Void::TYPE , state ) )
			}
			default: {
				super.computeTypes( expression , state )
			}
		}
	}
	
}