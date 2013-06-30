/**
 * Copyright (c) 2013 Concurrency and Mobility Group.
 * Universitˆ di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp.knowledge.adaptors;

import java.util.Arrays;
import java.util.LinkedList;

import org.armedbear.lisp.Cons;
import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.StructureObject;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.KnowledgeAdapter;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.TemplateField;
import org.cmg.resp.knowledge.Tuple;

/**
 * This is an adaptor that can be used to interact with Poem. 
 * This adaptor is able to handle tuples of the form:
 * 	[ "POEM" , CMD , ARGS , ID ]
 * and templates of the form:
 *  [ "POEM" , CMD , ARGS , ID , ?RESULT ]
 * where:
 * <ol>
 * <li> CMD is a string indicating the specific command;</li>
 * <li> ARGS is a list of of objects;</li>
 * <li> ID is an integer used to guarantee mutual exclusion when
 * processes access to the lisp interpreter</li>
 * <ol>
 * 
 * 
 * 
 * @author Michele Loreti
 *
 */
public class PoemAdaptor implements KnowledgeAdapter {

	public enum PoemCommand {
		INITIALIZE , 
		NEXTANSWER ,
		NEWPROVE ,
		ASSERT ,
		LOCK , 
		UNLOCK , 
		NONCE ,
		EVAL ;
	}
	
	public static Tuple getInitilizeTuple( PoemNonce nonce ) {
		return new Tuple( PoemAdaptor.POEM_KEY , PoemCommand.INITIALIZE , nonce );		
	}
	
	public static Tuple getNextAnswerTuple( PoemNonce nonce ) {
		return new Tuple( PoemAdaptor.POEM_KEY , PoemCommand.NEXTANSWER , nonce );
	}

	public static Tuple getNewProveTuple( PoemList list , PoemNonce nonce ) {
		return new Tuple( PoemAdaptor.POEM_KEY , PoemCommand.NEWPROVE , list , nonce );
	}

	public static Tuple getNewProveTuple( PoemList list , PoemList answer , PoemNonce nonce ) {
		return new Tuple( PoemAdaptor.POEM_KEY , PoemCommand.NEWPROVE , list , answer , nonce );
	}

	public static Tuple getAssertTuple( PoemList list , PoemNonce nonce ) {
		return new Tuple( PoemAdaptor.POEM_KEY , PoemCommand.ASSERT , list , nonce );
	}

	public static Tuple getLockTuple( PoemNonce nonce ) {
		return new Tuple( PoemAdaptor.POEM_KEY , PoemCommand.LOCK , nonce );
	}

	public static Tuple getUnLockTuple( PoemNonce nonce ) {
		return new Tuple( PoemAdaptor.POEM_KEY , PoemCommand.UNLOCK , nonce );
	}

	public static Tuple getNonceTuple( ) {
		return new Tuple( PoemAdaptor.POEM_KEY , PoemCommand.NONCE );
	}

	public static Tuple getEvalTuple( String string , PoemNonce nonce ) {
		return new Tuple( PoemAdaptor.POEM_KEY , PoemCommand.EVAL , string , nonce );
	}


	public class PoemNonce implements PoemValue {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private int id;
		
		PoemNonce( int id ) {
			this.id = id;
		}

		@Override
		public String getString() {
			return id+"";
		}

		@Override
		public int size() {
			return 1;
		}
				
	}
	
	public static final String POEM_KEY = "POEM";
	
	private static String[] INIT_COMMANDS = new String[] {
		"(require :asdf)" ,
		"(asdf:load-system :snark)" ,
		"(in-package :snark-user)" ,
		"(initialize)" ,
		"(use-resolution)" 
	};
	
	private int lockId = 0;

	private Interpreter interpreter;

	private PoemNonce activeNonce;
	
	public PoemAdaptor() {
		this.interpreter = Interpreter.createInstance();
		init();
	}
	
	
	private void init() {
		for( int i=0 ; i<INIT_COMMANDS.length ; i++ ) {
			doeval(INIT_COMMANDS[i]);
		}
	}

	private PoemValue doeval(String cmd) {
		System.out.print("Executing command: "+cmd);
		System.out.flush();
		long startTime = System.currentTimeMillis();
		LispObject o = this.interpreter.eval(cmd);
		long endTime = System.currentTimeMillis();
		System.out.println("   DONE! (Time: "+((endTime-startTime)/1000.0)+"sec)");
		return PoemValueFactory.getValue(o);
	}


	public synchronized PoemNonce getNonce() {
		PoemNonce nonce = new PoemNonce(lockId++);
		return nonce;
	}

