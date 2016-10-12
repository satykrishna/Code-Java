package example.src.deadlock;

public class B {
	
	private static B instance;
	
	private B() {
		
	}
	
	public static B getInstance(){
		if(instance == null) {
			instance = new B();
		}
		return instance;
	}
	
	public synchronized void method4(A a ) {
		System.out.println("Thread " + Thread.currentThread().getName() + " has acquired the B lock");

		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		a.method3();
	}
	
	public synchronized void method2() {
		System.out.println(Thread.currentThread().getName() + " is executing the b method2");
		
	}

}
