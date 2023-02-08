package org.tnsif.hierarchicalinheritance;

public class Triamisu extends AndroidVersion{
	private int version1;
//getter setter
	public int getVersion1() {
		return version1;
	}

	public void setVersion1(int version1) {
		this.version1 = version1;
	}

	public Triamisu() {
		super();
	}
	public Triamisu(int version1,String type,int version) {
		super();
		this.version1 = version1;
	}

	@Override
	public String toString() {
		return "Triamisu [version1=" + version1 + ", getVersion1()=" + getVersion1() + ", getType()=" + getType()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
