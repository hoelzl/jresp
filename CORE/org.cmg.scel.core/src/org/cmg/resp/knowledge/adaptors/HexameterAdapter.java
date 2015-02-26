package org.cmg.resp.knowledge.adaptors;

import hexameter.HexameterContext;

import java.util.LinkedList;
import java.util.Map;

import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.KnowledgeAdapter;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;
import org.json.simple.JSONArray;

public class HexameterAdapter implements KnowledgeAdapter {

	public enum HexameterTag  {
		HEXAMETER,
		HADES
	}
	
	protected HexameterContext hexameterContext;
	
	public HexameterAdapter(String networkAddress) {
		hexameterContext = new HexameterContext();
		hexameterContext.init(networkAddress);
	}
	
	protected HexameterAdapter() {
		hexameterContext = new HexameterContext();	
	}
	
	@Override
	public boolean put(Tuple t) {
		assert (HexameterTag)t.getElementAt(0) == HexameterTag.HEXAMETER;
		String recipient = (String)t.getElementAt(1);
		String space = (String)t.getElementAt(2);
		JSONArray data = (JSONArray)t.getElementAt(3);
		hexameterContext.put(recipient, space, data);
		return true;
	}

	@Override
	public Tuple get(Template template) throws InterruptedException {
		ActualTemplateField recipientField = (ActualTemplateField)template.getElementAt(1);
		String recipient = (String)recipientField.getValue();
		ActualTemplateField spaceField = (ActualTemplateField)template.getElementAt(2);
		String space = (String)spaceField.getValue();
		ActualTemplateField dataField = (ActualTemplateField)template.getElementAt(3);
		JSONArray data = (JSONArray)dataField.getValue();
		JSONArray resultData = hexameterContext.get(recipient, space, data);
		Tuple result = new Tuple(HexameterTag.HEXAMETER, recipient, space, data, resultData);
		return result;
	}

	@Override
	public Tuple getp(Template template) {
		Tuple tuple;
		try {
			tuple = get(template);
			return tuple;
		} catch (InterruptedException e) {
			return null;
		}
	}

	@Override
	public LinkedList<Tuple> getAll(Template template) {
		LinkedList<Tuple> result =  new LinkedList<Tuple>();
		Tuple t = getp(template);
		if (t != null) {
			result.add(t);
		}
		return result;
	}

	@Override
	public Tuple query(Template template) throws InterruptedException {
		ActualTemplateField recipientField = (ActualTemplateField)template.getElementAt(1);
		String recipient = (String)recipientField.getValue();
		ActualTemplateField spaceField = (ActualTemplateField)template.getElementAt(2);
		String space = (String)spaceField.getValue();
		ActualTemplateField dataField = (ActualTemplateField)template.getElementAt(3);
		JSONArray data = (JSONArray)dataField.getValue();
		JSONArray resultData = hexameterContext.qry(recipient, space, data);
		Tuple result = new Tuple(HexameterTag.HEXAMETER, recipient, space, data, resultData);
		return result;	
	}

	@Override
	public Tuple queryp(Template template) {
		Tuple tuple;
		try {
			tuple = query(template);
			return tuple;
		} catch (InterruptedException e) {
			return null;
		}
	}

	@Override
	public LinkedList<Tuple> queryAll(Template template) {
		LinkedList<Tuple> result =  new LinkedList<Tuple>();
		Tuple t = queryp(template);
		if (t != null) {
			result.add(t);
		}
		return result;
	}

	@Override
	public Tuple[] getKnowledgeItems() {
		return new Tuple[0];
	}

	@Override
	public boolean isResponsibleFor(Tuple t) {
		boolean hasCorrectTag = t.getElementAt(0) == HexameterTag.HEXAMETER;
		if (hasCorrectTag) {
			assert t.length() >= 4: 
				"Hexameter tuple needs to have at least 4 entries.";
		}
		return hasCorrectTag;
	}

	
	@Override
	public boolean isResponsibleFor(Template t) {
		boolean hasCorrectTag = t.getElementAt(0).match(HexameterTag.HEXAMETER);
		if (hasCorrectTag) {
			assert t.length() >= 4:
				"Hexameter template needs to have at least 4 entries.";
		}
		return hasCorrectTag;
	}

}
