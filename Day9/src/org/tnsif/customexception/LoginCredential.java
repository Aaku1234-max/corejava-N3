package org.tnsif.customexception;

public class LoginCredential extends Exception{
	//data mamber
	private String str;
    //parameterised constructor
	public LoginCredential(String str){
		super();
		this.str=str;
		
	}

	@Override
	public String toString() {
		return "LogicCredential [str=" + str + "]";
	}
	
	

}
