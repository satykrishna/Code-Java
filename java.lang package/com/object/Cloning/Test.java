package com.object.Cloning;

public class Test implements Cloneable {

	int i = 10;
	int j = 20;
	

	public static void main(String[] args) {
		Test t1 = new Test();

		try {
			Test t2 = (Test) t1.clone();
			t2.i = 100;
			t2.j = 200;
			
			System.out.println(t1.i + " " + t2.i);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
