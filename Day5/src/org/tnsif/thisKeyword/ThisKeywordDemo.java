package org.tnsif.thisKeyword;
//it can be used to refer instance variable of current class

//used of this keyword is suppose we have same variable and same argument then we use this keyword;
class AB{
		int a;
		int b;
		public void setdata(int a,int b) {
			this.a=a;
			this.b=b;
		}
		public void showdata() {
			System.out.println("value of A="+a);
			System.out.println("value of B="+b);
		}
	}
public class ThisKeywordDemo{
	public static void main(String[] args) {
		AB t=new AB();
//		t.a=23;
//		t.b=20;
//		t.showdata();
		t.setdata(4, 9);
		t.showdata();
	}

}
