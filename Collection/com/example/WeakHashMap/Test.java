package com.example.WeakHashMap;

public class Test {
	
	@Override
	public String toString() {
		return "overrride";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called.....");

	}

}
