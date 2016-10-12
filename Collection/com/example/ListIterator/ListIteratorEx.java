package com.example.ListIterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorEx {

	public static void main(String[] args) {
		
	   ArrayList l = new ArrayList();
	   
	   for(int i = 0; i < 10; ++i) {
		   l.add(i);
	   }
	   
	   ListIterator iterator = l.listIterator();
	   System.out.println(iterator.getClass().getName());
	   
	   while(iterator.hasNext()) {
		   System.out.print(iterator.next() + " ");
	   }
	   
	   Vector v = new Vector();
	   
	   for(int i = 10; i < 99; i++) {
		   v.add(i);
	   }
	   
	   Enumeration e = v.elements();
	   System.out.println(e.getClass().getName());
	   
	   System.out.println("");
	   
	   iterator = v.listIterator();
	   System.out.println(iterator.getClass().getName());
	   
	   
	  Iterator i = v.iterator();
	  System.out.println(i.getClass().getName());
	  
	   while(iterator.hasNext()) {
		   System.out.print(iterator.next() + " ");
	   }
	   
	}
}
