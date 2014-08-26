package org.cmg.resp.xtext.scellight.tests

import org.eclipse.xtext.junit4.InjectWith
import org.cmg.resp.xtext.scellight.ScelLightInjectorProvider
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.cmg.resp.xtext.scellight.scelLight.Model
import org.eclipse.xtext.junit4.util.ParseHelper
import com.google.inject.Inject
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test

@InjectWith(ScelLightInjectorProvider)
@RunWith(XtextRunner)
class TestParser {
	
	@Inject extension ParseHelper<Model>
	
	@Inject extension ValidationTestHelper
	
	@Test
	def testParser() {
		'''
		const int N = 10;
		
		projection test =
			[ ?[int x] ] -> x+1 : N;
		
		
		process Test( int x ) {
			query( ?[ int y ] )@self;			
			put( x+y )@self;
		}	
		'''.parse.assertNoErrors
	}
	
	@Test
	def testReplaceScope(){
		'''
		process Test (){
			int a;
			replace [ ?[int x] -> x+a];
			get(x)@self;
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def testComponentProcessScope(){
		'''
		attribute a:int;
		process p(int arg){}
		component c (int param) = {a=10}[<10>,p(param)];
		'''.parse.assertNoErrors
	}
	
	@Test
	def testComponentProcessScope2(){
		'''
		attribute a:int;
		process p(int arg){}
		component c1 ( int b ) = {a=10}[<10>,p(b)];
		component c2 ( int c ) = {a=15}[<30>,p(c)];
		'''.parse.assertNoErrors
	}
	
}