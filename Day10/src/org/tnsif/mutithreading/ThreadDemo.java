package org.tnsif.mutithreading;
import java.lang.Thread;
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Current thread :"+t);
		try {
			Thread.sleep(1);
		}
		catch(InterruptedException e) {
			System.out.println("Main Thread Intrrupted");
		}

	}

}
