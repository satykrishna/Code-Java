package com.object.Wrapper;

public class AutoBoxingvsWidening {

	
	public static void m1(Integer intValue ) {
		System.out.println("AutoBoxing");
	}
	
	public static void m1(long longValue) {
		System.out.println("Widening");
	}
	
	public static void main(String[] args) {
		
		
		int x = 10;
		
		m1(x);
	}
}
