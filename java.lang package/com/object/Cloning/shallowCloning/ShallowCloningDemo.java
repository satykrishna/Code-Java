package com.object.Cloning.shallowCloning;

public class ShallowCloningDemo {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat c = new Cat(20);
		Dog d1 = new Dog(c, 10);
		
		Dog d2 = (Dog) d1.clone();
		d2.setI(200);
		
		System.out.println(d1.getCat() == d2.getCat());
		System.out.println(d1.getI() == d2.getI());
	}
}
