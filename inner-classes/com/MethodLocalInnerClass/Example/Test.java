package com.MethodLocalInnerClass.Example;

public class Test {
	
	
	public void m1(){
		
		class Inner {
			
			public void sum(int x, int y) {
				System.out.println( " The sum is " +  (x+y));
			}
		}
		
		Inner i = new Inner();
		i.sum(10, 20);
		i.sum(100, 200);
		i.sum(1000, 2000);
	}
	
	static int z = 100;
	static int zz = 1000;
	
	public static void m2(){
		
		 final int ab = 10;
		
		class Inner {
			
			public void m3(){
				System.out.println(z);
				System.out.println(zz);
				System.out.println(ab);

			}
			
			 
		}
		
		Inner i = new Inner();
		i.m3();
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.m1();
		m2();
			
	}

}

