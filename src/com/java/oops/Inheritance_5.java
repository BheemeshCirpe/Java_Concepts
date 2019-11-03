package com.java.oops;

public class Inheritance_5 {

	public Inheritance_5() {
		System.out.println("this is parent class constructor");
	}

	public static void main(String[] args) {	
		Child_7 c7= new Child_7();
	
	}
	
}

class Child_7 extends Inheritance_5
{
	
	public Child_7() {
		//super(); super class constructor will be invoked
		System.out.println("this is child class constructor");
	}
	
	
}



