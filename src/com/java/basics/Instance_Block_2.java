package com.java.basics;

public class Instance_Block_2 {
	
	{
	System.out.println("this is instance block 1");
	}
	
	{
	System.out.println("this is instance block 2");
	}
	public Instance_Block_2()
	{
		System.out.println("this is constructor");//first step in constructor will be to call instance block
	}
	public Instance_Block_2(int a)
	{
		System.out.println("this is one arg constructor");
	}
	public static void main(String[] args) {
		
		Instance_Block_2 b2= new Instance_Block_2();
		
	}

}
