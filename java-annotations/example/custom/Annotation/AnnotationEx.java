package example.custom.Annotation;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AnnotationEx {
	
	public static void main(String[] args) {
		
		
	}
	
	
	@Override
	@MethodInfo(author="Satya", comments="this is my comment",
	date="Nov 17 2012", revision=1)
	public String toString() {
		return super.toString();
	}
	
	@Deprecated
	@MethodInfo(comments = "deprecated method", date = "Nov 17 2012")
	public static void oldMethod() {
		System.out.println("old method, don't use it.");
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@MethodInfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 10)
	public static void genericsTest() throws FileNotFoundException {
		List l = new ArrayList();
		l.add("abc");
		oldMethod();
	}

}
