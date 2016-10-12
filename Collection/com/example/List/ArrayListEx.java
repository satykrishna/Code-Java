package com.example.List;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Stack;
import java.util.Vector;

public class ArrayListEx {
	
	public static void main(String[] args) {
		List llc = new LinkedList();
		ArrayList  al = new ArrayList();
		LinkedList ll = new LinkedList();
		System.out.println(al instanceof RandomAccess);
		System.out.println(ll instanceof RandomAccess);
		System.out.println(ll instanceof Cloneable);
		System.out.println(ll instanceof Serializable);
		List l = (List) Collections.synchronizedList(al);
		
		Stack stack = new Stack();
		
		Vector v = new Vector(10, 1);
		System.out.println(v.capacity());
		
		for (int i = 0; i < 10; i++) {
			v.add(i);
		}
		v.add("a");
		
		System.out.println(v.capacity());
		
		System.out.println(v.size());
		
		stack.addAll(llc);
		System.out.println(stack.size());
	}

}
