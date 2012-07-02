package org.cmg.scel.protocol;

import java.io.IOException;
import java.util.Arrays;

import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.topology.Locality;

public class GroupPutReply extends Message {
	
	private Attribute[] values;
	
	public GroupPutReply(Locality source, int session, String target, Attribute[] values) {
		super(MessageType.GROUP_PUT_REPLY,source,session,target);
		this.values = values;
	}

	public Attribute[] getValues() {
		return values;
	}

	@Override
	public void accept(MessageHandler messageHandler) throws IOException {
		messageHandler.handle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return Arrays.deepEquals(values, ((GroupPutReply) obj).values); 
		}
		return false;
	}

	@Override
	public String toString() {
		return getType()+"[ "+ super.toString() + " , "+ Arrays.toString(values) +"]";
	}

	@Override
	public int hashCode() {
		return super.hashCode()^Arrays.hashCode(values);
	}

			
}