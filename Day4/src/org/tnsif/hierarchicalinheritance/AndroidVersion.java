package org.tnsif.hierarchicalinheritance;

public class AndroidVersion {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AndroidVersion() {
		super();
	}
	public AndroidVersion(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + ", getType()=" + getType() + ", toString()=" + super.toString() + "]";
	}
	

}
