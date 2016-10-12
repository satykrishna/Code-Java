package com.Thread.WaityNotifyAll;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThreadB b = new MyThreadB();
		b.start();
		b.limit = 919;
		synchronized (b) {
			b.wait();
			System.out.println(b.total);
		}
		
	}
}
