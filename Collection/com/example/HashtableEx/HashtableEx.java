package com.example.HashtableEx;

import java.util.Hashtable;

public class HashtableEx {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Hashtable h = new Hashtable(60, 0.1f);
		h.put(new Test(5), "A");
		h.put(new Test(6), "B");
		h.put(new Test(7), "C");
		h.put(new Test(12), "D");
		h.put(new Test(23), "E");
		h.put(new Test(45), "F");
		System.out.println(h);



	}

}
