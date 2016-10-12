package com.example.ComparatorEx;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object objectTobeInserted, Object alreadyExists) {
		Integer newInt = (Integer) objectTobeInserted;
		Integer oldInt = (Integer) alreadyExists;

		return +1;

	}

	
	
}
