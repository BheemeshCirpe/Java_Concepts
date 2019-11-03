package com.java.oops;

public class Polymorphism_8_Overriding_5 {
	
	private void m1()  // We Can not Override Private Methods
	{
		System.out.println("$$$$$$ This is Overriden Method $$$$$$$");
	}

	public static void main(String[] args) {
		
		Child_P5 obj=new Child_P5();
		obj.m1();

	}

}

class Child_P5 extends Polymorphism_8_Overriding_5
{
	
	
	
	  public void m1() {
	  System.out.println("*****This is Overriding Method*******"); }
	 
	
	 
}