package com.example.development;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	
	public Test() throws IOException{
		
		File file = new File(getClass().getClassLoader().getResource("text.properties").getFile());
		System.out.println(file.getAbsolutePath());
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		

	}

	public static void main(String[] args) throws IOException {

		String course = System.getProperty("course");
		
		System.out.println("course = " + course);
		

		/*if (course.equalsIgnoreCase("scjp")) {
			System.out.println("Scjp course information");
		} else {
			System.out.println("Other course information");
		}
		
		Properties p = System.getProperties();
		p.list(System.out);
		*/
		
		Test t = new Test();

	}

}
