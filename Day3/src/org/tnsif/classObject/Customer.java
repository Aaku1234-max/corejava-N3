package org.tnsif.classObject;

public class Customer {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		private int id;
		private String custname;
		private String city;	
		//default constructor
		public Customer() {
		
		}
//			
		public int getInt() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		public String getCustname() {
			return custname;
		}
		public void setCustname(String custname) {
			this.custname=custname;
		}
		public void setCity(String city) {
			this.city=city;
		}
		public String getCity() {
			return city;
		}
		
		public Customer(int id,String custname,String city ) {
			this.id=id;
			this.custname=custname;
			this.city=city;
		}
		
		void display() {
			System.out.println(id+" "+custname+" "+city);
		}
	

 }
