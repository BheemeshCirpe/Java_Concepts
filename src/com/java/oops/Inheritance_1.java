package com.java.oops;

public class Inheritance_1 {

	public void m1() {
		System.out.println("this is method-m1 from parent class");
	}

	public static void main(String[] args) {
		Child_1 c1= new Child_1();//using child class object we can call child and parent class members
		
		c1.m1();
		c1.m2();

	}

}

class Child_1 extends Inheritance_1 {

	public void m2()

	{

		System.out.println("this is method-m2 from child class");

	}
}
