package com.example.Files;

import java.io.File;
import java.io.IOException;

public class FileEx {
	
	private static File file;

	public static void main(String[] args) throws IOException {
		
	  file = new File("/home/satya/Desktop/javaexamp");
	  
	  
	  if(file.isDirectory()) {
		  String[] listofFiles = file.list();
		  
		  for(String name : listofFiles) {
			  File subFile = new File(file, name);
			  if(subFile.isFile()) {
				  System.out.println("File : " + name);
			  }
			  
			  else if(subFile.isDirectory()) {
				  System.out.println("Directory : " + name);
			  }
		  }
		  
	  }
	}
	
}
