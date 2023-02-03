package org.tndif.decisionmaking;

import java.util.Scanner;

public class IfelseDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value  of a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b) 
			System.out.println("a is greater");	
		else
		    System.out.println("b is greater");	

 }
}
