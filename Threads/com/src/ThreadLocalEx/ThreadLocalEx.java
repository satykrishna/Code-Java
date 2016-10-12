package com.src.ThreadLocalEx;

public class ThreadLocalEx {

	public static void main(String[] args) {
		
		ThreadLocal<Object> local = new ThreadLocal<Object>(){
			
			@Override
			protected Object initialValue() {
				// TODO Auto-generated method stub
				return "Overrided initial value";
			}
		};
		
		
		System.out.println("Created local object " + local.get());
		local.set("Durga");
		System.out.println("set value to local object " + local.get());
		local.remove();
		System.out.println("Removed local object value however the " +
				"default value is " + local.get());
	}
}
