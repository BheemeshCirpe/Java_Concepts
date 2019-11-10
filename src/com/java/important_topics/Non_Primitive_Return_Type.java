package com.java.important_topics;

public class Non_Primitive_Return_Type {
	
	int a=55;
	static int b=66;
	
	public static  Non_Primitive_Return_Type m1() { // class name can be used as return type
		
		Non_Primitive_Return_Type n2 = new Non_Primitive_Return_Type();

		return n2; // by returning obj 
	
	}
	
	
	public void m2() {
		
		System.out.println("This is method m2**");
	}

	public static void main(String[] args) {
		
	
		
		m1().m2(); // m1 method returns object of current class. so it can be used to call other non static members of same class
		System.out.println(m1().a);
	}

}
