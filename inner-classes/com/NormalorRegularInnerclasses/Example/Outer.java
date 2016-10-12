package com.NormalorRegularInnerclasses.Example;

public class Outer {

	int x = 10;
	int y = 20;

	class Inner {
		int x = 100;

		public void m1() {
			int x = 1000;
			System.out.println("Inside m1 method: m1");
			System.out.println(x + " ... " + y);
			System.out.println(this.x);
			System.out.println(Outer.this.x);
		}

		{
			System.out.println("Hi");
		}

		public void main(String[] args) {

		}
	}

	public static void main(String[] args) {
		// Outer o = new Outer();
		// Outer.Inner i = o.new Inner();
		// i.m1();

		new Outer().new Inner().m1();
	}

}
