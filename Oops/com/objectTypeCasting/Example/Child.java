package com.objectTypeCasting.Example;

import java.io.EOFException;

public class Child extends Parent{
	
	public Child() throws EOFException, Exception{
		
	}
	
	public static void methodOne(){
		System.out.println("Child Method One");
	}
	
	public void methodTwo(){
		System.out.println("child method two");
	}

}
