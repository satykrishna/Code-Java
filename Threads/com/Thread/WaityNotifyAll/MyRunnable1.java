package com.Thread.WaityNotifyAll;

public class MyRunnable1 implements Runnable {

	private Sum sum = Sum.getInstance();
	private int limit;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public void run() {
		
		synchronized (sum) {
		     sum.calculate(limit);
		     sum.notify();
		}
	}

}
