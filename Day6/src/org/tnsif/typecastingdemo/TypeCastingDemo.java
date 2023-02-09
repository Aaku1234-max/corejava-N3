package org.tnsif.typecastingdemo;
//program to demonstrate on typecasting
public class TypeCastingDemo {

	public static void main(String[] args) {
		//implicit small to large
		int x=15;
		float y=x;
		System.out.println("the value of y is:"+y);
		
		//explicit typecasting larger to small 
		double d=12.5;
		long l=(long)d;
		System.out.println("the value of y is:"+l);
		
	}

}
