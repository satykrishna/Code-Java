package com.example.externalization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ExternalizationImpl impl = new ExternalizationImpl("durga", 10, 0132);
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("extern.ser")));
		
		oos.writeObject(impl);
		oos.flush();
		oos.close();
		
		ObjectInputStream ois = 
				new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream("extern.ser")));
		
		ExternalizationImpl read = (ExternalizationImpl)ois.readObject();
		
		System.out.println(read.i + " ..... "  + "..... " + read.s);
		
		ois.close();

		
	}
}
