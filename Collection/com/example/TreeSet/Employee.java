package com.example.TreeSet;

public class Employee implements Comparable {

	private String name;
	private int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		
		return "[" + id + ", " + name + " ]";
	}

	@Override
	public int compareTo(Object anotherObject) {
		Employee anotherEmployee = (Employee) anotherObject;

		if (this.id < anotherEmployee.id) {
			return -1;
		} else if (this.id > anotherEmployee.id) {
			return 1;
		}

		else {
			return 0;
		}

	}

}
