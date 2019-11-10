package com.java.important_topics;

import java.util.ArrayList;
import java.util.List;

public class Object_Reference_Type_2 {

	public static void main(String[] args) {
		
		ArrayList obj= new ArrayList();
		obj.add(1);   
		obj.add('a');
		obj.add("Rupa");
		obj.add(10.1);
		
		System.out.println(obj);
		
		for(Object a :obj)
			System.out.println(a);

	}

}
