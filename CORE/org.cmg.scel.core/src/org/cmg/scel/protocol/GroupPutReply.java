package org.cmg.scel.protocol;

import java.io.IOException;
import java.util.Arrays;

import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.topology.PointToPoint;

public class GroupPutReply extends UnicastMessage {
	
	private int tupleSession;
	private Attribute[] values;
	
	public GroupPutReply(PointToPoint source, int session, String target, int tupleSession , Attribute[] values) {
		super(MessageType.GROUP_PUT_REPLY,source,session,target);
		this.values = values;
		this.tupleSession = tupleSession;
	}

	public Attribute[] getValues() {
		return values;
	}

	@Override
	public void accept(MessageHandler messageHandler) throws IOException, InterruptedException {
		messageHandler.handle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return (tupleSession == ((GroupPutReply) obj).tupleSession)&&Arrays.deepEquals(values, ((GroupPutReply) obj).values); 
		}
		return false;
	}

	@Override
	public String toString() {
		return getType()+"[ "+ super.toString() + " , "+ tupleSession + " , "+ Arrays.toString(values) +"]";
	}

	@Override
	public int hashCode() {
		return super.hashCode()^Arrays.hashCode(values)^tupleSession;
	}

	public int getTupleSession() {
		return tupleSession;
	}

			
}