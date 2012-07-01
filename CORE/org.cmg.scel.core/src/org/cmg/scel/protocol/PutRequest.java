package org.cmg.scel.protocol;

import java.io.IOException;

import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.topology.Locality;

public class PutRequest extends Message {
	
	private Tuple tuple;
	
	public PutRequest(Locality source, int session, String target, Tuple tuple) {
		super(MessageType.PUT_REQUEST,source,session,target);
		this.tuple = tuple;
	}

	public Tuple getTuple() {
		return tuple;
	}

	@Override
	public void accept(MessageHandler messageHandler) throws IOException {
		messageHandler.handle(this);
	}
	
}