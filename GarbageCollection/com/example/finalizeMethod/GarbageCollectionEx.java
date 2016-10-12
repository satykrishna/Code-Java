package com.example.finalizeMethod;

public class GarbageCollectionEx {

	public static void main(String[] args) {
		
		String str  = new String("Satya");
		
		str = null;
	
		GarbageCollectionEx ex = new GarbageCollectionEx();
	    
		ex = null;
		
		
		ex = new GarbageCollectionEx();
		ex.finalize();
		ex.finalize();
		ex.finalize();

	    GarbageCollectionEx ex2 = new GarbageCollectionEx();
	    ex = ex2;
		
		Runtime.getRuntime().gc();
		
		System.out.println("Main Method : completed");
	}
	
	public void finalize() {
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("Finalize - method called");
	}
}
