package com.src.ReEntrantlockEx;

public class DemoTryLock {
	
	public static void main(String[] args) {
		
		DemoTryLockRunnable r1 = new DemoTryLockRunnable();
		DemoTryLockRunnable r2 = new DemoTryLockRunnable();
		DemoTryLockRunnable r3 = new DemoTryLockRunnable();
		DemoTryLockRunnable r4 = new DemoTryLockRunnable();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r3);
		
		t1.setName("T-1 ");
		t2.setName("T-2 ");
		t3.setName("T-3 ");
		t4.setName("T-4 ");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
