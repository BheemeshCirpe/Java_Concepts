package com.java.wrapperclasses;

public class Wrapper_to_primitive_String_1 {

	public static void main(String[] args) {

		Integer i1 = new Integer(20);
		System.out.println(i1);

		// xxxValue method to covert Wrapper Object to primitive
		int a = i1.intValue();
		System.out.println(a);

		//  To Convert Wrapper Object to String  using toString method
		Integer i2 = new Integer(30);
		System.out.println(i1+i2);

		String str1 = i1.toString();
		String str2 = i2.toString();
		System.out.println(str1+str2);
		

	}

}
