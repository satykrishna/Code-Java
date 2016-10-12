package example.second.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
	
	
	public static void main(String[] args) throws InterruptedException {
		

		ExecutorService service = Executors.newFixedThreadPool(3);
		
		service.submit(MyJob.getInstance());
	}

}
