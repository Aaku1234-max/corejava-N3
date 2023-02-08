package org.tnsif.multilevellevelinheritane;

public class Nokia {
	private int modelno;
	public void display() {
		System.out.println("the Model no.is:"+modelno);
	}
	//default constructor
	public Nokia()
	{
		System.out.println("Nokia class");
	}
	//Parameterized constructor
	public Nokia(int modelno) {
		super();
		this.modelno = modelno;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	
	
}
