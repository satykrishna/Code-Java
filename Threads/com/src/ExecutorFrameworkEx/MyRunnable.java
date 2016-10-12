package com.src.ExecutorFrameworkEx;

import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {
   
	private String name;
	private static ReentrantLock l = new ReentrantLock(true);
	
	public MyRunnable(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : wait for lock");
		l.lock();
		System.out.println(Thread.currentThread().getName() + " : gained lock");
		System.out.println(name + " ... Job started by Thread "
				+ Thread.currentThread().getName());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " ... Job completed by Thread "
				+ Thread.currentThread().getName());
		l.unlock();
		System.out.println(Thread.currentThread().getName() + " : release lock");
	}

}
