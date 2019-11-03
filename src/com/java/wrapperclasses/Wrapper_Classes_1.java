package com.java.wrapperclasses;

public class Wrapper_Classes_1 {

	public static void main(String[] args) {
		
		Integer i1= new Integer(100);  //int Constructor for Integer Wrapper Class
		Integer i2=new Integer("100");  //String Constructor for Integer Wrapper Class
		//Integer i3=new Integer("Ten");  //it must be valid format, otherwise Number format Exception
		
		
		  System.out.println(i1+i2);
		  
		  Float f1=new Float(10.2); Float f2=new Float("20.2");
		  
		  System.out.println(f1+f2);
		 

	}

}
