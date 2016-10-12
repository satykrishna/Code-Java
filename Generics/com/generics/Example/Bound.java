package com.generics.Example;

import java.util.concurrent.Callable;

public class Bound<T extends Number> {

	
	public void calc(){
		
		T a, b;
 		
	}
	
	
	public static void main(String[] args) {
		
		Bound<Integer> bound = new Bound<Integer>();
	}
	
}



class Comb<T extends Number&Runnable> {
	



}

class Comb1<T extends Runnable & Comparable> {
	
}


class Comb2<T extends Number &  Runnable & Comparable> {
	
}
//
//class Comb3<T extends Runnable & Number> {
//	
//}
//
//class Comb4<T extends Thread & Number> {
//	
//}