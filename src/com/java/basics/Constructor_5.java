package com.java.basics;

public class Constructor_5 {
	int a;
	char b;

	public Constructor_5(int x,char y)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		this.a= x;
		this.b=y;
		
	}
	
	
	public void m1()
	{
		//System.out.println(x);
		//System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Constructor_5 c5= new Constructor_5(10, 'c');
		
		c5.m1();
		
		System.out.println("**********************");
		
		
		Constructor_5 cc5= new Constructor_5(50, 'z');
		
		cc5.m1();
		
		
	}
}
