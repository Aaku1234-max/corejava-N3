package org.tnsif.interfacesDemo;
//imlementable class
public class User implements SBI,HDFC{

	@Override
	public String LoanType() {
		// TODO Auto-generated method stub
		return "personal loan";
	}

	@Override
	public float getInterest() {
		// TODO Auto-generated method stub
		return 12.8f;
	}

}
