package com.Object.Example;

import java.lang.reflect.Method;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class object = Class.forName("java.lang.Object");
		int count = 0;
		Method[] methods = object.getDeclaredMethods();
		
		for(Method eachMethod: methods) {
			count++;
			System.out.println(eachMethod.getName());
		}
		
		System.out.println("No of methods : " + count);
		
	}

}
