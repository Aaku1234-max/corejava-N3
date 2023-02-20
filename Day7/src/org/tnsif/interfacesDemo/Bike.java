package org.tnsif.interfacesDemo;

public interface Bike {
	//variable must be public static final
	//private int speed;
	 int speed=45;
	//by default all the method are abstract in an interface
	void milage(int speed) ;
	void engine();
		
}