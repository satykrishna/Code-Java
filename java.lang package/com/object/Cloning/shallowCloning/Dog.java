package com.object.Cloning.shallowCloning;

public class Dog implements Cloneable {

	private Cat cat;
	private int i;

	public Dog(Cat cat, int i) {
		this.cat = cat;
		this.i = i;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
        Cat copyCat  = (Cat)cat.clone();
        Dog copyDog = new Dog(copyCat, i);
		return copyDog;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
 		this.i = i;
	}

}
