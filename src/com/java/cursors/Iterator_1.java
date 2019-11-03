package com.java.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_1 {

	public static void main(String[] args) {
		
		List obj= new ArrayList();
		obj.add(1);
		obj.add('a');
		obj.add("Cognizant");
		obj.add(10.1);

		
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			Object obj1= itr.next();
			System.out.println(obj1);	
		}
		
		
	}

}
