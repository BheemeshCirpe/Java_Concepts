package com.java.basics;

public class Variable_1 {

	int b;
	static int c;

	public void m1() {
		int a;
	}

	public static void main(String[] args) {

		//System.out.println(a); can be used only in method level
		//System.out.println(b); can be accessed only by creating object
		
		Variable_1 v1 = new Variable_1();
		System.out.println(v1.b);
		System.out.println(c);
		System.out.println(Variable_1.c);//-->this is recommended way to access static variable . 
		//static variables and methods can be accessed from any where by using class name. No need to inherit.
		System.out.println(v1.c);
		
		
	}

}
