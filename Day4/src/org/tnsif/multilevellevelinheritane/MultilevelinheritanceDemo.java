package org.tnsif.multilevellevelinheritane;

import java.util.Scanner;

public class MultilevelinheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the modelno,version and sloattype");
		int modelno=sc.nextInt();
		sc.nextLine();
		String version=sc.nextLine();
		String slottype=sc.nextLine();
		Iphone i=new Iphone();
		Iphone i1=new Iphone(modelno,version,slottype);
		i1.setModelno(modelno);
		i1.setVersion(version);
		i1.setSlottype(slottype);
		i1.slot();
		i1.accept();
		i1.display();
		System.out.println(i1);
		

	}

}
