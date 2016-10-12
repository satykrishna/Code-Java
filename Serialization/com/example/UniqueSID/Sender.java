package com.example.UniqueSID;

import java.io.*;

public class Sender {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
        
		ObjectOutputStream oos = 
		new ObjectOutputStream(new BufferedOutputStream(
				new FileOutputStream("sid.demo")));
		
		oos.writeObject(new Dog());
		
		oos.flush();
		
		oos.close();
		
		System.out.println("Done Serialization");
	}
}
