package com.java.oops;

public interface Abstraction_IF_6 {
	
	void m1();
	void m2();

}

class Class_1{
	
	public void m3() {
		System.out.println("this is method m3");
	}

	
	
}

class Class_2 extends Class_1 implements Abstraction_IF_6  // a class can extend a class and implement interface at a time. But extends keyword must be first statement.
{
	public void m1(){
		System.out.println("m1");
		}
	public void m2(){
		System.out.println("m2");
	}
}
	


/*
 * class Class_3 implements Abstraction_IF_6 extends Class_1 { public void m1()
 * { System.out.println("m1"); } public void m2(){ System.out.println("m2"); }
 * 
 * 
 * }
 */
 
 