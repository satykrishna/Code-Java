package com.example.TreeMapEx;

import java.util.Comparator;

public class CustomComparator implements Comparator{

	@Override
	public int compare(Object a, Object b) {
		String s1  = a.toString();
		String s2  = b.toString();
		
		return -s1.compareTo(s2);
	}

	 
}
