package com.generics.Example;

public class Gen<T> {

	T object;

	public Gen(T object) {
		this.object = object;
	}
	
	public void show(){
		System.out.println("The type of obj is " + object.getClass().getName());
	}
	
	public T getObject() {
		return object;
	}
	
	public void m1(){
	   T a, b;
	}

}


class Numeric<T extends Number> {
	
	void sum(){
		T a, b;
//		T c = a+2;
	}
}



