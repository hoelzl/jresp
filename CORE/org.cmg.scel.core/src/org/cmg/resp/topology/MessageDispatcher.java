package org.cmg.resp.topology;

import org.cmg.resp.protocol.Message;

public interface MessageDispatcher {

	public abstract void addMessage(Message msg);

	public abstract String getName();

}