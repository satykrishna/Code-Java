package com.example.enumEType;

public enum Juice {

	apple(10), mango(20), strawberry(30), banana(40), orange;

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Juice(int price) {
		this.price = price;
	}
	
	Juice() {
		
		this.price = 5; //default price
	}



	
}
