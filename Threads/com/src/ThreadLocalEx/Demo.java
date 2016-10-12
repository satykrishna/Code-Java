package com.src.ThreadLocalEx;

public class Demo {

	public static void main(String[] args) {
		CustomerRunnable r1 = new CustomerRunnable();
		CustomerRunnable r2 = new CustomerRunnable();
		CustomerRunnable r3 = new CustomerRunnable();
		
		Thread t1 = new Thread(r1, "Customer Thread -1");
		Thread t2 = new Thread(r2, "Customer Thread -2");
		Thread t3 = new Thread(r3, "Customer Thread -3");
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
