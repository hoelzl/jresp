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
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.Assert

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HLScelInjectorProvider))
class TestParser {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	var EMPTY_PROCESS = 		'''

		process Test( ) {
			
		}
		
	'''
	
	var PUT_PROCESS = '''
	
		process Test( ) {
			put( 2 )@true
		}
	
	'''

	var PUT_VARIABLE = '''

		process Test( ) {
			var x = 1
			put( x )@self
		}
	
	'''	
	
	@Test
	def parseEmptyProcess( ) {
		EMPTY_PROCESS.parse.assertNoErrors
	}
	
	@Test 
	def compileEmptyProcess( ) {
		EMPTY_PROCESS.compile[
			Assert::assertNotNull( it.compiledClass )
		]	
	}
	
	@Test
	def parsePutProcess( ) {
		PUT_PROCESS.parse.assertNoErrors
	}
	
	@Test
	def compilePutProcess( ) {
		PUT_PROCESS.compile[
			Assert::assertNotNull( it.compiledClass )
		]
	}
	
	@Test
	def parsePutVariable( ) {
		PUT_VARIABLE.parse.assertNoIssues
	}

	@Test
	def compilePutVariable( ) {
		PUT_VARIABLE.compile[
			Assert::assertNotNull( it.compiledClass )
		]
	}
	
}