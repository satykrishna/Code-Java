package com.immutability.example;

final public class Test {

	
	private int i;
	private String  name;
	
	
	public Test(int i) {
		this.i = i;
		this.name = name;
	}
	
	public Test modify(int newVal) {
		if(newVal == this.i && this.name.equals(name)) {
			return this;
		}else {
			return new Test(newVal);
		}
	}
	
	public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t2 = t1.modify(10);
		System.out.println(t1 == t2);
		Test t3 = t1.modify(100);
		System.out.println(t1 == t3);
	}
	
	
}
