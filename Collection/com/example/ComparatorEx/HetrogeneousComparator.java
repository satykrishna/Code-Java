package com.example.ComparatorEx;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class HetrogeneousComparator implements Comparator {

	@Override
	public int compare(Object future, Object present) {
		int length1 = future.toString().length();
		int length2 = present.toString().length();

		if (length1 > length2) {
			return +1;
		} else if (length1 < length2) {
			return -1;
		} else {
			return future.toString().compareTo(present.toString());
		}
	}

}
