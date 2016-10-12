package com.example.finalizeMethod;

public class GcTest {
	
	static int count = 0;

	public static void main(String[] args) {

		for (int i = 0; i < 1000000; i++) {
			GcTest t = new GcTest();
			t = null;
		}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called " + (++count));
	}

}
