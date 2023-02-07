package org.tnsif.accessspacifierdemo;

public class AccessSpecifierExample {
	public String name;
	/*if any data memeber id default it will
	 * access only inside the same pacakge */
	public void display() {
		System.out.println("the name is:" +name); 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;

}
}
