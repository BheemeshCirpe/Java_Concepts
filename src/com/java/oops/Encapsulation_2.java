package com.java.oops;

public class Encapsulation_2 {

	public static void main(String[] args) {
		
		
		Encapsulation_1 obj = new Encapsulation_1();
		//Setting values to private variables using public setter methods
		obj.Seteid(30);
		obj.Setename("rupa");
	
		//Getting values using getter methods 
		int a=obj.Geteid();
		String str=obj.Getename();
		System.out.println(a);
		System.out.println(str);
		
		
		obj.Seteid(5);
		obj.Setename("bheem");
		
		
		int b=obj.Geteid();
		String str1=obj.Getename();
		System.out.println(b);
		System.out.println(str1);
		
		
		

	}

}
