package com.java.cursors;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_1 {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(1);
		v.add('k');
		v.add("rupa");
		v.add(5.5);

		Enumeration en = Collections.enumeration(v);

		while (en.hasMoreElements()) 
		{

			Object obj= en.nextElement();
			System.out.println(obj);
			
		}

	}

}
