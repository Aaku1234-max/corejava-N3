package org.tnsif.hierarchicalinheritance;

import java.util.Scanner;

public class HierarchicalinheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the type and version");
		String type =sc.nextLine();
		int version =sc.nextInt();
		int version1=sc.nextInt();
		SnowCone s1=new SnowCone(type,version);
		s1.setType(type);
		s1.setVersion(version);
		
		Triamisu t=new Triamisu(version1, type,version);
		t.setType(type);
		t.setVersion1(version1);
		
		System.out.println(s1);
		System.out.println(t);

	}

}
