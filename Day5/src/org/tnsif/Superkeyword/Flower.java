package org.tnsif.Superkeyword;

public class Flower {
	private String name;
    //getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
     //default constructor
	public Flower() {
		System.out.println("flower-parent class");
		// TODO Auto-generated constructor stub
	}
     //paramereised constructor
	public Flower(String name) {
		super();
		this.name = name;
		
		
	}
	

}
