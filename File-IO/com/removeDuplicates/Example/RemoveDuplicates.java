package com.removeDuplicates.Example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveDuplicates {

	private File f;
	private FileReader reader;
	private BufferedReader breader;
	private PrintWriter out;
	private BufferedReader reader2;

	public RemoveDuplicates() throws FileNotFoundException {
		f = new File("/home/satya/Desktop/remove");
		reader = new FileReader(f);
		breader = new BufferedReader(reader);
		out = new PrintWriter("/home/satya/Desktop/out.txt");
	}

	public void remove() throws IOException {

		String line1 = breader.readLine();

		while (line1 != null && !line1.isEmpty()) {
			reader2 = new BufferedReader(new FileReader(
					"/home/satya/Desktop/out.txt"));
			String line2 = reader2.readLine();

			while (line2 != null && line1.equals(line2)) {
				line2 = reader2.readLine();
			}

			if (line2 == null) {
				out.println(line1);
				out.flush();
			}
			line1 = breader.readLine();
		}
	out.close();

	}

}
