package org.tnsif.mutithreading;

public class SynchronizationDemoExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         Synchronization obj=new  Synchronization ();
         ThreadOne t1=new ThreadOne(obj);
         ThreadTwo t2=new ThreadTwo(obj);
         t1.start();
         t2.start();
         
	}

}
