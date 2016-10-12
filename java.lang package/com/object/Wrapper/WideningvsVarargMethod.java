package com.object.Wrapper;

public class WideningvsVarargMethod {

	public static void m1(int...x){
		System.out.println("var-arg method");
	}
	
	public static void m1(long y) {
		System.out.println("widening");
	}
	
	public static void main(String[] args) {
		
	   int x = 10;
	   m1(x);
	}
	
}
