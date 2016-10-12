package com.String.example;

public class SCPArea {

	public static void main(String[] args) {

		/*
		 * No of Objects created till Now SCP AREA : 0 Heap AREA : 0
		 */
		String s1 = new String("You cannot change me");
		/*
		 * No of Objects created till Now SCP AREA : 1 Heap AREA : 1
		 */

		String s2 = new String("You cannot change me");

		/*
		 * No of Objects created till Now SCP AREA : 1 Heap AREA : 2 s1, s2
		 */

		System.out.println("S1 = S2 ? " + (s1 == s2));

		String s3 = "You cannot change me";

		/*
		 * No of Objects created till Now SCP AREA : 1 s3 Heap AREA : 2 s1, s2
		 */

		System.out.println("S1 == S3? " + (s1 == s3));

		/*
		 * No of Objects created till Now SCP AREA : 1 s3 Heap AREA : 2 s1, s2
		 */

		String s4 = "You cannot change me";

		/*
		 * No of Objects created till Now SCP AREA : 1 s3, s4 Heap AREA : 2 s1,
		 * s2
		 */

		System.out.println("s3 == s4 ? " + (s3 == s4));

		String s5 = "You cannot " + "change me";

	//	This operation  + will be performed at compile time only because both arguments are compile time constants.

		/*
		 * No of Objects created till Now SCP AREA : 1 s3, s4, s5 Heap AREA : 2
		 * s1, s2
		 */

		System.out.println("s3 == s5? " + (s3 == s5));

		String s6 = "You cannot";

		/*
		 * No of Objects created till Now SCP AREA : 2 (s3, s4, s5) & s6 Heap
		 * AREA : 2 s1, s2
		 */

		String s7 = s6 + " change me";

		//This operation  + is performed at run time only because atleast one argument is normal variable.

		/*
		 * No of Objects created till Now SCP AREA : 2 (s3, s4, s5) & (s6, s7)
		 * Heap AREA : 2 s1, s2
		 */

		System.out.println("s7 == s3? " + (s7 == s3));

		final String s8 = "You cannot";

		/*
		 * No of Objects created till Now SCP AREA : 2 (s3, s4, s5) & (s6, s7,
		 * s8) Heap AREA : 2 s1, s2
		 */

		System.out.println("s8 == s6? " + (s8 == s6));

		String s9 = s8 + " change me";

	//	This operation + is performed at compile time only because s8 is final and hence both arguments are compile time constants.


		/*
		 * No of Objects created till Now SCP AREA : 2 (s3, s4, s5, s9) & (s6,
		 * s7, s8) Heap AREA : 2 s1, s2
		 */
	}
}
