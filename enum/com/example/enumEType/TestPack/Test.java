package com.example.enumEType.TestPack;

import com.example.enumEType.Juice;
import static com.example.enumEType.Juice.*;

public class Test {
	
	public static void main(String[] args) {
		
		Juice juice = Juice.orange;
		
		 juice = apple;
		 
		 System.out.println(juice);
		
		 juice = strawberry;
		 
		 
		 Color[] colors = Color.values();
		 
		 for(Color color : colors) {
			 color.info();
		 }
	}

}
