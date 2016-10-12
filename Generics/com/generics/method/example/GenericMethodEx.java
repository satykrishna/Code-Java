package com.generics.method.example;

import java.util.ArrayList;

public class GenericMethodEx {

	public static void m1(ArrayList<? super Number> list) {

	}

	public static void m2(ArrayList<String> list) {

	}

	public static void m3(ArrayList<? extends Number> list) {

	}

	public static void m4(ArrayList<?> list) {

	}
	
	public static <T> void m5(T object) {
		
		T a, b;	
		ArrayList<T> l = new ArrayList<T>();
		l.add(object);
		
		for(T t : l) {
			System.out.println((Integer)t + 2);
		}
		
	}
	
	public static <T extends Number&Runnable> void m6(){
		
	}
	
	public static <T extends Number> void m7(){
		
	}
	
	public static <T extends Runnable> void m8() {
		
	}
	
	public static <T extends Comparable & Runnable> void m9(){
		
	}
//	
//	public static <T extends Number & String> void m10(){
//		//invalid
//	}
	
//	public static <T extends Runnable & Number> void m11() {
//		//Invalid
//	}

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<?> l2 = new ArrayList<String>();
		ArrayList<?> l3 = new ArrayList<Integer>();
		ArrayList<? extends Number> l4 = new ArrayList<Integer>();
//		ArrayList<? extends Number> l5 = new ArrayList<String>();
//		ArrayList<?> l6 = new ArrayList<?>();
//		ArrayList<?> l7 = new ArrayList<? extends Number>();
		
		m5(2);
		
		

	}

}
