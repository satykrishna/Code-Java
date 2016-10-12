package com.example.TreeMapEx;

import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapEx {

	public static void main(String[] args) {
		
		
		TreeMap m = new TreeMap(new CustomComparator());
		
		m.put("100", "ZZZ");
		m.put("101", "YYY");
		m.put("102", "XXX");
		
		System.out.println(m);
		
		m.put("", 106);
		
		System.out.println(m);

	}
}
