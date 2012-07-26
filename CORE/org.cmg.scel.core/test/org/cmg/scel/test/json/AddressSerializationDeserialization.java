package org.cmg.scel.test.json;

import static org.junit.Assert.*;

import org.cmg.scel.connections.Address;
import org.cmg.scel.connections.ServerPortAddress;
import org.cmg.scel.connections.SocketPortAddress;
import org.cmg.scel.topology.SCELFactory;
import org.junit.Test;

import com.google.gson.Gson;

public class AddressSerializationDeserialization {

	@Test
	public void testSerializeDeserializeSocket() {
		SocketPortAddress addr = new SocketPortAddress(9999);
		Gson gson = SCELFactory.getGSon();
		String str = gson.toJson(addr);
		Address read = gson.fromJson(str, Address.class);
		assertEquals(addr, read);
	}
	

	@Test
	public void testSerializeDeserializeServer() {
		ServerPortAddress addr = new ServerPortAddress(9999);
		Gson gson = SCELFactory.getGSon();
		String str = gson.toJson(addr);
		Address read = gson.fromJson(str, Address.class);
		assertEquals(addr, read);
	}


}