	@Override
	public boolean put(Tuple t) {
		try {
			_execute(t);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	protected PoemValue _execute( Tuple t ) throws InterruptedException {
		if (!checkCommand(t)) {
			throw new IllegalArgumentException();
		}
		switch (t.getElementAt(PoemCommand.class, 1)) {
		case INITIALIZE:
			return poemInitialize( t.getElementAt(PoemNonce.class , 2) );
		case NEXTANSWER:
			return poemClosure( t.getElementAt(PoemNonce.class , 2) );
		case NEWPROVE:
			if (t.length() == 3) { //A tuple without "answer" parameter!
				return poemNewProve(t.getElementAt(PoemList.class , 2),  t.getElementAt(PoemNonce.class, 3));
			} else { // Invocation to checkCommand guatantees that t.length() is 5!
				return poemNewProve(t.getElementAt(PoemList.class , 2), t.getElementAt(PoemList.class , 3),  t.getElementAt(PoemNonce.class, 4));
			}
		case LOCK:
			poemLock(t.getElementAt(PoemNonce.class , 2));
			return new PoemSymbol("NIL");
		case UNLOCK:
			poemUnLock(t.getElementAt(PoemNonce.class , 2));
			return new PoemSymbol("NIL");
		case EVAL:
			return poemEval(t.getElementAt(String.class , 2), t.getElementAt(PoemNonce.class,3));
		case NONCE:
			return getNonce();
		case ASSERT:
			return poemAssert(t.getElementAt(PoemList.class , 2), t.getElementAt(PoemNonce.class, 3));
		}
		//This code should not be nevered executed!
		return null;
	}
	
	@Override
	public Tuple get(Template template) throws InterruptedException {
		return new Tuple( _execute(getTupleFromTemplate(template)) );
	}

	@Override
	public Tuple getp(Template template) {
		Tuple tuple;
		try {
			tuple = get(template);
			return tuple;
		} catch (InterruptedException e) {
			return null;
		}
	}

	@Override
	public LinkedList<Tuple> getAll(Template template) {
		return new LinkedList<Tuple>();
	}

	@Override
	public Tuple query(Template template) throws InterruptedException {
		return get(template);
	}

	@Override
	public Tuple queryp(Template template) {
		return getp(template);
	}

	@Override
	public LinkedList<Tuple> queryAll(Template template) {
		return new LinkedList<Tuple>();
	}

	@Override
	public Tuple[] getKnowledgeItems() {
		return new Tuple[0];
	}

	@Override
	public boolean isResponsibleFor(Tuple t) {
		if (t.length()<2) {
			return false;
		}
		Object o = t.getElementAt(0);
		if ((o==null)||!(o instanceof String)||(!o.equals(POEM_KEY))) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isResponsibleFor(Template template) {
		Tuple tuple = getTupleFromTemplate(template);
		if (tuple == null) {
			return false;
		}
		return isResponsibleFor(tuple);
	}
	
	
	public boolean checkCommand( Tuple t ) {
		if (!(t.getElementAt(1) instanceof PoemCommand)) {
			return false;
		}
		switch (t.getElementAt(PoemCommand.class, 1)) {
		case INITIALIZE:
		case NEXTANSWER:
			return (t.length() == 3)&&(t.getElementAt(2) instanceof PoemNonce);
		case NEWPROVE:
			return ((t.length() == 4)&&(t.getElementAt(2) instanceof PoemList)&&(t.getElementAt(3) instanceof PoemNonce))
					||((t.length() == 5)&&(t.getElementAt(2) instanceof PoemList)&&(t.getElementAt(3) instanceof PoemList)&&(t.getElementAt(4) instanceof PoemNonce));
		case ASSERT:			
			return ((t.length() == 4)&&(t.getElementAt(2) instanceof PoemList)&&(t.getElementAt(3) instanceof PoemNonce));
		case LOCK:
		case UNLOCK:
			return (t.length() == 3)&&(t.getElementAt(2) instanceof PoemNonce);
		case EVAL:
			return (t.length() == 4)&&(t.getElementAt(2) instanceof String)&&(t.getElementAt(3) instanceof PoemNonce);
		case NONCE:
			return (t.length() == 2);
		default:
			break;
		}
		
		return false;		
	}
	
	private Tuple getTupleFromTemplate( Template field ) {
		Object[] fields = new Object[field.length()];
		for (int i=0 ; i<fields.length ; i++) {
			TemplateField f = field.getElementAt(i);
			if (f instanceof ActualTemplateField) {
				fields[i] = ((ActualTemplateField) f).getValue();
			} else {
				return null;
			}
		}
		return new Tuple(fields);
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Bye...");
		interpreter.dispose();
		super.finalize();
	}
	
	public synchronized void poemLock( PoemNonce nonce ) throws InterruptedException {
		while ((activeNonce != null)&&(activeNonce.id!=nonce.id)) {
			wait();
		}
		this.activeNonce = nonce;
	}
	
	public synchronized void poemUnLock( PoemNonce nonce ) {
		if ((activeNonce != null)&&(activeNonce.id == nonce.id)) {
			activeNonce = null;
			notifyAll();
		}
	}
	
	
	private synchronized void checkNonce( PoemNonce nonce ) throws InterruptedException {
		while ((activeNonce != null)&&(activeNonce.id != nonce.id)) {
			wait();
		}
	}
	
	public PoemValue poemInitialize( PoemNonce nonce ) throws InterruptedException {
		checkNonce( nonce );
		return doeval("(initialize)");
	}
	
	public PoemValue poemAssert( PoemValue arg , PoemNonce nonce ) throws InterruptedException {
		checkNonce(nonce);
		String command = "(assert '"+arg.getString()+")";
		return doeval(command);
	}

	public PoemValue poemNewProve( PoemValue arg , PoemNonce nonce ) throws InterruptedException {
		checkNonce(nonce);
		String command = "(new-prove '"+arg.getString()+")";
		return doeval(command);
	}
	
	public PoemValue poemNewProve( PoemValue arg , PoemValue answer , PoemNonce nonce ) throws InterruptedException {
		checkNonce(nonce);
		String command = "(new-prove '"+arg.getString()+" :answer '"+answer.getString()+")";
		return doeval(command);
	}

	public PoemValue poemClosure( PoemNonce nonce ) throws InterruptedException {
		checkNonce(nonce);
		String command = "(closure)";
		doeval(command);
		command = "(answer)";
		return doeval(command);
	}
	
	public PoemValue poemEval( String command , PoemNonce nonce ) throws InterruptedException {
		checkNonce(nonce);
		return doeval(command);
	}
	
}
