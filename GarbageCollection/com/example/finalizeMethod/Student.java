package com.example.finalizeMethod;

public class Student {

	String name;
	int rollNo;
	
	
	public static void main(String[] args) {
		
		System.gc();
		
		Student[] arr = new Student[1000000000];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = new Student();
		}
		
	
		
		System.out.println("Done");
	}
}