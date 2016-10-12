package com.src.ReEntrantlockEx;

public class SyncDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyRunnable r1 = new MyRunnable(d, "Dhoni");
		MyRunnable r2 = new MyRunnable(d, "Yuvraj");
		MyRunnable r3 = new MyRunnable(d, "Kohli");
		MyRunnable r4 = new MyRunnable(d, "Suresh Raina");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
