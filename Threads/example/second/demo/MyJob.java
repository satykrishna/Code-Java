package example.second.demo;

public class MyJob  implements Runnable{

	
	private MyJob(){
		
	}
	
	private static MyJob instance;
	
	public static MyJob getInstance(){
		
		if(instance == null) {
			instance = new MyJob();
		}
	
		return instance;
	}
	
	@Override
	public void run() {
		
		synchronized(this) {
			
			   for(int i = 0; i < 10; i++) {
				   System.out.println("Value of i is " + Thread.currentThread().getName() + " ... " + i);
				  Thread.yield();
			   }
			
		}
	
	
		
	}

}
