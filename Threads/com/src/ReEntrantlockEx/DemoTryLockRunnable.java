package com.src.ReEntrantlockEx;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DemoTryLockRunnable implements Runnable {

	private static ReentrantLock l = new ReentrantLock();

	@Override
	public void run() {
        do {
			
        	try {
				if(l.tryLock(3, TimeUnit.SECONDS)) {
					System.out.println(Thread.currentThread().getName() 
							+ "got the lock");
					System.out.println(Thread.currentThread().getName() 
							+ "sleeping now");
					Thread.sleep(25000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+ "releases lock");
					break;
				}else{
					System.out.println(Thread.currentThread().getName() 
							+ "unable to get the lock, will retry again");
				}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        	
		} while (true);
		/*
		 * try { if (l.tryLock(5, TimeUnit.SECONDS)) {
		 * System.out.println(Thread.currentThread().getName() + " " +
		 * "got lock and performing safe operation"); try { Thread.sleep(2000);
		 * } catch (InterruptedException e) { l.unlock(); } }else {
		 * System.out.println(Thread.currentThread().getName() + " " +
		 * "unable to get the lock and hence performing " +
		 * "some other operations"); } } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}

}
