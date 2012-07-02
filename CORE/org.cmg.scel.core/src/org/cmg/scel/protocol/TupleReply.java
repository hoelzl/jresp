package org.cmg.scel.protocol;

import java.io.IOException;

import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.topology.Locality;

public class TupleReply extends Message {
	private Tuple tuple;
	
	public TupleReply(Locality source, int session, String target, Tuple tuple) {
		super(MessageType.TUPLE_REPLY,source,session,target);
		this.tuple = tuple;
	}

	public Tuple getTuple() {
		return tuple;
	}

	@Override
	public void accept(MessageHandler messageHandler) throws IOException {
		messageHandler.handle(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return tuple.equals(((TupleReply) obj).tuple);
		}
		return false;
	}

	@Override
	public String toString() {
		return getType()+"["+super.toString()+","+tuple.toString()+"]";
	}

	@Override
	public int hashCode() {
		return super.hashCode()^tuple.hashCode();
	}
	
}