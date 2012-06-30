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
import org.cmg.scel.protocol.MessageDeserializer;
import org.cmg.scel.protocol.Protocol;
import org.cmg.scel.topology.Locality;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MessageSerializationDeserialization {

	protected Gson gson;

	@Before
	public void init() {
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeHierarchyAdapter(SCELValue.class, new ValueDeserializer());
		builder.registerTypeHierarchyAdapter(TemplateField.class, new TemplateDeserializer());
		builder.registerTypeHierarchyAdapter(Protocol.Message.class, new MessageDeserializer());
		gson = builder.setPrettyPrinting().create();
	}
	
	@Test
	public void testSerializeDeserializeAck() {
		Protocol.Ack ack = new Protocol.Ack(new Locality("test", 9999), 23);
		String txt = gson.toJson(ack);
		Protocol.Message msg = gson.fromJson(txt, Protocol.Message.class);
		assertEquals(ack, msg);
	}

	@Test
	public void testSerializeDeserializeFail() {
		Protocol.Fail fail = new Protocol.Fail(new Locality("test", 9999), 23);
		String txt = gson.toJson(fail);
		Protocol.Message msg = gson.fromJson(txt, Protocol.Message.class);
		assertEquals(fail, msg);
	}

	@Test
	public void testSerializeDeserializeAttributeRequest() {
		Protocol.AttributeRequest fail = new Protocol.AttributeRequest(new Locality("test", 9999), 23, new String[] {"attr1","attr2"});
		String txt = gson.toJson(fail);
		Protocol.Message msg = gson.fromJson(txt, Protocol.Message.class);
		assertEquals(fail, msg);
	}

	@Test
	public void testSerializeDeserializeAttributeReply() {
		Protocol.AttributeReply fail =
				new Protocol.AttributeReply(
						new Locality("test", 9999), 
						23, 
						new Attribute[] {
							new Attribute("attr1",SCELValue.getInteger(34)),
							new Attribute("attr2",SCELValue.getBoolean(false))
						}
				);
		String txt = gson.toJson(fail);
		Protocol.Message msg = gson.fromJson(txt, Protocol.Message.class);
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
		Protocol.PutRequest request =
				new Protocol.PutRequest(
						new Locality("test",9999) , 
						34 , 
						new Tuple( SCELValue.getBoolean(true) , SCELValue.getInteger(34)));
		String txt = gson.toJson(request);
		System.out.println(txt);
		Protocol.Message msg = gson.fromJson(txt, Protocol.Message.class);
		assertEquals(request, msg);
	}

	
	@Test
	public void testSerializeDeserializeTupleReply() {
		Protocol.TupleReply request =
				new Protocol.TupleReply(
						new Locality("test",9999) , 
						34 , 
						new Tuple( SCELValue.getBoolean(true) , SCELValue.getInteger(34)));
		String txt = gson.toJson(request);
		System.out.println(txt);
		Protocol.Message msg = gson.fromJson(txt, Protocol.Message.class);
		assertEquals(request, msg);
	}

	@Test
	public void testSerializeDeserializeGetRequest() {
		Protocol.GetRequest request =
			new Protocol.GetRequest(
				new Locality("test",9999) , 
				34 , 
				new Template( 
					new ActualTemplateField(SCELValue.getBoolean(true)) , 
					new FormalTemplateField(SCELType.INT)
				)
			);
		String txt = gson.toJson(request);
		System.out.println(txt);
		Protocol.Message msg = gson.fromJson(txt, Protocol.Message.class);
		assertEquals(request, msg);
	}

	@Test
	public void testSerializeDeserializeQueryRequest() {
		Protocol.QueryRequest request =
			new Protocol.QueryRequest(
				new Locality("test",9999) , 
				34 , 
				new Template( 
					new ActualTemplateField(SCELValue.getBoolean(true)) , 
					new FormalTemplateField(SCELType.INT)
				)
			);
		String txt = gson.toJson(request);
		System.out.println(txt);
		Protocol.Message msg = gson.fromJson(txt, Protocol.Message.class);
		assertEquals(request, msg);
	}
	
	/*
		GET_REQUEST(3,"G_REQUEST"),
		QUERY_REQUEST(4,"Q_REQUEST"),
	 */
}
