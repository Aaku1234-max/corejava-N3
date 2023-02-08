package org.tnsif.multilevellevelinheritane;

public class Iphone extends Android{
	
	private String slottype;
	public void slot() {
		System.out.println("Slotype is:"+slottype);
	}
	//getter and setter
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	public Iphone() {
		super();
	}
	public Iphone(int modelno,String version,String slottype) {
		super();
		this.slottype = slottype;
	}
	@Override
	public String toString() {
		return "Iphone [slottype=" + slottype + ", getSlottype()=" + getSlottype() + ", getVersion()=" + getVersion()
				+ ", getModelno()=" + getModelno() + ", toString()=" + super.toString() + "]";
	}
	
    
	
	

}
