package com.examples.PatternSimpleApplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNo {

	
	static boolean valid(String phoneNo) {
		
		String regex = 
				"(0|[+]91)[7-9][0-9]{9}";
		Matcher m = 
				Pattern.compile(regex).matcher(phoneNo);
		
		return m.find() && m.group().equals(phoneNo);
	}
	
	public static void main(String[] args) {
		System.out.println(valid("+919440203446"));
	}
	
	
}
