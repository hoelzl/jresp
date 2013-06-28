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

import java.util.LinkedList;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.LispObject;
import org.cmg.resp.knowledge.KnowledgeAdapter;
import org.cmg.resp.knowledge.Template;
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
		ANSWER ,
		NEWPROVE ,
		ASSERT ,
		LOCK , 
		UNLOCK;
	}

	public class PoemNonce {
		
		private int id;
		
		PoemNonce( int id ) {
			this.id = id;
		}
				
	}
	
	private static final String POEM_KEY = "POEM";
	
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

	private LispObject doeval(String cmd) {
		System.out.print("Executing command: "+cmd);
		System.out.flush();
		long startTime = System.currentTimeMillis();
		LispObject o = this.interpreter.eval(cmd);
		long endTime = System.currentTimeMillis();
		System.out.println("   DONE! (Time: "+((endTime-startTime)/1000.0)+"sec)");
		return o;
	}


	public synchronized PoemNonce getNonce() {
		PoemNonce nonce = new PoemNonce(lockId++);
		return nonce;
	}

	@Override
	public boolean put(Tuple t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Tuple get(Template template) throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple getp(Template template) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Tuple> getAll(Template template) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple query(Template template) throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple queryp(Template template) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Tuple> queryAll(Template template) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple[] getKnowledgeItems() {
		// TODO Auto-generated method stub
		return null;
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
		o = t.getElementAt(1);
		if (!(o instanceof PoemCommand)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isResponsibleFor(Template t) {
		// TODO Auto-generated method stub
		return false;
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
	
	public void poemInitialize( PoemNonce nonce ) throws InterruptedException {
		checkNonce( nonce );
		LispObject o  = doeval("(initialize)");
		System.out.println(o);
	}
	
	public void poemAssert( PoemCommandArgument arg , PoemNonce nonce ) throws InterruptedException {
		checkNonce(nonce);
		String command = "(assert "+arg.getString()+")";
		LispObject o  = doeval(command);
		System.out.println(o);
	}

	public void poemNewProve( PoemCommandArgument arg , PoemNonce nonce ) throws InterruptedException {
		checkNonce(nonce);
		String command = "(assert "+arg.getString()+")";
		LispObject o  = doeval(command);
		System.out.println(o);
	}
	
	public void poemNewProve( PoemCommandArgument arg , PoemCommandArgument answer , PoemNonce nonce ) throws InterruptedException {
		checkNonce(nonce);
		String command = "(newprove "+arg.getString()+" :answer "+answer.getString()+")";
		LispObject o  = doeval(command);
		System.out.println(o);
	}
}
