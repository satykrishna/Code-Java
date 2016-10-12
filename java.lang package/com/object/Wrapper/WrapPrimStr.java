package com.object.Wrapper;

public class WrapPrimStr {

	
	public static void main(String[] args) {
		
		
		/*
		 * wrapper - String
		 */
		
//		Integer I = new Integer(100);
//		I = Integer.valueOf(120);
//		System.out.println(I); 
//		System.out.println(I.toString().length());
//		
//		
//		Boolean b = new Boolean("true");
//		b = Boolean.valueOf("satya");
//		System.out.println(b);
//		System.out.println(b.toString().length());
//		
//		Character ch = new Character('a');
//		ch = Character.valueOf('b');
//		System.out.println(ch);
//		System.out.println(ch.toString());
//		
		/*
		 * String - wrapper
		 */
		
	   String str = "10";
	   
	   Integer integer = Integer.parseInt(str);
	   System.out.println(integer);
	  
	   integer = Integer.valueOf(str);
	   System.out.println(integer);
	   
	   Character ch = Character.valueOf('a');
		
		
		

	}
}
