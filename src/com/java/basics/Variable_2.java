package com.java.basics;

public class Variable_2 {
	
	int a;
	static char b;
	
	public static void m2()
	{
		//System.out.println(a); we need object to call non static variable inside static area
		System.out.println(b);
	}
	
	public void m3()
	{
		System.out.println(a);
		System.out.println(b);	
	}
	
	
	
	public static void main(String[] args) {
		
		
	}

}
