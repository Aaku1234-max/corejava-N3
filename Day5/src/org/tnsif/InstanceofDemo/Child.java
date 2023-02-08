package org.tnsif.InstanceofDemo;

public class Child extends Person {
	private int age;
    //getter and setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//default constructor
	public Child() {
		super();
	}

	public Child(String name,String Address,int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}

}
