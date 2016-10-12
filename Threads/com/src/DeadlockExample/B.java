package com.src.DeadlockExample;

public class B {

	private static B _instance;

	private B() {
		System.out.println("B: constructor");
	}

	public static B getInstance() {
		if (_instance == null) {
			_instance = new B();
		}
		return _instance;
	}

	public void d2(A a) {
		System.out.println(Thread.currentThread().getName()
				+ " Entering into B : d2(A a) method");
		synchronized (a) {
			try {
				System.out.println(Thread.currentThread().getName()
						+ " sleeping for 5000 ms");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+ " trying to invoke a.listen() method");

			a.listen();
		}

	}

	public void listen() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()
					+ " Entering into B: listen method");
		}

	}
}
