package com.java.basics;

public class Method_2 {

	public void m1() {
		System.out.println("this is instance method");
		Method_2.m2();
	
	}

	public static void m2() {
		System.out.println("this is static method");
		
		Method_2 mm2= new Method_2();
		mm2.m1();
	}
	
	

	public static void main(String[] args) {

		Method_2 m1 = new Method_2();
		m1.m1();
		Method_2.m2();

	}
}
