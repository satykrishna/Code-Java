package com.example.HashtableEx;

public class Test {
	
	private int i ;
	
	public Test(int i ) {
		this.i = i;
	}
	
	@Override
	public int hashCode() {
		return i;
	}
	
	
	public String toString() {
		return "Satya"+i;
	}
 
}
