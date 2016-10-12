package com.src.ThreadLocalInheritence;

public class ThreadLocalInheritenceEx {

	public static void main(String[] args) {
		ParentRunnable r = new ParentRunnable();
		InheritableThreadLocal  tl = new InheritableThreadLocal();
		
		
		Thread t = new Thread(r, "Parent Thread");
		t.start();
	}
}
