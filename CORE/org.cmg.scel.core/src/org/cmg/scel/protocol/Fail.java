package org.cmg.scel.protocol;

import org.cmg.scel.topology.PointToPoint;

public class Fail extends UnicastMessage {

	private String message;

	public Fail(PointToPoint source, int session, String target, String message) {
		super(MessageType.FAIL,source,session, target);
		this.message = message;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj)&&message.equals(((Fail) obj).message);
	}

	@Override
	public String toString() {
		return getType()+"[ "+super.toString()+" , "+getMessage()+" ]";
	}

	@Override
	public void accept(MessageHandler messageHandler) {
		messageHandler.handle(this);
	}

	public String getMessage() {
		return message;
	}

}