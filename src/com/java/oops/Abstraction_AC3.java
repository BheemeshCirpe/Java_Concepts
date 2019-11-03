package com.java.oops;

public abstract class Abstraction_AC3 {

	abstract void m1();
	abstract void m2();

	void m4(){
		System.out.println("This is m4");
	}
	
	
	public Abstraction_AC3() {
		System.out.println("This is Abstract Class Constuctor");
	}
	
	public static void main(String[] args) {
			
		b obj= new b(); // to call abstract class constructor we can create object for child class(which extends abstract class(concrete class),so that it will call parent class constructor internally 
		obj.m1();
		obj.m4(); 
		
	}	
	
}

class b extends Abstraction_AC3{
	
	
	public b() {
		//Super()
		System.out.println("This is b Constuctor");
	}
	
	
	void m1(){
		System.out.println("This is m1");
	
	}
	void m2(){
		System.out.println("This is m2");
	}
	
}