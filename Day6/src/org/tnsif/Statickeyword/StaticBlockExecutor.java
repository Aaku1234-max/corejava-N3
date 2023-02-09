package org.tnsif.Statickeyword;
//driver class
public class StaticBlockExecutor {
	public static void main(String[] args) {
		System.out.println(StaticBlock.getName());
		StaticBlock s=new StaticBlock ();
		s.setNum(124);
		System.out.println(s.getNum());
	}
	

}
