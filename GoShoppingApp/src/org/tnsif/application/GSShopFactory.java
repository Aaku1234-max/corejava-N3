package org.tnsif.application;

import org.tnsif.framework.NormalAcc;
import org.tnsif.framework.PrimeAcc;
import org.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int accno, String Accnm, float charges, boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(accno,Accnm,charges,isPrime);
		return null;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accno, String Accnm, float charges, float delivaryCharges) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
