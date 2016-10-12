package com.examples.PatternSimpleApplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPhoneFromFile {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = 
				new BufferedReader(new FileReader("abc.serialized"));
		
		PrintWriter out = 
				new PrintWriter(new BufferedWriter(
						new FileWriter("extract", true)));
		
//		String regex = 
//				"(0|91)[7-9][0-9]{9}";
//		
		String regex = 
				"[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+(([.][a-zA-Z0-9])+)+";
		
		
		String line = null;
		
		while((line = reader.readLine())!= null) {
			
			Matcher m = Pattern.compile(regex).matcher(line);
			
			while(m.find()) {
               out.println(m.group());
			}
			out.flush();
			
		}
		
		
		reader.close();
		out.close();
	
	}

}
