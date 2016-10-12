package com.example.serialization;

import java.io.Serializable;


public class Dog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	transient int i = 10;
	transient final int j = 20;
	
	Cat c = new Cat(); 
	
	
	
}

