package com.example.finalizeMethod;

public class FinalizeDemo {
	
	static FinalizeDemo s;
	
	public static void main(String[] args) throws InterruptedException {
		
		FinalizeDemo f = new FinalizeDemo();
		
		System.out.println("hashcode : f " + f.hashCode());
		
		f = null;
		
		System.gc();
		
		Thread.sleep(5000);
		
		System.out.println(s.hashCode());
		
		s = null;
		
		System.gc();
		
		Thread.sleep(10000);
		
		System.out.println("<D>-<O>-<N>-<E>");
	}
	
	@Override
	protected void finalize() {
	 
		System.out.println("Finalize method " );
		
		System.out.println("--<< ASSIGN TO STATIC VARIABLE >>--");
		
		s = this;
	}

}
