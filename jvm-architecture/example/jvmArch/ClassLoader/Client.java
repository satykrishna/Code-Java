package example.jvmArch.ClassLoader;

import com.example.serialization.Dog;

public class Client {

	
	public static void main(String[] args) throws ClassNotFoundException {
		
          MyClassLoader load = new MyClassLoader();
          
          
          Dog dog = new Dog();
          
          load.loadClass("com.example.serialization.Dog");
		
          
          /* if dog class is updated then
           *    
           */
          
	}
	
	
}
