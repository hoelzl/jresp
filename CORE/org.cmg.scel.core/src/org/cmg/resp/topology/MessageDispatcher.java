package org.cmg.resp.topology;

import org.cmg.resp.protocol.jRESPMessage;

public interface MessageDispatcher {

	public abstract void addMessage(jRESPMessage msg);

	public abstract String getName();

}