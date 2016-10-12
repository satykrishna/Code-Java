package com.example.ComparatorEx;

import java.util.Comparator;

public class StringBufferComparator implements Comparator {
	
	@Override
	
	public int compare(Object future, Object old) {
		
		String futureString = new String((StringBuffer)future);
		String oldString = new String((StringBuffer)old);
		return futureString.compareTo(oldString);
	}

}
