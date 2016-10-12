package example.src.deadlock;

public class MyRunnable1 implements Runnable {

	private A a  = A.getInstance();
	private B b = B.getInstance();
	
	@Override
	public void run() {
		
		a.method1(b);

	}

}
