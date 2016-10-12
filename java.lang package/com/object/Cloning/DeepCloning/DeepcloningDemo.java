package com.object.Cloning.DeepCloning;

import com.object.Cloning.shallowCloning.Cat;
import com.object.Cloning.shallowCloning.Dog;

public class DeepcloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat c = new Cat(20);
		Dog d1 = new Dog(c, 10);
		
		System.out.println("d1.i " + d1.getI() + " c.j " + d1.getCat().getJ() );
		Dog d2 = (Dog)d1.clone();
		d2.getCat().setJ(200);
		System.out.println(d1.getCat().getJ() == d2.getCat().getJ());
	
	
	}
	
}
