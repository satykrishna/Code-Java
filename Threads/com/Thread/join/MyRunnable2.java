package com.Thread.join;

public class MyRunnable2 implements Runnable {
	
	static Thread t;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		  System.out.println(Thread.currentThread().getName() +  " About to wait for  " + t.getName());

			t.join();
			System.out.println("I am done waiting for this thread " + t.getName() );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
