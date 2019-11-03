package com.java.collections;

import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {
		
		Vector vec= new Vector();
		vec.add(10);
		vec.add('e');
		vec.add("rupa");
		System.out.println(vec);// same as arraylist. synchronized version of array list.. thread safe.. low perfomrance
		
		//while one thread is performing other waits till the resources get released
	}
}
