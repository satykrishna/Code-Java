package com.StaticNestedclass.Example;

public class Outer {

	static class Nested {
		
		public void m1(){
			System.out.println("This is m1 method");
		}
		
		public static void main(String[] args) {
			System.out.println("Static nested class main method" +
					"");
		}
	}
	
	public static void main(String[] args) {
		Nested nested = new Nested();
		nested.m1();
		Outer.Nested n1 = new Outer.Nested();
	}
	
}


class Test{
	
	public static void main(String[] args) {
		Outer.Nested nested = new Outer.Nested();
		nested.m1();
	}
}