package com.example.PropertiesEx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("/home/satya/Desktop/javaexamp/workspace/Learn-Java/abc.properties");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		
		Properties p = new Properties();
		p.load(bis);
		System.out.println(p);
		System.out.println(p.get("user"));
		System.out.println(p.setProperty("user", "kondapalli"));
		p.setProperty("hometown", "nellore");
		
		FileOutputStream fos = new FileOutputStream("/home/satya/Desktop/javaexamp/workspace/Learn-Java/abc.properties");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		p.store(bos, "Edited by Satya");

	}
	
}
