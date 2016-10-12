package com.examples.PatternSimpleApplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisplayAllTxtFileNames {

	public static void main(String[] args) throws IOException {
		File directory = 
				new File("/home/satya/Desktop");
		
		String[]fileList = directory.list();
		
		
		PrintWriter out = 
				new PrintWriter(new BufferedWriter(
						new FileWriter("extract", true)));
		
		for(String file  : fileList) {
			
			Matcher m = Pattern.compile("[a-zA-Z0-9$._]+[.]txt").matcher(file);
			if(m.find() && m.group().equals(file)) {
				out.println(m.group());
			}
			
		}
		
		out.flush();
		out.close();
	}
	
}
