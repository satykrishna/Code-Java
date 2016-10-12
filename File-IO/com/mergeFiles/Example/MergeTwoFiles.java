package com.mergeFiles.Example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeTwoFiles {

	
	private File directory;
	private File[] files;
	private File output;
	private FileReader reader;
	private PrintWriter out;
	private BufferedReader buffer;
	private FileWriter writer;
	
	public MergeTwoFiles(String path ) throws FileNotFoundException{
		directory = new File(path);
		if(!directory.exists()) {
			throw new FileNotFoundException(path);
		}
		files = directory.listFiles();
		
	}
	
	public void merge() throws IOException{
		output = new File(directory, "finaloutput.txt");
		writer = new FileWriter(output, true);
		out = new PrintWriter(writer);
		
		for(File f : files) {
		   reader = new FileReader(f);
		   buffer = new BufferedReader(reader);
		   String line = buffer.readLine();
		   while(line != null) {
			   out.println(line);
			   line = buffer.readLine();
			   out.flush();
		   }
		}
		  System.out.println("Success!!!");
		  out.close();
		  buffer.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		MergeTwoFiles mergeFiles = new MergeTwoFiles("/home/satya/Desktop/merge");
		mergeFiles.merge();
	}
}
