package com.StringBuffer.example;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println("Default capacity is " + sb.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println("After adding 16 characters : " + sb.capacity());
		sb.append("q");
		System.out.println("Adding 17th Character : " + sb.capacity());
		sb.append("abcdefghijklmnopqr");
		System.out.println("Adding 34th Character : " + sb.capacity());
		sb.append("q");
		System.out.println("Adding 35th Character : " + sb.capacity());
      
		sb  = new StringBuffer("DURGA");
		System.out.println("Default capacity is " + sb.capacity());
		System.out.println(sb.charAt(3));
		sb.append(true);
		System.out.println(sb);
		
		sb = new StringBuffer();
		sb.append("The value of pi : ");
		sb.append(3.14);
		sb.append("it is exactly " + true);
		System.out.println(sb);
		sb.insert(2, "abcdefghijk");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);

		StringBuilder builder = new StringBuilder("Satya");
		System.out.println(builder);
		StringBuilder builder2 = builder.reverse();
		System.out.println(builder2);

	}

}
