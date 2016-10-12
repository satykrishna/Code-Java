package com.Thread.WaityNotifyAll;

public class MyThreadB extends Thread{
	
	int limit;
	int total;
	
	public void run() {
		
		synchronized (this) {
			for(int i = 1; i < limit; i++ ) {
				total+=i;
			}
			
			this.notify();
		}
	}

}
