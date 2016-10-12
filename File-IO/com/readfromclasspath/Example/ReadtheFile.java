package com.readfromclasspath.Example;

import java.io.File;

public class ReadtheFile {
	
	
	public ReadtheFile(){
		File file = new File(getClass().getClassLoader().getResource("resource.properties").getFile());
        System.out.println(file.exists());
	}
	
	public static void main(String[] args) {
		new ReadtheFile();
	}

}
