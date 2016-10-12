package example.anonymous.innerclass;

public class Outer {

	class Inner {

		final int x = 10;

		public void method1() {
			System.out.println("this is method1 inside Inner class");
		}
	}

}

class Test {

	public static void main(String[] args) {

		Outer outer = new Outer();

		Outer.Inner inner = outer.new Inner();

		inner.method1();
	}
}
