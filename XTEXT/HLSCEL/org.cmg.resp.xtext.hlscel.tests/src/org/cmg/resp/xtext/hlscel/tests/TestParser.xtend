package org.cmg.resp.xtext.hlscel.tests

import com.google.inject.Inject
import org.cmg.resp.xtext.hlscel.HLScelInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.cmg.resp.xtext.hlscel.hLScel.Model
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HLScelInjectorProvider))
class TestParser {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	
	@Test
	def firstTest( ) {
		'''
		process Test( ) {
			put( 2 )@self
		}
		'''.parse.assertNoErrors
	}
}