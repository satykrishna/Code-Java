package com.example.WeakHashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakhashMapEx {

	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap m = new WeakHashMap();
		
		Test t = new Test();
		
		m.put(t, "Satya");
		t = null;
		
		
		System.gc();
		
		Thread.sleep(1000);
		
		System.out.println(m);
		
	}
	
}
