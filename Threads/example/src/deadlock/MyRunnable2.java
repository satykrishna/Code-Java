package example.src.deadlock;

public class MyRunnable2 implements Runnable {
	
	private A a  = A.getInstance();
	private B b = B.getInstance();

	@Override
	public void run() {
         b.method4(a);
	}

}
