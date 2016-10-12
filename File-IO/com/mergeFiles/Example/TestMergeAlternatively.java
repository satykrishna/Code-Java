package com.mergeFiles.Example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.removeDuplicates.Example.RemoveDuplicates;

public class TestMergeAlternatively {

	
	public static void main(String[] args) throws IOException {
		
	   Job job1 = new Job("/home/satya/Desktop/merge/file1.txt");
	   Job job2 = new Job("/home/satya/Desktop/merge/file2.txt");
	   
	   Job[] myJobs = new Job[]{job1, job2};
	   
	   ExecutorService service = Executors.newFixedThreadPool(2);
	   
	   for(Job job : myJobs){
		   service.submit(job);
	   }
	   
	   service.shutdown();
	   
		RemoveDuplicates d = new RemoveDuplicates();
		d.remove();

	}
}
