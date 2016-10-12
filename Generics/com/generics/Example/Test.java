package com.generics.Example;

public class Test {
	
	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>(new String("Satya"));
		g1.show();
		
		Gen<Integer> g2 = new Gen<Integer>(new Integer(2));
		g2.show();
		
		Gen<Double> g3 = new Gen<Double>(10.5);
		g3.show();
	}

}
