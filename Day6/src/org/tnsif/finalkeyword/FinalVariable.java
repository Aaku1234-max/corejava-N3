package org.tnsif.finalkeyword;
//program to demonstrate on final keyword with variable

public class FinalVariable {
	
	final static int x=15;
	public static void print() {
		//x=16; we can't change the value of x here as x is declared is final;
		System.out.println("The value of x is:"+x);
	}
	public static void main(String[] args) {
		FinalVariable.print();
	}

}
