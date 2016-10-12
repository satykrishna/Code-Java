package com.example.FileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

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
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write(100);
		writer.write("urga\nSoftwareSolutions");
		writer.write("\n");
		writer.write(new char[]{'a', 'b', 'c'});
		writer.write('\n');
		writer.flush();
		writer.close();

	}

}
