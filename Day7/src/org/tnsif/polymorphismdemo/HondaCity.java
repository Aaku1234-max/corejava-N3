package org.tnsif.polymorphismdemo;
//Program to demonstrate constructor overloading
public class HondaCity {
	private int speed;
	 private String color;
	 /*getter and setter
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}*/
	 
	//constructor overloading
	
	//constructor with no-argument
	public HondaCity() {
		System.out.println("I like to drive a Hondacity");
	}
	//constructor with argument
	public HondaCity(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
		System.out.println("speed is:"+speed+","+ "color is:"+color);
	}
	 
	 

}
