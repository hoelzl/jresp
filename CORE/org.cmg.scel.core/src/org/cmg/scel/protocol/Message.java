package org.cmg.scel.protocol;

import java.io.IOException;

import org.cmg.scel.topology.Locality;

public abstract class Message {
	
	private Locality source;
	private int 	 session;
	private MessageType type;
	private String	 target;
	
	public Message( MessageType type , Locality source , int session , String target ) {
		this.source = source;
		this.session = session;
		this.type = type;
		this.target = target;
	}

	public Locality getSource() {
		return source;
	}

	public int getSession() {
		return session;
	}

	public MessageType getType() {
		return type;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Message) {
			Message msg = (Message) obj;
			return (type==msg.type)&&(source.equals(msg.source))&&(session==msg.session)&&(target.equals(msg.target));
		}
		return false;
	}

	@Override
	public int hashCode() {
		return type.toString().hashCode()^source.hashCode()^session;
	}

	@Override
	public String toString() {
		return source+":"+session;
	}

	public abstract void accept(MessageHandler messageHandler) throws IOException;

	public String getTarget() {
		return target;
	}
}