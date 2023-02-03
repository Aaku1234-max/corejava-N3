package org.tndif.decisionmaking;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
		int songs =sc.nextInt();
		switch(songs) {
		case 1:
			System.out.println("kesariya");
			break;
			
		case 2:
			System.out.println("ved");
			break;
			
		case 3:
			System.out.println("clam down");
			break;
			
		default:
			System.out.println("Invalid input");
			break;
			
		   }

      }
	
}