package org.tnsif.interfacesDemo;

public class Avanger implements Bike{

	@Override
	public void milage(int speed) {
		System.out.println("speed is:"+speed);
		
	}
	@Override
	public void engine() {
		System.out.println("working on petrol");
		
		
	}

}
