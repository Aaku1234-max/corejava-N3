package org.tnsif.thisKeyword;
//this keyword use for method/function
class HR{
	void function1(HR obj) {
		System.out.println("Humen Resource");
	}
	void  function2() {
		function1(this);
	}
}
public class ThisKeywordExecutermethod {
	public static void main(String[] args) {
		HR obj=new HR();
		obj.function2();
		
	}
	

}
