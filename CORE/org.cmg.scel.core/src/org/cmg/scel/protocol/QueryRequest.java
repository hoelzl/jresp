package org.cmg.scel.protocol;

import java.io.IOException;

import org.cmg.scel.knowledge.Template;
import org.cmg.scel.topology.Locality;

public class QueryRequest extends Message {

	private Template template;
	
	public QueryRequest(Locality source, int session, String target, Template template) {
		super(MessageType.QUERY_REQUEST,source,session,target);
		this.template = template;
	}

	public Template getTemplate() {
		return template;
	}

	@Override
	public void accept(MessageHandler messageHandler) throws IOException {
		messageHandler.handle(this);
	}
	
}