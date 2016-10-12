package com.src.ThreadLocalInheritence;

public class ParentRunnable implements Runnable {
	
	private static InheritableThreadLocal<Object> local = new InheritableThreadLocal<Object>(){
		protected Object childValue(Object parentValue) {
			return "Child Value";
			
		};
	};
	private ChildRunnable cr = new ChildRunnable();

	public static InheritableThreadLocal<Object> getLocal() {
		return local;
	}

	public static void setLocal(InheritableThreadLocal<Object> local) {
		ParentRunnable.local = local;
	}

	@Override
	public void run() {
		local.set("Parent Value");
		System.out.println("Parent Thread Local Value : " + local.get());
		Thread childThread = new Thread(cr, "Child Thread");
		childThread.start();

	}

}
