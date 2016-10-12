package com.mergeFiles.Example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Job implements Runnable {
	
	private FileReader reader;
	private BufferedReader buffer;
	private WritetoFile merge = WritetoFile.getInstance();

	public Job(String fileName) {
		try {
			reader = new FileReader(fileName);
			buffer = new BufferedReader(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			String line = buffer.readLine();
			while(line != null) {
				merge.write(line);
				line = buffer.readLine();
				
			}
			
			merge.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
