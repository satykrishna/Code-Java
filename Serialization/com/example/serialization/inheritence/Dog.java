package com.example.serialization.inheritence;

import java.io.Serializable;

public class Dog extends Animal implements Serializable{

	
	
	public Dog(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	
	public Dog() {
		System.out.println("Dog constructor called");
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int j =20;
}
