package org.tnsif.polymorphismdemo;
//Program to demonstrate constructor overloading
import java.util.Scanner;
//driver class
public class ConstructOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the speed and color of "+"a hondacity");
		int speed=sc.nextInt();
		sc.nextLine();
		String color =sc.nextLine();
		HondaCity hc=new HondaCity();
		HondaCity h1=new HondaCity(speed,color);

	}

}
