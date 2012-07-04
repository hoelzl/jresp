package org.cmg.scel.protocol;

import java.io.IOException;

import org.cmg.scel.topology.PointToPoint;

public abstract class Message {
	
	private PointToPoint source;
	private int 	 session;
	private MessageType type;
	
	public Message( MessageType type , PointToPoint source , int session ) {
		this.source = source;
		this.session = session;
		this.type = type;
	}

	public PointToPoint getSource() {
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
			return (type==msg.type)&&
					(source.equals(msg.source))&&
					(session==msg.session);
		}
		return false;
	}

	@Override
	public String toString() {
		return source+":"+session;
	}

	public abstract void accept(MessageHandler messageHandler) throws IOException, InterruptedException;

	@Override
	public int hashCode() {
		return type.hashCode()^source.hashCode()^session;
	}
}