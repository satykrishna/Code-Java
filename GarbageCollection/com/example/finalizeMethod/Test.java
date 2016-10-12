package com.example.finalizeMethod;

public class Test {
	
	public static void main(String[] args) throws Throwable {
	   
		Test t = new Test();
		t.finalize();
		t.finalize();
		t = null;
		Runtime.getRuntime().gc();
		System.out.println("end of main");
				
		
		
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(Thread.currentThread().getName() + " finalize method");
	}

}
