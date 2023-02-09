package org.tnsif.Statickeyword;

public class StaticVariableDemo {
	private String name;
	//its take n=5;
	 //static int n=10;
	public static String companyName="TechnoServe India";
	public StaticVariableDemo(String name) {
		//n=5;
		super();
		this.name=name;
		
		//System.out.println(n);
		
	}
	@Override
	public String toString() {
		return "StaticVariableDemo [name "+ name +"]";
	}
	
}

