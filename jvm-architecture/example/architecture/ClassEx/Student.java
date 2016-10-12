package example.architecture.ClassEx;

public class Student {

	
	public String getName(){
		return null;
	}
	
	public int getRollNo(){
		return 10;
	}
}



class TestClassEX {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
//		Class c = Class.forName("example.architecture.ClassEx.Student");
//		c = Class.forName("com.inovis.parse.mime.MimeBodyPartType");
//		
//
//		Method[] methods = c.getDeclaredMethods();
//		
//		for(Method method : methods) {
//			System.out.println(method.getName());
//		}
		
		
		
		
		Student student = new Student();
		
		Class className1 = student.getClass();
		
		Student another = new Student();
		
		Class className2 = another.getClass();
		
		if(className1 == className2) 
		{
			System.out.println("Both are same");
		}
		else 
		{
			System.out.println("Both are not same");
			
		}
		
		System.out.println(className1.hashCode() + ".. " + className2.hashCode());
		
		
		
		
	}
	
}