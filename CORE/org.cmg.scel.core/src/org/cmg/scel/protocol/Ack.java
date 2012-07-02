package org.cmg.scel.protocol;

import org.cmg.scel.topology.Locality;

public class Ack extends Message {

	public Ack(Locality source, int session, String target) {
		super(MessageType.ACK,source,session, target);
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return getType()+"[ "+super.toString()+" ]";
	}

	@Override
	public void accept(MessageHandler messageHandler) {
		messageHandler.handle(this);
	}

}