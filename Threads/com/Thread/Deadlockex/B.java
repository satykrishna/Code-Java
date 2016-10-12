package com.Thread.Deadlockex;

public class B {

	
	private static B _instance;
	
	
	private B() {
		
	}
	
	
	public static B getInstance(){
		if(_instance == null) {
			return new B();
		}
		return _instance;
	}
	
	
	public void m2(A a) {
		System.out.println("Entering B m2 method");
		synchronized(a) {
			a.listen();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Got lock of " + a + " and hence invoking listen method");
		}
		
	}


	public void listen() {
		synchronized(this) {
			System.out.println("Acquired lock of " + this + "hence entered listen method synchronized block");
		}
	}
}
