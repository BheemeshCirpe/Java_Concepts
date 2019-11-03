package com.java.cursors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Enumeration_2 {

	public static void main(String[] args) {
		
		/*
		 * Stack v = new Stack(); v.push(1); v.push('k'); v.push("bheem"); v.push(5.5);
		 */
		
		ArrayList al= new ArrayList();
		al.add(1);
		al.add('a');
		al.add("Rupa");
		

		Enumeration en = Collections.enumeration(al);

		while (en.hasMoreElements()) 
		{

			Object obj= en.nextElement();
			System.out.println(obj);
			
		}


	}

}
