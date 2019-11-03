package com.java.basics;

public class Constructor_4 {
	
	public Constructor_4(int a) {
		System.out.println("this is parent class constructor");
	}
	
	public static void main(String[] args) {
		Child_1 ch1 = new Child_1(10);
		
		
	}

}

 class Child_1 extends Constructor_4
{
	
	 public Child_1(int a) {
		 //super(); this will be first statement in sub class constructor. applicable only for zero argument constructor
		 super(10); // need to use super for parameterised constrcutor
		System.out.println("this is child class constrctor");
	}
}
