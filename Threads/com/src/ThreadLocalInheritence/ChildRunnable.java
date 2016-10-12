package com.src.ThreadLocalInheritence;

public class ChildRunnable implements Runnable{

	@Override
	public void run() {
	  
		System.out.println("Child Thread Local : " + ParentRunnable.getLocal().get());
		
	}

	
}
