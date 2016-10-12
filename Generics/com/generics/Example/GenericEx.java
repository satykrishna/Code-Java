package com.generics.Example;

import java.util.ArrayList;

public class GenericEx {

	
	public static void main(String[] args) {
		
		ArrayList<String> list = 
				new ArrayList<String>();
		
	//	list.add(new Integer(20));
		
 	 Account<Gold> goldAccount = new Account<Gold>();
	} 
}


class Account<T> {
	
	
}


class Gold {
	
}