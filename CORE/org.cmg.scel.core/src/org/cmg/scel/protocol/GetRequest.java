package org.cmg.scel.protocol;

import java.io.IOException;

import org.cmg.scel.knowledge.Template;
import org.cmg.scel.topology.Locality;

public class GetRequest extends Message {

	private Template template;
	
	public GetRequest(Locality source, int session, String target, Template template) {
		super(MessageType.GET_REQUEST,source,session,target);
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