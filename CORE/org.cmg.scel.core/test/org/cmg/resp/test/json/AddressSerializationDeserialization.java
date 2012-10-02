package org.cmg.resp.test.json;

import static org.junit.Assert.*;

import org.cmg.resp.RESPFactory;
import org.cmg.resp.topology.Address;
import org.cmg.resp.topology.ServerPortAddress;
import org.cmg.resp.topology.SocketPortAddress;
import org.junit.Test;

import com.google.gson.Gson;

public class AddressSerializationDeserialization {

	@Test
	public void testSerializeDeserializeSocket() {
		SocketPortAddress addr = new SocketPortAddress(9999);
		Gson gson = RESPFactory.getGSon();
		String str = gson.toJson(addr);
		Address read = gson.fromJson(str, Address.class);
		assertEquals(addr, read);
	}
	

	@Test
	public void testSerializeDeserializeServer() {
		ServerPortAddress addr = new ServerPortAddress(9999);
		Gson gson = RESPFactory.getGSon();
		String str = gson.toJson(addr);
		Address read = gson.fromJson(str, Address.class);
		assertEquals(addr, read);
	}


}
