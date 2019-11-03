package com.java.oops;

public class Polymorphism_7_Overriding_4 {

	
	public /* static */ void m1()  // We Can not Override Static Methods (Method Hiding)
	{
		System.out.println("$$$$$$ This is Overriden Method $$$$$$$");
	}

}


class Child_P4 extends Polymorphism_7_Overriding_4
{
	
	  public void m1() {
	  System.out.println("*****This is Overriding Method*******"); }
	 
}