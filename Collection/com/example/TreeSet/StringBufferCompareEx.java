package com.example.TreeSet;

import java.util.TreeSet;

import com.example.ComparatorEx.StringBufferComparator;

public class StringBufferCompareEx {

	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new StringBufferComparator());
		t.add("A");
		t.add("B");
		t.add("C");
		t.add("D");
		System.out.println(t);
	}
}
