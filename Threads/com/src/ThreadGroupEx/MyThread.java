package com.src.ThreadGroupEx;

public class MyThread extends Thread {

	public MyThread(ThreadGroup group, String name) {
		super(group, name);
	}

	public void run() {
		System.out.println(this + " is waiting for lock");
		   synchronized (MyThread.class) {
			   System.out.println(this + " ACQUIRED for lock");
			   System.out.println("Child thread: " + Thread.currentThread().getName());
			try {
				System.out.println("Sleeping : "+ Thread.currentThread().getName());
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(" Done execution : " + Thread.currentThread().getName());

		   }

	}

}
