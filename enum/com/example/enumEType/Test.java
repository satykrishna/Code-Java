package com.example.enumEType;

public class Test {

	
	private enum User {
		
		Satya,
		Krishna,
		Kondapalli
	}
	
	
	public static void main(String[] args) {
		
	   User u = User.Satya;
	   
	   User kr = User.Kondapalli;
	   
	   		
	   Month m = Month.MAR;
	   
	   System.out.println(m);
		
	   Juice[] juices = Juice.values();
	   
	   for(Juice j : juices) {
		   System.out.println(j + "... " + j.getPrice());
	   }
	   
	   
	   System.out.println(Juice.apple.equals(Juice.orange));
	   System.out.println(Juice.apple.ordinal() < Juice.orange.ordinal());
	   
	}
}
