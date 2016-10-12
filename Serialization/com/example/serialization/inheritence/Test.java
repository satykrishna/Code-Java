package com.example.serialization.inheritence;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

public class Test {
   
	private static Logger log = Logger.getLogger(Test.class.getSimpleName());
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Dog d = new Dog();
		d.i = 200;
		d.j = 300;
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(new BufferedOutputStream(
						new FileOutputStream("inheritencedemo")));
		oos.writeObject(d);
		oos.flush();
		
		log.info("Deserialization Started" );
		
		ObjectInputStream ois = 
				new ObjectInputStream(new BufferedInputStream(
						new FileInputStream("inheritencedemo")));
		Dog d2 = (Dog)ois.readObject();
		
		log.info(d.i + "... " + d.j );
		log.info(d2.i + "... " + d2.j );
		
		ois.close();
		oos.close();
		
	}
}
