package example.scjp.simpleVersionAssert;

public class Test {

	
	public static void main(String[] args) {
		
		
		int x = 10;
		
		x = 20;
		
		x = 30;
		
		x = 40;
		
		x = 10;
		
		x = 50;
		
		x = 60;
		
		
	    assert(x < 10) : m1(x);
	    
	    System.out.println(x);
	}
	
	public static int m1(int x) {
		
		x++;
		
		return 7701;
	}
	
}
