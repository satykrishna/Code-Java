package com.example.enumEType;

public  enum Month {
	
	
	JAN, FEB, MAR, APR;
	
	
	public static void main(String[] args) {
		
		Month m = Month.JAN;
		
		System.out.println(m.ordinal());
		
		System.out.println("Main");
	}
	
	
	 Month() {
		System.out.println("Constructor " + this.ordinal()) ;
	}
	
}
