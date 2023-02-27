package org.tnsif.genericdemo;
//program to demonstrate on generic method
class GenericMethod
{
	public static<E> void print(E[] elements)
	{
		for(E itr:elements)
		{
			System.out.println(itr+" ");
		}
		System.out.println();
	}
}
public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethod m=new GenericMethod();
		Integer[] array1= {10,36,40,56,61};
		Character[] array2= {'A','A','K','A','N'};
		System.out.print("Integer Array : ");
		m.print(array1);
		System.out.print("Character Array : ");
		m.print(array2);
		
	}
	
}