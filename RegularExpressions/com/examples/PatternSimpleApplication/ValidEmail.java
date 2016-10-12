package com.examples.PatternSimpleApplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {

static boolean valid(String email) {
		
		String regex = 
				"[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]" +
				"([.][a-zA-Z0-9_.]*";
		Matcher m = 
				Pattern.compile(regex).matcher(email);
		
		return m.find() && m.group().equals(email);
	}
	
	public static void main(String[] args) {
		System.out.println(valid("+919440203446"));
	}
}
