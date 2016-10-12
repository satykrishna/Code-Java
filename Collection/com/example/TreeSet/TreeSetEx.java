package com.example.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

import com.example.ComparableInterf.Student;
import com.example.ComparatorEx.MyComparator;

public class TreeSetEx {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		@SuppressWarnings("unchecked")
		TreeSet t = new TreeSet(new MyComparator());

		// t.add(true);
		// t.add(false);
		// t.add("1");
		// t.add("2");
		// t.add(1);
		// t.add(2);
		//
		// t.add(1);
		// t.add(2);
		// t.add(3);
		// t.add(4);
		// t.add(5);
		// t.add(6);
		// t.add(null);
		// System.out.println(t.add("satya"));

		// t.add(new StringBuffer("Kondapalli"));
		// t.add(new StringBuffer("Satyakrishna"));
		// t.add(new StringBuffer("SaiKiran"));
		//
		//
		// System.out.println("A".compareTo("C"));
		// System.out.println("D".compareTo("A"));
		// System.out.println("A".compareTo("A"));

		// t.add(new Student(1, "Satya"));
		// t.add(new Student(2, "Kondapalli"));
		// t.add(new Student(1, "chai"));
		 
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		t.add(20);

		System.out.println(t);
		

	}

}
