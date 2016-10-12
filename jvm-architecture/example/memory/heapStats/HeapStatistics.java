package example.memory.heapStats;

public class HeapStatistics {
	
	 
	public static void main(String[] args) throws ClassNotFoundException {

		Runtime r = Runtime.getRuntime();

		double mb = 1024*1024;
		
		try {
			Object instantiate = Class.forName(args[0]).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Class c = Class.forName(args[0]);
		
		System.out.println(c.isInstance(c));
		
		
		System.out.println("MAX MEMORY " + r.maxMemory()/mb);

		System.out.println("TOTAL MEMORY " + r.totalMemory()/mb);

		System.out.println("FREE MEMORY " + r.freeMemory()/mb);

		System.out.println("USED MEMORY " + (r.totalMemory()/mb - r.freeMemory()/mb));

		r.gc();

		System.out.println("_______________GC_______________");
		
		System.out.println("MAX MEMORY " + r.maxMemory()/mb);

		System.out.println("TOTAL MEMORY " + r.totalMemory()/mb);

		System.out.println("FREE MEMORY " + r.freeMemory()/mb);

		System.out.println("USED MEMORY " + (r.totalMemory()/mb - r.freeMemory()/mb));



	}

}
