package org.cmg.scel.test.json;

import static org.junit.Assert.*;

import org.cmg.scel.knowledge.ActualTemplateField;
import org.cmg.scel.knowledge.Attribute;
import org.cmg.scel.knowledge.FormalTemplateField;
import org.cmg.scel.knowledge.SCELValue;
import org.cmg.scel.knowledge.Template;
import org.cmg.scel.knowledge.TemplateDeserializer;
import org.cmg.scel.knowledge.TemplateField;
import org.cmg.scel.knowledge.Tuple;
import org.cmg.scel.knowledge.ValueDeserializer;
import org.cmg.scel.knowledge.SCELValue.SCELType;
import org.cmg.scel.protocol.Ack;
import org.cmg.scel.protocol.AttributeReply;
import org.cmg.scel.protocol.AttributeRequest;
import org.cmg.scel.protocol.Fail;
import org.cmg.scel.protocol.GetRequest;
import org.cmg.scel.protocol.GroupGetReply;
import org.cmg.scel.protocol.GroupGetRequest;
import org.cmg.scel.protocol.GroupPutReply;
import org.cmg.scel.protocol.GroupPutRequest;
import org.cmg.scel.protocol.GroupQueryReply;
import org.cmg.scel.protocol.GroupQueryRequest;
import org.cmg.scel.protocol.Message;
import org.cmg.scel.protocol.MessageDeserializer;
import org.cmg.scel.protocol.PutRequest;
import org.cmg.scel.protocol.QueryRequest;
import org.cmg.scel.protocol.TupleReply;
import org.cmg.scel.topology.PointToPoint;
import org.cmg.scel.topology.SCELFactory;
import org.cmg.scel.topology.SocketPortAddress;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MessageSerializationDeserialization {

	protected Gson gson;

	@Before
	public void init() {
		gson = SCELFactory.getGSon();
	}
	
	@Test
	public void testSerializeDeserializeAck() {
		Ack ack = new Ack(new PointToPoint("test", new SocketPortAddress(9999)), 23,"pippo");
		String txt = gson.toJson(ack);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(ack, msg);
	}

	@Test
	public void testSerializeDeserializeFail() {
		Fail fail = new Fail(new PointToPoint("test", new SocketPortAddress(9999)), 23,"pippo");
		String txt = gson.toJson(fail);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(fail, msg);
	}

	@Test
	public void testSerializeDeserializeAttributeRequest() {
		AttributeRequest fail = new AttributeRequest(new PointToPoint("test", new SocketPortAddress(9999)), 23,"pippo", new String[] {"attr1","attr2"});
		String txt = gson.toJson(fail);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(fail, msg);
	}

	@Test
	public void testSerializeDeserializeAttributeReply() {
		AttributeReply fail =
				new AttributeReply(
						new PointToPoint("test", new SocketPortAddress(9999)), 
						23,
						"pippo", 
						new Attribute[] {
							new Attribute("attr1",SCELValue.getInteger(34)),
							new Attribute("attr2",SCELValue.getBoolean(false))
						}
				);
		String txt = gson.toJson(fail);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(fail, msg);
	}

	@Test
	public void testSerializeDeserializeTuple() {
		Tuple t = new Tuple( SCELValue.getBoolean(true) , SCELValue.getInteger(34));
		String txt = gson.toJson(t);
		System.out.println(txt);
		Tuple msg = gson.fromJson(txt, Tuple.class);
		assertEquals(t, msg);
	}

	
	@Test
	public void testSerializeDeserializePutRequest() {
		PutRequest request =
				new PutRequest(
						new PointToPoint("test",new SocketPortAddress(9999)) , 
						34 ,
						"pippo", 
						new Tuple( SCELValue.getBoolean(true) , SCELValue.getInteger(34)));
		String txt = gson.toJson(request);
		System.out.println(txt);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(request, msg);
	}

	
	@Test
	public void testSerializeDeserializeTupleReply() {
		TupleReply request =
				new TupleReply(
						new PointToPoint("test",new SocketPortAddress(9999)) , 
						34 ,"pippo", 
						new Tuple( SCELValue.getBoolean(true) , SCELValue.getInteger(34)));
		String txt = gson.toJson(request);
		System.out.println(txt);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(request, msg);
	}

	@Test
	public void testSerializeDeserializeGetRequest() {
		GetRequest request =
			new GetRequest(
				new PointToPoint("test",new SocketPortAddress(9999)) , 
				34 ,"pippo", 
				new Template( 
					new ActualTemplateField(SCELValue.getBoolean(true)) , 
					new FormalTemplateField(SCELType.INT)
				)
			);
		String txt = gson.toJson(request);
		System.out.println(txt);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(request, msg);
	}

	@Test
	public void testSerializeDeserializeQueryRequest() {
		QueryRequest request =
			new QueryRequest(
				new PointToPoint("test",new SocketPortAddress(9999)) , 
				34 ,"pippo", 
				new Template( 
					new ActualTemplateField(SCELValue.getBoolean(true)) , 
					new FormalTemplateField(SCELType.INT)
				)
			);
		String txt = gson.toJson(request);
		System.out.println(txt);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(request, msg);
	}

	@Test
	public void testSerializeDeserializeGroupQueryRequest() {
		GroupQueryRequest request =
			new GroupQueryRequest(
				new PointToPoint("test",new SocketPortAddress(9999)) , 
				34 , 
				new Template( 
					new ActualTemplateField(SCELValue.getBoolean(true)) , 
					new FormalTemplateField(SCELType.INT)
				),
				new String[] { "attr1" , "attr2" }
			);
		String txt = gson.toJson(request);
		System.out.println(txt);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(request, msg);
	}

	@Test
	public void testSerializeDeserializeGroupGetRequest() {
		GroupGetRequest request =
			new GroupGetRequest(
				new PointToPoint("test",new SocketPortAddress(9999)) , 
				34 ,
				new Template( 
					new ActualTemplateField(SCELValue.getBoolean(true)) , 
					new FormalTemplateField(SCELType.INT)
				),
				new String[] { "attr1" , "attr2" }
			);
		String txt = gson.toJson(request);
		System.out.println(txt);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(request, msg);
	}

	@Test
	public void testSerializeDeserializeGroupPutRequest() {
		GroupPutRequest request =
			new GroupPutRequest(
				new PointToPoint("test",new SocketPortAddress(9999)) , 
				34 ,
				new String[] { "attr1" , "attr2" },
				new Tuple( SCELValue.getBoolean(true) , SCELValue.getInteger(34))
			);
		String txt = gson.toJson(request);
		System.out.println(txt);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(request, msg);
	}

	@Test
	public void testSerializeDeserializeGroupGetReply() {
		GroupGetReply request =
			new GroupGetReply(
				new PointToPoint("test",new SocketPortAddress(9999)) , 
				34 ,"pippo", 
				48,
				new Attribute[] {
					new Attribute("attr1",SCELValue.getInteger(34)),
					new Attribute("attr2",SCELValue.getBoolean(false))
				},
				new Tuple( SCELValue.getBoolean(true) , SCELValue.getInteger(34))
			);
		String txt = gson.toJson(request);
		System.out.println(txt);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(request, msg);
	}

	@Test
	public void testSerializeDeserializeGroupQueryReply() {
		GroupQueryReply request =
			new GroupQueryReply(
				new PointToPoint("test",new SocketPortAddress(9999)) , 
				34 ,"pippo", 
				new Attribute[] {
					new Attribute("attr1",SCELValue.getInteger(34)),
					new Attribute("attr2",SCELValue.getBoolean(false))
				},
				new Tuple( SCELValue.getBoolean(true) , SCELValue.getInteger(34))
			);
		String txt = gson.toJson(request);
		System.out.println(txt);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(request, msg);
	}

	@Test
	public void testSerializeDeserializeGroupPutReply() {
		GroupPutReply fail =
				new GroupPutReply(
						new PointToPoint("test", new SocketPortAddress(9999)), 
						23,
						"pippo", 
						34,
						new Attribute[] {
							new Attribute("attr1",SCELValue.getInteger(34)),
							new Attribute("attr2",SCELValue.getBoolean(false))
						}
				);
		String txt = gson.toJson(fail);
		System.out.println(txt);
		Message msg = gson.fromJson(txt, Message.class);
		assertEquals(fail, msg);
	}


	/*
		GET_REQUEST(3,"G_REQUEST"),
		QUERY_REQUEST(4,"Q_REQUEST"),
	 */
}
