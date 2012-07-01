package org.cmg.scel.test.knowledge;

import static org.junit.Assert.*;

import org.cmg.scel.knowledge.ActualTemplateField;
import org.cmg.scel.knowledge.SCELValue;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.knowledge.ts.TupleSpace;
import org.junit.Test;

public class TupleSpaceTests {

	@Test
	public void testPut() {
		TupleSpace ts = new TupleSpace();
		assertTrue(ts.put( new Tuple( SCELValue.getString("PONG") ) ));
	}

	@Test
	public void testPutGet() throws InterruptedException {
		TupleSpace ts = new TupleSpace();
		Tuple t = new Tuple(SCELValue.getString("PONG"));
		ts.put( t );
		Template temp = new Template( new ActualTemplateField(SCELValue.getString("PONG")) );
		Tuple t2 = ts.get(temp);
		assertEquals(t, t2);
	}

}
