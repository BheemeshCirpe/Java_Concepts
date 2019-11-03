package com.java.oops;

public class Polymorphism_9_Overriding_6 {
	
	
	public Polymorphism_9_Overriding_6 m1() {
		System.out.println("This is method from Parent");
		return null;
	}

	public static void main(String[] args) {
		
	
	}

}

class Child_P9 extends Polymorphism_9_Overriding_6{
	
	public Child_P9 m1() {  //We can achive Overriding by using Child class as Return type (and we can also use Parent type)
		System.out.println("This is method from Child"); // this concept is called covariant return type
		return null;
	}
}

