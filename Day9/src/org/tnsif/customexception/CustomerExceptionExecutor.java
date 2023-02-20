package org.tnsif.customexception;

import java.util.Scanner;
//driver class
public class CustomerExceptionExecutor {
//program to demonstrate on customer exception
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String id =sc.nextLine();
		String password=sc.nextLine();
		try {
			if(id.equals("barkalea2001@gmail.com")&& password.equals("abc@123")){
					System.out.println("Credential matched");
			}
			else
		           throw new LoginCredential("Invalid credential");
		}
		catch(LoginCredential e) {
			System.out.println("Exception handle "+e);
		}
		finally{
			System.out.println("finally Block");
		}
	}

}
