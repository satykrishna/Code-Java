package com.src.ReEntrantlockEx;

import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLockEx {

	private static ReentrantLock l = new ReentrantLock(true);
	
	public static void main(String[] args) {
		l.lock();
		l.lock();
		System.out.println("is any thread using the lock? " + l.isLocked());
		System.out.println("is current thread using the lock ? " + l.isHeldByCurrentThread());
		System.out.println("No of locks hold by current thread : " + l.getHoldCount());
		System.out.println("No of threads waiting for the lock to release : " + l.getQueueLength());
		System.out.println("----<< UNLOCK NOW >>----");
	    l.unlock();
		System.out.println("No of locks hold by current thread : " + l.getHoldCount());
		System.out.println("is any thread using the lock? " + l.isLocked());
		System.out.println("is current thread using the lock ? " + l.isHeldByCurrentThread());
		System.out.println("----<< UNLOCK NOW >>----");
		l.unlock();
		System.out.println("No of locks hold by current thread : " + l.getHoldCount());
		System.out.println("is any thread using the lock? " + l.isLocked());
		System.out.println("is current thread using the lock ? " + l.isHeldByCurrentThread());
	}
}
