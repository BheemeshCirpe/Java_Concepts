package com.java.cursors;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class List_Iterator {

	public static void main(String[] args) {
		
		LinkedList<String> ts1= new LinkedList<String>();
		
		ts1.add("Nani");
		ts1.add("Jr NTR");
		ts1.add("Bunny");
		ts1.add("Ram ");
		
		ListIterator<String> itr1=ts1.listIterator();
		
		while(itr1.hasNext())
		{
			String str=itr1.next();
			System.out.println(str);
			
		}
		
		

	}

}
