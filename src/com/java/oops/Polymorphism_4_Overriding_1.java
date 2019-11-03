package com.java.oops;

public class Polymorphism_4_Overriding_1 {

	public void m1()
	{
		System.out.println("$$$$$$ This is Overriden Method $$$$$$$");
	}
	public static void main(String[] args) {
		
		Child_P1 obj=new Child_P1();
		
		obj.m1();

	}

}

class Child_P1 extends Polymorphism_4_Overriding_1
{

	
	  public void m1() {
	  System.out.println("*****This is Overriding Method*******"); }
	 
}