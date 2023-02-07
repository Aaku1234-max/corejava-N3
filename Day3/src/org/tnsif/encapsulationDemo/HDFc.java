package org.tnsif.encapsulationDemo;

public class HDFc {
	//data member
	private int pin;
	void accept() {
		System.out.println("the ATM pin is:"+pin);
	}
	
	//getter and setter
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin=pin;
	}

}
