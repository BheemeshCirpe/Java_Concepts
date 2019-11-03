package com.java.wrapperclasses;

public class Auto_Unboxing {

	public static void main(String[] args) {
		
		Integer n1= new Integer(50);
		
		Integer n2= Integer.valueOf(10);
		
		
		//Auto Unboxing
		int x=new Integer(n1);
		int y=new Integer(n2);
		
		System.out.println(x+y);
		
	}

}
