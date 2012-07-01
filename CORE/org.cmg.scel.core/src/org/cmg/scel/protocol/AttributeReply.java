package org.cmg.scel.protocol;

import java.io.IOException;

import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.topology.Locality;

public class AttributeReply extends Message {
	
	private Attribute[] values;
	
	public AttributeReply(Locality source, int session, String target, Attribute[] values) {
		super(MessageType.ATTRIBUTE_REPLY,source,session,target);
		this.values = values;
	}

	public Attribute[] getValues() {
		return values;
	}

	@Override
	public void accept(MessageHandler messageHandler) throws IOException {
		messageHandler.handle(this);
	}
			
}