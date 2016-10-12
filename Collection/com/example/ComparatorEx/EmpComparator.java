package com.example.ComparatorEx;

import java.util.Comparator;

import com.example.TreeSet.Employee;

public class EmpComparator implements Comparator {
	
	@Override
	public int compare(Object future, Object exists) {
		
		Employee futureEmp = (Employee)future;
		Employee existsEmp = (Employee) exists;
		
		String emp1Name = futureEmp.getName();
		String emp2Name = existsEmp.getName();
		
		return emp1Name.compareTo(emp2Name);
	}

}
