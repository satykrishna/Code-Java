package com.Thread.join;

public class ThreadJoinDemo {

	
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 r1 = new MyRunnable1();
		MyRunnable2 r2 = new MyRunnable2();
		
		Thread t1 = new Thread(r1, "Thread1" );
		Thread t2 = new Thread(r2, "Thread2");
		
		r1.t = t2;
		r2.t = t1;
		r1.wait();
		t1.start();
		t2.start();
		
		/*Thread main = Thread.currentThread();*/
		Thread.sleep(4000);
		t1.interrupt();
		t2.interrupt();
		
		
	}
}
