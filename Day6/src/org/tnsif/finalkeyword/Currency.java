package org.tnsif.finalkeyword;
//program to demonstrate final class
public  final class Currency {
	private String type;
	void print() {
		System.out.println("currency type is:"+type);
	}
	//gette setter
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
