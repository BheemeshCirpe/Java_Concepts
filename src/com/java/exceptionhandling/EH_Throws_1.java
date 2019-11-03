package com.java.exceptionhandling;

public class EH_Throws_1 {

	
	public static void  m2() throws InterruptedException  
	{	
		
		Thread.sleep(2000);
		System.out.println("This is m2 method");		
	}
	
		
	public static void m1() throws InterruptedException 
	{	
		EH_Throws_1 obj= new EH_Throws_1();
		obj.m2();
	
		System.out.println("This is m1 method");
	}

	
	
	public static void main(String[] args) throws InterruptedException  {  //here jvm will handle
		
		EH_Throws_1 obj= new EH_Throws_1();
		
		obj.m1();
		
	}	
	
	
	
	
	

}
