package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp=new SmartPhone ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the resolution and slottype " + "of a cellphone");
		int resolution=sc.nextInt();
		sc.nextLine();
		String slottype=sc.nextLine();
		sp.setResolution(resolution);
		sp.setSloattype(slottype);
		sp.display(resolution, slottype);
		
		Mutiplication m=new Mutiplication();
		System.out.println(m.mul(11,5));
		System.out.println(m.mul(5.2f,3));

	}

}
