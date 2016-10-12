package example.scjp.assertUsage;

public class ValidAssertion {

	public static void main(String[] args) {

		Integer x = Integer.parseInt(args[0]);
		
		System.out.println("hi " + x);

		switch (x) {

		case 0:
			System.out.println("JAN");
			break;
		case 1:
			System.out.println("FEB");
			break;
		case 2:
			System.out.println("MAR");
			break;

		default:
			assert(false) : "Assertion error  value of input must be between 0 and 2";

		}
	}
	
	
	public static void m1(int x) {
		assert(x  > 10):"invalid value of x " + x;
	}

}
