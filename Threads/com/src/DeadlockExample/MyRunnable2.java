package com.src.DeadlockExample;

public class MyRunnable2 implements Runnable {

	A a = A.getInstance();
	B b = B.getInstance();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.d2(a);

	}

}
