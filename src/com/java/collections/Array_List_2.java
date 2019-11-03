package com.java.collections;

import java.util.ArrayList;

public class Array_List_2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> obj= new ArrayList<String>();
		
		obj.add("rupa");
		//obj.add(10);	// it will not accept integer, as String is declared as generic
		obj.add(null);//all list implementation classes accepts null values
		
		obj.add("bheemesh");
		obj.add("rupa");// list accepts duplicate values
		obj.add("Rupa");
		System.out.println(obj);
		
		System.out.println("**********************************");
		
		for(String str:obj)
			System.out.println(str);
		
		
		
		
	}

}
