package com.src.ExecutorFrameworkEx;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class ExecutorDemo {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
	  MyRunnable[] jobs1 = new MyRunnable[]{
			   new MyRunnable("Job-1"),
			   new MyRunnable("Job-2"),
			   new MyRunnable("Job-3"),
			   new MyRunnable("Job-4"),
			   new MyRunnable("Job-5"),
			   new MyRunnable("Job-6")
	   };
	   
	   ExecutorService service1 = Executors.newFixedThreadPool(5);
	   
	   for(MyRunnable job: jobs1) {
		   service1.submit(job);
	   }
	   
	   service1.shutdown();
	   
	   int[] a = new int[] { 10, 20, 30};
		
		MyCallable[] jobs2 = new MyCallable[]{
				new MyCallable(10),
				new MyCallable(20),
				new MyCallable(30),
				new MyCallable(40),
				new MyCallable(50)
		};
		
		ExecutorService service2 = Executors.newFixedThreadPool(3);
		service2 = Executors.newFixedThreadPool(4);
		Future<Object> future;
		
		for(MyCallable job : jobs2) {
			future = service2.submit(job);
			System.out.println(future.get() + " returned by " + job);
		}
		
		service2.shutdown();
	}
}
