package org.tnsif.techvidvan.constructorching;

public class Sender {
	public void sendMessage(String message) {
		System.out.println("\nSending"+message);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("thread interruped");
		}
		System.out.println("\n"+message+"Sent");
	}
}
