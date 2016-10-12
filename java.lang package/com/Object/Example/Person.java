package com.Object.Example;

import java.lang.reflect.Method;

public class Person {

	private String name;
	private int age;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person other = (Person) obj;
			if (name == other.name && age == other.age)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		/*
		 * Since the equals() method used age and name as the 
		 * parameters to compare two Objects, use the same paramters 
		 * in hashCode.
		 */
		return name.hashCode() + age;
	}
	
	
	public static void main(String[] args) {
		Object object = new String("durga");
		Class runtime = object.getClass();
		
		System.out.println(runtime.getName() + " : is the fully qualified class name");
		
		for(Method m : runtime.getMethods()) {
			System.out.println(m.getName());
		}
		
		System.out.println("No of methods in th class : " + runtime.getMethods().length);
	}

}
