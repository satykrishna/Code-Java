package com.object.Wrapper;

public class AutoBoxUnBoxEx {

	static Integer I = 10; //autoboxing
	
	public static void main(String[] args) {
		int i = I; //auto unboxing
		 m1(i);
	}
	
	public static void m1(Integer k) {
		int m = k; //m is of 
		System.out.println(m);
	}
	
}
