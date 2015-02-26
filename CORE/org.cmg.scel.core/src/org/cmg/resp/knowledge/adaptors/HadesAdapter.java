package org.cmg.resp.knowledge.adaptors;

import java.util.ArrayList;

import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.cmg.resp.knowledge.adaptors.HexameterAdapter.HexameterTag;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class HadesAdapter extends HexameterAdapter {

	protected String hades;
	protected ArrayList<JSONArray> newTicks = new ArrayList<JSONArray>();
	
	public HadesAdapter(String myAddress, String hadesAddress) {
		super();
		hades = hadesAddress;
		hexameterContext.init(myAddress, () -> {
			return (type, author, space, parameter, recipient) -> {
				JSONArray response = processReceivedMessage(type, author, space, parameter, recipient);
				if ( response != null ) {
					return response;
				} else {
					return new JSONArray();
				}
			};
		});
	}
	
	protected void waitForMessage() {
		hexameterContext.respond(0);
	}

	
	protected JSONArray processReceivedMessage(String type, String author, String space, JSONArray parameter, String recipient) {
		if ( type.equals("put") && space.equals("hades.ticks") ) {
			newTicks.add(parameter);
		}
		JSONArray response = new JSONArray();
		return response;
	}
	
	@Override
	public Tuple get(Template template) throws InterruptedException {
		ActualTemplateField tagField = (ActualTemplateField) template.getElementAt(0);
		HexameterTag tag = (HexameterTag) tagField.getValue();
		if ( tag == HexameterTag.HADES ) {
			ActualTemplateField commandField = (ActualTemplateField) template.getElementAt(1);
			String command = (String) commandField.getValue();
			if ( command == "tick" ) {
				while ( newTicks.isEmpty() ) {
					waitForMessage();
				}
				Tuple result = new Tuple(HexameterTag.HADES, command, newTicks.remove(0));
				return result;
			}
			throw new InterruptedException();
		} else {
			return super.get(template);
		}
	}
	
	@Override
	public boolean isResponsibleFor(Tuple t) {
		return t.getElementAt(0) == HexameterTag.HADES || super.isResponsibleFor(t);
	}

	
	@Override
	public boolean isResponsibleFor(Template t) {
		return t.getElementAt(0).match(HexameterTag.HADES) || super.isResponsibleFor(t);
	}

}
