package com.example.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	private static File file;
	private static FileReader fileReader;
	
	public static void main(String[] args) throws IOException {
		
		file = new File("/home/satya/Desktop/file1");
		fileReader = new FileReader(file);
//		int i = fileReader.read();
//		
//		while(i != -1) {
//		    System.out.print((char)i);
//		    i = fileReader.read();
//		}
		
		char[] ch = new char[(int)file.length()];
		
		int read = fileReader.read(ch);
		
		for(char c: ch) {
			System.out.print(c);
		}
		
		 
		
		
	}
	
	
}
