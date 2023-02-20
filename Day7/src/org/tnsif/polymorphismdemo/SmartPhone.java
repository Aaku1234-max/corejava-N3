package org.tnsif.polymorphismdemo;
//program to demonstrate on method overloading
public class SmartPhone {
	//Method overloading in terms by passing no.of argument
	private int resolution;
	private String sloattype;
	void display(int resolution) {
		System.out.println("Camera Resolution:"+resolution);
	}
	void display(int resolution,String slottype) {
		System.out.println("Camera Resolution:"+resolution+","+"slottype:"+slottype);
		
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSloattype() {
		return sloattype;
	}
	public void setSloattype(String sloattype) {
		this.sloattype = sloattype;
	}

}
