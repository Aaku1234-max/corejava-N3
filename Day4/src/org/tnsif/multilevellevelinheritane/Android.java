package org.tnsif.multilevellevelinheritane;

public class Android extends Nokia{
	private String version;
	public void accept()
	{
		System.out.println("The andriod version name is:"+version);
	}
	//getter and setter
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Android() {
		super();
		this.version = version;
	}
	public Android(String version) {
		super();
		this.version = version;
	}
	
	}

