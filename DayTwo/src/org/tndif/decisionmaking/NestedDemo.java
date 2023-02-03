package org.tndif.decisionmaking;

import java.util.Scanner;

public class NestedDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age and weight");
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>=12) {
			if(weight>=40)
			{
				if(weight<120) {
				System.out.println("Eligibal for bunjee jumping");
				
			    }
			else {
				System.out.println("extra ropes will be added");
				
			}
	        }
			else{
				System.out.println(" not Eligibal for bunjee jumping");
			}
                  }
			else {
				System.out.println(" not Eligibal for bunjee jumping");
		        }
		
	    }
}
