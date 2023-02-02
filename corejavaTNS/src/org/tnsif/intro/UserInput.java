package org.tnsif.intro;

import java.util.Scanner;

public class UserInput {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("The value of x is:"+x);
		float f=sc.nextFloat();
		System.out.println("The value of f is:"+f);
		char ch=sc.next().charAt(3);
		System.out.println("The value of ch is:"+ch);
		String name=sc.next();
		System.out.println("The value of name is:"+name);  //aakanksha
		String str=sc.nextLine();
		System.out.println("The value of str is:"+str);  //aakanksha barkale
		double d=sc.nextDouble();
		System.out.println("The value of d is:"+d);
		
		
		sc.close();
	}

}
