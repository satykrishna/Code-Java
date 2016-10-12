package com.example.ComparableInterf;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Student student) {
		if(rollNo < student.rollNo) {
			return -1;
		}
		else if(rollNo > student.rollNo) {
			return 1;
		}
		
		return 0;
	}

}
