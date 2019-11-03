package com.java.wrapperclasses;

public class Primitive_To_String {

	public static void main(String[] args) {

		int a = 1;
	//	float f = 10.8f;

		String str1 = String.valueOf(a);
	//	String str2 = String.valueOf(f);

		
		String st1="110";
		String st2="111";
		
		System.out.println(st1+st2);
		int x=Integer.parseInt(st1);
		int y=Integer.parseInt(st2);
		
		System.out.println(x+y);
		
	}

}
