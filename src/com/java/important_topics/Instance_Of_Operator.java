package com.java.important_topics;

public class Instance_Of_Operator {

	public static void main(String[] args) {
		
		parent p1=new parent();
		parent p2=new child();//upcasting
		child  c1=new child();
		
		
		child  c2=(child) new parent();  //downcasting
		
		Object c3= new child();
		
		Object c4=new Object();
		
		System.out.println(p1 instanceof parent);	 //true
		System.out.println(p1 instanceof child);	//false
		
		System.out.println(p2 instanceof parent);	//true
		System.out.println(p2 instanceof child);	//true
		
		System.out.println(c1 instanceof parent);	//true
		System.out.println(c1 instanceof child);	//true
		
		System.out.println(c3 instanceof child);	//true
		System.out.println(c4 instanceof child);	//false
		
	

	}

}




class parent
{
	
}

class child extends parent
{
	
}








