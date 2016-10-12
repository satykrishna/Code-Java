package com.example.Iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateEx {
	

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		for(int i = 0; i < 10; i++){
			l.add(i);
		}
		
		System.out.println(l);
		
		Iterator iterator = l.iterator();
		
		while(iterator.hasNext()) {
			Integer i = (Integer)iterator.next();
			if(i%2 == 0) {
				System.out.println(i);
			}
			else {
				iterator.remove();
			}
		}
		
		System.out.println(l);
	}

}
 