package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	private static FileOutputStream outStream;
	private static ObjectOutputStream objectStream;
	private static FileInputStream inStream;
	private static ObjectInputStream ioStream;
	static {
		try {
			outStream = new FileOutputStream("abcd.serialized");
			objectStream = new ObjectOutputStream(outStream);
			inStream = new FileInputStream("abcd.serialized");
			ioStream = new ObjectInputStream(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public SerializableDemo() throws IOException {
	}

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Dog d = new Dog();
		objectStream.writeObject(d);

		Object o = null;
//
//		while ((o = ioStream.readObject()) != null) {
//		
//			if (o instanceof Dog) {
//				d = (Dog) o;
//				System.out.println("dog : " + d.i + " " + d.j);
//			} else if (o instanceof Cat) {
//				c = (Cat) o;
//				System.out.println("cat : " + c.k + " " + c.j);
//			} else {
//				r = (Rat) o;
//				System.out.println("rat : " + r.j + " " + r.r);
//			}
//
//		}
		
		o = ioStream.readObject();
		
		Dog read = (Dog)o;
		
		System.out.println(read.c.r.r);

	}
}
