package org.cmg.resp.test.poem;

import static org.junit.Assert.*;

import org.cmg.resp.knowledge.adaptors.PoemAdaptor;
import org.cmg.resp.knowledge.adaptors.PoemAdaptor.PoemNonce;
import org.cmg.resp.knowledge.adaptors.PoemList;
import org.cmg.resp.knowledge.adaptors.PoemSymbol;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPoemAdaptor {

	private PoemAdaptor adaptor;
	private PoemNonce nonce;
	
	@Test
	public void testTupleStructure() {
		adaptor = new PoemAdaptor();
		nonce = adaptor.getNonce();
		assertTrue( adaptor.checkCommand( PoemAdaptor.getNonceTuple() ) );
		assertTrue( adaptor.checkCommand( PoemAdaptor.getEvalTuple("(+ 1 2)", nonce) ) );
		assertTrue( adaptor.checkCommand( PoemAdaptor.getAssertTuple(
			new PoemList(new PoemSymbol("FOO") , new PoemSymbol("A")),
			nonce) ) );
	}

}
