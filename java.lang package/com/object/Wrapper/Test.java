package com.object.Wrapper;

public class Test {

	
//	static void m1(Long lo){
//		System.out.println("Long");
//	}
//	
	
	static void m1(Object obj) {
		Integer integer = (Integer)obj;
		System.out.println("Object method : " + integer);
	}
	public static void main(String[] args) {
		int x = 10;
		
		
		
		Object o = 10;
		System.out.println(o);
		
		o = 10l;
		System.out.println(o);
		
		Number n = 12_934_34.333_234;
		System.out.println(n);
		
		m1(10);
	}
	
	
}
