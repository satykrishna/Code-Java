package example.src.deadlock;

public class Test {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyRunnable1());
		Thread t2 = new Thread(new MyRunnable2());
		
		t1.start();
		t2.start();
		
		Thread.currentThread().setDaemon(true);
		
	}
	
}
