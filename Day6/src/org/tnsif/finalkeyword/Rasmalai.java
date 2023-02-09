package org.tnsif.finalkeyword;
//child class
public class Rasmalai extends Cake{
	private int Price;
	
	//void display() {
		/*if any method is declared final in parent class and we are 
	going to use that method inside the child class then we can't override*/
	//}
     final void display(int price) {
	
		System.out.println("The price of cake is:"+price);

	}
	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

}
