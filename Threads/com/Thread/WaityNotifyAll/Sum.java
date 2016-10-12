package com.Thread.WaityNotifyAll;

public class Sum {

	
	private static Sum _instance;
	private static int count = 0;
	private int total;
	
	private Sum(){
		++count;
		System.out.println("Count = " + count );
	}
	
	public static Sum getInstance() {
		if(_instance == null) {
			_instance = new Sum();
		}
		return _instance;
		
	}
	
	public  void calculate(int limit) {
		
		for(int i = 1; i <= limit; i++ ) {
			total += i;
		}
	}
	
	public  int getTotal() {
		return total;
	}
}
