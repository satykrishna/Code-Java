package com.src.ExecutorFrameworkEx;

import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public class MyCallable implements Callable {

	private int number;
	
	public MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Object call() {
		System.out.println(Thread.currentThread().getName() + " is " +
				"responsible to find sum of first " + number + " numbers");
	
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum += i;
		}
		
		return sum;
	}

}
