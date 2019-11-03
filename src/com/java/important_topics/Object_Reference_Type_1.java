package com.java.important_topics;

public class Object_Reference_Type_1 {
	
	

	public static void main(String[] args) {
		
		Object_Reference_Type_1 p1=new Object_Reference_Type_1();
		Child_O1			  c1=new Child_O1();
		Object_Reference_Type_1 c2=new Child_O1();  
	//	Child_O1              p2=new Object_Reference_Type();   // we cannot store parent obj in child reference variable
		
		

	}

}

class Child_O1 extends Object_Reference_Type_1{
	
	
	
}