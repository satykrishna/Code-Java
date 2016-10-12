package example.jvmArch.ClassLoader;

import java.text.SimpleDateFormat;

public class Test {

	   private static final SimpleDateFormat LOG_DATE_FORMAT = new SimpleDateFormat("yyyyMM");

	
	public static void main(String[] args) {
	
		String s = new String();
		
		System.out.println(String.class.getClassLoader());
		
		 
		//System.out.println(Student.class.getClassLoader());
		
		
		
		  
		
	}
	
}
