package org.tnsif.mutithreading;

public class Synchronization{
	 synchronized void print(int num) {
		for(int i=1;i<=5;i++) {
			
		System.out.println(num*i);
	}

	}

}
//Thread1
class ThreadOne extends Thread{
	Synchronization d;

	public ThreadOne(Synchronization d) {
		super();
		this.d = d;
	}
	public void display() {
		d.print(10);
	}
}
//Thread2
class ThreadTwo extends Thread{
	Synchronization d;

	public ThreadTwo(Synchronization d) {
		super();
		this.d = d;
	}
	public void run() {
		d.print(15);
	}
}