package example.src.deadlock;

public class A {
	
	private static A instance;
	
	private A() {
		
	}
	
	public static A getInstance() {
		if(instance == null) {
			instance = new A();
		}
		return instance;
		
	}
	
	public synchronized void method1(B b){
		
		System.out.println("Thread " + Thread.currentThread().getName() + " has acquired the A lock");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		b.method2();
	}
	
	public synchronized void method3() {
		System.out.println(Thread.currentThread().getName() + " is executing a method3");
	}

}
