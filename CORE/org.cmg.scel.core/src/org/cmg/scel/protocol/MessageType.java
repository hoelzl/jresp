package org.cmg.scel.protocol;

public enum MessageType {
	ATTRIBUTE_REQUEST(0,"A_REQUEST"),
	ATTRIBUTE_REPLY(1,"A_REQUEST"),
	PUT_REQUEST(2,"P_REQUEST"),
	GET_REQUEST(3,"G_REQUEST"),
	QUERY_REQUEST(4,"Q_REQUEST"),
	TUPLE_REPLY(5,"T_REPLY"),
	ACK(6,"ACK"),
	FAIL(7,"FAIL");
	
	private int code;
	private String string;
	
	MessageType( int code , String string ) {
		this.code = code;
		this.string = string;
	}

	@Override
	public String toString() {
		return string;
	}		
	
	public int code() {
		return code;
	}
}