package com.Thread.Deadlockex;

public class A {

	private static A _instance;

	private A() {

	}

	public static A getInstance() {
		if (_instance == null) {
			_instance = new A();
		}
		return _instance;
	}

	public void m1(B b) {
		synchronized (b) {
			System.out.println("Entering A: m1() method");

			try {
				Thread.sleep(2000);
				System.out.println( Thread.currentThread().getName() + " Acquired lock of " + b + " and sleeping now");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println(Thread.currentThread().getName() + " woke up, invoke b.listen() method");
			b.listen();
		}

	}

	public void listen() {
		synchronized (this) {
			System.out.println("Acquired lock of " + this
					+ "hence entered listen method synchronized block");
		}
	}

}
