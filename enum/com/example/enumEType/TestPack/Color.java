package com.example.enumEType.TestPack;

public enum Color {

	GREEN,
	BLACK,
	RED,
	YELLOW,
	VIOLET,
	PINK,
	GREY,
	CYAN,
	CREAM,
	SILVER,
	GOLD {
		@Override
		public void info() {
			// TODO Auto-generated method stub
			System.out.println("GOLD");
		}
	},
	BLUE {
		public void info() {
			System.out.println("blue COLOR");
		}
	};
	
	
	public void info() {
		if(this.name() == "RED" || this.name() == "GREEN" || this.name() == "BLUE") {
			System.out.println("UNIVERSAL COLOR");
		}
		
		else {
			System.out.println("NORMAL COLOR");
		}
	}
	
}
