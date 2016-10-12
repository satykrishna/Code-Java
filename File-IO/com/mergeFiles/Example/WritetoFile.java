package com.mergeFiles.Example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.locks.ReentrantLock;

public class WritetoFile {


	private PrintWriter writer;
	private static ReentrantLock lock = new ReentrantLock();

	
	private static WritetoFile instance;

	private WritetoFile() {
		try {
			FileWriter writer = new FileWriter(
					"/home/satya/Desktop/kaka.javased", true);
			this.writer = new PrintWriter(writer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static WritetoFile getInstance(){
		if(instance == null) {
			instance = new WritetoFile();
		}
		return instance;
	} 

	
	
	public void write(String line){
		if(line == null){
			 Thread.yield();
		}
		System.out.println("Thread - lock " + Thread.currentThread());
		lock.lock();
		writer.println(line);
		writer.flush();
		lock.unlock();
		System.out.println("Thread - unlock" + Thread.currentThread());
	}
	
	public void close(){
		writer.close();
	}
	
}
