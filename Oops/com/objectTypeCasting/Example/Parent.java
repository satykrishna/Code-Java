package com.objectTypeCasting.Example;
import java.io.IOException;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.Math.sqrt;

public class Parent {

	
	double flow = 0x201034d;
	
	public native static void methodOne();
	
	
	public Parent() throws IOException{
		
	}
	
	public static void main(String[] args) throws IOException {
		Date  d = new Date();
		out.print("Hi");
		double x =sqrt(new Parent().flow);
		System.out.println(x);
	}
}
