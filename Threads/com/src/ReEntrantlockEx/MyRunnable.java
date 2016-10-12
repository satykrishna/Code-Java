package com.src.ReEntrantlockEx;

public class MyRunnable implements Runnable {

	private Display d;
	private String name;

	public MyRunnable(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);

	}

}
