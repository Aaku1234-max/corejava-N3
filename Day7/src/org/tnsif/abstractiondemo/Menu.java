package org.tnsif.abstractiondemo;

public abstract class Menu {
	abstract void recipe();
	abstract void foodType();
	void menuType() {
		//concrete method
		
		System.out.println("veg and nonveg");
	}
	

}
