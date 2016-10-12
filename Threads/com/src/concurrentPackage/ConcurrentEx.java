package com.src.concurrentPackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentEx {
	
	private static Lock lock = new ReentrantLock();
	
	public static void main(String[] args) throws InterruptedException {
		
		if(lock.tryLock(1, TimeUnit.DAYS)) {
		   System.out.println("Show the lock");	
		}else{
			System.out.println("display it");
		}
	}

}
