package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;

public class Client {
	public static void main(String args[])
	{
		MMBankFactory m=new MMBankFactory();
		MMSavingAcc s=new MMSavingAcc(123,"Aakanksha Barkale",40000f,true);
		MMCurrentAcc c=new MMCurrentAcc(124,"Arya",8000f,500f);
		//saving acc
				System.out.println("Saving Acc");
				System.out.println(s);
				s.withdraw(s.getAccBal());
				
				//saving acc
				System.out.println("Current Acc");
				System.out.println(c);
				c.withdraw(c.getAccBal());
		
	}

}