package com.example.HashMapEx;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap m = new LinkedHashMap();
		m.put("101", "chiru");
		m.put("102", "Venkatesh");
		m.put("103", "Nag");
		m.put("104", "balayya");
		System.out.println(m.put("104", "KAKA"));
		System.out.println(m);
		Iterator iterator = m.keySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		iterator = m.values().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		iterator  = m.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry entry = (Map.Entry)iterator.next();
			System.out.println(entry.getKey() + "...." + entry.getValue() + ".... " + entry.setValue("k:"));
		}
		
		System.out.println(m);
		
		Map synchronizedMapVersion = Collections.synchronizedMap(m);
		
		
	}
}
