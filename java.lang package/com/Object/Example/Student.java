package com.Object.Example;

public class Student {

	private String name;
	private int rollNo;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		// return "Student: name = [" +name + "], RollNo = [" + rollNo + "]";
		return super.toString();
	}

	@Override
	public int hashCode() {
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj instanceof Student) {
			Student otherStudent = (Student) obj;
			if (otherStudent == this) {
				flag = true;
			} else if (otherStudent.name.equals(name)
					&& otherStudent.rollNo == rollNo) {
				flag = true;
			}
		}
		return flag;
	}

	// @Override
	// public boolean equals(Object obj) {
	// /*Check if current student Object is equal to the
	// * other Student object.
	// *
	// * returns true iff rollNo and name of the both student
	// * objects are same.
	// *
	// * in case of ClassCastException | NullPointerException
	// * return false
	// */
	// try{
	// Student otherStudent = (Student) obj;
	// if ((otherStudent.name.equals(name))
	// && (otherStudent.rollNo == rollNo)) {
	// return true;
	// }
	// return false;
	// }catch(ClassCastException | NullPointerException e) {
	// return false;
	// }
	// }

	public static void main(String[] args) {
		/*
		 * Student s1 = new Student("Satya", 12); Student s2 = new
		 * Student("Satya", 122); Student s4 = s1;
		 * 
		 * System.out.println(s1); System.out.println(s2);
		 * 
		 * System.out.println(s1.equals("durga"));
		 * System.out.println(s4.equals(null));
		 * 
		 * // String s = new String("Satyakrishna Kondapalli"); // Integer i =
		 * new Integer(10); // System.out.println("String : " + s); //
		 * System.out.println("Integer : " + i); // // ArrayList<String> al =
		 * new ArrayList<String>(); // al.add("A"); // al.add("B"); //
		 * al.add("C"); // System.out.println("Array list : " + al); // // Test
		 * t = new Test(); // System.out.println("Test class : " + t);
		 */
		
		String s1 = new String("Durga");
		String s2 = new String("Durga");
//		
		StringBuffer sb1 = new StringBuffer("Satya");
		StringBuffer sb2 = new StringBuffer("Satya");
//		
//		System.out.println("s1 == s2?"  + s1 == s2);
//		System.out.println("s1.equals(s2)" + s1.equals(s2));
////		
//		Thread t = new Thread();
//		
//		System.out.println(t.equals(null));
//		System.out.println(t == null);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());
		
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.hashCode() + " " + sb2.hashCode());
	}

}
