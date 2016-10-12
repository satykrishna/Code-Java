package com.object.Wrapper;

public class BufferWrapper {

	
	/*
	 * To provide support for autoboxing Internally a buffer of 
	 * wrapper classes are created in range [-128. 128).
	 */
	
	public static void main(String[] args) {
		
//		Integer  x = 127;
//		Integer y = 127;
//		
//		System.out.println(x == y);
//		
//		x = 128;
//		y = 128;
//		
//		System.out.println(x == y);
//		
//		Boolean b2 = false;
//		Boolean b1 = false;
//		
//		System.out.println(b1 == b2);
//		
//		Double d1 = 10.9d;
//		Double d2 = 10.9d;
//		
//		System.out.println(d1 == d2);
//		
//		Integer i = new Integer(10);
//		x = Integer.valueOf(12);
		
		Integer x = new Integer(10);
		Integer y = new Integer(10);
		
		System.out.println(x  == y);
		
		x = 100;
		y = 100;
		
		System.out.println(x  == y);

		x = Integer.valueOf(200);
		y = 200;
		
		System.out.println(x  == y);

		x = Integer.valueOf(300);
		y = Integer.valueOf(300);
		
		System.out.println(x == y);
		
	}

}
