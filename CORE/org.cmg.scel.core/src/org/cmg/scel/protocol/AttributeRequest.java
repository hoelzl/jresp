package org.cmg.scel.protocol;

import java.io.IOException;
import java.util.Arrays;

import org.cmg.scel.topology.PointToPoint;

public class AttributeRequest extends Message {
	
	private String[] attributes;
	
	public AttributeRequest(PointToPoint source, int session, String target,
			String[] attributes) {
		super(MessageType.ATTRIBUTE_REQUEST,source,session,target);
		this.attributes = attributes;
	}

	public String[] getAttributes() {
		return attributes;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return Arrays.deepEquals(attributes, ((AttributeRequest) obj).attributes);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return super.hashCode()^Arrays.hashCode(attributes);
	}

	@Override
	public String toString() {
		return getType()+"["+super.toString()+","+Arrays.toString(attributes)+"]";
	}

	@Override
	public void accept(MessageHandler messageHandler) throws IOException {
		messageHandler.handle(this);
	}
	
	
	
}