package org.tnsif.mutithreading;

public class ThreadExcecutor {

	public static void main(String[] args) {
		SimpleThreadProgram  p=new SimpleThreadProgram();
		//used to change the thread name
		p.setName("java Thread");
		//used to change the priority
		p.setPriority(8);
		//when thread calls to start method it will come to run method
		p.start();
		/*once we called the start() method,again we cant resart
		 *p.start()*/
		System.out.println("current Thread "+p);
	}

}
