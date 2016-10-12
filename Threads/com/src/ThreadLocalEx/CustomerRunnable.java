package com.src.ThreadLocalEx;

public class CustomerRunnable implements Runnable {

	private static Integer customerId = 0;
	private  ThreadLocal local = new ThreadLocal() {
		
		protected Integer initialValue(){
			return (++customerId);
		}

	};
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " executing" +
				" " +local.get());
		local.remove();
	}
}


