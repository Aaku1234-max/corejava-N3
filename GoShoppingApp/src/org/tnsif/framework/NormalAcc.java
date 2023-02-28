package org.tnsif.framework;

public abstract class NormalAcc extends ShopAcc {
	final private float delivaryCharges;

	public NormalAcc(int accno, String accnm, float charges, float delivaryCharges) {
		super(accno, accnm, charges);
		this.delivaryCharges = delivaryCharges;
	}

	@Override
	public String toString() {
		return "NormalAcc [delivaryCharges=" + delivaryCharges + "]";
	}
	 public void bookProduct(float charges) {
	    	System.out.println("Acc no"+this.getAccno()+" "+"Acc name:"+this.getAccnm()
	    	+" "+"DelivaryChrges:"+(charges+delivaryCharges));
	    }

}
