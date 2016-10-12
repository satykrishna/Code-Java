package com.object.Cloning.shallowCloning;

public class Cat implements Cloneable{

	
	private int j;
	
	public Cat(int j) {
		this.j = j;
	}
	
	public void setJ(int j) {
		this.j = j;
	}
	
	public int getJ() {
		return j;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
