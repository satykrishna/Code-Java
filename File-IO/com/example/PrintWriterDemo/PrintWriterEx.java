package com.example.PrintWriterDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {

     private FileWriter writer;
     private PrintWriter out;
     private FileReader reader;
     private BufferedReader buffer;
     
     public PrintWriterEx() throws IOException{
    	 writer = new FileWriter("/home/satya/Desktop/PrintWriter.example");
    	 out = new PrintWriter(writer);
    	 reader = new FileReader("/home/satya/Desktop/PrintWriter.example");
    	 buffer = new BufferedReader(reader);
     }
     
     public void read() throws IOException {
    	 String line = buffer.readLine();
    	 while(line != null) {
    		 System.out.println(line);
    		 line = buffer.readLine();
    	 }
     }
     
     public void write(Object obj) throws IOException{
    	 if(out == null) {
    		 throw new IOException();
    	 }
    	 out.println(obj);
    	 out.flush();
    	
     }
     
     public void close(){
    	 out.close();
     }
     
     public static void main(String[] args) throws IOException {
		PrintWriterEx ex = new PrintWriterEx();
		ex.write(new Integer(150));
		ex.write(true);
		ex.write(Double.valueOf(200.1D));
		ex.write("Durga");
		ex.close();
		ex.read();
		ex.write("Satya");
	}
}
