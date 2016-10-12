package example.jvmArch.ClassLoader;

public class MyClassLoader extends ClassLoader {
	
	
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
	
		/*check for updates and load updated .class file 
		
		  & return corresponding Class class object.
		  
		  
		
		*/
		return super.loadClass(name);
	}

}
