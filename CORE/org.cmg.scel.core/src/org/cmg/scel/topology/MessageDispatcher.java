package org.cmg.scel.topology;

import org.cmg.scel.protocol.Message;

public interface MessageDispatcher {

	public abstract void addMessage(Message msg);

	public abstract String getName();

}