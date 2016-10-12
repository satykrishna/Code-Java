package com.src.ThreadGroupEx;

public class SystemGroupEx {

	public static void main(String[] args) {
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] tArray = new Thread[system.activeGroupCount()];
	    system.enumerate(tArray);
	    for(Thread t : tArray) {
	    	System.out.println(t.getName() + " ...... " + t.isDaemon() );
	    }
	}
}
