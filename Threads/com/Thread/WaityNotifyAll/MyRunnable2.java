package com.Thread.WaityNotifyAll;

public class MyRunnable2 implements Runnable {

	private Sum sum = Sum.getInstance();
	
	@Override
	public void run() {
		
		synchronized (sum) {
			if(sum.getTotal() == 0) {
				try {
					sum.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("Total : " + sum.getTotal());
			}
		}
	}

}
