package com.src.ThreadGroupEx;

public class ThreadGroupEx {

	private static ThreadGroup parentGroup;
	private static ThreadGroup childGroup;

	public static void main(String[] args) {
		parentGroup = new ThreadGroup(Thread.currentThread().getThreadGroup(),
				"Parent group");
		childGroup = new ThreadGroup(parentGroup, "Child group");
		MyThread t1 = new MyThread(parentGroup, "Child Thread -1");
		MyThread t2 = new MyThread(parentGroup, "Child Thread -2");
		t1.start();
		t2.start();
		System.out.println(parentGroup.activeCount()
				+ " threads are active in " + parentGroup.getName());
		System.out.println(childGroup.activeCount() + " threads are active in "
				+ childGroup.getName());
		parentGroup.list();
        System.out.println(Thread.currentThread().getName() + " is sleeping now");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(parentGroup.activeCount()
				+ " threads are active in " + parentGroup.getName());
		System.out.println(childGroup.activeCount() + " threads are active in "
				+ childGroup.getName());
		parentGroup.list();
		
	}

}
