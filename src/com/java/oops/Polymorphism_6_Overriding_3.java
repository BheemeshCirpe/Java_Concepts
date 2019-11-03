package com.java.oops;

public class Polymorphism_6_Overriding_3 {
	
	/* final */ public void m1()  //we can not Override final methods
	{
		System.out.println("$$$$$$ This is Overriden Method $$$$$$$");
	}

	public static void main(String[] args) {
		

	}

}


class Child_P3 extends Polymorphism_6_Overriding_3
{
	
	  public void m1() {
	  System.out.println("*****This is Overriding Method*******"); }
	 
}