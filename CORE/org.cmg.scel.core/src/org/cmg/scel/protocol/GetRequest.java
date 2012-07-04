package org.cmg.scel.protocol;

import java.io.IOException;

import org.cmg.scel.knowledge.Template;
import org.cmg.scel.topology.PointToPoint;

public class GetRequest extends UnicastMessage {

	private Template template;
	
	public GetRequest(PointToPoint source, int session, String target, Template template) {
		super(MessageType.GET_REQUEST,source,session,target);
		this.template = template;
	}

	public Template getTemplate() {
		return template;
	}

	@Override
	public void accept(MessageHandler messageHandler) throws IOException, InterruptedException {
		messageHandler.handle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return template.equals((((GetRequest) obj).template));
		}
		return false;
	}

	@Override
	public String toString() {
		return getType()+"[ "+super.toString()+" , "+template.toString()+" ]";
	}

	@Override
	public int hashCode() {
		return super.hashCode()^template.hashCode();
	}
	
}