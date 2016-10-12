package com.example.ComparatorEx;

import java.util.Comparator;

public class StringReverseComparator implements Comparator {

	@Override
	public int compare(Object future, Object exist) {
		String futureString = (String)future;
		String existingString = (String)exist;
		return -futureString.compareTo(existingString);
	}


}
