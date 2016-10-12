package com.example.CustomizedSerialization;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Account a = new Account("kaka", "Infy!123", 134);
		System.out.println(a);
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new BufferedOutputStream((new FileOutputStream("customserialization")))) );
		
		oos.writeObject(a);
		oos.flush();
		oos.close();
		
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("customserialization"));
		
		Account readAccount = (Account)ois.readObject();
		
		System.out.println(readAccount);
		
		ois.close();
	}

}
