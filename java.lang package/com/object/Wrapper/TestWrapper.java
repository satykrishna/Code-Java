package com.object.Wrapper;

public class TestWrapper {

	/**
	 * @param args
	 */

	static Integer i = 0;
	static Integer j; // default value assigned by compiler is null since Integer
	 //is an Object

	Integer x = 10;
	Integer y = x;
	
	public static void main(String[] args) {
       
//		int m = i;
//		System.out.println(m);
//		try{
//			int k = j;
//			System.out.println(k);	
//		}catch(NullPointerException ne) {
//			System.out.println(j);
//		}
//		
//		Integer x = 10;
//		Integer y = x;
//		System.out.println(x == y);
//		x++;
//		System.out.println(x + " ... " + y );
//		System.out.println(x == y);
		
		Integer x = new Integer(10);
		Integer y = new Integer(10);
		System.out.println(x == y);
		
		x = new Integer(10);
		y =10;
		System.out.println(x  == y);
		
		x = 10;
		y = 10;
		
		System.out.println(x == y);
		
		x = 100;
		y = 100;
		
		System.out.println(x == y);
		
		x = 1000;
		y = 1000;
		
		System.out.println(x == y);
		
		
		
			
	}

}
