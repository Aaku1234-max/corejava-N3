package org.tnsif.threadlifecycle;

public class ThreadlifecycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tech t= new Tech();
		Softskill s=new Softskill();
		t.start();
		t.yield();
		s.start();

	}

}
