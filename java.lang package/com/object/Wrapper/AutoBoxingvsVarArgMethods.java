package com.object.Wrapper;

public class AutoBoxingvsVarArgMethods {

	static void m1(int x){
		System.out.println("primitive");
	}
	
	static void  m1(Integer integer) {
		System.out.println("AutoBoxing");
	}
	
	static void m1(int...is){
		System.out.println("VarArg");
	}
	
	public static void main(String[] args) {
		int x = 10;
		m1(x);
	}
	
}
