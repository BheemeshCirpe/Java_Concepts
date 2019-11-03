package com.java.basics;

public class Variable_4 {

	int a;
	static int b;
	
	public void m4()
	{
	int c; // local variables should be initialized before using
	c=11;
	System.out.println(c);
	
	}
	public static void main(String[] args) {
		
		Variable_4 v4 = new Variable_4();
		v4.m4();
		System.out.println(v4.a);
		System.out.println(Variable_4.b);
	}
}
