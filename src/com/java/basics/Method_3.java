package com.java.basics;

public class Method_3 {

	int a;
	static int b;
	
	public void m1()
	{
	}

	
	public void m2() {
		System.out.println(a);
		System.out.println(Method_3.b);
		System.out.println(b);
		m1();// can access non static methods/variables directly from non static area only
				// within a class
	}

	public static void m3() {
		//System.out.println(a);
		// m2(); cannot access non static methods/variables directly from static area .
		// Need to create object to access them

		Method_3 m3 = new Method_3();

		m3.m2();
		System.out.println(m3.a);
	}

	public static void main(String[] args) {

	}

}
