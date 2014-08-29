package org.cmg.resp.policy;

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
	
	@Override
	public boolean equals(Object arg) {
		if (arg instanceof StructName){
			if (this.category.equals(((StructName)arg).getCategory())){
				if (this.idAttribute.equals(((StructName)arg).getIDAttribute())){
					return true;
				}else{
					return false;
				}
			}else {
				return false;
			}
		}else{
			return false;
		}
	}
	
}
