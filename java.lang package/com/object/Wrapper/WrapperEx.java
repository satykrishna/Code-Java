package com.object.Wrapper;

public class WrapperEx {
	
	public static void main(String[] args) {
		Boolean b = new Boolean(true);
		b = new Boolean("Y");
		
		Float f = new Float(10.52334343d);
		System.out.println(f);
		Boolean b1 = Boolean.valueOf(true);
		
		String str = "1234";
		
		
		Integer integer = Integer.valueOf(130);
		System.out.println(integer.intValue());
		System.out.println(integer.floatValue());
		System.out.println(integer.byteValue());
		System.out.println(integer.doubleValue());
		System.out.println(integer.longValue());
		System.out.println(integer.shortValue());
		
		
		Character ch = Character.valueOf('a');
		System.out.println(ch.charValue());
		
		Boolean bool = Boolean.valueOf("durga");
		System.out.println(bool.booleanValue());
		
		
		int no = Integer.parseInt("10");
		System.out.println(no);
		
		
		System.out.println( Integer.toString(153435, 31));
		
		Integer check = Integer.parseInt("10");
		check = Integer.valueOf("10");
		

	}

}
