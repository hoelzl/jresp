package org.cmg.resp.policy.facpl;

public class StructName {
	private String idAttribute;
	private String category;
	
	public StructName (String category, String s){
		this.category = category;
		this.idAttribute = s;
	}
	
	public String getIDAttribute() {
		return idAttribute;
	}
	
	public String getCategory() {
		return category;
	}
	
}
