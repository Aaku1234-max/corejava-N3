package org.tnsif.thisKeyword;
//this keyword can be use to return current class instance(obj);
class Mathematics{
	int a,b;
	Mathematics(){
		a=10;
		b=20;
	}
	Mathematics accept() {
		return this;
		
	}
	void display() {
		System.out.println("a is :"+a);
		System.out.println("b is :"+b);
	}
}
public class ThisKeywordRunner {

	public static void main(String[] args) {
		
		Mathematics m=new Mathematics();
		m.accept().display();

	}

}
