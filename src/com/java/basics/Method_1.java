package com.java.basics;

public class Method_1 {

	public void m1() {

		System.out.println("this is instance method");
	}

	public static void m2() {
		System.out.println("this is static method");
	}
	
	

	public static void main(String[] args) {

		Method_1 m1 = new Method_1();
		m1.m1();
		Method_1.m2();

	}
}
