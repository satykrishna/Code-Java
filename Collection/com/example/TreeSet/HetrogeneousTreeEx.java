package com.example.TreeSet;

import java.util.TreeSet;

import com.example.ComparatorEx.HetrogeneousComparator;

public class HetrogeneousTreeEx {
	
	public static void main(String[] args) {
		
	  HetrogeneousComparator comparator = 
			  new HetrogeneousComparator();
	  
	  TreeSet t = new TreeSet(comparator);
	  t.add(new String("A"));
	  t.add(new StringBuffer("AA"));
	  t.add(new String("AAA"));
	  t.add(new StringBuffer("AAAAA"));
	  t.add(new StringBuffer("B"));
	  System.out.println(t);
	}

}
