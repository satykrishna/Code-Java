package com.example.BufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	
	private static FileWriter fileWriter;

	public static void main(String[] args) throws IOException {
		File dir = new File("/home/satya/Desktop/javaFileWriter");
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		File file = new File(dir, "FileWriterDemo2.sed");
		
//		if(!file.exists()) {
//			file.createNewFile();
//		}
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		writer.write(100);
		writer.write("urga");
		writer.newLine();
		writer.write("SoftwareSolutions");
		writer.newLine();
		writer.write(new char[]{'a', 'b', 'c'});
		writer.newLine();
		writer.flush();
		writer.close();
		System.out.println("Success!!!");
		
		FileReader reader = new FileReader(file);
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String line = bufferedReader.readLine();
		
		while(line != null ) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
		
		reader.close();
		bufferedReader.read();

	}
}
