package com.java.oops;

public interface Abstraction_IF_1 {

	void m1();

	default void m2() {

		System.out.println("This is default method m2");
	}

	public static void m3() {
		System.out.println("This is Static method m3");
	}
	
	
	public static void main(String[] args) {	 
		m3();
		
		CD m=new CD();
		m.m1();
		m.m2();
		m.m3();	//this method will not be considered as overriding static method. It will be considered as a child class method
	}
}



class CD implements Abstraction_IF_1
{

	
	public void m1() {
		
		System.out.println("This is  method m1 Implementation");
		
	}
	
	
	
	  public void m2() {
	  
	  System.out.println("This is  method m2 Implementation");
	  
	  }
	 
	
	
	
	  public void m3() {
	  
	  System.out.println("This is  method m3 Implementation");
	  
	  }
	 
	 
}

