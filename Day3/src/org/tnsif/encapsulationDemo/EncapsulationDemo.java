package org.tnsif.encapsulationDemo;

import java.util.Scanner;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin:");
		HDFc h=new HDFc();
		h.setPin(sc.nextInt());
		System.out.println (h.getPin());
		h.accept();
	}

}
