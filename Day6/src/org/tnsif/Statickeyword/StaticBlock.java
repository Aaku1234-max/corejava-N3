package org.tnsif.Statickeyword;

public class StaticBlock {
	private int num;  //non-static
	private static String name;  //static

	//getter setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticBlock.name = name;
	}
	//static block
	//"static block is used to initialise static variable";

	static {
		name="Gauri";
	}

	

	

}
