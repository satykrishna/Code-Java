package com.AnonymousInnerClasses.Example;

public class Test {

	static Thread t = new Thread() {
		public void run() {
			for (int i = 0; i < 10; ++i) {
				System.out.println("Child thread");
			}
		};
	};
	
	static Runnable r = new Runnable() {
		public void run() {
			for (int i = 0; i < 10; ++i) {
				System.out.println("Child thread - Runnable");
			}
		}
	};
	
	static Thread t2 = new Thread(r);

	public static void main(String[] args) {

		Popcorn spicyPopcorn = new Popcorn() {
			@Override
			public void taste() {
				System.out.println("Spicy Popcorn");
			}
		};

		spicyPopcorn.taste();

		Popcorn sweetPopcorn = new Popcorn() {
			@Override
			public void taste() {
				System.out.println("Sweet Popcorn");
			}
			public void football(){
				System.out.println("it is a sport");
			}
		};
		sweetPopcorn.taste();

		Popcorn normalPopcorn = new Popcorn();
		normalPopcorn.taste();

		System.out.println(normalPopcorn.getClass().getName());
		System.out.println(sweetPopcorn.getClass().getName());
		System.out.println(spicyPopcorn.getClass().getName());

		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
		t2.start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
			  for (int i = 0; i < 10; i++) {
				System.out.println("Arugment Runnable thread - child");
			}
				
			}
		}).start();
	}

}