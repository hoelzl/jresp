package org.cmg.resp.xtext.hlscel.compiler

import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.cmg.resp.xtext.hlscel.hLScel.SelfLiteral
import org.cmg.resp.xtext.hlscel.hLScel.HLScelPutAction

class HLScelCompiler extends XbaseCompiler {
	
	override protected doInternalToJavaStatement(XExpression expr, 
                                               ITreeAppendable it, 
                                               boolean isReferenced) {
//        if (expr instanceof SelfLiteral) {
//			_toJavaStatement((Self) obj, appendable, isReferenced);
//		}
		switch expr {
			SelfLiteral: {
				_toJavaStatement(expr,it,isReferenced)
			
			}
			HLScelPutAction: {
				append('''true''')
			}
			default:
				super.doInternalToJavaStatement(expr,it,isReferenced)
		}                                          	
    }
    
    override protected internalToConvertedExpression(XExpression obj, 
                                                 ITreeAppendable b) {
      switch obj {
      	SelfLiteral: {
      		_toJavaExpression(obj,b)
      	}
      	default:
		    super.internalToConvertedExpression(obj, b)       	
      }
//	  if (hasName(obj))
//		    append(getName(obj))
//		  else 
//		    super.internalToConvertedExpression(obj, it) 
	}
	
	def protected _toJavaStatement( SelfLiteral expr , ITreeAppendable b , boolean isRefenced ) {
		generateComment( expr , b , isRefenced )
	}
	
	def protected _toJavaExpression( SelfLiteral expr , ITreeAppendable b ) {
		b.append( "true" )
	}

//	def protected _toJavaStatement( HLScelPutAction expr , ITreeAppendable b , boolean isRefenced ) {
//		generateComment( expr , b , isRefenced )
//	}

	
	
}