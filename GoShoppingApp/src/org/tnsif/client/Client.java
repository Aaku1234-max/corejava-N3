package org.tnsif.client;

import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.ShopFactory;

public class Client {
	public static void main(String[]args) {
		ShopFactory f= new GSShopFactory();
		GSPrimeAcc  p= new GSPrimeAcc(1234,"Aakanksha Barkale",1050f,true);
		GSNormalAcc n= new GSNormalAcc(1234,"Shraddha thorat",1050f,60f);
		System.out.println("Prime Acc");
		System.out.println(p);
		p.bookProduct(p.getCharges());
		System.out.println("Normal Acc");
		System.out.println(n);
		n.bookProduct(p.getCharges());
	}

}
