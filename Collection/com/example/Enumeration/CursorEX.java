package com.example.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class CursorEX {
	
	private static Vector v = 
			new Vector();
	
    public  static void traverse() {
    	
    	Enumeration e = v.elements();
    	
    	while(e.hasMoreElements()) {
    		System.out.println(e.nextElement());
    	}
    }
    
    public static void main(String[] args) {
		v.add(10);
		v.add(11);
		v.add(12);
		
		traverse();
	}

}
