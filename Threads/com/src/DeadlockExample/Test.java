package com.src.DeadlockExample;

public class Test {
	
	public static void main(String[] args) {
//		MyRunnable1 r1 = new MyRunnable1();
//		MyRunnable2 r2 = new MyRunnable2();
//		
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
//		
//		t1.setName("Thread-1");
//		t2.setName("Thread-2");
//		
//		t1.start();
//		t2.start();
		Thread main = Thread.currentThread();
		System.out.println(main.getThreadGroup().getParent().getName());
	}

}
