package org.tnsif.thisKeyword;
//this keyword use for constructor
class Finance{
	int Salary;
	Finance(){
		System.out.println("parent class");
	}
	Finance(int Salary){
		this.Salary=Salary;
	}
	void print() {
		System.out.println("Salary is:"+Salary);
	}
}
public class ThisKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finance obj=new Finance();
		Finance f1= new Finance(100);
		System.out.println("num vaule is:"+f1.Salary);

	}

}
