package com.String.example;

public class Intern {

	
	public static void main(String[] args) {
		
		String s1 = new String("Durga");
		String s2 = s1.intern();
		String s3 = "Durga";
		System.out.println(" is s1 == s2? " + (s1 == s2));
		System.out.println(" is s3 == s2? " + (s3 == s2));
		String s4 = s1.concat("Software");
		String s5 = s4.intern();
		System.out.println("s5 ? " + (s5));
		String s6 = "DurgaSoftware";
		System.out.println("s6 == s5 ? " + (s6 == s5));
		
//		String s1 = new String("durga");
//		String s2 = s1.toLowerCase();
//		System.out.println(s1 == s2);
//		String s3 = s1.toUpperCase();
//		System.out.println(s1 == s3);
	}
}
