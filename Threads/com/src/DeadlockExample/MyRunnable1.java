package com.src.DeadlockExample;

public class MyRunnable1 implements Runnable {

	A a = A.getInstance();
	B b = B.getInstance();

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " is running a.d1(b) method next");
		a.d1(b);
	}

}
