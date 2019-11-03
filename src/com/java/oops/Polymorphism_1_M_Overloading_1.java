package com.java.oops;

public class Polymorphism_1_M_Overloading_1 {

	public void m1()
	{
		System.out.println("This is m1 with 0- Argument");
	
	}
	
	public void m1(int a)
	{
		System.out.println("This is m1 with 1- Argument");
		
		
		
	}
	
	public void m1(int a,int b)
	{
		
		System.out.println("This is m1 with 2- Argument");
		
	}
	
	public void m1(char c)
	{
		System.out.println("This is m1 with 1- Argument with different data type");
		
	}
	public static void main(String[] args) {
		
		Polymorphism_1_M_Overloading_1 p1 = new Polymorphism_1_M_Overloading_1();
		p1.m1();		// without parameters
		p1.m1(5);		// with parameter
		p1.m1(5, 10);	//with different no of parameter
		p1.m1('a');  	//with different data type
	}

}
