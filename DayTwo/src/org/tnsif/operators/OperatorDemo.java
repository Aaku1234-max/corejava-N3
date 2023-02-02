package org.tnsif.operators;

import java.util.Scanner;

public class OperatorDemo {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		//Arithmetic operator
//		System.out.println(x+y);
//		System.out.println(x-y);
//		System.out.println(x/y);
//		System.out.println(x*y);
//		System.out.println(x%y);
		 //relational
		//System.out.println(x==y);
//		boolean res=x>y;
//		System.out.println(res);
//		//assignment
//		x+=y;
//		System.out.println(x);
		//logical
		//boolean res2=(x>y)&&(x==y);
		//boolean res3=(x<y)||(x==y);
		//boolean res4=!(x==y);
		
		//bitwise
//		int a=12&5;
//		int b=12|5;
//		int c=12^5;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        
        //ternary
        String str=(13%2==0)?"even":"odd";
        System.out.println(str);
        
        //increament and decreamnet
        
        int p=x++;
        int q=--x;
        System.out.println(q);
       
        
		
	}

}
