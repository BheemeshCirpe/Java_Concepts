package com.java.interview_questions;

public class IQ_7_String_rev_case {
	public static void main(String args[]) {
		String s1 = "MaLaYaLaM", rev = "";

		for (int i = s1.length() - 1; i >= 0; i--)

		{
			if (Character.isUpperCase(s1.charAt(i)))

				rev = rev + Character.toLowerCase(s1.charAt(i));
			else if (Character.isLowerCase(s1.charAt(i)))
				rev = rev + Character.toUpperCase((s1.charAt(i)));

		}

		System.out.println(rev);
		/*
		 * if(s1.equals(rev)) { System.out.println("Reversed string is:" +rev);
		 * //System.out.println(rev); } else System.out.println("not reverse");
		 */
	}
}

//   mAlAyAlAm