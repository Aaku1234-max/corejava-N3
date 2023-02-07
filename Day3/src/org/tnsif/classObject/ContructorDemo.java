package org.tnsif.classObject;
import java.util.Scanner;
public class ContructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,custname name and city");
		int id;
		String custname,city;
		
		id=sc.nextInt();
		sc.nextLine();
		custname=sc.nextLine();
		city=sc.next(); 
		
		//cust 1;
		Customer C=new Customer();
		C.setId(id);
		C.setCustname(custname);
		C.setCity(city);
		C.display();
//		System.out.println(C.getInt());
//		System.out.println(C.getCustomer());
//		System.out.println(C.getCity());
		
		//cust2
		Customer C1=new Customer();
		C1.setId(id);
		C1.setCustname(custname);
		C1.setCity(city);
		C1.display();
//		System.out.println(C.getId1());
//		System.out.println(C.getCustname1());
//		System.out.println(C.getCity1());
//		
	
	}
	Customer c=new Customer(19,"Aakanksha","bhagur");//

}
