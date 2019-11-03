package com.java.basics;

public class Instance_Block_1 {
	
	{
		System.out.println("this is instance block 1");
	}
	
	{
		System.out.println("this is instance block 2");
	}
	
	

	public static void main(String[] args) {
		
		Instance_Block_1 b1 = new Instance_Block_1(); // diff between instance block and constructor.. need to parameterise for constructor.
		
		// but for instance blocks gets executed once object is created
		

	}

}
