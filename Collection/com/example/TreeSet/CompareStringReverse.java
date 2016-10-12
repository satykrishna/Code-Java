package com.example.TreeSet;

import java.util.TreeSet;

import com.example.ComparatorEx.StringReverseComparator;

public class CompareStringReverse {

	public static void main(String[] args) {
		
		StringReverseComparator comparator = 
				new StringReverseComparator();
		TreeSet<String> names = 
				new TreeSet<String>(comparator);
		
		names.add("Aaka");
		names.add("A!inal");
		names.add("Cenj");
		names.add("Defg");
		
		System.out.println(names);
	}
	
}
