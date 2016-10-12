package com.example.UniqueSID;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Receiver {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = 
				new ObjectInputStream(new BufferedInputStream(
						new FileInputStream("sid.demo")));
		
		Dog d = (Dog)ois.readObject();
		
		System.out.println(d.sis + "  " +  d.j+ "  " + d.k + " " + d.y);
	
		ois.close();

	}
}
 