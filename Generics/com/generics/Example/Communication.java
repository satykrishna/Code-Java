package com.generics.Example;

import java.util.ArrayList;

public class Communication {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Satya");
		list.add("kondapalli");
		System.out.println("main " + list);
		m1(list);
		
		list.add("krishna");
		list.add("Satyam");
		
		System.out.println("after m1 : "  + list);
		Integer x = 10;
		
		m2(x);
		System.out.println("main " + x);

	}
	
//	private static void m1(ArrayList<Integer> list) {
//		
//	}

	private static void m1(ArrayList list) {
		list.add(10);
		list.add(20);
		list.add(true);
		System.out.println("m1  - " + list);
	}
	
	
	private static void m2(Integer x) {
		x = 20;
		System.out.println("m2 " + x);
	}
	
	public static void main2(String[] args) {
		
		ArrayList<String> l = new ArrayList();
		
	}
	
	

}
 