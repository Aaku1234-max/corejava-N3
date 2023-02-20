package org.tnsif.threadlifecycle;

public class Softskill extends Thread{
	 synchronized public void run(){
		System.out.println("professional Ethics");
		for(int i=1;i<=5;i++) {
			System.out.println(i+" ");
			
		}
		System.out.println("softskill session");
	}

}
