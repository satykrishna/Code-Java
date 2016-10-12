package example2.normal.innerclass;

public class OuterClass {
	private int y = 01;
	
	public class InnerClass {
		
		public void method1(){
			
			System.out.println("Return : Method 1");
		}
		
		public void method2(){
			
		}
		
		private int sum(){
			OuterClass.this.y = 1;
			return 1;
		}
		
		private  int x = 10;
		
	}
	
	
	/*public static void main(String[] args) {
		
		OuterClass.InnerClass i = new OuterClass().new InnerClass();
		
		i.method1();
		
	}
*/
}


class C {
	
	
	public static void main(String[] args) {
		
		OuterClass.InnerClass i = new OuterClass().new InnerClass();
		i.method1();
	}
	
}
