package com.example.HashSetEx;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class HashSetEx {
	
	
	private static HashSet set;
	
	public static void main(String[] args) {
		
		set = new LinkedHashSet();
		System.out.println(set.size());
	    
		set.add("A");
		set.add("B");
		set.add(0x11);
		set.add("D");
		System.out.println(set.add("A"));
		
		System.out.println(set);
		
	}

}
