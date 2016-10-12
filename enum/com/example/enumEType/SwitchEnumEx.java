package com.example.enumEType;

public class SwitchEnumEx {

	public enum Month implements Runnable {

		
		JAN, FEB, MAR, APR, MAY;


		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		

	}

	public static void main(String[] args) {

		Month m = Month.FEB;

		Month[] values = Month.values();
		
		for(Month v : values ){
			System.out.println(v + "... " + v.ordinal());
		}
		
		switch (m) {
		case JAN:
			System.out.println("JAN MONTH.....");
			break;
		case FEB:
			System.out.println("FEB MONTH.....");
			break;
		case MAR:
			System.out.println("MAR MONTH.....");
			break;
		case APR:
			System.out.println("APR MONTH.....");
			break;
		case MAY:
			System.out.println("MAY MONTH.....");
			break;
		default:
			break;
		}
	}

}


