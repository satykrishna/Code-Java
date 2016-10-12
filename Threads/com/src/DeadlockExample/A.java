package com.src.DeadlockExample;

public class A {

	private static A _instance;

	private A() {
		System.out.println("A: constructor");
	}

	public static A getInstance() {
		if (_instance == null) {
			_instance = new A();
		}
		return _instance;
	}

	public void d1(B b) {
		System.out.println(Thread.currentThread().getName()
				+ " Entering into A : d1(B b) method");

		synchronized (b) {
			try {
				System.out.println(Thread.currentThread().getName()
						+ " sleeping for 5000 ms");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+ " trying to invoke b.listen() method");

			b.listen();
		}

	}

	public void listen() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()
					+ " Entering into A: listen method");
		}
	}
}
