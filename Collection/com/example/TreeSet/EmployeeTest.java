package com.example.TreeSet;

import java.util.TreeSet;

import com.example.ComparatorEx.EmpComparator;

public class EmployeeTest {
	
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new EmpComparator());
		t.add(new Employee("nag", 100));
		t.add(new Employee("bal", 200));
		t.add(new Employee("chir", 50));
		t.add(new Employee("venki", 150));
		t.add(new Employee("nagaraj", 100));
		
		System.out.println(t);
	}
	
	

}
