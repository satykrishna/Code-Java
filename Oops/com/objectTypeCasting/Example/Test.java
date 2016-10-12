package com.objectTypeCasting.Example;

import java.io.EOFException;

public class Test {

	public static void main(String[] args) throws EOFException, Exception {
		
		Child c = new Child();
		c.methodOne();
		c.methodTwo();
		((Parent)c).methodOne();

	}
	
}
